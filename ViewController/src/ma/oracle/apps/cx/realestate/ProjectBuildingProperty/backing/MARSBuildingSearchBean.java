package ma.oracle.apps.cx.realestate.ProjectBuildingProperty.backing;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import ma.oracle.apps.cx.realestate.building.views.MARSBuildingSearchVORowImpl;

import ma.oracle.apps.cx.realestate.property.modules.MARealEstatePropertyAMImpl;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputFile;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichMessages;

import oracle.adf.view.rich.component.rich.output.RichPanelCollection;

import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.domain.Number;
import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;

import oracle.jbo.domain.BlobDomain;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.uicli.binding.JUCtrlHierBinding;

import org.apache.myfaces.trinidad.model.CollectionModel;
import org.apache.myfaces.trinidad.model.UploadedFile;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Hyperlink;

public class MARSBuildingSearchBean {
    private RichForm f1;
    private RichDocument d1;
    private RichMessages m1;
    private RichPanelGroupLayout pgl1;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichTable resId1;
    private RichToolbar t5;
    private RichButton b1;
    private RichButton b2;
    private RichPanelCollection pc1;
    private RichToolbar t1;
    private RichInputFile if1;
    private RichButton b5;
   
    static Number buildingId;
    static Number propertyId;
    static Number buildingRentId;
    static Number buildingOwnerId;
    static Number attachmentDocumentId;
    
    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setPh1(RichPanelHeader ph1) {
        this.ph1 = ph1;
    }

    public RichPanelHeader getPh1() {
        return ph1;
    }

    public void setQryId1(RichQuery qryId1) {
        this.qryId1 = qryId1;
    }

    public RichQuery getQryId1() {
        return qryId1;
    }

    public void setResId1(RichTable resId1) {
        this.resId1 = resId1;
    }

    public RichTable getResId1() {
        return resId1;
    }
    
    public void setT5(RichToolbar t5) {
        this.t5 = t5;
    }

    public RichToolbar getT5() {
        return t5;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }
    
    public void onRemoveAction(ActionEvent actionEvent) {
        FacesCtrlHierNodeBinding rowdata = (FacesCtrlHierNodeBinding)resId1.getRowData(resId1.getRowIndex());
        MARSBuildingSearchVORowImpl rowImpl;
        rowImpl = (MARSBuildingSearchVORowImpl) rowdata.getRow();
        //Getting primary key of the record
                Number keyVal = rowImpl.getBuildingId();
                DCBindingContainer dcBindings =
                    (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
                
        //Iterator binding on the page           
         DCIteratorBinding iteratorBinding = (DCIteratorBinding)dcBindings.get("MARSBuildingSearchVO1Iterator");
                RowSetIterator rowSetIterator = iteratorBinding.getRowSetIterator();
                Key key = new Key(new Object[] { keyVal });
                Row row = rowSetIterator.findByKey(key, 1)[0];
                rowSetIterator.setCurrentRow(row);
        //Removing the current record
        rowSetIterator.removeCurrentRow();
        OperationBinding operationBinding = dcBindings.getOperationBinding("Commit");
        operationBinding.execute();
    }

    public void generateExcel(FacesContext facesContext, OutputStream outputStream) throws IOException {
        
        try {
                      
              HSSFWorkbook workbook = new HSSFWorkbook();  
              HSSFSheet worksheet = workbook.createSheet("Building");
              HSSFSheet worksheet1 = workbook.createSheet("Property");
              HSSFSheet worksheet2 = workbook.createSheet("Rent");
              HSSFSheet worksheet3 = workbook.createSheet("Owner");
              HSSFSheet worksheet4 = workbook.createSheet("Attachment");

              FacesCtrlHierNodeBinding rowdata = (FacesCtrlHierNodeBinding)resId1.getRowData(resId1.getRowIndex());
              MARSBuildingSearchVORowImpl rowImpl;
              rowImpl = (MARSBuildingSearchVORowImpl) rowdata.getRow();
              //Getting primary key of the record
                      Number keyVal = rowImpl.getBuildingId();
                      
              DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
              DCIteratorBinding dcIteratorBindings = bindings.findIteratorBinding("MARSBuildingTableVO1Iterator");
              RowSetIterator rowSetIterator = dcIteratorBindings.getRowSetIterator();
              Key key = new Key(new Object[] { keyVal });
              Row row = rowSetIterator.findByKey(key, 1)[0];
              rowSetIterator.setCurrentRow(row);
            
              DCIteratorBinding dcIteratorBindings1 = bindings.findIteratorBinding("MARealEstatePropertyExportVO1Iterator");
              dcIteratorBindings1.getViewObject().setWhereClause("BUILDING_ID=:build_Id");
              dcIteratorBindings1.getViewObject().defineNamedWhereClauseParam("build_Id", null, null); 
              dcIteratorBindings1.getViewObject().setNamedWhereClauseParam("build_Id", keyVal);
              dcIteratorBindings1.executeQuery();
              RowSetIterator rowSetIterator1 = dcIteratorBindings1.getRowSetIterator();
              
              DCIteratorBinding dcIteratorBindings2 = bindings.findIteratorBinding("MABuildingRentOptionExportVO1Iterator");
              dcIteratorBindings2.getViewObject().setWhereClause("BUILDING_ID=:build_Id");
              dcIteratorBindings2.getViewObject().defineNamedWhereClauseParam("build_Id", null, null); 
              dcIteratorBindings2.getViewObject().setNamedWhereClauseParam("build_Id", keyVal);
              dcIteratorBindings2.executeQuery();
              RowSetIterator rowSetIterator2 = dcIteratorBindings2.getRowSetIterator();
             
              DCIteratorBinding dcIteratorBindings3 = bindings.findIteratorBinding("MABuildingOwnerExportVO1Iterator");
              dcIteratorBindings3.getViewObject().setWhereClause("BUILDING_ID=:build_Id");
              dcIteratorBindings3.getViewObject().defineNamedWhereClauseParam("build_Id", null, null); 
              dcIteratorBindings3.getViewObject().setNamedWhereClauseParam("build_Id", keyVal);
              dcIteratorBindings3.executeQuery();
              RowSetIterator rowSetIterator3 = dcIteratorBindings3.getRowSetIterator();
            
              DCIteratorBinding dcIteratorBindings4 = bindings.findIteratorBinding("MABuildingAttachmentImportVO1Iterator");
              dcIteratorBindings4.getViewObject().setWhereClause("PK1_VALUE=:build_Id");
              dcIteratorBindings4.getViewObject().defineNamedWhereClauseParam("build_Id", null, null); 
              dcIteratorBindings4.getViewObject().setNamedWhereClauseParam("build_Id", keyVal);
              dcIteratorBindings4.executeQuery();
              RowSetIterator rowSetIterator4 = dcIteratorBindings4.getRowSetIterator();            
//              ViewObject vo = dcIteratorBindings4.getViewObject();
//              MABuildingAttachmentExportVORowImpl curRow = (MABuildingAttachmentExportVORowImpl) vo.getCurrentRow();
//              BlobDomain blob = curRow.getFileData();
//              byte[] bytes = blob.toByteArray();//Convert into Byte array
            
              HSSFRow  excelrow = null;
              HSSFRow  excelrow1 = null;
              HSSFRow  excelrow2 = null;
              HSSFRow  excelrow3 = null;
              HSSFRow  excelrow4 = null;

              int i = 0;
              int x = 0;
              int z = 0;
              int w = 0;
              int y = 0;
            
              //print header on first row in excel
                  if (i == 0) {
                      excelrow = (HSSFRow)worksheet.createRow((short)i);
                      short j = 0;
                      for (String colName : row.getAttributeNames()) {
                                                     
                          HSSFCell cellA1 = excelrow.createCell((short) j);
                          cellA1.setCellValue(colName);
                          
                          j++;                             
                      }
                  }
    
                  //print data from second row in excel
                  ++i;
                  short j = 0;
                  excelrow = worksheet.createRow((short)i);
                  for (String colName : row.getAttributeNames()) {

                      HSSFCell  cell = excelrow.createCell(j);
                      if (colName.equalsIgnoreCase("BuildingId")) {
                          if(null!=row.getAttribute(colName)){
                          cell.setCellValue(row.getAttribute(colName).toString());
                          }
                      }
                      //logic for cell formatting
                      else if (colName.equalsIgnoreCase("BuildingName")) {
                          if(null!=row.getAttribute(colName)){
                          cell.setCellValue(row.getAttribute(colName).toString());
                          }                                     
                      }
                      //make it double if you want and convert accordingly
                      else if (colName.equalsIgnoreCase("BuildingType")){
                          if(null!=row.getAttribute(colName)){
                          cell.setCellValue(row.getAttribute(colName).toString());
                          }
                      }
                      else if (colName.equalsIgnoreCase("NoOfFloors")){                                    
                          if(null!=row.getAttribute(colName)){
                          cell.setCellValue(row.getAttribute(colName).toString());
                          }
                      } 
                      else if (colName.equalsIgnoreCase("AvailableForRentFlag")){                                    
                          if(null!=row.getAttribute(colName)){
                          cell.setCellValue(row.getAttribute(colName).toString());
                          }
                      }
                      else if (colName.equalsIgnoreCase("Status")){                                    
                          if(null!=row.getAttribute(colName)){
                          cell.setCellValue(row.getAttribute(colName).toString());
                          }
                      } 
                      else if (colName.equalsIgnoreCase("WestSide")){                                    
                          if(null!=row.getAttribute(colName)){
                          cell.setCellValue(row.getAttribute(colName).toString());
                          }
                      }
                      else if (colName.equalsIgnoreCase("NorthSide")){                                    
                          if(null!=row.getAttribute(colName)){
                          cell.setCellValue(row.getAttribute(colName).toString());
                          }
                      }else
                          cell.setCellValue(row.getAttribute(colName).toString());
                      j++;                              
                  }                                                  
                  worksheet.autoSizeColumn(0);
                  worksheet.autoSizeColumn(1);
                  worksheet.autoSizeColumn(2);
                  worksheet.autoSizeColumn(3);
                  worksheet.autoSizeColumn(4);
                  worksheet.autoSizeColumn(5);
                  worksheet.autoSizeColumn(6);
                  worksheet.autoSizeColumn(7);
                 
              for(int h=0;h<rowSetIterator1.getRowCount();h++){
                        
                        Row row1 = rowSetIterator1.getRowAtRangeIndex(h);
                            //print header on first row in excel
                                if (x == 0) {
                                    excelrow1 = (HSSFRow)worksheet1.createRow((short)x);
                                    short n = 0;
                                    for (String colName : row1.getAttributeNames()) {
                                                                   
                                        HSSFCell cellA1 = excelrow1.createCell((short) n);
                                        cellA1.setCellValue(colName);
                                        
                                        n++;                             
                                    }
                                }
                            
                                //print data from second row in excel
                                ++x;
                                short n = 0;
                                excelrow1 = worksheet1.createRow((short)x);
                                for (String colName : row1.getAttributeNames()) {

                                    HSSFCell  cell = excelrow1.createCell(n);
                                            if (colName.equalsIgnoreCase("PropertyId")) {
                                                if(null!=row1.getAttribute(colName)){
                                                cell.setCellValue(row1.getAttribute(colName).toString());
                                                }                                     
                                            }
                                            //make it double if you want and convert accordingly
                                            else if (colName.equalsIgnoreCase("PropertyName")){
                                                if(null!=row1.getAttribute(colName)){
                                                cell.setCellValue(row1.getAttribute(colName).toString());
                                                }
                                            } 
                                            else if (colName.equalsIgnoreCase("PropertyCode")){
                                                if(null!=row1.getAttribute(colName)){
                                                cell.setCellValue(row1.getAttribute(colName).toString());
                                                }
                                            }
                                            else if (colName.equalsIgnoreCase("BuildingId")){
                                                if(null!=row1.getAttribute(colName)){
                                                cell.setCellValue(row1.getAttribute(colName).toString());
                                                }
                                            }
                                            else if (colName.equalsIgnoreCase("BlockBuldingName")){
                                                if(null!=row1.getAttribute(colName)){
                                                cell.setCellValue(row1.getAttribute(colName).toString());
                                                }
                                            }
                                            else if (colName.equalsIgnoreCase("FloorNumber")){
                                                if(null!=row1.getAttribute(colName)){
                                                cell.setCellValue(row1.getAttribute(colName).toString());
                                                }
                                            }
                                            else if (colName.equalsIgnoreCase("PropertyStatus")){
                                                if(null!=row1.getAttribute(colName)){
                                                cell.setCellValue(row1.getAttribute(colName).toString());
                                                }
                                            }
                                         
                                    n++;
                                                                   
                                }                                                  
                                worksheet1.autoSizeColumn(0);
                                worksheet1.autoSizeColumn(1);
                                worksheet1.autoSizeColumn(2);
                                worksheet1.autoSizeColumn(3);
                                worksheet1.autoSizeColumn(4);
                                worksheet1.autoSizeColumn(5);
                                worksheet1.autoSizeColumn(6);
                                
              }

              for(int h=0;h<rowSetIterator2.getRowCount();h++){
                  
                  Row rows2 = rowSetIterator2.getRowAtRangeIndex(h);//rowSetIterator2.next();
                            //print header on first row in excel
                                if (z == 0) {
                                    
                                    excelrow2 = (HSSFRow)worksheet2.createRow((short)z);
                                    short m = 0;
                                    for (String colName : rows2.getAttributeNames()) {
                                                                   
                                        HSSFCell cellA1 = excelrow2.createCell((short) m);
                                        cellA1.setCellValue(colName);
                                        m++;                             
                                    }
                                }
                            
                                //print data from second row in excel
                                ++z;
                                short m = 0;
                                excelrow2 = worksheet2.createRow((short)z);
                                for (String colName : rows2.getAttributeNames()) {

                                    HSSFCell  cell = excelrow2.createCell(m);
                                        if (colName.equalsIgnoreCase("BuildingRentId")){
                                            if(null!=rows2.getAttribute(colName)){
                                                cell.setCellValue(rows2.getAttribute(colName).toString());
                                                }
                                            }
                                            //make it double if you want and convert accordingly
                                            else if (colName.equalsIgnoreCase("RentPaymentTermId")){
                                                if(null!=rows2.getAttribute(colName)){
                                                cell.setCellValue(rows2.getAttribute(colName).toString());
                                                }
                                            } 
                                            else if (colName.equalsIgnoreCase("RentAmount")){
                                                if(null!=rows2.getAttribute(colName)){
                                                cell.setCellValue(rows2.getAttribute(colName).toString());
                                                }
                                            }
                                            else if (colName.equalsIgnoreCase("StartServiceDate")){
                                                if(null!=rows2.getAttribute(colName)){
                                                cell.setCellValue(rows2.getAttribute(colName).toString());
                                                }
                                            }
                                            else if (colName.equalsIgnoreCase("EndServiceDate")){
                                                if(null!=rows2.getAttribute(colName)){
                                                cell.setCellValue(rows2.getAttribute(colName).toString());
                                                }
                                            }                                            
                                            else if (colName.equalsIgnoreCase("BuildingId")){
                                                if(null!=rows2.getAttribute(colName)){
                                                cell.setCellValue(rows2.getAttribute(colName).toString());
                                                }
                                            }
                                         
                                    m++;
                                                                   
                                }                                                  
                                worksheet2.autoSizeColumn(0);
                                worksheet2.autoSizeColumn(1);
                                worksheet2.autoSizeColumn(2);
                                worksheet2.autoSizeColumn(3);
                                worksheet2.autoSizeColumn(4);
                                worksheet2.autoSizeColumn(5);
                                
                                
              }          
             
              for(int h=0;h<rowSetIterator3.getRowCount();h++){
              
              Row rows3 = rowSetIterator3.getRowAtRangeIndex(h);//rowSetIterator2.next();
                        //print header on first row in excel
                            if (w == 0) {
                                
                                excelrow3 = (HSSFRow)worksheet3.createRow((short)w);
                                short u = 0;
                                for (String colName : rows3.getAttributeNames()) {
                                                               
                                    HSSFCell cellA1 = excelrow3.createCell((short) u);
                                    cellA1.setCellValue(colName);
                                    u++;                             
                                }
                            }
                        
                            //print data from second row in excel
                            ++w;
                            short u = 0;
                            excelrow3 = worksheet3.createRow((short)w);
                            for (String colName : rows3.getAttributeNames()) {

                                HSSFCell  cell = excelrow3.createCell(u);
                                    if (colName.equalsIgnoreCase("BuildingOwnerId")){
                                        if(null!=rows3.getAttribute(colName)){
                                            cell.setCellValue(rows3.getAttribute(colName).toString());
                                            }
                                        }
                                        //make it double if you want and convert accordingly
                                        else if (colName.equalsIgnoreCase("BuildingOwnerName")){
                                            if(null!=rows3.getAttribute(colName)){
                                            cell.setCellValue(rows3.getAttribute(colName).toString());
                                            }
                                        } 
                                        else if (colName.equalsIgnoreCase("ContractId")){
                                            if(null!=rows3.getAttribute(colName)){
                                            cell.setCellValue(rows3.getAttribute(colName).toString());
                                            }
                                        }
                                        else if (colName.equalsIgnoreCase("ContractSubject")){
                                            if(null!=rows3.getAttribute(colName)){
                                            cell.setCellValue(rows3.getAttribute(colName).toString());
                                            }
                                        }
                                        else if (colName.equalsIgnoreCase("ContractStartDate")){
                                            if(null!=rows3.getAttribute(colName)){
                                            cell.setCellValue(rows3.getAttribute(colName).toString());
                                            }
                                        }
                                        else if (colName.equalsIgnoreCase("ContractEndDate")){
                                            if(null!=rows3.getAttribute(colName)){
                                            cell.setCellValue(rows3.getAttribute(colName).toString());
                                            }
                                        }                                            
                                        else if (colName.equalsIgnoreCase("BuildingId")){
                                            if(null!=rows3.getAttribute(colName)){
                                            cell.setCellValue(rows3.getAttribute(colName).toString());
                                            }
                                        }
                                     
                                u++;
                                                               
                            }                                                  
                            worksheet3.autoSizeColumn(0);
                            worksheet3.autoSizeColumn(1);
                            worksheet3.autoSizeColumn(2);
                            worksheet3.autoSizeColumn(3);
                            worksheet3.autoSizeColumn(4);
                            worksheet3.autoSizeColumn(5);
                            worksheet3.autoSizeColumn(6);
                            
                            
              }  
                    
              for(int h=0;h<rowSetIterator4.getRowCount();h++){
              
              Row rows4 = rowSetIterator4.getRowAtRangeIndex(h);//rowSetIterator2.next();
                        //print header on first row in excel
                            if (y == 0) {
                                
                                excelrow4 = (HSSFRow)worksheet4.createRow((short)y);
                                short r = 0;
                                for (String colName : rows4.getAttributeNames()) {
                                                               
                                    HSSFCell cellA1 = excelrow4.createCell((short) r);
                                    cellA1.setCellValue(colName);
                                    r++;                             
                                }
                            }
                        
                            //print data from second row in excel
                            ++y;
                            short r = 0;
                            excelrow4 = worksheet4.createRow((short)y);
                            for (String colName : rows4.getAttributeNames()) {

                                HSSFCell  cell = excelrow4.createCell(r);
                                    if (colName.equalsIgnoreCase("AttachedDocumentId")){
                                        if(null!=rows4.getAttribute(colName)){
                                            cell.setCellValue(rows4.getAttribute(colName).toString());
                                            }
                                        }
                                else if (colName.equalsIgnoreCase("EntityName")){
                                    if(null!=rows4.getAttribute(colName)){
                                    cell.setCellValue(rows4.getAttribute(colName).toString());
                                    }
                                } 
                                        //make it double if you want and convert accordingly
                                        else if (colName.equalsIgnoreCase("FileName")){
                                            if(null!=rows4.getAttribute(colName)){
                                            cell.setCellValue(rows4.getAttribute(colName).toString());
                                            }
                                        } 
                                        else if (colName.equalsIgnoreCase("FileContentType")){
                                            if(null!=rows4.getAttribute(colName)){
                                            cell.setCellValue(rows4.getAttribute(colName).toString());
                                            }
                                        }
                                        else if (colName.equalsIgnoreCase("UploadDate")){
                                            if(null!=rows4.getAttribute(colName)){
                                            cell.setCellValue(rows4.getAttribute(colName).toString());
                                            }
                                        }
                                        else if (colName.equalsIgnoreCase("BuildingId")){
                                            if(null!=rows4.getAttribute(colName)){
                                            cell.setCellValue(rows4.getAttribute(colName).toString());
                                            }
                                        }
                                        else if (colName.equalsIgnoreCase("FileData")){
                                                              
                                        }
                                  
                                r++;
                                                               
                            }                                                  
                            worksheet4.autoSizeColumn(0);
                            worksheet4.autoSizeColumn(1);
                            worksheet4.autoSizeColumn(2);
                            worksheet4.autoSizeColumn(3);
                            worksheet4.autoSizeColumn(4);
                            worksheet4.autoSizeColumn(5);
                            
              }      
                    
              workbook.write(outputStream);
              outputStream.flush();
             
          }
              catch (Exception e) {
                  e.printStackTrace();
              }
                                       
    }
    
    public void uploadFileVCE(ValueChangeEvent valueChangeEvent) {
        UploadedFile file = (UploadedFile) valueChangeEvent.getNewValue();
        try {
        if (file.getContentType().equalsIgnoreCase("application/vnd.ms-excel")) {

        if (file.getFilename().toUpperCase().endsWith(".XLS")) {
        readNProcessExcel(file.getInputStream()); //for xls
        }

        } else {
        FacesMessage msg = new FacesMessage("File format not supported.– Upload XLS or XLSX file");
        msg.setSeverity(FacesMessage.SEVERITY_WARN);
        FacesContext.getCurrentInstance().addMessage(null, msg);
        }
        AdfFacesContext.getCurrentInstance().addPartialTarget(resId1);

        } catch (IOException e) {
        // TODO
        }
        
    }
    
    public void readNProcessExcel(InputStream xls) throws IOException {
        CollectionModel cModel = (CollectionModel) resId1.getValue();
        JUCtrlHierBinding tableBinding = (JUCtrlHierBinding) cModel.getWrappedData();
        DCIteratorBinding iter = tableBinding.getDCIteratorBinding();

        //Use HSSFWorkbook for XLS file
        HSSFWorkbook WorkBook = null;

        try {
        WorkBook = new HSSFWorkbook(xls);
        } catch (IOException e) {
        System.out.println("Exception : " + e);
        }
        for (int i = 0; i < WorkBook.getNumberOfSheets(); i++) {     
        HSSFSheet sheet = WorkBook.getSheetAt(i);
        if(i==0){ 
        
        Integer skipRw = 1;
        Integer skipcnt = 1;
        Integer sno = 1;
        
        //Iterate over excel rows
        for (org.apache.poi.ss.usermodel.Row tempRow : sheet) {
        System.out.println(skipcnt + "–" + skipRw);
        if (skipcnt > skipRw) { //skip first n row for labels.
        //Create new row in table
        executeOperation("CreateInsert").execute();
        
        BindingContext bindingContext = BindingContext.getCurrent();
               @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
               MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        ViewObjectImpl buildingVO = (ViewObjectImpl)am.findViewObject("MARSBuildingTableVO1");  
        Row row = buildingVO.createRow();

        SequenceImpl seq = new SequenceImpl("XXMA.XXMA_REAL_ESTATE_BUILDING_SEQ", am.getDBTransaction());
        buildingId=seq.getSequenceNumber();

        int Index = 0;
        //Iterate over row’s columns
        for (int column = 0; column < tempRow.getLastCellNum(); column++) {
        Cell MytempCell = tempRow.getCell(column);
        if (MytempCell != null) {
        Index = MytempCell.getColumnIndex();

        if (Index == 0) {
        row.setAttribute("BuildingId", buildingId);

        }
        else if (Index == 1) {
        row.setAttribute("BuildingName", MytempCell.getStringCellValue());

        } else if (Index == 2) {
        row.setAttribute("BuildingType", MytempCell.getNumericCellValue());

        } else if (Index == 3) {
        row.setAttribute("NoOfFloors", MytempCell.getNumericCellValue());

        } else if (Index == 4) {
        row.setAttribute("AvailableForRentFlag", MytempCell.getStringCellValue());

        } else if (Index == 5) {
        row.setAttribute("Status", MytempCell.getStringCellValue());

        } else if (Index == 6) {
        row.setAttribute("WestSide", MytempCell.getStringCellValue());

        } else if (Index == 7) {
        row.setAttribute("NorthSide", MytempCell.getStringCellValue());

        } 

        } else {
            Index++;
        }
    } 
        sno++; 
    } 
        skipcnt++; 
    } //Execute table viewObject executeOperation(“Execute”).execute(); }
    }
        else if(i==1){
            Integer skipRw = 1;
            Integer skipcnt = 1;
            Integer sno = 1;
            
            //Iterate over excel rows
            for (org.apache.poi.ss.usermodel.Row tempRow : sheet) {
            System.out.println(skipcnt + "–" + skipRw);
            if (skipcnt > skipRw) { //skip first n row for labels.
            //Create new row in table
            executeOperation("CreateInsert1").execute();
            //Get current row from iterator
            BindingContext bindingContext = BindingContext.getCurrent();
                   @SuppressWarnings("deprecation")
            DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
                   MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
                ViewObjectImpl propertyVO = (ViewObjectImpl)am.findViewObject("MARealEstatePropertyExportVO1");  
            Row row = propertyVO.createRow();
            
            SequenceImpl seq = new SequenceImpl("XXMA.XXMA_REAL_ESTATE_PROPERTY_SEQ", am.getDBTransaction());
            propertyId=seq.getSequenceNumber();   
                
            int Index = 0;
            //Iterate over row’s columns
            for (int column = 0; column < tempRow.getLastCellNum(); column++) {
            Cell MytempCell = tempRow.getCell(column);
            if (MytempCell != null) {
            Index = MytempCell.getColumnIndex();

            if (Index == 0) {
            row.setAttribute("PropertyId", propertyId);

            } else if (Index == 1) {
            row.setAttribute("PropertyName", MytempCell.getStringCellValue());

            } else if (Index == 2) {
            row.setAttribute("PropertyCode", MytempCell.getStringCellValue());

            } else if (Index == 3) {
            row.setAttribute("BuildingId", buildingId);

            } else if (Index == 4) {
            row.setAttribute("BlockBuldingName", MytempCell.getStringCellValue());

            } else if (Index == 5) {
            row.setAttribute("FloorNumber", MytempCell.getStringCellValue());

            } else if (Index == 6) {
            row.setAttribute("PropertyStatus", MytempCell.getStringCellValue());
            }

            } else {
                Index++;
            }
            }
            sno++; 
            }
            skipcnt++; 
            } //Execute table viewObject executeOperation(“Execute”).execute(); }
            
    }
        else if(i==2){
                Integer skipRw = 1;
                Integer skipcnt = 1;
                Integer sno = 1;
                
                //Iterate over excel rows
                for (org.apache.poi.ss.usermodel.Row tempRow : sheet) {
                System.out.println(skipcnt + "–" + skipRw);
                if (skipcnt > skipRw) { //skip first n row for labels.
                //Create new row in table
                executeOperation("CreateInsert2").execute();
                //Get current row from iterator
                BindingContext bindingContext = BindingContext.getCurrent();
                       @SuppressWarnings("deprecation")
                DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
                       MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
                    ViewObjectImpl rentVO = (ViewObjectImpl)am.findViewObject("MABuildingRentOptionExportVO1");  
                Row row = rentVO.createRow();
                 
                SequenceImpl seq = new SequenceImpl("XXMA.XXMA_RS_RENT_BUILDING_SEQ", am.getDBTransaction());
                buildingRentId=seq.getSequenceNumber();   
                    
                int Index = 0;
                //Iterate over row’s columns
                for (int column = 0; column < tempRow.getLastCellNum(); column++) {
                Cell MytempCell = tempRow.getCell(column);
                if (MytempCell != null) {
                Index = MytempCell.getColumnIndex();

                if (Index == 0) {
                row.setAttribute("BuildingRentId", buildingRentId);

                } else if (Index == 1) {
                row.setAttribute("RentPaymentTermId", MytempCell.getNumericCellValue());

                } else if (Index == 2) {
                row.setAttribute("RentAmount", MytempCell.getNumericCellValue());

                } else if (Index == 3) { 
                    java.util.Date utilStartDate = MytempCell.getDateCellValue();
                    java.sql.Date date= new java.sql.Date(utilStartDate.getDate());
                row.setAttribute("StartServiceDate", date);

                } else if (Index == 4) {
                    java.util.Date utilStartDate = MytempCell.getDateCellValue();
                    java.sql.Date date= new java.sql.Date(utilStartDate.getDate());
                row.setAttribute("EndServiceDate", date);

                } else if (Index == 5) {
                row.setAttribute("BuildingId", buildingId);
                } 
                } else {
                    Index++;
                }
                }
                sno++; 
                }
                skipcnt++; 
                } //Execute table viewObject executeOperation(“Execute”).execute(); }
                
            }
        else if(i==3){
                    Integer skipRw = 1;
                    Integer skipcnt = 1;
                    Integer sno = 1;
                    
                    //Iterate over excel rows
                    for (org.apache.poi.ss.usermodel.Row tempRow : sheet) {
                    System.out.println(skipcnt + "–" + skipRw);
                    if (skipcnt > skipRw) { //skip first n row for labels.
                    //Create new row in table
                    executeOperation("CreateInsert3").execute();
                    //Get current row from iterator
                    BindingContext bindingContext = BindingContext.getCurrent();
                           @SuppressWarnings("deprecation")
                    DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
                           MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
                        ViewObjectImpl ownerVO = (ViewObjectImpl)am.findViewObject("MABuildingOwnerExportVO1");  
                    Row row = ownerVO.createRow();
                        
                    SequenceImpl seq = new SequenceImpl("XXMA.XXMA_RS_BUILDING_OWNER_SEQ", am.getDBTransaction());
                    buildingOwnerId=seq.getSequenceNumber();   
                        
                    int Index = 0;
                    //Iterate over row’s columns
                    for (int column = 0; column < tempRow.getLastCellNum(); column++) {
                    Cell MytempCell = tempRow.getCell(column);
                    if (MytempCell != null) {
                    Index = MytempCell.getColumnIndex();

                    if (Index == 0) {
                    row.setAttribute("BuildingOwnerId", buildingOwnerId);

                    } else if (Index == 1) {
                    row.setAttribute("BuildingOwnerName", MytempCell.getStringCellValue());

                    } else if (Index == 2) {
                    row.setAttribute("ContractId", MytempCell.getNumericCellValue());

                    } else if (Index == 3) {
                    row.setAttribute("ContractSubject", MytempCell.getStringCellValue());

                    } else if (Index == 4) {
                        java.util.Date utilStartDate = MytempCell.getDateCellValue();
                        java.sql.Date date= new java.sql.Date(utilStartDate.getDate());
                    row.setAttribute("ContractStartDate", date);

                    } else if (Index == 5) {
                        java.util.Date utilStartDate = MytempCell.getDateCellValue();
                        java.sql.Date date= new java.sql.Date(utilStartDate.getDate());
                    row.setAttribute("ContractEndDate", date);

                    }else if (Index == 6) {
                    row.setAttribute("BuildingId", buildingId);
                    } 
                    } else {
                        Index++;
                    }
                    }
                    sno++; 
                    }
                    skipcnt++; 
                    } //Execute table viewObject executeOperation(“Execute”).execute(); }
                    
                }
        else if(i==4){
                        Integer skipRw = 1;
                        Integer skipcnt = 1;
                        Integer sno = 1;
                        
                        //Iterate over excel rows
                        for (org.apache.poi.ss.usermodel.Row tempRow : sheet) {
                        System.out.println(skipcnt + "–" + skipRw);
                        if (skipcnt > skipRw) { //skip first n row for labels.
                        //Create new row in table
                        executeOperation("CreateInsert4").execute();
                        //Get current row from iterator
                        BindingContext bindingContext = BindingContext.getCurrent();
                               @SuppressWarnings("deprecation")
                        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
                               MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
                            ViewObjectImpl attachmentVO = (ViewObjectImpl)am.findViewObject("MABuildingAttachmentImportVO1");  
                        Row row = attachmentVO.createRow();
                            
                        SequenceImpl seq = new SequenceImpl("XXMA.XXMA_ATTACHED_DOCS_SEQ", am.getDBTransaction());
                        attachmentDocumentId=seq.getSequenceNumber();
                        
                        int Index = 0;
                        //Iterate over row’s columns
                        for (int column = 0; column < tempRow.getLastCellNum(); column++) {
                        Cell MytempCell = tempRow.getCell(column);
                        if (MytempCell != null) {
                        Index = MytempCell.getColumnIndex();
                       
                        if (Index == 0) {
                        row.setAttribute("AttachedDocumentId", attachmentDocumentId);

                        }
                        else if (Index == 1) {
                        row.setAttribute("EntityName", MytempCell.getStringCellValue());

                        }else if (Index == 2) {
                        row.setAttribute("FileName", MytempCell.getStringCellValue());

                        } else if (Index == 3) {
                        row.setAttribute("FileContentType", MytempCell.getStringCellValue());
//                            DCBindingContainer dcBindings =
//                                (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
                            //OperationBinding operationBinding = dcBindings.getOperationBinding("Commit");
                            //operationBinding.execute();
                        } else if (Index == 4) {
                            java.util.Date utilStartDate = MytempCell.getDateCellValue();
                            java.sql.Date date= new java.sql.Date(utilStartDate.getDate());
                        row.setAttribute("UploadDate", date);

                        } else if (Index == 5) {
                        row.setAttribute("BuildingId", buildingId);

                        } else if (Index == 6) {
                            
//                            DataFormatter dataFormatter = new DataFormatter();
//                            String cellValue = dataFormatter.formatCellValue(MytempCell);
//                                    try {
//                                        Blobtest(cellValue);
//                                    } catch (SQLException e) {
//                                    }
                                }
                        } else {
                            Index++;
                        }
                        }
                        sno++; 
                        }
                        skipcnt++; 
                        } //Execute table viewObject executeOperation(“Execute”).execute(); }
                        
                    }
        }
    }
    
   /* public void Blobtest (String address) throws SQLException{
        System.out.print(address);
        try{
            DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
            Connection conn = DriverManager.getConnection ("jdbc:oracle:thin:@192.168.1.8:1521:VIS", "apps", "Applmgr_admin8");

            PreparedStatement ps = conn.prepareStatement("UPDATE XXMA.XXMA_ATTACHED_DOCUMENTS set FILE_DATA=? where ATTACHED_DOCUMENT_ID=?");
            oracle.sql.BLOB myBlob = oracle.sql.BLOB.createTemporary(conn, false, oracle.sql.BLOB.DURATION_SESSION);   
            byte[] buff = address.getBytes();
            myBlob.putBytes(1,buff);
            ps.setBlob(1, myBlob);     
            ps.setInt(2, attachmentDocumentId.intValue()); 
            int count = ps.executeUpdate();
            ps.close();
            conn.close();    
        }
        catch(Exception e){
            e.printStackTrace();   
        }
    }*/
    
    public BindingContainer getBindingsCont() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    
    public OperationBinding executeOperation(String operation) {
           OperationBinding createParam = getBindingsCont().getOperationBinding(operation);
        return createParam;
    }

       public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }


    public void setT1(RichToolbar t1) {
        this.t1 = t1;
    }

    public RichToolbar getT1() {
        return t1;
    }

    public void setIf1(RichInputFile if1) {
        this.if1 = if1;
    }

    public RichInputFile getIf1() {
        return if1;
    }

    public void setB5(RichButton b5) {
        this.b5 = b5;
    }

    public RichButton getB5() {
        return b5;
    }
}

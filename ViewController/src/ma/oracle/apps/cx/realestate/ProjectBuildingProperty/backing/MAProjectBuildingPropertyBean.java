package ma.oracle.apps.cx.realestate.ProjectBuildingProperty.backing;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.sql.SQLException;

import java.util.List;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.component.UISelectItems;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.ValueChangeEvent;

import javax.servlet.http.HttpSession;

import ma.oracle.apps.cx.realestate.building.views.MABuildingAttachmentVORowImpl;
import ma.oracle.apps.cx.realestate.project.views.MAProjectImagesVORowImpl;
import ma.oracle.apps.cx.realestate.property.modules.MARealEstatePropertyAMImpl;
import ma.oracle.apps.cx.realestate.setup.views.MAAttachedDocumentsVORowImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichCarousel;
import oracle.adf.view.rich.component.rich.data.RichCarouselItem;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputFile;
import oracle.adf.view.rich.component.rich.input.RichInputNumberSpinbox;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.layout.RichPanelStretchLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelTabbed;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichImage;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;
import oracle.adf.view.rich.component.rich.output.RichSpacer;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ViewObject;
import oracle.jbo.domain.BlobDomain;

import org.apache.myfaces.trinidad.component.UIXGroup;
import org.apache.myfaces.trinidad.event.DisclosureEvent;
import org.apache.myfaces.trinidad.model.UploadedFile;

public class MAProjectBuildingPropertyBean {
    private RichForm f1;
    private RichDocument d1;
    private RichPanelTabbed pt2;
    private RichShowDetailItem tab1;
    private RichShowDetailItem tab2;
    private RichShowDetailItem tab3;
    private RichMessages m1;
    private RichPanelStretchLayout psl1;
    private RichPanelStretchLayout psl2;
    private RichPanelFormLayout pfl1;
    private RichInputText it2;
    private RichInputText it5;
    private RichInputText it6;
    private RichInputText it7;
    private RichInputText it8;
    private RichInputText it9;
    private RichSelectBooleanCheckbox it3;
    private RichSelectBooleanCheckbox it4;
    private UIXGroup g1;
    private RichPanelStretchLayout psl3;
    private UIXGroup g2;
    private RichPanelStretchLayout psl4;
    private RichTable t2;
    private RichTable t3;
    private RichPanelCollection pc1;
    private RichToolbar t4;
    private RichButton b2;
    private RichPanelCollection pc2;
    private RichToolbar t5;
    private RichButton b3;
    private RichPanelBox pb1;
    private RichPanelBox pb2;
    private RichPanelBox pb3;
    private RichPanelGroupLayout pgl1;
    private RichPanelGroupLayout pgl3;
    private RichPanelGroupLayout pgl2;
    private RichToolbar t7;
    private RichInputText it17;
    private RichPanelCollection pc4;

    
    private RichButton b5;
    private RichTable t8;
    private RichPanelStretchLayout psl5;
    private RichCarousel c3;
    private RichCarouselItem ci1;
    private RichImage i1;
    private RichPanelStretchLayout psl6;
    private RichTable t1;
    private RichPanelStretchLayout psl7;
    private RichPanelStretchLayout psl8;
    private RichPanelStretchLayout psl9;
    private RichInputText it12;
    private RichInputText it13;
    private RichInputText it16;
    private RichInputText it18;
    private RichInputText it20;
    private RichInputText it21;
    private RichInputText it22;
    private RichInputText it23;
    private RichInputText it24;
    private RichInputNumberSpinbox it25;
    private RichInputNumberSpinbox it26;
    private RichPanelBox pb4;
    private RichTable t6;
    private RichPanelFormLayout pfl3;
    private RichInputNumberSpinbox it33;
    private RichSelectOneChoice soc6;
    private UISelectItems si6;
    private RichInputDate id8;
    private RichInputDate id9;
    private UIXGroup g3;
    private RichSpacer s5;
    private RichPanelGroupLayout pgl5;
    private RichPanelGroupLayout pgl6;
    private RichToolbar t9;
    private RichButton b1;
    private RichPanelGridLayout pgl4;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichGridRow gr2;
    private RichGridCell gc2;
    private RichPanelGroupLayout pgl7;
    private RichInputText it28;
    private RichInputDate id4;
    private RichInputText it29;
    private RichInputDate id5;
    private RichPanelGridLayout pgl8;
    private RichGridRow gr3;
    private RichGridCell gc3;
    private RichGridRow gr4;
    private RichGridCell gc4;
    private RichPanelGridLayout pgl9;
    private RichGridRow gr5;
    private RichGridCell gc5;
    private RichGridRow gr6;
    private RichGridCell gc6;
    private RichPanelGridLayout pgl10;
    private RichGridRow gr7;
    private RichGridCell gc7;
    private RichGridRow gr8;
    private RichGridCell gc8;
    private RichPanelStretchLayout psl11;
    private RichButton b4;
    private UIXGroup g4;
    private UIXGroup g5;
    private RichSelectBooleanCheckbox it27;
    private RichPanelCollection pc3;
    private RichToolbar t30;
    private RichButton b6;
    private RichPanelStretchLayout psl10;
    private RichPanelStretchLayout psl12;
    private RichPanelFormLayout pfl2;
    private RichSelectOneChoice soc2;
    private UISelectItems si2;
    private RichInputText it1;
    private RichInputText it10;
    private RichInputText it11;
    private RichSelectOneChoice soc3;
    private UISelectItems si3;
    private RichSelectOneChoice soc4;
    private UISelectItems si4;
    private RichInputDate id2;
    private RichInputDate id3;
    private static String isAttachFlag = "0";
    private RichTable t130;
    private RichTable t10;
    private RichButton b8;
    private RichButton b9;
    private RichButton b10;
    private RichButton b11;
    private RichButton b7;
    private RichButton b123;
    private RichPanelStretchLayout psl13;
    private RichPanelGridLayout pgl11;
    private RichGridRow gr9;
    private RichGridCell gc9;
    private RichGridCell gc10;
    private RichGridRow gr10;
    private RichGridCell gc11;
    private RichGridCell gc12;
    private RichGridRow gr11;
    private RichGridCell gc13;
    private RichGridCell gc14;
    private RichGridRow gr12;
    private RichGridCell gc15;
    private RichGridCell gc16;
    private RichGridRow gr13;
    private RichGridCell gc17;
    private RichGridCell gc18;
    private RichGridRow gr14;
    private RichGridCell gc19;
    private RichGridCell gc20;
    private RichPanelFormLayout pfl4;
    private RichInputText it34;
    private RichSelectOneChoice soc5;
    private UISelectItems si5;
    private RichSelectOneChoice soc7;
    private UISelectItems si7;
    private RichSelectOneChoice soc8;
    private UISelectItems si8;
    private RichSelectOneChoice soc9;
    private UISelectItems si9;
    private RichInputText it35;
    private RichSelectOneChoice soc10;
    private UISelectItems si10;
    private RichInputText it36;
    private RichInputText it37;
    private RichInputText it38;
    private RichInputText it39;
    private RichInputText it40;
    private RichSelectOneChoice soc11;
    private UISelectItems si11;
    private RichInputText it43;
    private RichInputText it44;
    private RichInputText it45;
    private RichSelectBooleanCheckbox sbc2;
    private RichPanelFormLayout pfl5;
    private RichInputText it46;
    private RichSelectOneChoice soc12;
    private UISelectItems si12;
    private RichInputDate id10;
    private RichInputDate id11;
    private RichSelectOneChoice soc13;
    private UISelectItems si13;
    private RichInputDate id12;
    private RichPanelFormLayout pfl6;
    private RichInputText it47;
    private RichInputText it48;
    private RichInputText it49;
    private RichInputText it50;
    private RichInputText it51;
    private RichInputText it52;
    private RichInputText it53;
    private RichInputText it54;
    private RichInputText it55;
    private RichInputText it56;
    private RichInputText it57;
    private RichInputText it58;
    private RichInputText it59;
    private RichInputText it60;
    private RichInputText it61;
    private RichInputText it62;
    private RichPanelFormLayout pfl7;
    private RichSelectOneChoice soc14;
    private UISelectItems si14;
    private RichInputText it63;
    private RichInputText it64;
    private RichInputDate id13;
    private RichInputDate id14;
    private RichPanelGroupLayout pgl12;
    private RichInputDate id15;
    private RichInputText it69;
    private RichInputDate id16;
    private RichInputText it70;
    private UIXGroup g6;
    private UIXGroup g7;
    private RichInputFile if2;
    private RichTable t13;
    private RichPanelGroupLayout pgl13;
    private RichSelectBooleanCheckbox it42;
    private RichSelectBooleanCheckbox it41;
    private RichPanelGroupLayout pgl14;
    private RichPanelGroupLayout pgl15;
    private RichButton b125;
    private RichButton b13;
    private RichToolbar t14;
    private RichButton b14;
    private RichButton b15;
    private RichPanelCollection pc6;
    private RichToolbar t16;
    private RichButton b127;
    private RichButton b1298;
    private RichTable t12;
    private RichPanelCollection pc5;
    private RichToolbar t15;
    private RichButton b12;
    private RichTable t11;
    private RichLink l10;
    private RichPanelBox pb5;
    private RichPanelBox pb6;
    private RichPanelBox pb7;
    private RichInputText it71;
    private RichInputText it72;
    private RichPanelBox pb8;
    private RichPanelBox pb9;
    private RichPanelBox pb10;
    private RichPanelFormLayout pfl8;
    private RichPanelBox pb11;
    private RichInputText it31;
    private RichToolbar t17;
    private RichButton b16;
    private RichButton b17;
    private RichInputText ot8;
    private RichInputText it67;
    private RichInputText it73;
    private RichOutputText ot91;
    private RichToolbar t18;
    private RichPanelLabelAndMessage plam1;
    private RichSelectBooleanCheckbox sbc4;
    private RichInputText it73333;


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

    public void setPt2(RichPanelTabbed pt2) {
        this.pt2 = pt2;
    }

    public RichPanelTabbed getPt2() {
        return pt2;
    }

    public void setTab1(RichShowDetailItem tab1) {
        this.tab1 = tab1;
    }

    public RichShowDetailItem getTab1() {
        return tab1;
    }

    public void setTab2(RichShowDetailItem tab2) {
        this.tab2 = tab2;
    }

    public RichShowDetailItem getTab2() {
        return tab2;
    }

    public void setTab3(RichShowDetailItem tab3) {
        this.tab3 = tab3;
    }

    public RichShowDetailItem getTab3() {
        return tab3;
    }


    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }


    public void setPsl1(RichPanelStretchLayout psl1) {
        this.psl1 = psl1;
    }

    public RichPanelStretchLayout getPsl1() {
        return psl1;
    }

    public void setPsl2(RichPanelStretchLayout psl2) {
        this.psl2 = psl2;
    }

    public RichPanelStretchLayout getPsl2() {
        return psl2;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }


    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }


    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }

    public void setIt7(RichInputText it7) {
        this.it7 = it7;
    }

    public RichInputText getIt7() {
        return it7;
    }

    public void setIt8(RichInputText it8) {
        this.it8 = it8;
    }

    public RichInputText getIt8() {
        return it8;
    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public void setIt3(RichSelectBooleanCheckbox it3) {
        this.it3 = it3;
    }

    public RichSelectBooleanCheckbox getIt3() {
        return it3;
    }

    public void setIt4(RichSelectBooleanCheckbox it4) {
        this.it4 = it4;
    }

    public RichSelectBooleanCheckbox getIt4() {
        return it4;
    }

    public void setG1(UIXGroup g1) {
        this.g1 = g1;
    }

    public UIXGroup getG1() {
        return g1;
    }


    public void setPsl3(RichPanelStretchLayout psl3) {
        this.psl3 = psl3;
    }

    public RichPanelStretchLayout getPsl3() {
        return psl3;
    }

    public void setG2(UIXGroup g2) {
        this.g2 = g2;
    }

    public UIXGroup getG2() {
        return g2;
    }


    public void setPsl4(RichPanelStretchLayout psl4) {
        this.psl4 = psl4;
    }

    public RichPanelStretchLayout getPsl4() {
        return psl4;
    }

    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }

    public void setT3(RichTable t3) {
        this.t3 = t3;
    }

    public RichTable getT3() {
        return t3;
    }

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setT4(RichToolbar t4) {
        this.t4 = t4;
    }

    public RichToolbar getT4() {
        return t4;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setPc2(RichPanelCollection pc2) {
        this.pc2 = pc2;
    }

    public RichPanelCollection getPc2() {
        return pc2;
    }

    public void setT5(RichToolbar t5) {
        this.t5 = t5;
    }

    public RichToolbar getT5() {
        return t5;
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
    }

    public void setPb2(RichPanelBox pb2) {
        this.pb2 = pb2;
    }

    public RichPanelBox getPb2() {
        return pb2;
    }

    public void setPb3(RichPanelBox pb3) {
        this.pb3 = pb3;
    }

    public RichPanelBox getPb3() {
        return pb3;
    }


    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }
    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }


    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setT7(RichToolbar t7) {
        this.t7 = t7;
    }

    public RichToolbar getT7() {
        return t7;
    }

    public void setIt17(RichInputText it17) {
        this.it17 = it17;
    }

    public RichInputText getIt17() {
        return it17;
    }


    public void setPc4(RichPanelCollection pc4) {
        this.pc4 = pc4;
    }

    public RichPanelCollection getPc4() {
        return pc4;
    }

   

    

    public void setB5(RichButton b5) {
        this.b5 = b5;
    }

    public RichButton getB5() {
        return b5;
    }

    public void setT8(RichTable t8) {
        this.t8 = t8;
    }

    public RichTable getT8() {
        return t8;
    }
    /**
     * Generic Method to execute operation
     * */
    public OperationBinding executeOperation(String operation) {
        OperationBinding createParam = getBindingsCont().getOperationBinding(operation);
        return createParam;
    }

    @SuppressWarnings("unchecked")
    public void uploadFileVCE(ValueChangeEvent vce) {
        // Add event code here...
//        BindingContext bindingContext = BindingContext.getCurrent();
//                                DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
//                                       MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
//                                       am.getDBTransaction().commit();
        if (vce.getNewValue() != null) {
        //Get File Object from VC Event
        List<UploadedFile> lf = (List<UploadedFile>) vce.getNewValue();

        //Traverse over file list to upload all files
        for (UploadedFile fileVal : lf) {
        //Method to check if this file is uploaded previously or not
        OperationBinding duplOb = executeOperation("checkDuplicateFile");
        duplOb.getParamsMap().put("fileNm", fileVal.getFilename());
        duplOb.execute();
        if (duplOb.getResult() != null && "Y".equalsIgnoreCase(duplOb.getResult().toString())) {

        //Method to insert data in table to keep track of uploaded files
            if(fileVal!=null && fileVal.getFilename()!=null && fileVal.getContentType()!=null)
            {
        OperationBinding ob = executeOperation("setFileData");
        ob.getParamsMap().put("name", fileVal.getFilename());
        ob.getParamsMap().put("path", "DB");
        ob.getParamsMap().put("contTyp", fileVal.getContentType());
        ob.execute();
        //Upload and Save file to DB
        UploadFileActionToDB(fileVal);
        //Commit the transaction
        //executeOperation("Commit").execute();
        //Execute ViewObjecy
        //executeOperation("Execute").execute();
        }
        }
        // Reset inputFile component after upload
       // ResetUtils.reset(vce.getComponent());
        }
        }
    }
    /**Method to upload file in Database
     * @return
     */
    public String UploadFileActionToDB(UploadedFile file) {
        UploadedFile myfile = file;
        if (myfile != null) {
            //Get current row of viewObject using iterator
            DCIteratorBinding imageIter = (DCIteratorBinding) getBindingsCont().get("MAProjectImagesVOIterator");
            ViewObject vo = imageIter.getViewObject();
            MAProjectImagesVORowImpl curRow = (MAProjectImagesVORowImpl) vo.getCurrentRow();

         //   try {
                //Save image in Blob column in database
                curRow.setImageContent(createBlobDomain(myfile));

          //  } catch (Exception ex) {
           //     System.out.println("Exception-" + ex);
            //}

        }
        return null;
    }
    /*****Generic Method to Get BindingContainer**/
    public BindingContainer getBindingsCont() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    /**Method to create blobdomain for uploaded file
     * */
    @SuppressWarnings("oracle.jdeveloper.java.nested-assignment")
    private BlobDomain createBlobDomain(UploadedFile file) {
        InputStream in = null;
        BlobDomain blobDomain = null;
        OutputStream out = null;

        try {
            in = file.getInputStream();

            blobDomain = new BlobDomain();
            out = blobDomain.getBinaryOutputStream();
            byte[] buffer = new byte[8192];
            int bytesRead = 0;

            while ((bytesRead = in.read(buffer, 0, 8192)) != -1) {
                out.write(buffer, 0, bytesRead);
            }

            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.fillInStackTrace();
        }

        return blobDomain;
    }


    public void setPsl5(RichPanelStretchLayout psl5) {
        this.psl5 = psl5;
    }

    public RichPanelStretchLayout getPsl5() {
        return psl5;
    }

    public void setC3(RichCarousel c3) {
        this.c3 = c3;
    }

    public RichCarousel getC3() {
        return c3;
    }

    public void setCi1(RichCarouselItem ci1) {
        this.ci1 = ci1;
    }

    public RichCarouselItem getCi1() {
        return ci1;
    }

    public void setI1(RichImage i1) {
        this.i1 = i1;
    }

    public RichImage getI1() {
        return i1;
    }

    public void setPsl6(RichPanelStretchLayout psl6) {
        this.psl6 = psl6;
    }

    public RichPanelStretchLayout getPsl6() {
        return psl6;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    @SuppressWarnings("unchecked")
    public void uploadAttachFileVCE(ValueChangeEvent valueChangeEvent) {
//        BindingContext bindingContext = BindingContext.getCurrent();
//                                DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
//                                       MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
//                                       am.getDBTransaction().commit();
        if (valueChangeEvent.getNewValue() != null) {
        //Get File Object from VC Event
            @SuppressWarnings("unchecked")
            List<UploadedFile> lf = (List<UploadedFile>) valueChangeEvent.getNewValue();

        //Traverse over file list to upload all files
        for (UploadedFile fileVal : lf) {
        //Method to check if this file is uploaded previously or not
        OperationBinding duplOb = executeOperation("checkAttachDuplicateFile");
        duplOb.getParamsMap().put("fileNm", fileVal.getFilename());
        duplOb.execute();
        if (duplOb.getResult() != null && "Y".equalsIgnoreCase(duplOb.getResult().toString())) {

        //Method to insert data in table to keep track of uploaded files
            if(fileVal!=null && fileVal.getFilename()!=null && fileVal.getContentType()!=null)
            {
        OperationBinding ob = executeOperation("setAttachFileData");
        ob.getParamsMap().put("name", fileVal.getFilename());
        ob.getParamsMap().put("path", "DB");
        ob.getParamsMap().put("contTyp", fileVal.getContentType());
        ob.execute();
        //Upload and Save file to DB
        UploadFileAttachActionToDB(fileVal);
        //Commit the transaction
        //executeOperation("Commit").execute();
        //Execute ViewObjecy
        //executeOperation("Execute").execute();
        }
        }
        // Reset inputFile component after upload
       // ResetUtils.reset(valueChangeEvent.getComponent());
        }
        }
    }
    /**Method to download file from actual path
     * @param facesContext
     * @param outputStream
     */
    @SuppressWarnings("oracle.jdeveloper.java.nested-assignment")
    public void downloadFileListene(FacesContext facesContext, OutputStream outputStream) throws IOException {

        DCIteratorBinding imageIter = (DCIteratorBinding) getBindingsCont().get("MAProjectAttachedDocumentsVOIterator");
        ViewObject vo = imageIter.getViewObject();
        MAAttachedDocumentsVORowImpl curRow = (MAAttachedDocumentsVORowImpl) vo.getCurrentRow();

        BlobDomain blob = curRow.getFileData();
        BufferedInputStream in = null;

        in = new BufferedInputStream(blob.getBinaryStream());

        int b;
        byte[] buffer = new byte[10240];
        while ((b = in.read(buffer, 0, 10240)) != -1) {
            outputStream.write(buffer, 0, b);
        }
        outputStream.close();
    }
    
    public String UploadFileAttachActionToDB(UploadedFile file) {
        UploadedFile myfile = file;
        if (myfile != null) {
            //Get current row of viewObject using iterator
            DCIteratorBinding fileIter = (DCIteratorBinding) getBindingsCont().get("MAProjectAttachedDocumentsVOIterator");
            ViewObject vo = fileIter.getViewObject();
            MAAttachedDocumentsVORowImpl curRow = (MAAttachedDocumentsVORowImpl) vo.getCurrentRow();

           // try {
                //Save image in Blob column in database
                curRow.setFileData(createBlobDomain(myfile));

          //  } catch (Exception ex) {
            //    System.out.println("Exception-" + ex);
            //}

        }
        return null;
    }

    public void setPsl7(RichPanelStretchLayout psl7) {
        this.psl7 = psl7;
    }

    public RichPanelStretchLayout getPsl7() {
        return psl7;
    }

    public void setPsl8(RichPanelStretchLayout psl8) {
        this.psl8 = psl8;
    }

    public RichPanelStretchLayout getPsl8() {
        return psl8;
    }

    public void setPsl9(RichPanelStretchLayout psl9) {
        this.psl9 = psl9;
    }

    public RichPanelStretchLayout getPsl9() {
        return psl9;
    }


    public void setIt12(RichInputText it12) {
        this.it12 = it12;
    }

    public RichInputText getIt12() {
        return it12;
    }

    public void setIt13(RichInputText it13) {
        this.it13 = it13;
    }

    public RichInputText getIt13() {
        return it13;
    }

    public void setIt16(RichInputText it16) {
        this.it16 = it16;
    }

    public RichInputText getIt16() {
        return it16;
    }

    public void setIt18(RichInputText it18) {
        this.it18 = it18;
    }

    public RichInputText getIt18() {
        return it18;
    }

    public void setIt20(RichInputText it20) {
        this.it20 = it20;
    }

    public RichInputText getIt20() {
        return it20;
    }

    public void setIt21(RichInputText it21) {
        this.it21 = it21;
    }

    public RichInputText getIt21() {
        return it21;
    }

    public void setIt22(RichInputText it22) {
        this.it22 = it22;
    }

    public RichInputText getIt22() {
        return it22;
    }

    public void setIt23(RichInputText it23) {
        this.it23 = it23;
    }

    public RichInputText getIt23() {
        return it23;
    }

    public void setIt24(RichInputText it24) {
        this.it24 = it24;
    }

    public RichInputText getIt24() {
        return it24;
    }

    public void setIt25(RichInputNumberSpinbox it25) {
        this.it25 = it25;
    }

    public RichInputNumberSpinbox getIt25() {
        return it25;
    }

    public void setIt26(RichInputNumberSpinbox it26) {
        this.it26 = it26;
    }

    public RichInputNumberSpinbox getIt26() {
        return it26;
    }


    public void setPb4(RichPanelBox pb4) {
        this.pb4 = pb4;
    }

    public RichPanelBox getPb4() {
        return pb4;
    }


    public void setT6(RichTable t6) {
        this.t6 = t6;
    }

    public RichTable getT6() {
        return t6;
    }


    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
    }

    public void setIt33(RichInputNumberSpinbox it33) {
        this.it33 = it33;
    }

    public RichInputNumberSpinbox getIt33() {
        return it33;
    }

    public void setSoc6(RichSelectOneChoice soc6) {
        this.soc6 = soc6;
    }

    public RichSelectOneChoice getSoc6() {
        return soc6;
    }

    public void setSi6(UISelectItems si6) {
        this.si6 = si6;
    }

    public UISelectItems getSi6() {
        return si6;
    }

    public void setId8(RichInputDate id8) {
        this.id8 = id8;
    }

    public RichInputDate getId8() {
        return id8;
    }

    public void setId9(RichInputDate id9) {
        this.id9 = id9;
    }

    public RichInputDate getId9() {
        return id9;
    }


    public void setG3(UIXGroup g3) {
        this.g3 = g3;
    }

    public UIXGroup getG3() {
        return g3;
    }


    public void setS5(RichSpacer s5) {
        this.s5 = s5;
    }

    public RichSpacer getS5() {
        return s5;
    }


    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }


    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
    }

    public void setT9(RichToolbar t9) {
        this.t9 = t9;
    }

    public RichToolbar getT9() {
        return t9;
    }

    @SuppressWarnings("oracle.jdeveloper.java.unchecked-conversion-or-cast")
    public void uploadBuildAttachFileVCE(ValueChangeEvent valueChangeEvent) {
        isAttachFlag = "attached";
//        BindingContext bindingContext = BindingContext.getCurrent();
//                        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
//                               MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
//                               am.getDBTransaction().commit();
        if (valueChangeEvent.getNewValue() != null) {
                //Get File Object from VC Event
                    @SuppressWarnings("unchecked")
                    List<UploadedFile> lf = (List<UploadedFile>) valueChangeEvent.getNewValue();

                //Traverse over file list to upload all files
                for (UploadedFile fileVal : lf) {
                //Method to check if this file is uploaded previously or not
                OperationBinding duplOb = executeOperation("checkBuildAttachDuplicateFile");
                duplOb.getParamsMap().put("fileNm", fileVal.getFilename());
                duplOb.execute();
                if (duplOb.getResult() != null && "Y".equalsIgnoreCase(duplOb.getResult().toString())) {

                //Method to insert data in table to keep track of uploaded files
                    if(fileVal!=null && fileVal.getFilename()!=null && fileVal.getContentType()!=null)
                    {
                OperationBinding ob = executeOperation("setBuildAttachFileData");
                ob.getParamsMap().put("name", fileVal.getFilename());
                ob.getParamsMap().put("path", "DB");
                ob.getParamsMap().put("contTyp", fileVal.getContentType());
                ob.execute();
                //Upload and Save file to DB
                UploadBuildAttachActionToDB(fileVal);
                //Commit the transaction
                //executeOperation("Commit").execute();
                //Execute ViewObjecy
                //
               // BindingContext bindingContext = BindingContext.getCurrent();
                //DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
                  //     MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
                      // am.getDBTransaction().commit();
                      // executeOperation("Execute1").execute();
                    
                }
                }
                // Reset inputFile component after upload
                //ResetUtils.reset(valueChangeEvent.getComponent());
                }
                }
    }
    public String UploadBuildAttachActionToDB(UploadedFile file) {
        UploadedFile myfile = file;
        if (myfile != null) {
            //Get current row of viewObject using iterator
            DCIteratorBinding fileIter = (DCIteratorBinding) getBindingsCont().get("MABuildingAttachmentVOIterator");
            ViewObject vo = fileIter.getViewObject();
            MABuildingAttachmentVORowImpl curRow = (MABuildingAttachmentVORowImpl) vo.getCurrentRow();

            //try {
                //Save image in Blob column in database
                curRow.setFileData(createBlobDomain(myfile));

//} catch (Exception ex) {
           //     System.out.println("Exception-" + ex);
           // }

        }
        return null;
    }


    @SuppressWarnings("oracle.jdeveloper.java.nested-assignment")
    public void downloadBuildFileListener(FacesContext facesContext, OutputStream outputStream) throws IOException {
        DCIteratorBinding imageIter = (DCIteratorBinding) getBindingsCont().get("MABuildingAttachmentVOIterator");
              ViewObject vo = imageIter.getViewObject();
              MABuildingAttachmentVORowImpl curRow = (MABuildingAttachmentVORowImpl) vo.getCurrentRow();

              BlobDomain blob = curRow.getFileData();
              BufferedInputStream in = null;

              in = new BufferedInputStream(blob.getBinaryStream());

              int b;
              byte[] buffer = new byte[10240];
              while ((b = in.read(buffer, 0, 10240)) != -1) {
                  outputStream.write(buffer, 0, b);
              }
              outputStream.close();

    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }


    public void CreateNewProBuilPrpRows(DisclosureEvent disclosureEvent) {
        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("oracle.jdeveloper.java.semantic-warning")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        UIComponent uiComp = (UIComponent)disclosureEvent.getSource();
             String  tabSelected = uiComp.getId();
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        String buildEdit = (String)sessionScope.get("buildingEdit");
        String propEdit = (String)sessionScope.get("propEdit");
        if(tabSelected.equals("tab3"))
        {
            if(propEdit!=null)
            {}
         else
         {  
                 am.createProperty();
                 am.createPropRentOption();
                 am.createPropFinancials();
                 am.createPropOwner();
             //String error = throwable.getMessage();;
                     //Handle the error or log the error
                     //throw throwable;
                     //Log it 
//                     FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,"la n7tag al mal", null );
//                      
//                     FacesContext.getCurrentInstance().addMessage(null, message);
         }
        
        }
       if(tabSelected.equals("tab2")) 
        {
            if(buildEdit!=null)
            {} 
            else
            {
                        am.createBuilding();
                        am.createBuildRentOption();
             }
        }
       
    }
    public void setPgl4(RichPanelGridLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGridLayout getPgl4() {
        return pgl4;
    }

    public void setGr1(RichGridRow gr1) {
        this.gr1 = gr1;
    }

    public RichGridRow getGr1() {
        return gr1;
    }

    public void setGc1(RichGridCell gc1) {
        this.gc1 = gc1;
    }

    public RichGridCell getGc1() {
        return gc1;
    }

    public void setGr2(RichGridRow gr2) {
        this.gr2 = gr2;
    }

    public RichGridRow getGr2() {
        return gr2;
    }

    public void setGc2(RichGridCell gc2) {
        this.gc2 = gc2;
    }

    public RichGridCell getGc2() {
        return gc2;
    }

    public void setPgl7(RichPanelGroupLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGroupLayout getPgl7() {
        return pgl7;
    }


    public void setIt28(RichInputText it28) {
        this.it28 = it28;
    }

    public RichInputText getIt28() {
        return it28;
    }

    public void setId4(RichInputDate id4) {
        this.id4 = id4;
    }

    public RichInputDate getId4() {
        return id4;
    }

    public void setIt29(RichInputText it29) {
        this.it29 = it29;
    }

    public RichInputText getIt29() {
        return it29;
    }

    public void setId5(RichInputDate id5) {
        this.id5 = id5;
    }

    public RichInputDate getId5() {
        return id5;
    }

    public void setPgl8(RichPanelGridLayout pgl8) {
        this.pgl8 = pgl8;
    }

    public RichPanelGridLayout getPgl8() {
        return pgl8;
    }

    public void setGr3(RichGridRow gr3) {
        this.gr3 = gr3;
    }

    public RichGridRow getGr3() {
        return gr3;
    }

    public void setGc3(RichGridCell gc3) {
        this.gc3 = gc3;
    }

    public RichGridCell getGc3() {
        return gc3;
    }

    public void setGr4(RichGridRow gr4) {
        this.gr4 = gr4;
    }

    public RichGridRow getGr4() {
        return gr4;
    }

    public void setGc4(RichGridCell gc4) {
        this.gc4 = gc4;
    }

    public RichGridCell getGc4() {
        return gc4;
    }

    public void setPgl9(RichPanelGridLayout pgl9) {
        this.pgl9 = pgl9;
    }

    public RichPanelGridLayout getPgl9() {
        return pgl9;
    }

    public void setGr5(RichGridRow gr5) {
        this.gr5 = gr5;
    }

    public RichGridRow getGr5() {
        return gr5;
    }

    public void setGc5(RichGridCell gc5) {
        this.gc5 = gc5;
    }

    public RichGridCell getGc5() {
        return gc5;
    }

    public void setGr6(RichGridRow gr6) {
        this.gr6 = gr6;
    }

    public RichGridRow getGr6() {
        return gr6;
    }

    public void setGc6(RichGridCell gc6) {
        this.gc6 = gc6;
    }

    public RichGridCell getGc6() {
        return gc6;
    }

    public void setPgl10(RichPanelGridLayout pgl10) {
        this.pgl10 = pgl10;
    }

    public RichPanelGridLayout getPgl10() {
        return pgl10;
    }

    public void setGr7(RichGridRow gr7) {
        this.gr7 = gr7;
    }

    public RichGridRow getGr7() {
        return gr7;
    }

    public void setGc7(RichGridCell gc7) {
        this.gc7 = gc7;
    }

    public RichGridCell getGc7() {
        return gc7;
    }

    public void setGr8(RichGridRow gr8) {
        this.gr8 = gr8;
    }

    public RichGridRow getGr8() {
        return gr8;
    }

    public void setGc8(RichGridCell gc8) {
        this.gc8 = gc8;
    }

    public RichGridCell getGc8() {
        return gc8;
    }


    public void setPsl11(RichPanelStretchLayout psl11) {
        this.psl11 = psl11;
    }

    public RichPanelStretchLayout getPsl11() {
        return psl11;
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }

    public void setG4(UIXGroup g4) {
        this.g4 = g4;
    }

    public UIXGroup getG4() {
        return g4;
    }

    public void setG5(UIXGroup g5) {
        this.g5 = g5;
    }

    public UIXGroup getG5() {
        return g5;
    }

    public void setIt27(RichSelectBooleanCheckbox it27) {
        this.it27 = it27;
    }

    public RichSelectBooleanCheckbox getIt27() {
        return it27;
    }

    public void setPc3(RichPanelCollection pc3) {
        this.pc3 = pc3;
    }

    public RichPanelCollection getPc3() {
        return pc3;
    }

    public void setT30(RichToolbar t30) {
        this.t30 = t30;
    }

    public RichToolbar getT30() {
        return t30;
    }


    public void setB6(RichButton b6) {
        this.b6 = b6;
    }

    public RichButton getB6() {
        return b6;
    }

    public void setPsl10(RichPanelStretchLayout psl10) {
        this.psl10 = psl10;
    }

    public RichPanelStretchLayout getPsl10() {
        return psl10;
    }

    public void setPsl12(RichPanelStretchLayout psl12) {
        this.psl12 = psl12;
    }

    public RichPanelStretchLayout getPsl12() {
        return psl12;
    }

    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
    }

    public void setSi2(UISelectItems si2) {
        this.si2 = si2;
    }

    public UISelectItems getSi2() {
        return si2;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setIt10(RichInputText it10) {
        this.it10 = it10;
    }

    public RichInputText getIt10() {
        return it10;
    }

    public void setIt11(RichInputText it11) {
        this.it11 = it11;
    }

    public RichInputText getIt11() {
        return it11;
    }

    public void setSoc3(RichSelectOneChoice soc3) {
        this.soc3 = soc3;
    }

    public RichSelectOneChoice getSoc3() {
        return soc3;
    }

    public void setSi3(UISelectItems si3) {
        this.si3 = si3;
    }

    public UISelectItems getSi3() {
        return si3;
    }

    public void setSoc4(RichSelectOneChoice soc4) {
        this.soc4 = soc4;
    }

    public RichSelectOneChoice getSoc4() {
        return soc4;
    }

    public void setSi4(UISelectItems si4) {
        this.si4 = si4;
    }

    public UISelectItems getSi4() {
        return si4;
    }

    public void setId2(RichInputDate id2) {
        this.id2 = id2;
    }

    public RichInputDate getId2() {
        return id2;
    }

    public void setId3(RichInputDate id3) {
        this.id3 = id3;
    }

    public RichInputDate getId3() {
        return id3;
    }


    public void setT130(RichTable t130) {
   
         this.t130 = t130;
    }
public RichTable getT130() {
        return t130;
    }


    public String creatBuild() {
        // Add event code here...
        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("oracle.jdeveloper.java.semantic-warning")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
               MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
               am.createBuilding();
               am.createBuildRentOption();
               return null;
    }
    public String creatProperty() {
        // Add event code here...
        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings({ "oracle.jdeveloper.java.semantic-warning", "deprecation" })
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
               MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        am.createProperty();
        am.createPropRentOption();
        am.createPropFinancials();
        am.createPropOwner();
               return null;
    }

    public void setT10(RichTable t10) {
        this.t10 = t10;
    }

    public RichTable getT10() {
        return t10;
    }


    public void checkEdit(PhaseEvent phaseEvent) {
        // Add event code here...
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        String buildEdit = (String)sessionScope.get("buildingEdit");
        String propEdit = (String)sessionScope.get("propEdit");
        if(buildEdit!=null)
        {
        RichPanelTabbed richPanelTabbed = this.getPt2();
               for (UIComponent child : richPanelTabbed.getChildren()) {
                   RichShowDetailItem sdi = (RichShowDetailItem) child;
                   if ("tab1".equals(sdi.getId()))
                   {
                                        sdi.setDisclosed(false);
                                        sdi.setRendered(false);
                                   } else if ("tab2".equals(sdi.getId())){
                                        sdi.setDisclosed(true);
                                       sdi.setRendered(true);
                                   } else {
                                        sdi.setDisclosed(false);
                                        sdi.setRendered(false);
                                   }
               }
        }
        if(propEdit!=null)
        {
        RichPanelTabbed richPanelTabbed = this.getPt2();
               for (UIComponent child : richPanelTabbed.getChildren()) {
                   RichShowDetailItem sdi = (RichShowDetailItem) child;
                   if ("tab1".equals(sdi.getId()))
                   {
                                        sdi.setDisclosed(false);
                                       sdi.setRendered(false);
                                   } else if ("tab2".equals(sdi.getId())){
                                        sdi.setDisclosed(false);
                                       sdi.setRendered(false);
                                   } else if ("tab3".equals(sdi.getId())){
                                        sdi.setDisclosed(true);
                                       sdi.setRendered(true);
                                   }
               }
        }
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession) ectx.getSession(false);
        userSession.setAttribute("buildingEdit", null);
        userSession.setAttribute("propEdit", null);
        
        BindingContext bindingContext;
        bindingContext = BindingContext.getCurrent();
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        am.set_lang();
    }


    public void setB8(RichButton b8) {
        this.b8 = b8;
    }

    public RichButton getB8() {
        return b8;
    }

    public void setB9(RichButton b9) {
        this.b9 = b9;
    }

    public RichButton getB9() {
        return b9;
    }

    public void setB10(RichButton b10) {
        this.b10 = b10;
    }

    public RichButton getB10() {
        return b10;
    }

    public void setB11(RichButton b11) {
        this.b11 = b11;
    }

    public RichButton getB11() {
        return b11;
    }


    public void setB7(RichButton b7) {
        this.b7 = b7;
    }

    public RichButton getB7() {
        return b7;
    }
    public void setB123(RichButton b123) {
        this.b123 = b123;
    }

    public RichButton getB123() {
        return b123;
    }

    public void setPsl13(RichPanelStretchLayout psl13) {
        this.psl13 = psl13;
    }

    public RichPanelStretchLayout getPsl13() {
        return psl13;
    }


    public void setPgl11(RichPanelGridLayout pgl11) {
        this.pgl11 = pgl11;
    }

    public RichPanelGridLayout getPgl11() {
        return pgl11;
    }

    public void setGr9(RichGridRow gr9) {
        this.gr9 = gr9;
    }

    public RichGridRow getGr9() {
        return gr9;
    }

    public void setGc9(RichGridCell gc9) {
        this.gc9 = gc9;
    }

    public RichGridCell getGc9() {
        return gc9;
    }

    public void setGc10(RichGridCell gc10) {
        this.gc10 = gc10;
    }

    public RichGridCell getGc10() {
        return gc10;
    }

    public void setGr10(RichGridRow gr10) {
        this.gr10 = gr10;
    }

    public RichGridRow getGr10() {
        return gr10;
    }

    public void setGc11(RichGridCell gc11) {
        this.gc11 = gc11;
    }

    public RichGridCell getGc11() {
        return gc11;
    }

    public void setGc12(RichGridCell gc12) {
        this.gc12 = gc12;
    }

    public RichGridCell getGc12() {
        return gc12;
    }

    public void setGr11(RichGridRow gr11) {
        this.gr11 = gr11;
    }

    public RichGridRow getGr11() {
        return gr11;
    }

    public void setGc13(RichGridCell gc13) {
        this.gc13 = gc13;
    }

    public RichGridCell getGc13() {
        return gc13;
    }

    public void setGc14(RichGridCell gc14) {
        this.gc14 = gc14;
    }

    public RichGridCell getGc14() {
        return gc14;
    }

    public void setGr12(RichGridRow gr12) {
        this.gr12 = gr12;
    }

    public RichGridRow getGr12() {
        return gr12;
    }

    public void setGc15(RichGridCell gc15) {
        this.gc15 = gc15;
    }

    public RichGridCell getGc15() {
        return gc15;
    }

    public void setGc16(RichGridCell gc16) {
        this.gc16 = gc16;
    }

    public RichGridCell getGc16() {
        return gc16;
    }

    public void setGr13(RichGridRow gr13) {
        this.gr13 = gr13;
    }

    public RichGridRow getGr13() {
        return gr13;
    }

    public void setGc17(RichGridCell gc17) {
        this.gc17 = gc17;
    }

    public RichGridCell getGc17() {
        return gc17;
    }

    public void setGc18(RichGridCell gc18) {
        this.gc18 = gc18;
    }

    public RichGridCell getGc18() {
        return gc18;
    }

    public void setGr14(RichGridRow gr14) {
        this.gr14 = gr14;
    }

    public RichGridRow getGr14() {
        return gr14;
    }

    public void setGc19(RichGridCell gc19) {
        this.gc19 = gc19;
    }

    public RichGridCell getGc19() {
        return gc19;
    }

    public void setGc20(RichGridCell gc20) {
        this.gc20 = gc20;
    }

    public RichGridCell getGc20() {
        return gc20;
    }

    public void setPfl4(RichPanelFormLayout pfl4) {
        this.pfl4 = pfl4;
    }

    public RichPanelFormLayout getPfl4() {
        return pfl4;
    }


    public void setIt34(RichInputText it34) {
        this.it34 = it34;
    }

    public RichInputText getIt34() {
        return it34;
    }

    public void setSoc5(RichSelectOneChoice soc5) {
        this.soc5 = soc5;
    }

    public RichSelectOneChoice getSoc5() {
        return soc5;
    }

    public void setSi5(UISelectItems si5) {
        this.si5 = si5;
    }

    public UISelectItems getSi5() {
        return si5;
    }

    public void setSoc7(RichSelectOneChoice soc7) {
        this.soc7 = soc7;
    }

    public RichSelectOneChoice getSoc7() {
        return soc7;
    }

    public void setSi7(UISelectItems si7) {
        this.si7 = si7;
    }

    public UISelectItems getSi7() {
        return si7;
    }

    public void setSoc8(RichSelectOneChoice soc8) {
        this.soc8 = soc8;
    }

    public RichSelectOneChoice getSoc8() {
        return soc8;
    }

    public void setSi8(UISelectItems si8) {
        this.si8 = si8;
    }

    public UISelectItems getSi8() {
        return si8;
    }

    public void setSoc9(RichSelectOneChoice soc9) {
        this.soc9 = soc9;
    }

    public RichSelectOneChoice getSoc9() {
        return soc9;
    }

    public void setSi9(UISelectItems si9) {
        this.si9 = si9;
    }

    public UISelectItems getSi9() {
        return si9;
    }

    public void setIt35(RichInputText it35) {
        this.it35 = it35;
    }

    public RichInputText getIt35() {
        return it35;
    }

    public void setSoc10(RichSelectOneChoice soc10) {
        this.soc10 = soc10;
    }

    public RichSelectOneChoice getSoc10() {
        return soc10;
    }

    public void setSi10(UISelectItems si10) {
        this.si10 = si10;
    }

    public UISelectItems getSi10() {
        return si10;
    }

    public void setIt36(RichInputText it36) {
        this.it36 = it36;
    }

    public RichInputText getIt36() {
        return it36;
    }

    public void setIt37(RichInputText it37) {
        this.it37 = it37;
    }

    public RichInputText getIt37() {
        return it37;
    }

    public void setIt38(RichInputText it38) {
        this.it38 = it38;
    }

    public RichInputText getIt38() {
        return it38;
    }

    public void setIt39(RichInputText it39) {
        this.it39 = it39;
    }

    public RichInputText getIt39() {
        return it39;
    }

    public void setIt40(RichInputText it40) {
        this.it40 = it40;
    }

    public RichInputText getIt40() {
        return it40;
    }

    public void setSoc11(RichSelectOneChoice soc11) {
        this.soc11 = soc11;
    }

    public RichSelectOneChoice getSoc11() {
        return soc11;
    }

    public void setSi11(UISelectItems si11) {
        this.si11 = si11;
    }

    public UISelectItems getSi11() {
        return si11;
    }


    public void setIt43(RichInputText it43) {
        this.it43 = it43;
    }

    public RichInputText getIt43() {
        return it43;
    }

    public void setIt44(RichInputText it44) {
        this.it44 = it44;
    }

    public RichInputText getIt44() {
        return it44;
    }

    public void setIt45(RichInputText it45) {
        this.it45 = it45;
    }

    public RichInputText getIt45() {
        return it45;
    }

    public void setSbc2(RichSelectBooleanCheckbox sbc2) {
        this.sbc2 = sbc2;
    }

    public RichSelectBooleanCheckbox getSbc2() {
        return sbc2;
    }

    public void setPfl5(RichPanelFormLayout pfl5) {
        this.pfl5 = pfl5;
    }

    public RichPanelFormLayout getPfl5() {
        return pfl5;
    }

    public void setIt46(RichInputText it46) {
        this.it46 = it46;
    }

    public RichInputText getIt46() {
        return it46;
    }

    public void setSoc12(RichSelectOneChoice soc12) {
        this.soc12 = soc12;
    }

    public RichSelectOneChoice getSoc12() {
        return soc12;
    }

    public void setSi12(UISelectItems si12) {
        this.si12 = si12;
    }

    public UISelectItems getSi12() {
        return si12;
    }

    public void setId10(RichInputDate id10) {
        this.id10 = id10;
    }

    public RichInputDate getId10() {
        return id10;
    }

    public void setId11(RichInputDate id11) {
        this.id11 = id11;
    }

    public RichInputDate getId11() {
        return id11;
    }

    public void setSoc13(RichSelectOneChoice soc13) {
        this.soc13 = soc13;
    }

    public RichSelectOneChoice getSoc13() {
        return soc13;
    }

    public void setSi13(UISelectItems si13) {
        this.si13 = si13;
    }

    public UISelectItems getSi13() {
        return si13;
    }

    public void setId12(RichInputDate id12) {
        this.id12 = id12;
    }

    public RichInputDate getId12() {
        return id12;
    }

    public void setPfl6(RichPanelFormLayout pfl6) {
        this.pfl6 = pfl6;
    }

    public RichPanelFormLayout getPfl6() {
        return pfl6;
    }

    public void setIt47(RichInputText it47) {
        this.it47 = it47;
    }

    public RichInputText getIt47() {
        return it47;
    }

    public void setIt48(RichInputText it48) {
        this.it48 = it48;
    }

    public RichInputText getIt48() {
        return it48;
    }

    public void setIt49(RichInputText it49) {
        this.it49 = it49;
    }

    public RichInputText getIt49() {
        return it49;
    }

    public void setIt50(RichInputText it50) {
        this.it50 = it50;
    }

    public RichInputText getIt50() {
        return it50;
    }

    public void setIt51(RichInputText it51) {
        this.it51 = it51;
    }

    public RichInputText getIt51() {
        return it51;
    }

    public void setIt52(RichInputText it52) {
        this.it52 = it52;
    }

    public RichInputText getIt52() {
        return it52;
    }

    public void setIt53(RichInputText it53) {
        this.it53 = it53;
    }

    public RichInputText getIt53() {
        return it53;
    }

    public void setIt54(RichInputText it54) {
        this.it54 = it54;
    }

    public RichInputText getIt54() {
        return it54;
    }

    public void setIt55(RichInputText it55) {
        this.it55 = it55;
    }

    public RichInputText getIt55() {
        return it55;
    }

    public void setIt56(RichInputText it56) {
        this.it56 = it56;
    }

    public RichInputText getIt56() {
        return it56;
    }

    public void setIt57(RichInputText it57) {
        this.it57 = it57;
    }

    public RichInputText getIt57() {
        return it57;
    }

    public void setIt58(RichInputText it58) {
        this.it58 = it58;
    }

    public RichInputText getIt58() {
        return it58;
    }

    public void setIt59(RichInputText it59) {
        this.it59 = it59;
    }

    public RichInputText getIt59() {
        return it59;
    }

    public void setIt60(RichInputText it60) {
        this.it60 = it60;
    }

    public RichInputText getIt60() {
        return it60;
    }

    public void setIt61(RichInputText it61) {
        this.it61 = it61;
    }

    public RichInputText getIt61() {
        return it61;
    }

    public void setIt62(RichInputText it62) {
        this.it62 = it62;
    }

    public RichInputText getIt62() {
        return it62;
    }


    public void setPfl7(RichPanelFormLayout pfl7) {
        this.pfl7 = pfl7;
    }

    public RichPanelFormLayout getPfl7() {
        return pfl7;
    }

    public void setSoc14(RichSelectOneChoice soc14) {
        this.soc14 = soc14;
    }

    public RichSelectOneChoice getSoc14() {
        return soc14;
    }

    public void setSi14(UISelectItems si14) {
        this.si14 = si14;
    }

    public UISelectItems getSi14() {
        return si14;
    }

    public void setIt63(RichInputText it63) {
        this.it63 = it63;
    }

    public RichInputText getIt63() {
        return it63;
    }

    public void setIt64(RichInputText it64) {
        this.it64 = it64;
    }

    public RichInputText getIt64() {
        return it64;
    }

    public void setId13(RichInputDate id13) {
        this.id13 = id13;
    }

    public RichInputDate getId13() {
        return id13;
    }

    public void setId14(RichInputDate id14) {
        this.id14 = id14;
    }

    public RichInputDate getId14() {
        return id14;
    }


    public void setPgl12(RichPanelGroupLayout pgl12) {
        this.pgl12 = pgl12;
    }

    public RichPanelGroupLayout getPgl12() {
        return pgl12;
    }


    public void setId15(RichInputDate id15) {
        this.id15 = id15;
    }

    public RichInputDate getId15() {
        return id15;
    }

    public void setIt69(RichInputText it69) {
        this.it69 = it69;
    }

    public RichInputText getIt69() {
        return it69;
    }

    public void setId16(RichInputDate id16) {
        this.id16 = id16;
    }

    public RichInputDate getId16() {
        return id16;
    }

    public void setIt70(RichInputText it70) {
        this.it70 = it70;
    }

    public RichInputText getIt70() {
        return it70;
    }

    public void setG6(UIXGroup g6) {
        this.g6 = g6;
    }

    public UIXGroup getG6() {
        return g6;
    }

    public void setG7(UIXGroup g7) {
        this.g7 = g7;
    }

    public UIXGroup getG7() {
        return g7;
    }

    @SuppressWarnings("unchecked")
    public void uploadPropAttachFileVCE(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
//        BindingContext bindingContext = BindingContext.getCurrent();
//                                DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
//                                       MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
//                                       am.getDBTransaction().commit();
        if (valueChangeEvent.getNewValue() != null) {
                //Get File Object from VC Event
                    @SuppressWarnings("unchecked")
                    List<UploadedFile> lf = (List<UploadedFile>) valueChangeEvent.getNewValue();

                //Traverse over file list to upload all files
                for (UploadedFile fileVal : lf) {
                //Method to check if this file is uploaded previously or not
                OperationBinding duplOb = executeOperation("checkPropAttachDuplicateFile");
                duplOb.getParamsMap().put("fileNm", fileVal.getFilename());
                duplOb.execute();
                if (duplOb.getResult() != null && "Y".equalsIgnoreCase(duplOb.getResult().toString())) {

                //Method to insert data in table to keep track of uploaded files
                    if(fileVal!=null && fileVal.getFilename()!=null && fileVal.getContentType()!=null)
                    {
                OperationBinding ob = executeOperation("setPropAttachFileData");
                ob.getParamsMap().put("name", fileVal.getFilename());
                ob.getParamsMap().put("path", "DB");
                ob.getParamsMap().put("contTyp", fileVal.getContentType());
                ob.execute();
                //Upload and Save file to DB
                UploadPropAttachActionToDB(fileVal);
              
                    
                }
                }
                // Reset inputFile component after upload
                //ResetUtils.reset(valueChangeEvent.getComponent());
                }
                }
    }

    


    public void setIf2(RichInputFile if2) {
        this.if2 = if2;
    }

    public RichInputFile getIf2() {
        return if2;
    }

    public void setT13(RichTable t13) {
        this.t13 = t13;
    }

    public RichTable getT13() {
        return t13;
    }

    public void setPgl13(RichPanelGroupLayout pgl13) {
        this.pgl13 = pgl13;
    }

    public RichPanelGroupLayout getPgl13() {
        return pgl13;
    }

    public void setIt42(RichSelectBooleanCheckbox it42) {
        this.it42 = it42;
    }

    public RichSelectBooleanCheckbox getIt42() {
        return it42;
    }

    public void setIt41(RichSelectBooleanCheckbox it41) {
        this.it41 = it41;
    }

    public RichSelectBooleanCheckbox getIt41() {
        return it41;
    }

    public void setPgl14(RichPanelGroupLayout pgl14) {
        this.pgl14 = pgl14;
    }

    public RichPanelGroupLayout getPgl14() {
        return pgl14;
    }

    public void setPgl15(RichPanelGroupLayout pgl15) {
        this.pgl15 = pgl15;
    }

    public RichPanelGroupLayout getPgl15() {
        return pgl15;
    }


    public void setB125(RichButton b125) {
        this.b125 = b125;
    }

    public RichButton getB125() {
        return b125;
    }

    public void setB13(RichButton b13) {
        this.b13 = b13;
    }

    public RichButton getB13() {
        return b13;
    }

    public void setT14(RichToolbar t14) {
        this.t14 = t14;
    }

    public RichToolbar getT14() {
        return t14;
    }


    public void setB14(RichButton b14) {
        this.b14 = b14;
    }

    public RichButton getB14() {
        return b14;
    }

    public void setB15(RichButton b15) {
        this.b15 = b15;
    }

    public RichButton getB15() {
        return b15;
    }


    private String UploadPropAttachActionToDB(UploadedFile fileVal) {
        UploadedFile myfile = fileVal;
        if (myfile != null) {
            //Get current row of viewObject using iterator
            DCIteratorBinding fileIter = (DCIteratorBinding) getBindingsCont().get("MAPropertyAttachedDocumentsVOIterator");
            ViewObject vo = fileIter.getViewObject();
            MAAttachedDocumentsVORowImpl curRow = (MAAttachedDocumentsVORowImpl) vo.getCurrentRow();

            //try {
                //Save image in Blob column in database
                curRow.setFileData(createBlobDomain(myfile));

        //} catch (Exception ex) {
           //     System.out.println("Exception-" + ex);
           // }

        }
        return null;
    }

    public void setPc6(RichPanelCollection pc6) {
        this.pc6 = pc6;
    }

    public RichPanelCollection getPc6() {
        return pc6;
    }

    public void setT16(RichToolbar t16) {
        this.t16 = t16;
    }

    public RichToolbar getT16() {
        return t16;
    }


    public void setB127(RichButton b127) {
        this.b127 = b127;
    }

    public RichButton getB127() {
        return b127;
    }


    public void setB1298(RichButton b1298) {
        this.b1298 = b1298;
    }

    public RichButton getB1298() {
        return b1298;
    }


    public void setT12(RichTable t12) {
        this.t12 = t12;
    }

    public RichTable getT12() {
        return t12;
    }

    public void setPc5(RichPanelCollection pc5) {
        this.pc5 = pc5;
    }

    public RichPanelCollection getPc5() {
        return pc5;
    }

    public void setT15(RichToolbar t15) {
        this.t15 = t15;
    }

    public RichToolbar getT15() {
        return t15;
    }


    public void setB12(RichButton b12) {
        this.b12 = b12;
    }

    public RichButton getB12() {
        return b12;
    }

    public void setT11(RichTable t11) {
        this.t11 = t11;
    }

    public RichTable getT11() {
        return t11;
    }

    @SuppressWarnings("oracle.jdeveloper.java.nested-assignment")
    public void downloadPropFileListner(FacesContext facesContext, OutputStream outputStream) throws IOException {
        // Add event code here...
        DCIteratorBinding imageIter = (DCIteratorBinding) getBindingsCont().get("MAPropertyAttachedDocumentsVOIterator");
                     ViewObject vo = imageIter.getViewObject();
                     MAAttachedDocumentsVORowImpl curRow = (MAAttachedDocumentsVORowImpl) vo.getCurrentRow();

                     BlobDomain blob = curRow.getFileData();
                     BufferedInputStream in = null;

                     in = new BufferedInputStream(blob.getBinaryStream());

                     int b;
                     byte[] buffer = new byte[10240];
                     while ((b = in.read(buffer, 0, 10240)) != -1) {
                         outputStream.write(buffer, 0, b);
                     }
                     outputStream.close();
    }

    public void setL10(RichLink l10) {
        this.l10 = l10;
    }

    public RichLink getL10() {
        return l10;
    }


    public void setPb5(RichPanelBox pb5) {
        this.pb5 = pb5;
    }

    public RichPanelBox getPb5() {
        return pb5;
    }

    public void setPb6(RichPanelBox pb6) {
        this.pb6 = pb6;
    }

    public RichPanelBox getPb6() {
        return pb6;
    }

    public void setPb7(RichPanelBox pb7) {
        this.pb7 = pb7;
    }

    public RichPanelBox getPb7() {
        return pb7;
    }

    public void setIt71(RichInputText it71) {
        this.it71 = it71;
    }

    public RichInputText getIt71() {
        return it71;
    }

    public void setIt72(RichInputText it72) {
        this.it72 = it72;
    }

    public RichInputText getIt72() {
        return it72;
    }

    public void setPb8(RichPanelBox pb8) {
        this.pb8 = pb8;
    }

    public RichPanelBox getPb8() {
        return pb8;
    }

    public void setPb9(RichPanelBox pb9) {
        this.pb9 = pb9;
    }

    public RichPanelBox getPb9() {
        return pb9;
    }

    public void setPb10(RichPanelBox pb10) {
        this.pb10 = pb10;
    }

    public RichPanelBox getPb10() {
        return pb10;
    }

    public void setPfl8(RichPanelFormLayout pfl8) {
        this.pfl8 = pfl8;
    }

    public RichPanelFormLayout getPfl8() {
        return pfl8;
    }

    public void setPb11(RichPanelBox pb11) {
        this.pb11 = pb11;
    }

    public RichPanelBox getPb11() {
        return pb11;
    }


    public void setIt31(RichInputText it31) {
        this.it31 = it31;
    }

    public RichInputText getIt31() {
        return it31;
    }

    public void setT17(RichToolbar t17) {
        this.t17 = t17;
    }

    public RichToolbar getT17() {
        return t17;
    }

    public void setB16(RichButton b16) {
        this.b16 = b16;
    }

    public RichButton getB16() {
        return b16;
    }

    public void setB17(RichButton b17) {
        this.b17 = b17;
    }

    public RichButton getB17() {
        return b17;
    }


    public void setOt8(RichInputText ot8) {
        this.ot8 = ot8;
    }

    public RichInputText getOt8() {
        return ot8;
    }


    public void setIt67(RichInputText it67) {
        this.it67 = it67;
    }

    public RichInputText getIt67() {
        return it67;
    }


    public RichOutputText getOt91() {
        return ot91;
    }


    public void setT18(RichToolbar t18) {
        this.t18 = t18;
    }

    public RichToolbar getT18() {
        return t18;
    }


    public void setPlam1(RichPanelLabelAndMessage plam1) {
        this.plam1 = plam1;
    }

    public RichPanelLabelAndMessage getPlam1() {
        return plam1;
    }

    public void setIt73(RichInputText it73) {
        this.it73 = it73;
    }

    public RichInputText getIt73() {
        return it73;
    }

    public void setSbc4(RichSelectBooleanCheckbox sbc4) {
        this.sbc4 = sbc4;
    }

    public RichSelectBooleanCheckbox getSbc4() {
        return sbc4;
    }

    public void setIt73333(RichInputText it73333) {
        this.it73333 = it73333;
    }

    public RichInputText getIt73333() {
        return it73333;
    }
}

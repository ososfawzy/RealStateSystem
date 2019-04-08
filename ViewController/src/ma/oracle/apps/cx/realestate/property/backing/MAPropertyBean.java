package ma.oracle.apps.cx.realestate.property.backing;

import java.util.Iterator;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.faces.event.PhaseEvent;

import ma.oracle.apps.cx.realestate.property.modules.MARealEstatePropertyAMImpl;

import ma.oracle.apps.cx.realestate.property.views.MAGridViewVVOImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.share.ADFContext;
import oracle.adf.view.faces.bi.component.gauge.UIGauge;
import oracle.adf.view.faces.bi.component.geoMap.UIGeoMap;
import oracle.adf.view.faces.bi.component.geoMap.UIGeoMapToolbar;
import oracle.adf.view.rich.component.UIXTable;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelStretchLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelTabbed;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;

import org.apache.myfaces.trinidad.event.AttributeChangeEvent;

public class MAPropertyBean {
    private RichForm f1;
    private RichDocument d1;
    private RichPanelTabbed pt1;
    private RichShowDetailItem sdi1;
    private RichShowDetailItem sdi2;
    private RichShowDetailItem sdi3;
    private RichMessages m1;
    private RichPanelCollection pc1;
    private RichPanelGroupLayout pgl1;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichTable resId1;
    private RichToolbar t1;
    private RichPanelGroupLayout pgl2;
    private RichPanelHeader ph2;
    private RichQuery qryId2;
    private RichTable resId2;
    private RichPanelCollection pc2;
    private RichToolbar t2;
    private RichPanelStretchLayout psl1;
    private RichPanelStretchLayout psl2;
    private UIGauge gauge1;
    @SuppressWarnings("oracle.jdeveloper.java.semantic-warning")
    private UIGauge gauge2;
    private UIGeoMap map;
    private RichButton cb3;
    private RichButton cb4;
    private RichButton cb6;
    private RichButton cb5;
    private RichButton cb2;
    private RichButton cb1;
    private RichOutputText ot136;
    private RichLink l1;
    private RichToolbar t3;
    private RichButton b1;
    private RichButton b2;
    private UIGeoMapToolbar mt1;
    private RichPanelGroupLayout pgl3;

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

    public void setPt1(RichPanelTabbed pt1) {
        this.pt1 = pt1;
    }

    public RichPanelTabbed getPt1() {
        return pt1;
    }

    public void setSdi1(RichShowDetailItem sdi1) {
        this.sdi1 = sdi1;
    }

    public RichShowDetailItem getSdi1() {
        return sdi1;
    }

    public void setSdi2(RichShowDetailItem sdi2) {
        this.sdi2 = sdi2;
    }

    public RichShowDetailItem getSdi2() {
        return sdi2;
    }

    public void setSdi3(RichShowDetailItem sdi3) {
        this.sdi3 = sdi3;
    }

    public RichShowDetailItem getSdi3() {
        return sdi3;
    }


    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }


    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
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


    public void setT1(RichToolbar t1) {
        this.t1 = t1;
    }

    public RichToolbar getT1() {
        return t1;
    }


    /**
     * method get current row data
     * @param getTable
     * @return
     */
     public Row getCurrentRow(RichTable getTable) {
         UIXTable table = getTable;
         Iterator selectionIt = table.getSelectedRowKeys().iterator();
         Row selectedRow = null;
         while (selectionIt.hasNext()) {
             Object rowKey = selectionIt.next();
             table.setRowKey(rowKey);
             int index = table.getRowIndex();
             FacesCtrlHierNodeBinding row = (FacesCtrlHierNodeBinding) table.getRowData(index);
             selectedRow = row.getRow();
         }
         return selectedRow;
     }
    public void cb2_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        
        BindingContext bCtx = BindingContext.getCurrent();
        DCBindingContainer DcCon = (DCBindingContainer) bCtx.getCurrentBindingsEntry();
        oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding submit1 =
            (FacesCtrlHierNodeBinding) resId1.getSelectedRowData();
       // ADFContext adfCtx = ADFContext.getCurrent();
        Row currentRow = getCurrentRow(this.getResId1());
        oracle.jbo.domain.Number propId = (oracle.jbo.domain.Number)currentRow.getAttribute("PropertyId");
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        //ViewObject editVO = am.getMARealEstatePropertyVO1();
        am.gridViewEdit(propId);
        
    }
    
    
    
    public String gridDelete() {
        // Add event code here...
        
//        BindingContext bCtx = BindingContext.getCurrent();
//        DCBindingContainer DcCon = (DCBindingContainer) bCtx.getCurrentBindingsEntry();
//        oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding submit1 =
//            (FacesCtrlHierNodeBinding) resId1.getSelectedRowData();
       // ADFContext adfCtx = ADFContext.getCurrent();
        Row currentRow = getCurrentRow(this.getResId1());
        oracle.jbo.domain.Number propId = (oracle.jbo.domain.Number)currentRow.getAttribute("PropertyId");
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        //ViewObject editVO = am.getMARealEstatePropertyVO1();
        am.fakeDelete(propId);
        FacesMessage msg;
        msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Property Is Deleted", "");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        MAGridViewVVOImpl gridViewVO = am.getMAGridViewVVO1();
        gridViewVO.executeQuery();
        return null;
    }


    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setPh2(RichPanelHeader ph2) {
        this.ph2 = ph2;
    }

    public RichPanelHeader getPh2() {
        return ph2;
    }

    public void setQryId2(RichQuery qryId2) {
        this.qryId2 = qryId2;
    }

    public RichQuery getQryId2() {
        return qryId2;
    }

    public void setResId2(RichTable resId2) {
        this.resId2 = resId2;
    }

    public RichTable getResId2() {
        return resId2;
    }

    public void setPc2(RichPanelCollection pc2) {
        this.pc2 = pc2;
    }

    public RichPanelCollection getPc2() {
        return pc2;
    }

    public void setT2(RichToolbar t2) {
        this.t2 = t2;
    }

    public RichToolbar getT2() {
        return t2;
    }


    public void cb4_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        
        BindingContext bCtx = BindingContext.getCurrent();
        DCBindingContainer DcCon = (DCBindingContainer) bCtx.getCurrentBindingsEntry();
        oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding submit1 =
            (FacesCtrlHierNodeBinding) resId2.getSelectedRowData();
        // ADFContext adfCtx = ADFContext.getCurrent();
        Row currentRow = getCurrentRow(this.getResId2());
        oracle.jbo.domain.Number propId = (oracle.jbo.domain.Number)currentRow.getAttribute("PropertyId");
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        //ViewObject editVO = am.getMARealEstatePropertyVO1();
        am.gridViewEdit(propId);
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

    public void setGauge1(UIGauge gauge1) {
        this.gauge1 = gauge1;
    }

    public UIGauge getGauge1() {
        return gauge1;
    }


    public void setGauge2(UIGauge gauge2) {
        this.gauge2 = gauge2;
    }

    public UIGauge getGauge2() {
        return gauge2;
    }


    public void setMap(UIGeoMap map) {
        this.map = map;
    }

    public UIGeoMap getMap() {
        return map;
    }


    public void setCb3(RichButton cb3) {
        this.cb3 = cb3;
    }

    public RichButton getCb3() {
        return cb3;
    }

    public void setCb4(RichButton cb4) {
        this.cb4 = cb4;
    }

    public RichButton getCb4() {
        return cb4;
    }

    public void setCb6(RichButton cb6) {
        this.cb6 = cb6;
    }

    public RichButton getCb6() {
        return cb6;
    }

    public void setCb5(RichButton cb5) {
        this.cb5 = cb5;
    }

    public RichButton getCb5() {
        return cb5;
    }

    public void setCb2(RichButton cb2) {
        this.cb2 = cb2;
    }

    public RichButton getCb2() {
        return cb2;
    }

    public void setCb1(RichButton cb1) {
        this.cb1 = cb1;
    }

    public RichButton getCb1() {
        return cb1;
    }

    public void setOt136(RichOutputText ot136) {
        this.ot136 = ot136;
    }

    public RichOutputText getOt136() {
        return ot136;
    }

    public void setL1(RichLink l1) {
        this.l1 = l1;
    }

    public RichLink getL1() {
        return l1;
    }


    public void setT3(RichToolbar t3) {
        this.t3 = t3;
    }

    public RichToolbar getT3() {
        return t3;
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

//    public void beore(PhaseEvent phaseEvent) {
//        // Add event code here...
//    }
    
    public void beforePhase(PhaseEvent phaseEvent) {
        BindingContext bindingContext;
        bindingContext = BindingContext.getCurrent();
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
       MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();   
       am.set_lang();
    }

    public void setMt1(UIGeoMapToolbar mt1) {
        this.mt1 = mt1;
    }

    public UIGeoMapToolbar getMt1() {
        return mt1;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }
}

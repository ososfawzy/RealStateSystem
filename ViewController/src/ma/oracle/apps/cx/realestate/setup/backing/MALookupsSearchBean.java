package ma.oracle.apps.cx.realestate.setup.backing;

import java.util.Iterator;

import javax.faces.event.PhaseEvent;

import ma.oracle.apps.cx.realestate.property.modules.MARealEstatePropertyAMImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.view.rich.component.UIXTable;
import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;

public class MALookupsSearchBean {
    private RichForm f1;
    private RichDocument d1;
    private RichMessages m1;
    private RichPanelGroupLayout pgl1;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichTable resId1;
    private RichPanelCollection pc1;
    private RichToolbar t3;
    private RichButton b3;
    private RichPopup p1;
    private RichDialog d2;
    private RichPanelFormLayout pfl1;
    private RichInputText it1;
    private RichPanelGroupLayout pgl2;
    private RichPanelCollection pc2;
    private RichTable t4;
    private RichToolbar t5;
    private RichButton b4;
    private RichToolbar t6;
    private RichPanelGroupLayout pgl3;
    private RichButton b5;
    private RichButton b6;
    private RichToolbar t7;
    private RichLink l1;
    private RichToolbar t8;
    private RichButton b7;
    private RichButton b8;

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

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setT3(RichToolbar t3) {
        this.t3 = t3;
    }

    public RichToolbar getT3() {
        return t3;
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
    }

    public void setD2(RichDialog d2) {
        this.d2 = d2;
    }

    public RichDialog getD2() {
        return d2;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setPc2(RichPanelCollection pc2) {
        this.pc2 = pc2;
    }

    public RichPanelCollection getPc2() {
        return pc2;
    }

    public void setT4(RichTable t4) {
        this.t4 = t4;
    }

    public RichTable getT4() {
        return t4;
    }

    public void setT5(RichToolbar t5) {
        this.t5 = t5;
    }

    public RichToolbar getT5() {
        return t5;
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }

    public void setT6(RichToolbar t6) {
        this.t6 = t6;
    }

    public RichToolbar getT6() {
        return t6;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setB5(RichButton b5) {
        this.b5 = b5;
    }

    public RichButton getB5() {
        return b5;
    }

    public void setB6(RichButton b6) {
        this.b6 = b6;
    }

    public RichButton getB6() {
        return b6;
    }

    public String updateLookupType() {

        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        getP1().show(hints);

        return null;
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String cancelLookupUpdate() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
        operationBinding.execute();

        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();

        ViewObject lookupTypesVO = am.getMALookupTypesVO();
        lookupTypesVO.executeQuery();

        getP1().hide();

        return null;
    }

    public String saveLookupUpdates() {
        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();

        ViewObject lookupTypesVO = am.getMALookupTypesVO();
        lookupTypesVO.clearCache();
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        operationBinding.execute();

       
        lookupTypesVO.executeQuery();

        getP1().hide();

        return null;
    }

    public String deleteLookup() {
        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        am.deleteLookup(getCurrentLookup());
        
        ViewObject lookupTypesVO=am.getMALookupTypesVO();
        lookupTypesVO.executeQuery();
        return null;
    }


    public Number getCurrentLookup() {
        Number lookupId = null;
        UIXTable table = getResId1();
        Iterator selectionIt = table.getSelectedRowKeys().iterator();
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row = (FacesCtrlHierNodeBinding) table.getRowData(index);
            Row selectedRow = row.getRow();
            lookupId = (Number) selectedRow.getAttribute("LookupId");
        }
        return lookupId;
    }

    public void setT7(RichToolbar t7) {
        this.t7 = t7;
    }

    public RichToolbar getT7() {
        return t7;
    }


    public void setL1(RichLink l1) {
        this.l1 = l1;
    }

    public RichLink getL1() {
        return l1;
    }

    public void setT8(RichToolbar t8) {
        this.t8 = t8;
    }

    public RichToolbar getT8() {
        return t8;
    }

    public void setB7(RichButton b7) {
        this.b7 = b7;
    }

    public RichButton getB7() {
        return b7;
    }

    public void setB8(RichButton b8) {
        this.b8 = b8;
    }

    public RichButton getB8() {
        return b8;
    }

    public void beforePhase(PhaseEvent phaseEvent) {
        BindingContext bindingContext;
        bindingContext = BindingContext.getCurrent();
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        am.set_lang();
    }
}

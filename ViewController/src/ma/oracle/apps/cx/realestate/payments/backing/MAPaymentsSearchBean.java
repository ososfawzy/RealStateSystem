package ma.oracle.apps.cx.realestate.payments.backing;

import java.util.Iterator;
import java.util.Map;

import javax.faces.event.PhaseEvent;

import ma.oracle.apps.cx.realestate.property.modules.MARealEstatePropertyAMImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.UIXTable;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
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

public class MAPaymentsSearchBean {
    private RichForm f1;
    private RichDocument d1;
    private RichMessages m1;
    private RichPanelGroupLayout pgl1;
    private RichButton b1;
    private RichPanelBox pb1;
    private RichPanelBox pb2;
    private RichPanelGroupLayout pgl2;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichTable resId1;
    private RichPanelGroupLayout pgl3;
    private RichPanelHeader ph2;
    private RichQuery qryId2;
    private RichTable resId2;
    private RichPanelCollection pc1;
    private RichPanelCollection pc2;
    private RichToolbar t1;
    private RichToolbar t2;
    private RichButton b2;
    private RichToolbar t5;
    private RichLink l1;
    private RichToolbar t6;
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

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    @SuppressWarnings("unchecked")
    public String createInstallmentPayment() {
        BindingContainer bindings = getBindings();

        OperationBinding newInstallment = bindings.getOperationBinding("CreateInstallment");
        newInstallment.execute();


//        OperationBinding newRent = bindings.getOperationBinding("CreateRent");
//        newRent.execute();

        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        sessionScope.put("ActionScope", "NewInstallment");

        return "CreatePayment";
    }

    @SuppressWarnings("unchecked")
    public String createRentPayment() {
        BindingContainer bindings = getBindings();

//        OperationBinding newInstallment = bindings.getOperationBinding("CreateInstallment");
//        newInstallment.execute();


        OperationBinding newRent = bindings.getOperationBinding("CreateRent");
        newRent.execute();

        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        sessionScope.put("ActionScope", "NewRent");


        return "CreatePayment";
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

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
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

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
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

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setPc2(RichPanelCollection pc2) {
        this.pc2 = pc2;
    }

    public RichPanelCollection getPc2() {
        return pc2;
    }

    public void setT1(RichToolbar t1) {
        this.t1 = t1;
    }

    public RichToolbar getT1() {
        return t1;
    }

    public void setT2(RichToolbar t2) {
        this.t2 = t2;
    }

    public RichToolbar getT2() {
        return t2;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    @SuppressWarnings("unchecked")
    public String editInstallmentAction() {
        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        ViewObject installmentVO = am.getMAInstallmentPaymentTermsVO();
        installmentVO.setWhereClauseParams(null);
        installmentVO.setWhereClause("INSTALLMENT_PAYMENT_TERM_ID=:1");
        installmentVO.setWhereClauseParam(0, getCurrentInstallment());
        installmentVO.executeQuery();

        if (installmentVO.first().getAttribute("IntAttribute14") != null) {

        } else {
            installmentVO.first().setAttribute("IntAttribute14", "Y");
            am.getDBTransaction().commit();
        }


        ViewObject rentVO = am.getMARentPaymentTermsVO();
        rentVO.setWhereClauseParams(null);
        rentVO.setWhereClause("RENT_PAYMENT_TERM_ID=:1");
        rentVO.setWhereClauseParam(0, null);
        rentVO.executeQuery();

        ViewObject paymentTypeVO = am.getMADummyPaymentTypeVVO();
        paymentTypeVO.setWhereClauseParams(null);
        paymentTypeVO.setWhereClause("PAYMENT_TYPE=:1");
        paymentTypeVO.setWhereClauseParam(0, "Installment");
        paymentTypeVO.executeQuery();
        
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        sessionScope.put("ActionScope", "EditInstallment");

        return "CreatePayment";
    }

    @SuppressWarnings("unchecked")
    public String editRentAction() {
        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        ViewObject rentVO = am.getMARentPaymentTermsVO();
        rentVO.setWhereClauseParams(null);
        rentVO.setWhereClause("RENT_PAYMENT_TERM_ID=:1");
        rentVO.setWhereClauseParam(0, getCurrentRent());
        rentVO.executeQuery();


        if (rentVO.first().getAttribute("IntAttribute14") != null) {

        } else {
            rentVO.first().setAttribute("IntAttribute14", "Y");
            am.getDBTransaction().commit();
        }

        ViewObject installmentVO = am.getMAInstallmentPaymentTermsVO();
        installmentVO.setWhereClauseParams(null);
        installmentVO.setWhereClause("INSTALLMENT_PAYMENT_TERM_ID=:1");
        installmentVO.setWhereClauseParam(0, null);
        installmentVO.executeQuery();

        ViewObject paymentTypeVO = am.getMADummyPaymentTypeVVO();
        paymentTypeVO.setWhereClauseParams(null);
        paymentTypeVO.setWhereClause("PAYMENT_TYPE=:1");
        paymentTypeVO.setWhereClauseParam(0, "Rent");
        paymentTypeVO.executeQuery();
        
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        sessionScope.put("ActionScope", "EditRent");

        return "CreatePayment";
    }

    public Number getCurrentInstallment() {
        Number installmentId = null;
        UIXTable table = getResId1();
        Iterator selectionIt = table.getSelectedRowKeys().iterator();
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row = (FacesCtrlHierNodeBinding) table.getRowData(index);
            Row selectedRow = row.getRow();
            installmentId = (Number) selectedRow.getAttribute("InstallmentPaymentTermId");
        }
        return installmentId;
    }

    public Number getCurrentRent() {
        Number RentId = null;
        UIXTable table = getResId2();
        Iterator selectionIt = table.getSelectedRowKeys().iterator();
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row = (FacesCtrlHierNodeBinding) table.getRowData(index);
            Row selectedRow = row.getRow();
            RentId = (Number) selectedRow.getAttribute("RentPaymentTermId");
        }
        return RentId;
    }

    public String deleteInstallment() {
        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        am.deletePayment(getCurrentInstallment(), null);

        ViewObject installmentSearchVO = am.getMAInstallmentPaymentTermsVVO();
        installmentSearchVO.reset();
        installmentSearchVO.clearCache();
        installmentSearchVO.executeQuery();

//        ViewObject rentSearchVO = am.getMARentPaymentTermsVVO();
//        rentSearchVO.reset();
//        rentSearchVO.clearCache();
//        rentSearchVO.executeQuery();
        
        return null;
    }

    public String deleteRent() {
        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        am.deletePayment(null, getCurrentRent());

//        ViewObject installmentSearchVO = am.getMAInstallmentPaymentTermsVVO();
//        installmentSearchVO.reset();
//        installmentSearchVO.clearCache();
//        installmentSearchVO.executeQuery();

        ViewObject rentSearchVO = am.getMARentPaymentTermsVVO();
        rentSearchVO.reset();
        rentSearchVO.clearCache();
        rentSearchVO.executeQuery();
        
        return null;
    }

    public void setT5(RichToolbar t5) {
        this.t5 = t5;
    }

    public RichToolbar getT5() {
        return t5;
    }

    public void setL1(RichLink l1) {
        this.l1 = l1;
    }

    public RichLink getL1() {
        return l1;
    }

    public void setT6(RichToolbar t6) {
        this.t6 = t6;
    }

    public RichToolbar getT6() {
        return t6;
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

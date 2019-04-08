package ma.oracle.apps.cx.realestate.contractPayments.backing;

import java.util.Map;

import javax.faces.event.PhaseEvent;

import ma.oracle.apps.cx.realestate.property.modules.MARealEstatePropertyAMImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.RowSet;
import oracle.jbo.ViewObject;

public class MAContractPaymentsBean {
    private RichForm f1;
    private RichDocument d1;
    private RichMessages m1;
    private RichButton b1;
    private RichPanelGroupLayout pgl2;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichTable resId1;
    private RichPanelCollection pc1;
    private RichToolbar t1;
    private RichButton b2;
    private RichButton b3;
    private RichToolbar t2;
    private RichLink l1;
    private RichToolbar t3;
    private RichButton b4;
    private RichButton b5;

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

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }


    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    @SuppressWarnings("unchecked")
    public String createContractBtnAction() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        operationBinding.execute();

        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();

        ViewObject excuteWithParamVO = am.getMAPropertyIdLovVVO();
        //        excuteWithParamVO.setWhereClauseParams(null);
        //        excuteWithParamVO.setWhereClause("PROPERTY_ID=:1");
        excuteWithParamVO.setNamedWhereClauseParam("p_property_id", null);
        excuteWithParamVO.executeQuery();
        
        Map installmentScope = ADFContext.getCurrent().getSessionScope();
        installmentScope.put("ActionScope", "Create");

        return "CreateContract";
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

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    @SuppressWarnings("unchecked")
    public String editContractAction() {
        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();

        ViewObject contractsVO = am.getMAContractsVO();
        contractsVO.setWhereClauseParams(null);
        contractsVO.setWhereClause("CONTRACT_ID=:1");
        contractsVO.setWhereClauseParam(0, am.getMAContractsSearchVVO().getCurrentRow().getAttribute("ContractId"));
        contractsVO.executeQuery();

        RowSet lov = (RowSet) contractsVO.getCurrentRow().getAttribute("MAInstallmentRuleVVO");
        lov.reset();
        lov.setNamedWhereClauseParam("p_property_id",
                                     am.getMAContractsSearchVVO().getCurrentRow().getAttribute("ExtAttribute10"));
        lov.executeQuery();

        ViewObject excuteWithParamVO = am.getMAPropertyIdLovVVO();
        //        excuteWithParamVO.setWhereClauseParams(null);
        //        excuteWithParamVO.setWhereClause("PROPERTY_ID=:1");
        excuteWithParamVO.setNamedWhereClauseParam("p_property_id",
                                                   contractsVO.getCurrentRow().getAttribute("ExtAttribute10"));
        excuteWithParamVO.executeQuery();
        
        Map installmentScope = ADFContext.getCurrent().getSessionScope();
        installmentScope.put("ActionScope", "Edit");

        //        ViewObject excuteWithParamVO = am.getMAPropertyIdLovVVO();
        //        excuteWithParamVO.setWhereClauseParams(null);
        //        excuteWithParamVO.setWhereClause("PROPERTY_ID=:1");
        //        excuteWithParamVO.setWhereClauseParam(0, am.getMAContractsSearchVVO().getCurrentRow().getAttribute("ExtAttribute10"));
        //        excuteWithParamVO.executeQuery();

        return "CreateContract";
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

    public String deleteContract() {
        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        
        ViewObject contractsSearchVO=am.getMAContractsSearchVVO();
        am.deleteContract((oracle.jbo.domain.Number) contractsSearchVO.getCurrentRow().getAttribute("ContractId"));

        contractsSearchVO.clearCache();
        contractsSearchVO.reset();
        contractsSearchVO.executeQuery();
        return null;
    }

    public void setT2(RichToolbar t2) {
        this.t2 = t2;
    }

    public RichToolbar getT2() {
        return t2;
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

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }

    public void setB5(RichButton b5) {
        this.b5 = b5;
    }

    public RichButton getB5() {
        return b5;
    }

    public void beforePhase(PhaseEvent phaseEvent) {
        BindingContext bindingContext;
        bindingContext = BindingContext.getCurrent();
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        am.set_lang();
    }
}

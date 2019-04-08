package ma.oracle.apps.cx.realestate.contracts.backing;

import java.util.Iterator;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.component.UISelectItems;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.ValueChangeEvent;

import ma.oracle.apps.cx.realestate.property.modules.MARealEstatePropertyAMImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.UIXTable;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;

public class MAContractCreationBean {
    static Number totalPrimaryOwner = new Number(0);
    static Number installmentId = new Number(0);
    private RichForm f1;
    private RichDocument d1;
    private RichPanelGroupLayout pgl1;
    private RichPanelBox pb1;
    private RichPanelBox pb2;
    private RichPanelBox pb3;
    private RichPanelBox pb4;
    private RichPanelFormLayout pfl1;
    private RichInputText it1;
    private RichSelectOneChoice soc1;
    private UISelectItems si1;
    private RichSelectOneChoice soc2;
    private UISelectItems si2;
    private RichInputText it2;
    private RichInputDate id1;
    private RichInputText it3;
    private RichMessages m1;
    private RichInputText it13;
    private RichInputListOfValues ilov1;
    private RichPanelFormLayout pfl2;
    private RichTable t2;
    private RichPanelCollection pc1;
    private RichToolbar t3;
    private RichButton b2;
    private RichPanelGridLayout pgl2;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichGridCell gc2;
    private RichPanelFormLayout pfl4;
    private RichInputText it5;
    private RichPanelGroupLayout pgl3;
    private RichPanelGroupLayout pgl4;
    private RichPanelLabelAndMessage plam1;
    private RichPanelLabelAndMessage plam2;
    private RichInputText it6;
    private RichSelectBooleanCheckbox sbc1;
    private RichInputText it8;
    private RichSelectBooleanCheckbox sbc2;
    private RichSelectOneChoice soc3;
    private UISelectItems si3;
    private RichPanelHeader ph1;
    private RichToolbar t1;
    private RichButton b3;
    private RichButton b4;
    private RichInputText it4;
    private RichPanelCollection pc2;
    private RichToolbar t5;
    private RichTable t4;
    private RichButton b5;
    private RichButton b6;
    private RichToolbar t6;
    private RichButton b7;
    private RichPanelLabelAndMessage plam3;
    private RichPanelLabelAndMessage plam4;
    private RichPanelGroupLayout pgl5;
    private RichPanelGroupLayout pgl6;
    private RichButton b8;
    private RichToolbar t7;
    private RichLink l1;
    private RichButton b1;
    private RichPanelFormLayout pfl3;
    private RichInputText it10;
    private RichInputText it11;
    private RichInputText it12;
    private RichInputText it14;
    private RichInputText it15;
    private RichInputText it16;
    private RichInputDate id2;
    private RichInputListOfValues ilov2;
    private RichToolbar t8;
    private RichButton b9;
    private RichButton b10;

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

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
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

    public void setPb4(RichPanelBox pb4) {
        this.pb4 = pb4;
    }

    public RichPanelBox getPb4() {
        return pb4;
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

    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
    }

    public void setSi1(UISelectItems si1) {
        this.si1 = si1;
    }

    public UISelectItems getSi1() {
        return si1;
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

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }


    public void setIt13(RichInputText it13) {
        this.it13 = it13;
    }

    public RichInputText getIt13() {
        return it13;
    }


    public void setIlov1(RichInputListOfValues ilov1) {
        this.ilov1 = ilov1;
    }

    public RichInputListOfValues getIlov1() {
        return ilov1;
    }


    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }


    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
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

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setPgl2(RichPanelGridLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGridLayout getPgl2() {
        return pgl2;
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

    public void setGc2(RichGridCell gc2) {
        this.gc2 = gc2;
    }

    public RichGridCell getGc2() {
        return gc2;
    }

    public void setPfl4(RichPanelFormLayout pfl4) {
        this.pfl4 = pfl4;
    }

    public RichPanelFormLayout getPfl4() {
        return pfl4;
    }


    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String searchPropertyBtnAction() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("ExecuteWithParams");
        operationBinding.execute();

        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();

        ViewObject excuteWithParamVO = am.getMAPropertyIdLovVVO();

        ViewObject contractVO = am.getMAContractsVO();

        if (excuteWithParamVO.first() != null) {
            if (excuteWithParamVO.first().getAttribute("PropertyId") != null) {
                contractVO.getCurrentRow().setAttribute("ExtAttribute10",
                                                        excuteWithParamVO.first().getAttribute("PropertyId"));
                ViewObject contractInstallmentVO = am.findViewObject("MAContractsVO");

                //        ViewObject installmentVO = am.findViewObject("MAInstallmentRuleVVO");
                //        installmentVO.setWhereClauseParams(null);
                //        installmentVO.setWhereClause("PROPERTY_ID=:1");

                RowSet lov = (RowSet) contractInstallmentVO.getCurrentRow().getAttribute("MAInstallmentRuleVVO");
                lov.reset();
                //        lov.setWhereClauseParams(null);
                lov.setNamedWhereClauseParam("p_property_id", excuteWithParamVO.first().getAttribute("PropertyId"));
                lov.executeQuery();
                //        am.getDBTransaction().commit();
                //        FacesMessage message =
                //            new FacesMessage(FacesMessage.SEVERITY_ERROR,
                //                             "Test "+excuteWithParamVO.first().getAttribute("PropertyId"), null);
                //        FacesContext.getCurrentInstance().addMessage(null, message);
            } else {
                FacesMessage message =
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                     "There is no property with this ID, Please select another property", null);
                FacesContext.getCurrentInstance().addMessage(null, message);
            }
        } else {
            FacesMessage message =
                new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                 "There is no property with this ID, Please select another property", null);
            FacesContext.getCurrentInstance().addMessage(null, message);
        }

        return null;
    }


    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }

    public void setPlam1(RichPanelLabelAndMessage plam1) {
        this.plam1 = plam1;
    }

    public RichPanelLabelAndMessage getPlam1() {
        return plam1;
    }

    public void setPlam2(RichPanelLabelAndMessage plam2) {
        this.plam2 = plam2;
    }

    public RichPanelLabelAndMessage getPlam2() {
        return plam2;
    }

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }

    public void setSbc1(RichSelectBooleanCheckbox sbc1) {
        this.sbc1 = sbc1;
    }

    public RichSelectBooleanCheckbox getSbc1() {
        return sbc1;
    }

    public void setIt8(RichInputText it8) {
        this.it8 = it8;
    }

    public RichInputText getIt8() {
        return it8;
    }

    public void setSbc2(RichSelectBooleanCheckbox sbc2) {
        this.sbc2 = sbc2;
    }

    public RichSelectBooleanCheckbox getSbc2() {
        return sbc2;
    }

    public void beforePhase(PhaseEvent phaseEvent) {
        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();

        ViewObject contractVO = am.findViewObject("MAContractsVO");

        Map installmentScope = ADFContext.getCurrent().getSessionScope();
        String actionScope = (String) installmentScope.get("ActionScope");
        if (actionScope != null) {
            if (actionScope.equals("Edit")) {
//                        FacesMessage message =
//                            new FacesMessage(FacesMessage.SEVERITY_ERROR,
//                                             "Test "+actionScope, null);
//                        FacesContext.getCurrentInstance().addMessage(null, message);
                getIlov2().setValue(contractVO.first().getAttribute("ExtAttribute10"));
                getIlov2().setDisabled(true);
                installmentScope.remove("ActionScope");
            } 
        }
    
        am.set_lang();

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

    public void setPh1(RichPanelHeader ph1) {
        this.ph1 = ph1;
    }

    public RichPanelHeader getPh1() {
        return ph1;
    }

    public void setT1(RichToolbar t1) {
        this.t1 = t1;
    }

    public RichToolbar getT1() {
        return t1;
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }

    @SuppressWarnings("unchecked")
    public void installmentTypeAction(ValueChangeEvent valueChangeEvent) {
        //        BindingContext bindingContext = BindingContext.getCurrent();
        //        @SuppressWarnings("deprecation")
        //        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        //        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        //
        //
        //        am.getDBTransaction().commit();
        //        Number contractId = (Number) am.getMAContractsVO().getCurrentRow().getAttribute("ContractId");
        //        ViewObject excuteWithParamVO = am.getMAPropertyIdLovVVO();
        //        Number propertyId = (Number) excuteWithParamVO.first().getAttribute("PropertyId");
        //        if (getSoc3().getValue() != null) {
        //            am.createInstallments((Number) getSoc3().getValue(), propertyId);
        //        }
        //        am.getDBTransaction().commit();
        //
        //        ViewObject contractsVO = am.getMAContractsVO();
        //        contractsVO.setWhereClauseParams(null);
        //        contractsVO.setWhereClause("CONTRACT_ID=:1");
        //        contractsVO.setWhereClauseParam(0, contractId);
        //        contractsVO.executeQuery();

        //        ADFContext adfCtx = ADFContext.getCurrent();
        //        Map pageFlowScope = adfCtx.getPageFlowScope();
        if (getSoc3().getValue() != null) {
            installmentId = new Number(0);
            //            pageFlowScope.put("PInstallmentId", getSoc3().getValue());
            installmentId = (Number) getSoc3().getValue();
            //            FacesMessage message =
            //                                 new FacesMessage(FacesMessage.SEVERITY_ERROR,
            //                                                   " " +
            //                                                  installmentId, null);
            //                             FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }


    public String createInstallmentAction() {

        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        am.getDBTransaction().commit();

        Number contractId = (Number) am.getMAContractsVO().getCurrentRow().getAttribute("ContractId");
        ViewObject excuteWithParamVO = am.getMAPropertyIdLovVVO();
        Number propertyId = (Number) excuteWithParamVO.first().getAttribute("PropertyId");
        //        ADFContext adfCtx = ADFContext.getCurrent();
        //        Map pageFlowScope = adfCtx.getPageFlowScope();
        //        Number installmentId = (Number) pageFlowScope.get("PInstallmentId");
        if (propertyId != null && installmentId != null) {


            am.createInstallments(installmentId, propertyId);
            //
            //            //            ViewObject contractVO = am.getMAContractsVO();
            //            //            contractVO.getCurrentRow().setAttribute("ExtAttribute11",getSoc3().getValue());
            //
            //            //            am.getDBTransaction().commit();
            //


            //        FacesMessage message =
            //            new FacesMessage(FacesMessage.SEVERITY_ERROR,
            //                             (Number) pageFlowScope.get("PInstallmentId")+ " " +
            //                             (Number) excuteWithParamVO.first().getAttribute("PropertyId"), null);
            //        FacesContext.getCurrentInstance().addMessage(null, message);

        }
        //        am.getDBTransaction().commit();

        ViewObject contractsVO = am.getMAContractsVO();
        contractsVO.setWhereClauseParams(null);
        contractsVO.setWhereClause("CONTRACT_ID=:1");
        contractsVO.setWhereClauseParam(0, contractId);
        contractsVO.executeQuery();

        ViewObject contractInstallmentVO = am.findViewObject("MAContractsVO");

        //        ViewObject installmentVO = am.findViewObject("MAInstallmentRuleVVO");
        //        installmentVO.setWhereClauseParams(null);
        //        installmentVO.setWhereClause("PROPERTY_ID=:1");

        RowSet lov = (RowSet) contractInstallmentVO.getCurrentRow().getAttribute("MAInstallmentRuleVVO");
        lov.reset();
        //        lov.setWhereClauseParams(null);
        lov.setNamedWhereClauseParam("p_property_id", propertyId);
        lov.executeQuery();

        return null;
    }


    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
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


    public void setT4(RichTable t4) {
        this.t4 = t4;
    }

    public RichTable getT4() {
        return t4;
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

    public void setPlam3(RichPanelLabelAndMessage plam3) {
        this.plam3 = plam3;
    }

    public RichPanelLabelAndMessage getPlam3() {
        return plam3;
    }

    public void setPlam4(RichPanelLabelAndMessage plam4) {
        this.plam4 = plam4;
    }

    public RichPanelLabelAndMessage getPlam4() {
        return plam4;
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

    public void setB8(RichButton b8) {
        this.b8 = b8;
    }

    public RichButton getB8() {
        return b8;
    }

    public String primaryOwner() {
        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        am.setPrimaryOwner(getCurrentContractOwner());
        return null;
    }

    public Number getCurrentContractOwner() {
        Number contractOwnerId = null;
        UIXTable table = getT2();
        Iterator selectionIt = table.getSelectedRowKeys().iterator();
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row = (FacesCtrlHierNodeBinding) table.getRowData(index);
            Row selectedRow = row.getRow();
            contractOwnerId = (Number) selectedRow.getAttribute("ContractOwnerId");
        }
        return contractOwnerId;
    }

    public String saveContractCreation() {
        //        ADFContext adfCtx = ADFContext.getCurrent();
        //        Map pageFlowScope = adfCtx.getPageFlowScope();
        //        Number installmentId = (Number) pageFlowScope.get("PInstallmentId");
        totalPrimaryOwner = new Number(0);
        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        ViewObject contractOwnerVO = am.getMAContractOwnerVO();
        if (contractOwnerVO.getRowCount() != 0) {
            for (int i = 0; i < contractOwnerVO.getRowCount(); i++) {
                Row contractOwnerRow = contractOwnerVO.getRowAtRangeIndex(i);
                if (contractOwnerRow.getAttribute("IntAttribute3") != null &&
                    contractOwnerRow.getAttribute("IntAttribute3").equals("Y")) {
                    totalPrimaryOwner = totalPrimaryOwner.add(new Number(1));
                }
            }
        }
        if (totalPrimaryOwner.intValue() == 0) {
            FacesMessage message =
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Contract Owner Must have one Primary  Owner.", null);
            FacesContext.getCurrentInstance().addMessage(null, message);
        } else if (totalPrimaryOwner.intValue() > 1) {
            FacesMessage message =
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Contract Owner Must have only one Primary  Owner.",
                                 null);
            FacesContext.getCurrentInstance().addMessage(null, message);
        } else if (totalPrimaryOwner.intValue() < 0) {
            FacesMessage message =
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Contract Owner Must have one Primary  Owner.", null);
            FacesContext.getCurrentInstance().addMessage(null, message);
        } else {
            //            FacesMessage message =
            //                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Contract Owner Must have one Primary  Owner. " + installmentId, null);
            //            FacesContext.getCurrentInstance().addMessage(null, message);
            contractOwnerVO.clearCache();
            BindingContainer bindings = getBindings();
            OperationBinding operationBinding = bindings.getOperationBinding("Commit");
            operationBinding.execute();
            //

        }

        return null;
    }

    public String saveCloseContractCreation() {
        //        ADFContext adfCtx = ADFContext.getCurrent();
        //        Map pageFlowScope = adfCtx.getPageFlowScope();
        //        Number installmentId = (Number) pageFlowScope.get("PInstallmentId");
        totalPrimaryOwner = new Number(0);
        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        ViewObject contractOwnerVO = am.getMAContractOwnerVO();
        if (contractOwnerVO.getRowCount() != 0) {
            for (int i = 0; i < contractOwnerVO.getRowCount(); i++) {
                Row contractOwnerRow = contractOwnerVO.getRowAtRangeIndex(i);
                if (contractOwnerRow.getAttribute("IntAttribute3") != null &&
                    contractOwnerRow.getAttribute("IntAttribute3").equals("Y")) {
                    totalPrimaryOwner = totalPrimaryOwner.add(new Number(1));
                }
            }
        }
        if (totalPrimaryOwner.intValue() == 0) {
            FacesMessage message =
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Contract Owner Must have one Primary  Owner.", null);
            FacesContext.getCurrentInstance().addMessage(null, message);
        } else if (totalPrimaryOwner.intValue() > 1) {
            FacesMessage message =
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Contract Owner Must have only one Primary  Owner.",
                                 null);
            FacesContext.getCurrentInstance().addMessage(null, message);
        } else if (totalPrimaryOwner.intValue() < 0) {
            FacesMessage message =
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Contract Owner Must have one Primary  Owner.", null);
            FacesContext.getCurrentInstance().addMessage(null, message);
        } else {
            //            FacesMessage message =
            //                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Contract Owner Must have one Primary  Owner. " + installmentId, null);
            //            FacesContext.getCurrentInstance().addMessage(null, message);

            BindingContainer bindings = getBindings();
            OperationBinding operationBinding = bindings.getOperationBinding("Commit");
            operationBinding.execute();
            
            ViewObject contractSearchVVO=am.getMAContractsSearchVVO();
            contractSearchVVO.executeQuery();
            
            return "BackToContractPayments";
        }

        return "";
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


    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
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

    public void setIt12(RichInputText it12) {
        this.it12 = it12;
    }

    public RichInputText getIt12() {
        return it12;
    }

    public void setIt14(RichInputText it14) {
        this.it14 = it14;
    }

    public RichInputText getIt14() {
        return it14;
    }

    public void setIt15(RichInputText it15) {
        this.it15 = it15;
    }

    public RichInputText getIt15() {
        return it15;
    }

    public void setIt16(RichInputText it16) {
        this.it16 = it16;
    }

    public RichInputText getIt16() {
        return it16;
    }

    public void setId2(RichInputDate id2) {
        this.id2 = id2;
    }

    public RichInputDate getId2() {
        return id2;
    }

    public void setIlov2(RichInputListOfValues ilov2) {
        this.ilov2 = ilov2;
    }

    public RichInputListOfValues getIlov2() {
        return ilov2;
    }

    public void setT8(RichToolbar t8) {
        this.t8 = t8;
    }

    public RichToolbar getT8() {
        return t8;
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
}

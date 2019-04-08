package ma.oracle.apps.cx.realestate.payments.backing;


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
import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;

public class MAPaymentCreationBean {
    static Number totalInstallment = new Number(0);
    static Number totalRent = new Number(0);
    private RichForm f1;
    private RichDocument d1;
    private RichPanelGroupLayout pgl1;
    private RichPanelBox pb1;
    private RichPanelBox pb2;
    private RichPanelBox pb3;
    private RichMessages m1;
    private RichPanelFormLayout pfl2;
    private RichSelectOneChoice soc2;
    private UISelectItems si2;
    private RichInputText it1;
    private RichInputText it2;
    private RichInputText it3;
    private RichSelectOneChoice soc3;
    private UISelectItems si3;
    private RichInputText it4;
    private RichInputText it5;
    private RichPanelFormLayout pfl3;
    private RichSelectOneChoice soc4;
    private UISelectItems si4;
    private RichInputText it6;
    private RichSelectOneChoice soc5;
    private UISelectItems si5;
    private RichInputText it9;
    private RichInputText it10;
    private RichInputText it11;
    private RichInputText it12;
    private RichSelectOneChoice soc6;
    private UISelectItems si6;
    private RichPanelFormLayout pfl1;
    private RichSelectOneChoice soc1;
    private UISelectItems si1;
    private RichPanelGroupLayout pgl2;
    private RichPanelLabelAndMessage plam1;
    private RichInputText it14;
    private RichPanelLabelAndMessage plam2;
    private RichPanelGroupLayout pgl3;
    private RichInputText it7;
    private RichPanelGroupLayout pgl4;
    private RichSelectBooleanCheckbox sbc1;
    private RichPanelLabelAndMessage plam3;
    private RichPanelGroupLayout pgl5;
    private RichSelectBooleanCheckbox sbc2;
    private RichPanelHeader ph1;
    private RichToolbar t1;
    private RichButton b1;
    private RichButton b2;
    private RichPanelCollection pc1;
    private RichTable t2;
    private RichToolbar t3;
    private RichButton b3;
    private RichPanelCollection pc2;
    private RichTable t4;
    private RichToolbar t5;
    private RichButton b4;
    private RichPopup p1;
    private RichDialog d2;
    private RichOutputText ot1;
    private RichToolbar t6;
    private RichPanelGroupLayout pgl6;
    private RichButton b5;
    private RichButton b6;
    private RichPopup p2;
    private RichDialog d3;
    private RichOutputText ot2;
    private RichToolbar t7;
    private RichPanelGroupLayout pgl7;
    private RichButton b7;
    private RichButton b8;
    private RichToolbar t8;
    private RichLink l1;
    private RichToolbar t9;
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


    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
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

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
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

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }


    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
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

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
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


    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
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


    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
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


    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setPlam1(RichPanelLabelAndMessage plam1) {
        this.plam1 = plam1;
    }

    public RichPanelLabelAndMessage getPlam1() {
        return plam1;
    }

    public void setIt14(RichInputText it14) {
        this.it14 = it14;
    }

    public RichInputText getIt14() {
        return it14;
    }

    public void setPlam2(RichPanelLabelAndMessage plam2) {
        this.plam2 = plam2;
    }

    public RichPanelLabelAndMessage getPlam2() {
        return plam2;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setIt7(RichInputText it7) {
        this.it7 = it7;
    }

    public RichInputText getIt7() {
        return it7;
    }

    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }

    public void setSbc1(RichSelectBooleanCheckbox sbc1) {
        this.sbc1 = sbc1;
    }

    public RichSelectBooleanCheckbox getSbc1() {
        return sbc1;
    }

    public void setPlam3(RichPanelLabelAndMessage plam3) {
        this.plam3 = plam3;
    }

    public RichPanelLabelAndMessage getPlam3() {
        return plam3;
    }

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }

    public void setSbc2(RichSelectBooleanCheckbox sbc2) {
        this.sbc2 = sbc2;
    }

    public RichSelectBooleanCheckbox getSbc2() {
        return sbc2;
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

    public void paymentTypeAction(ValueChangeEvent valueChangeEvent) {
        if (getSoc1() != null) {
            if (getSoc1().getValue().equals("Installment")) {
                getIt14().resetValue();
                getSoc5().resetValue();
                getIt6().resetValue();
                getIt7().resetValue();
                getIt9().resetValue();
                getSoc4().resetValue();
                getIt10().resetValue();
                getIt11().resetValue();
                getSbc1().resetValue();
                getSbc2().resetValue();
                getIt12().resetValue();
                getSoc6().resetValue();
            } else {
                getIt2().resetValue();
                getSoc3().resetValue();
                getIt3().resetValue();
                getIt4().resetValue();
                getIt5().resetValue();
                getSoc2().resetValue();
                getIt1().resetValue();
            }
        }
    }

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
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

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String newInstallmentDetail() {
//        BindingContext bindingContext = BindingContext.getCurrent();
//        @SuppressWarnings("deprecation")
//        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
//        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
//        ViewObject installmentDetailVO = am.getMAInstallmentPaymentTermsDetailsVO();
//
//        if (installmentDetailVO.getRowCount() < 1) {
//            RichPopup.PopupHints hints = new RichPopup.PopupHints();
//            getP1().show(hints);
//        } else {
            BindingContainer bindings = getBindings();
            OperationBinding operationBinding = bindings.getOperationBinding("NewInstallmentDetail");
            operationBinding.execute();
//        }

        return null;
    }

    public String newRentDetail() {

//        BindingContext bindingContext = BindingContext.getCurrent();
//        @SuppressWarnings("deprecation")
//        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
//        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
//        ViewObject rentDetailVO = am.getMARentPaymentTermsDetailsVO();
//
//        if (rentDetailVO.getRowCount() < 1) {
//            RichPopup.PopupHints hints = new RichPopup.PopupHints();
//            getP2().show(hints);
//        } else {
            BindingContainer bindings = getBindings();
            OperationBinding operationBinding = bindings.getOperationBinding("NewRentDetails");
            operationBinding.execute();
//        }

        return null;
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

    public void setOt1(RichOutputText ot1) {
        this.ot1 = ot1;
    }

    public RichOutputText getOt1() {
        return ot1;
    }

    public void setT6(RichToolbar t6) {
        this.t6 = t6;
    }

    public RichToolbar getT6() {
        return t6;
    }

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
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


    public String installmentConfirmationYesAction() {
        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        ViewObject installmentVO = am.getMAInstallmentPaymentTermsVO();
        installmentVO.getCurrentRow().setAttribute("IntAttribute10", "Y");
        am.getDBTransaction().commit();

        getP1().hide();

        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("NewInstallmentDetail");
        operationBinding.execute();

        return null;
    }

    public String installmentConfirmationNoAction() {
        getP1().hide();
        return null;
    }

    public void setP2(RichPopup p2) {
        this.p2 = p2;
    }

    public RichPopup getP2() {
        return p2;
    }

    public void setD3(RichDialog d3) {
        this.d3 = d3;
    }

    public RichDialog getD3() {
        return d3;
    }

    public void setOt2(RichOutputText ot2) {
        this.ot2 = ot2;
    }

    public RichOutputText getOt2() {
        return ot2;
    }

    public void setT7(RichToolbar t7) {
        this.t7 = t7;
    }

    public RichToolbar getT7() {
        return t7;
    }

    public void setPgl7(RichPanelGroupLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGroupLayout getPgl7() {
        return pgl7;
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

    public String rentConfirmationYesAction() {
        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        ViewObject rentVO = am.getMARentPaymentTermsVO();
        rentVO.getCurrentRow().setAttribute("IntAttribute11", "Y");
        am.getDBTransaction().commit();

        getP2().hide();

        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("NewRentDetails");
        operationBinding.execute();

        return null;
    }

    public String rentConfirmationNoAction() {
        getP2().hide();
        return null;
    }

    public String applyBtnAction() {
        totalInstallment = new Number(0);
        totalRent = new Number(0);
        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        ViewObject installmentDetailVO = am.getMAInstallmentPaymentTermsDetailsVO();
        ViewObject rentDetailVO = am.getMARentPaymentTermsDetailsVO();
        ViewObject paymentTypeVO = am.getMADummyPaymentTypeVVO();
        if (paymentTypeVO.getCurrentRow() != null) {
            if (paymentTypeVO.getCurrentRow().getAttribute("PaymentType") != null) {
                if (paymentTypeVO.getCurrentRow().getAttribute("PaymentType").equals("Installment")) {
                    if (installmentDetailVO.getRowCount() > 0) {
                        for (int i = 0; i < installmentDetailVO.getRowCount(); i++) {
                            Row installmentRow = installmentDetailVO.getRowAtRangeIndex(i);
                            totalInstallment =
                                totalInstallment.add((Number) installmentRow.getAttribute("InstallmentValue"));
                        }
                        if (totalInstallment.compareTo(new Number(100)) == 0) {
                            BindingContainer bindings = getBindings();
                            OperationBinding operationBinding = bindings.getOperationBinding("Commit");
                            operationBinding.execute();
                            
                            ViewObject installmentSearchVO = am.getMAInstallmentPaymentTermsVVO();
                            installmentSearchVO.reset();
                            installmentSearchVO.clearCache();
                            installmentSearchVO.executeQuery();

                            ViewObject rentSearchVO = am.getMARentPaymentTermsVVO();
                            rentSearchVO.reset();
                            rentSearchVO.clearCache();
                            rentSearchVO.executeQuery();
                            
                            return "BackPaymentSearch";
                        } else {
                            FacesMessage message =
                                new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                                 "Total installment value for Detail rows must equal to 100%", null);
                            FacesContext.getCurrentInstance().addMessage(null, message);
                        }
                    } else {
                        FacesMessage message =
                            new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                             "Total installment value for Detail rows must equal to 100%", null);
                        FacesContext.getCurrentInstance().addMessage(null, message);
                    }
                } else {
                    if (rentDetailVO.getRowCount() > 0) {
                        for (int i = 0; i < rentDetailVO.getRowCount(); i++) {
                            Row rentRow = rentDetailVO.getRowAtRangeIndex(i);
                            totalRent = totalRent.add((Number) rentRow.getAttribute("RentValue"));
                        }
                        if (totalRent.compareTo(new Number(100)) == 0) {
                            BindingContainer bindings = getBindings();
                            OperationBinding operationBinding = bindings.getOperationBinding("Commit");
                            operationBinding.execute();
                            
                            ViewObject installmentSearchVO = am.getMAInstallmentPaymentTermsVVO();
                            installmentSearchVO.reset();
                            installmentSearchVO.clearCache();
                            installmentSearchVO.executeQuery();

                            ViewObject rentSearchVO = am.getMARentPaymentTermsVVO();
                            rentSearchVO.reset();
                            rentSearchVO.clearCache();
                            rentSearchVO.executeQuery();
                            
                            return "BackPaymentSearch";
                        } else {
                            FacesMessage message =
                                new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                                 "Total Rent value for Detail rows must equal to 100%", null);
                            FacesContext.getCurrentInstance().addMessage(null, message);
                        }
                    } else {
                        FacesMessage message =
                            new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                             "Total Rent value for Detail rows must equal to 100%", null);
                        FacesContext.getCurrentInstance().addMessage(null, message);
                    }
                }
            }
        } else {
            if (rentDetailVO.getRowCount() > 0) {
                for (int i = 0; i < rentDetailVO.getRowCount(); i++) {
                    Row rentRow = rentDetailVO.getRowAtRangeIndex(i);
                    totalRent = totalRent.add((Number) rentRow.getAttribute("RentValue"));
                }
                if (totalRent.compareTo(new Number(100)) == 0) {
                    BindingContainer bindings = getBindings();
                    OperationBinding operationBinding = bindings.getOperationBinding("Commit");
                    operationBinding.execute();
                    
                    ViewObject installmentSearchVO = am.getMAInstallmentPaymentTermsVVO();
                    installmentSearchVO.reset();
                    installmentSearchVO.clearCache();
                    installmentSearchVO.executeQuery();

                    ViewObject rentSearchVO = am.getMARentPaymentTermsVVO();
                    rentSearchVO.reset();
                    rentSearchVO.clearCache();
                    rentSearchVO.executeQuery();
                    
                    return "BackPaymentSearch";
                } else {
                    FacesMessage message =
                        new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                         "Total Rent value for Detail rows must equal to 100%", null);
                    FacesContext.getCurrentInstance().addMessage(null, message);
                }
            } else {
                FacesMessage message =
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Total Rent value for Detail rows must equal to 100%",
                                     null);
                FacesContext.getCurrentInstance().addMessage(null, message);
            }
        }


        return null;
    }
/*
    public void beforePhase(PhaseEvent phaseEvent) {
        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        ViewObject dummyPaymentTypeVVO = am.findViewObject("MADummyPaymentTypeVVO");
        RowSet lov = (RowSet) dummyPaymentTypeVVO.getCurrentRow().getAttribute("MAPaymentTypeVVO");

        Map installmentScope = ADFContext.getCurrent().getSessionScope();
        String installment = (String) installmentScope.get("InstallmentScope");
        if (installment != null) {
            if (installment.equals("Y")) {
//                getSoc1().setValue("Installment");
                lov.setCurrentRowAtRangeIndex(0);
//                dummyPaymentTypeVVO.getCurrentRow().setAttribute("PaymentType", "Installment");
            } else {
//                getSoc1().setValue("Rent");
                lov.setCurrentRowAtRangeIndex(1);
//                dummyPaymentTypeVVO.getCurrentRow().setAttribute("PaymentType", "Rent");
            }
            installmentScope.remove("InstallmentScope");
        }


    }
*/
    public void setT8(RichToolbar t8) {
        this.t8 = t8;
    }

    public RichToolbar getT8() {
        return t8;
    }


    public void setL1(RichLink l1) {
        this.l1 = l1;
    }

    public RichLink getL1() {
        return l1;
    }


    public void beforePhase(PhaseEvent phaseEvent) {
        BindingContext bindingContext = BindingContext.getCurrent();
        @SuppressWarnings("deprecation")
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();

        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        String actionScope = (String) sessionScope.get("ActionScope");
        if (actionScope != null) {
            getPb1().setRendered(false);
            if (actionScope.equals("NewInstallment")||actionScope.equals("EditInstallment")) {
                getPb3().setRendered(false);
                sessionScope.remove("ActionScope");
            } else{
                getPb2().setRendered(false);
                sessionScope.remove("ActionScope");
            }
        }
        
        am.set_lang();
    }

    public void setT9(RichToolbar t9) {
        this.t9 = t9;
    }

    public RichToolbar getT9() {
        return t9;
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

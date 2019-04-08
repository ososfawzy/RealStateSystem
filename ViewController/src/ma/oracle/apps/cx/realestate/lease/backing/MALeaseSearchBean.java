package ma.oracle.apps.cx.realestate.lease.backing;

import java.util.Iterator;

import javax.faces.event.PhaseEvent;

import ma.oracle.apps.cx.realestate.lease.modules.MARealEstateLeaseAMImpl;
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

import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.domain.Number;

public class MALeaseSearchBean {
    private RichForm f1;
    private RichDocument d1;
    private RichMessages m1;
    private RichPanelGroupLayout pgl1;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichTable resId1;
    private RichPanelCollection pc1;
    private RichToolbar t1;
    private RichPopup p1;
    private RichDialog d2;
    private RichPanelFormLayout pfl1;
    private RichPanelLabelAndMessage plam1;
    private RichOutputText ot12;
    private RichPanelLabelAndMessage plam2;
    private RichOutputText ot13;
    private RichPanelLabelAndMessage plam3;
    private RichOutputText ot14;
    private RichPanelLabelAndMessage plam4;
    private RichOutputText ot15;
    private RichPanelLabelAndMessage plam5;
    private RichOutputText ot16;
    private RichPanelLabelAndMessage plam6;
    private RichOutputText ot17;
    private RichPanelLabelAndMessage plam7;
    private RichOutputText ot18;
    private RichPanelLabelAndMessage plam8;
    private RichOutputText ot19;
    private RichPanelLabelAndMessage plam9;
    private RichOutputText ot20;
    private RichPanelLabelAndMessage plam10;
    private RichOutputText ot21;
    private RichPanelLabelAndMessage plam11;
    private RichOutputText ot22;
    private RichPanelLabelAndMessage plam12;
    private RichOutputText ot23;
    private RichPanelLabelAndMessage plam13;
    private RichOutputText ot24;
    private RichPanelLabelAndMessage plam14;
    private RichOutputText ot25;
    private RichPanelLabelAndMessage plam15;
    private RichOutputText ot26;
    private RichPanelLabelAndMessage plam16;
    private RichOutputText ot27;
    private RichPanelLabelAndMessage plam17;
    private RichOutputText ot28;
    private RichPanelLabelAndMessage plam18;
    private RichOutputText ot29;
    private RichPanelLabelAndMessage plam19;
    private RichOutputText ot30;
    private RichPanelLabelAndMessage plam20;
    private RichOutputText ot31;
    private RichPanelLabelAndMessage plam21;
    private RichOutputText ot32;
    private RichPanelLabelAndMessage plam22;
    private RichOutputText ot33;
    private RichPanelLabelAndMessage plam23;
    private RichOutputText ot34;
    private RichPanelLabelAndMessage plam24;
    private RichOutputText ot35;
    private RichPanelLabelAndMessage plam25;
    private RichOutputText ot36;
    private RichPanelLabelAndMessage plam26;
    private RichOutputText ot37;
    private RichPanelLabelAndMessage plam27;
    private RichOutputText ot38;
    private RichPanelLabelAndMessage plam28;
    private RichOutputText ot39;
    private RichPanelLabelAndMessage plam29;
    private RichOutputText ot40;
    private RichPanelLabelAndMessage plam30;
    private RichOutputText ot41;
    private RichPanelLabelAndMessage plam31;
    private RichOutputText ot42;
    private RichPanelLabelAndMessage plam32;
    private RichOutputText ot43;
    private RichPanelLabelAndMessage plam33;
    private RichOutputText ot44;
    private RichPanelLabelAndMessage plam34;
    private RichOutputText ot45;
    private RichPanelLabelAndMessage plam35;
    private RichOutputText ot46;
    private RichPanelLabelAndMessage plam36;
    private RichOutputText ot47;
    private RichPanelLabelAndMessage plam37;
    private RichOutputText ot48;
    private RichPanelLabelAndMessage plam38;
    private RichOutputText ot49;
    private RichPanelLabelAndMessage plam39;
    private RichOutputText ot50;
    private RichPanelLabelAndMessage plam40;
    private RichOutputText ot51;
    private RichPanelLabelAndMessage plam41;
    private RichOutputText ot52;
    private RichPanelLabelAndMessage plam42;
    private RichOutputText ot53;
    private RichPanelLabelAndMessage plam43;
    private RichOutputText ot54;
    private RichPanelLabelAndMessage plam44;
    private RichOutputText ot55;
    private RichPanelLabelAndMessage plam45;
    private RichOutputText ot56;
    private RichPanelLabelAndMessage plam46;
    private RichOutputText ot57;
    private RichPanelLabelAndMessage plam47;
    private RichOutputText ot58;
    private RichPanelLabelAndMessage plam48;
    private RichOutputText ot59;
    private RichPanelLabelAndMessage plam49;
    private RichOutputText ot60;
    private RichPanelLabelAndMessage plam50;
    private RichOutputText ot61;
    private RichPopup p2;
    private RichDialog d3;
    private RichPanelFormLayout pfl2;
    private RichPanelLabelAndMessage plam51;
    private RichOutputText ot62;
    private RichPanelLabelAndMessage plam52;
    private RichOutputText ot63;
    private RichPanelLabelAndMessage plam53;
    private RichOutputText ot64;
    private RichPanelLabelAndMessage plam54;
    private RichOutputText ot65;
    private RichPanelLabelAndMessage plam55;
    private RichOutputText ot66;
    private RichPanelLabelAndMessage plam56;
    private RichOutputText ot67;
    private RichPanelLabelAndMessage plam57;
    private RichOutputText ot68;
    private RichPanelLabelAndMessage plam58;
    private RichOutputText ot69;
    private RichPanelLabelAndMessage plam59;
    private RichOutputText ot70;
    private RichPopup p3;
    private RichDialog d4;
    private RichPanelFormLayout pfl3;
    private RichPanelLabelAndMessage plam60;
    private RichOutputText ot71;
    private RichPanelLabelAndMessage plam61;
    private RichOutputText ot72;
    private RichPanelLabelAndMessage plam62;
    private RichOutputText ot73;
    private RichPopup p4;
    private RichDialog d5;
    private RichPanelFormLayout pfl4;
    private RichPanelLabelAndMessage plam63;
    private RichOutputText ot74;
    private RichPanelLabelAndMessage plam64;
    private RichOutputText ot75;
    private RichPanelLabelAndMessage plam65;
    private RichOutputText ot76;
    private RichPanelLabelAndMessage plam66;
    private RichOutputText ot77;
    private RichPanelLabelAndMessage plam67;
    private RichOutputText ot78;
    private RichPanelLabelAndMessage plam68;
    private RichOutputText ot79;
    private RichPanelLabelAndMessage plam69;
    private RichOutputText ot80;
    private RichPanelLabelAndMessage plam70;
    private RichOutputText ot81;
    private RichPanelLabelAndMessage plam71;
    private RichOutputText ot82;
    private RichPanelLabelAndMessage plam72;
    private RichOutputText ot83;
    private RichPanelLabelAndMessage plam73;
    private RichOutputText ot84;
    private RichPanelLabelAndMessage plam74;
    private RichOutputText ot85;
    private RichPanelLabelAndMessage plam75;
    private RichOutputText ot86;
    private RichPanelLabelAndMessage plam76;
    private RichOutputText ot87;
    private RichPanelLabelAndMessage plam77;
    private RichOutputText ot88;
    private RichPanelLabelAndMessage plam78;
    private RichOutputText ot89;
    private RichPanelLabelAndMessage plam79;
    private RichOutputText ot90;
    private RichPanelLabelAndMessage plam80;
    private RichOutputText ot91;
    private RichPanelLabelAndMessage plam81;
    private RichOutputText ot92;
    private RichPanelLabelAndMessage plam82;
    private RichOutputText ot93;
    private RichPanelLabelAndMessage plam83;
    private RichOutputText ot94;
    private RichPanelLabelAndMessage plam84;
    private RichOutputText ot95;
    private RichPanelLabelAndMessage plam85;
    private RichOutputText ot96;
    private RichPanelLabelAndMessage plam86;
    private RichOutputText ot97;
    private RichPanelLabelAndMessage plam87;
    private RichOutputText ot98;
    private RichPanelLabelAndMessage plam88;
    private RichOutputText ot99;
    private RichPanelLabelAndMessage plam89;
    private RichOutputText ot100;
    private RichPanelLabelAndMessage plam90;
    private RichOutputText ot101;
    private RichPanelLabelAndMessage plam91;
    private RichOutputText ot102;
    private RichPanelLabelAndMessage plam92;
    private RichOutputText ot103;
    private RichPanelLabelAndMessage plam93;
    private RichOutputText ot104;
    private RichPanelLabelAndMessage plam94;
    private RichOutputText ot105;
    private RichPanelLabelAndMessage plam95;
    private RichOutputText ot106;
    private RichPanelLabelAndMessage plam96;
    private RichOutputText ot107;
    private RichPanelLabelAndMessage plam97;
    private RichOutputText ot108;
    private RichPanelLabelAndMessage plam98;
    private RichOutputText ot109;
    private RichPanelLabelAndMessage plam99;
    private RichOutputText ot110;
    private RichPanelLabelAndMessage plam100;
    private RichOutputText ot111;
    private RichPanelLabelAndMessage plam101;
    private RichOutputText ot112;
    private RichPanelLabelAndMessage plam102;
    private RichOutputText ot113;
    private RichPanelLabelAndMessage plam103;
    private RichOutputText ot114;
    private RichPanelLabelAndMessage plam104;
    private RichOutputText ot115;
    private RichPanelLabelAndMessage plam105;
    private RichOutputText ot116;
    private RichPanelLabelAndMessage plam106;
    private RichOutputText ot117;
    private RichPanelLabelAndMessage plam107;
    private RichOutputText ot118;
    private RichPanelLabelAndMessage plam108;
    private RichOutputText ot119;
    private RichPanelLabelAndMessage plam109;
    private RichOutputText ot120;
    private RichPanelLabelAndMessage plam110;
    private RichOutputText ot121;
    private RichPanelLabelAndMessage plam111;
    private RichOutputText ot122;
    private RichPanelLabelAndMessage plam112;
    private RichOutputText ot123;
    private RichPopup p5;
    private RichDialog d6;
    private RichPanelFormLayout pfl5;
    private RichPanelLabelAndMessage plam113;
    private RichOutputText ot124;
    private RichPanelLabelAndMessage plam114;
    private RichOutputText ot125;
    private RichPopup p6;
    private RichDialog d7;
    private RichPanelFormLayout pfl6;
    private RichPanelLabelAndMessage plam115;
    private RichOutputText ot126;
    private RichPanelLabelAndMessage plam116;
    private RichOutputText ot127;
    private RichPanelLabelAndMessage plam117;
    private RichOutputText ot128;
    private RichButton cb1;
    private RichButton cb3;
    private RichButton cb2;
    private RichPanelGroupLayout pgl2;
    private RichOutputText ot130;
    private RichLink l1;
    private RichToolbar t2;
    private RichButton b1;
    private RichButton b2;

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

    public void setT1(RichToolbar t1) {
        this.t1 = t1;
    }

    public RichToolbar getT1() {
        return t1;
    }


    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String createNewLease() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return "CreateNewLease";
        }
        return "CreateNewLease";
    }


    public String editLeaseRow() {
        BindingContainer bindings = getBindings();
        OperationBinding initLeaseQueryOB =
            bindings.getOperationBinding("initLeaseQuery");
        initLeaseQueryOB.getParamsMap().put("leaseId",
                                                 getCurrentLease());
        initLeaseQueryOB.execute();
        return "EditLeaseRow";
    }
    
    public Number getCurrentLease() {
        Number leaseId = null;
        UIXTable table = getResId1();
        Iterator selectionIt = table.getSelectedRowKeys().iterator();
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();
            leaseId = (Number)selectedRow.getAttribute("LeaseId");
        }
        return leaseId;
    }
    
    public String leasePopupShow(){
        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        this.getP1().show(hints);
        return null;
    }
   
    public String tenantNamePopupShow(){
        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        this.getP5().show(hints);
        return null;
    }
    
    public String tenantSupplierPopupShow(){
        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        this.getP6().show(hints);
        return null;
    }
    
    public String parentLeasePopupShow(){
        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        this.getP4().show(hints);
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

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setPlam1(RichPanelLabelAndMessage plam1) {
        this.plam1 = plam1;
    }

    public RichPanelLabelAndMessage getPlam1() {
        return plam1;
    }

    public void setOt12(RichOutputText ot12) {
        this.ot12 = ot12;
    }

    public RichOutputText getOt12() {
        return ot12;
    }

    public void setPlam2(RichPanelLabelAndMessage plam2) {
        this.plam2 = plam2;
    }

    public RichPanelLabelAndMessage getPlam2() {
        return plam2;
    }

    public void setOt13(RichOutputText ot13) {
        this.ot13 = ot13;
    }

    public RichOutputText getOt13() {
        return ot13;
    }

    public void setPlam3(RichPanelLabelAndMessage plam3) {
        this.plam3 = plam3;
    }

    public RichPanelLabelAndMessage getPlam3() {
        return plam3;
    }

    public void setOt14(RichOutputText ot14) {
        this.ot14 = ot14;
    }

    public RichOutputText getOt14() {
        return ot14;
    }

    public void setPlam4(RichPanelLabelAndMessage plam4) {
        this.plam4 = plam4;
    }

    public RichPanelLabelAndMessage getPlam4() {
        return plam4;
    }

    public void setOt15(RichOutputText ot15) {
        this.ot15 = ot15;
    }

    public RichOutputText getOt15() {
        return ot15;
    }

    public void setPlam5(RichPanelLabelAndMessage plam5) {
        this.plam5 = plam5;
    }

    public RichPanelLabelAndMessage getPlam5() {
        return plam5;
    }

    public void setOt16(RichOutputText ot16) {
        this.ot16 = ot16;
    }

    public RichOutputText getOt16() {
        return ot16;
    }

    public void setPlam6(RichPanelLabelAndMessage plam6) {
        this.plam6 = plam6;
    }

    public RichPanelLabelAndMessage getPlam6() {
        return plam6;
    }

    public void setOt17(RichOutputText ot17) {
        this.ot17 = ot17;
    }

    public RichOutputText getOt17() {
        return ot17;
    }

    public void setPlam7(RichPanelLabelAndMessage plam7) {
        this.plam7 = plam7;
    }

    public RichPanelLabelAndMessage getPlam7() {
        return plam7;
    }

    public void setOt18(RichOutputText ot18) {
        this.ot18 = ot18;
    }

    public RichOutputText getOt18() {
        return ot18;
    }

    public void setPlam8(RichPanelLabelAndMessage plam8) {
        this.plam8 = plam8;
    }

    public RichPanelLabelAndMessage getPlam8() {
        return plam8;
    }

    public void setOt19(RichOutputText ot19) {
        this.ot19 = ot19;
    }

    public RichOutputText getOt19() {
        return ot19;
    }

    public void setPlam9(RichPanelLabelAndMessage plam9) {
        this.plam9 = plam9;
    }

    public RichPanelLabelAndMessage getPlam9() {
        return plam9;
    }

    public void setOt20(RichOutputText ot20) {
        this.ot20 = ot20;
    }

    public RichOutputText getOt20() {
        return ot20;
    }

    public void setPlam10(RichPanelLabelAndMessage plam10) {
        this.plam10 = plam10;
    }

    public RichPanelLabelAndMessage getPlam10() {
        return plam10;
    }

    public void setOt21(RichOutputText ot21) {
        this.ot21 = ot21;
    }

    public RichOutputText getOt21() {
        return ot21;
    }

    public void setPlam11(RichPanelLabelAndMessage plam11) {
        this.plam11 = plam11;
    }

    public RichPanelLabelAndMessage getPlam11() {
        return plam11;
    }

    public void setOt22(RichOutputText ot22) {
        this.ot22 = ot22;
    }

    public RichOutputText getOt22() {
        return ot22;
    }

    public void setPlam12(RichPanelLabelAndMessage plam12) {
        this.plam12 = plam12;
    }

    public RichPanelLabelAndMessage getPlam12() {
        return plam12;
    }

    public void setOt23(RichOutputText ot23) {
        this.ot23 = ot23;
    }

    public RichOutputText getOt23() {
        return ot23;
    }

    public void setPlam13(RichPanelLabelAndMessage plam13) {
        this.plam13 = plam13;
    }

    public RichPanelLabelAndMessage getPlam13() {
        return plam13;
    }

    public void setOt24(RichOutputText ot24) {
        this.ot24 = ot24;
    }

    public RichOutputText getOt24() {
        return ot24;
    }

    public void setPlam14(RichPanelLabelAndMessage plam14) {
        this.plam14 = plam14;
    }

    public RichPanelLabelAndMessage getPlam14() {
        return plam14;
    }

    public void setOt25(RichOutputText ot25) {
        this.ot25 = ot25;
    }

    public RichOutputText getOt25() {
        return ot25;
    }

    public void setPlam15(RichPanelLabelAndMessage plam15) {
        this.plam15 = plam15;
    }

    public RichPanelLabelAndMessage getPlam15() {
        return plam15;
    }

    public void setOt26(RichOutputText ot26) {
        this.ot26 = ot26;
    }

    public RichOutputText getOt26() {
        return ot26;
    }

    public void setPlam16(RichPanelLabelAndMessage plam16) {
        this.plam16 = plam16;
    }

    public RichPanelLabelAndMessage getPlam16() {
        return plam16;
    }

    public void setOt27(RichOutputText ot27) {
        this.ot27 = ot27;
    }

    public RichOutputText getOt27() {
        return ot27;
    }

    public void setPlam17(RichPanelLabelAndMessage plam17) {
        this.plam17 = plam17;
    }

    public RichPanelLabelAndMessage getPlam17() {
        return plam17;
    }

    public void setOt28(RichOutputText ot28) {
        this.ot28 = ot28;
    }

    public RichOutputText getOt28() {
        return ot28;
    }

    public void setPlam18(RichPanelLabelAndMessage plam18) {
        this.plam18 = plam18;
    }

    public RichPanelLabelAndMessage getPlam18() {
        return plam18;
    }

    public void setOt29(RichOutputText ot29) {
        this.ot29 = ot29;
    }

    public RichOutputText getOt29() {
        return ot29;
    }

    public void setPlam19(RichPanelLabelAndMessage plam19) {
        this.plam19 = plam19;
    }

    public RichPanelLabelAndMessage getPlam19() {
        return plam19;
    }

    public void setOt30(RichOutputText ot30) {
        this.ot30 = ot30;
    }

    public RichOutputText getOt30() {
        return ot30;
    }

    public void setPlam20(RichPanelLabelAndMessage plam20) {
        this.plam20 = plam20;
    }

    public RichPanelLabelAndMessage getPlam20() {
        return plam20;
    }

    public void setOt31(RichOutputText ot31) {
        this.ot31 = ot31;
    }

    public RichOutputText getOt31() {
        return ot31;
    }

    public void setPlam21(RichPanelLabelAndMessage plam21) {
        this.plam21 = plam21;
    }

    public RichPanelLabelAndMessage getPlam21() {
        return plam21;
    }

    public void setOt32(RichOutputText ot32) {
        this.ot32 = ot32;
    }

    public RichOutputText getOt32() {
        return ot32;
    }

    public void setPlam22(RichPanelLabelAndMessage plam22) {
        this.plam22 = plam22;
    }

    public RichPanelLabelAndMessage getPlam22() {
        return plam22;
    }

    public void setOt33(RichOutputText ot33) {
        this.ot33 = ot33;
    }

    public RichOutputText getOt33() {
        return ot33;
    }

    public void setPlam23(RichPanelLabelAndMessage plam23) {
        this.plam23 = plam23;
    }

    public RichPanelLabelAndMessage getPlam23() {
        return plam23;
    }

    public void setOt34(RichOutputText ot34) {
        this.ot34 = ot34;
    }

    public RichOutputText getOt34() {
        return ot34;
    }

    public void setPlam24(RichPanelLabelAndMessage plam24) {
        this.plam24 = plam24;
    }

    public RichPanelLabelAndMessage getPlam24() {
        return plam24;
    }

    public void setOt35(RichOutputText ot35) {
        this.ot35 = ot35;
    }

    public RichOutputText getOt35() {
        return ot35;
    }

    public void setPlam25(RichPanelLabelAndMessage plam25) {
        this.plam25 = plam25;
    }

    public RichPanelLabelAndMessage getPlam25() {
        return plam25;
    }

    public void setOt36(RichOutputText ot36) {
        this.ot36 = ot36;
    }

    public RichOutputText getOt36() {
        return ot36;
    }

    public void setPlam26(RichPanelLabelAndMessage plam26) {
        this.plam26 = plam26;
    }

    public RichPanelLabelAndMessage getPlam26() {
        return plam26;
    }

    public void setOt37(RichOutputText ot37) {
        this.ot37 = ot37;
    }

    public RichOutputText getOt37() {
        return ot37;
    }

    public void setPlam27(RichPanelLabelAndMessage plam27) {
        this.plam27 = plam27;
    }

    public RichPanelLabelAndMessage getPlam27() {
        return plam27;
    }

    public void setOt38(RichOutputText ot38) {
        this.ot38 = ot38;
    }

    public RichOutputText getOt38() {
        return ot38;
    }

    public void setPlam28(RichPanelLabelAndMessage plam28) {
        this.plam28 = plam28;
    }

    public RichPanelLabelAndMessage getPlam28() {
        return plam28;
    }

    public void setOt39(RichOutputText ot39) {
        this.ot39 = ot39;
    }

    public RichOutputText getOt39() {
        return ot39;
    }

    public void setPlam29(RichPanelLabelAndMessage plam29) {
        this.plam29 = plam29;
    }

    public RichPanelLabelAndMessage getPlam29() {
        return plam29;
    }

    public void setOt40(RichOutputText ot40) {
        this.ot40 = ot40;
    }

    public RichOutputText getOt40() {
        return ot40;
    }

    public void setPlam30(RichPanelLabelAndMessage plam30) {
        this.plam30 = plam30;
    }

    public RichPanelLabelAndMessage getPlam30() {
        return plam30;
    }

    public void setOt41(RichOutputText ot41) {
        this.ot41 = ot41;
    }

    public RichOutputText getOt41() {
        return ot41;
    }

    public void setPlam31(RichPanelLabelAndMessage plam31) {
        this.plam31 = plam31;
    }

    public RichPanelLabelAndMessage getPlam31() {
        return plam31;
    }

    public void setOt42(RichOutputText ot42) {
        this.ot42 = ot42;
    }

    public RichOutputText getOt42() {
        return ot42;
    }

    public void setPlam32(RichPanelLabelAndMessage plam32) {
        this.plam32 = plam32;
    }

    public RichPanelLabelAndMessage getPlam32() {
        return plam32;
    }

    public void setOt43(RichOutputText ot43) {
        this.ot43 = ot43;
    }

    public RichOutputText getOt43() {
        return ot43;
    }

    public void setPlam33(RichPanelLabelAndMessage plam33) {
        this.plam33 = plam33;
    }

    public RichPanelLabelAndMessage getPlam33() {
        return plam33;
    }

    public void setOt44(RichOutputText ot44) {
        this.ot44 = ot44;
    }

    public RichOutputText getOt44() {
        return ot44;
    }

    public void setPlam34(RichPanelLabelAndMessage plam34) {
        this.plam34 = plam34;
    }

    public RichPanelLabelAndMessage getPlam34() {
        return plam34;
    }

    public void setOt45(RichOutputText ot45) {
        this.ot45 = ot45;
    }

    public RichOutputText getOt45() {
        return ot45;
    }

    public void setPlam35(RichPanelLabelAndMessage plam35) {
        this.plam35 = plam35;
    }

    public RichPanelLabelAndMessage getPlam35() {
        return plam35;
    }

    public void setOt46(RichOutputText ot46) {
        this.ot46 = ot46;
    }

    public RichOutputText getOt46() {
        return ot46;
    }

    public void setPlam36(RichPanelLabelAndMessage plam36) {
        this.plam36 = plam36;
    }

    public RichPanelLabelAndMessage getPlam36() {
        return plam36;
    }

    public void setOt47(RichOutputText ot47) {
        this.ot47 = ot47;
    }

    public RichOutputText getOt47() {
        return ot47;
    }

    public void setPlam37(RichPanelLabelAndMessage plam37) {
        this.plam37 = plam37;
    }

    public RichPanelLabelAndMessage getPlam37() {
        return plam37;
    }

    public void setOt48(RichOutputText ot48) {
        this.ot48 = ot48;
    }

    public RichOutputText getOt48() {
        return ot48;
    }

    public void setPlam38(RichPanelLabelAndMessage plam38) {
        this.plam38 = plam38;
    }

    public RichPanelLabelAndMessage getPlam38() {
        return plam38;
    }

    public void setOt49(RichOutputText ot49) {
        this.ot49 = ot49;
    }

    public RichOutputText getOt49() {
        return ot49;
    }

    public void setPlam39(RichPanelLabelAndMessage plam39) {
        this.plam39 = plam39;
    }

    public RichPanelLabelAndMessage getPlam39() {
        return plam39;
    }

    public void setOt50(RichOutputText ot50) {
        this.ot50 = ot50;
    }

    public RichOutputText getOt50() {
        return ot50;
    }

    public void setPlam40(RichPanelLabelAndMessage plam40) {
        this.plam40 = plam40;
    }

    public RichPanelLabelAndMessage getPlam40() {
        return plam40;
    }

    public void setOt51(RichOutputText ot51) {
        this.ot51 = ot51;
    }

    public RichOutputText getOt51() {
        return ot51;
    }

    public void setPlam41(RichPanelLabelAndMessage plam41) {
        this.plam41 = plam41;
    }

    public RichPanelLabelAndMessage getPlam41() {
        return plam41;
    }

    public void setOt52(RichOutputText ot52) {
        this.ot52 = ot52;
    }

    public RichOutputText getOt52() {
        return ot52;
    }

    public void setPlam42(RichPanelLabelAndMessage plam42) {
        this.plam42 = plam42;
    }

    public RichPanelLabelAndMessage getPlam42() {
        return plam42;
    }

    public void setOt53(RichOutputText ot53) {
        this.ot53 = ot53;
    }

    public RichOutputText getOt53() {
        return ot53;
    }

    public void setPlam43(RichPanelLabelAndMessage plam43) {
        this.plam43 = plam43;
    }

    public RichPanelLabelAndMessage getPlam43() {
        return plam43;
    }

    public void setOt54(RichOutputText ot54) {
        this.ot54 = ot54;
    }

    public RichOutputText getOt54() {
        return ot54;
    }

    public void setPlam44(RichPanelLabelAndMessage plam44) {
        this.plam44 = plam44;
    }

    public RichPanelLabelAndMessage getPlam44() {
        return plam44;
    }

    public void setOt55(RichOutputText ot55) {
        this.ot55 = ot55;
    }

    public RichOutputText getOt55() {
        return ot55;
    }

    public void setPlam45(RichPanelLabelAndMessage plam45) {
        this.plam45 = plam45;
    }

    public RichPanelLabelAndMessage getPlam45() {
        return plam45;
    }

    public void setOt56(RichOutputText ot56) {
        this.ot56 = ot56;
    }

    public RichOutputText getOt56() {
        return ot56;
    }

    public void setPlam46(RichPanelLabelAndMessage plam46) {
        this.plam46 = plam46;
    }

    public RichPanelLabelAndMessage getPlam46() {
        return plam46;
    }

    public void setOt57(RichOutputText ot57) {
        this.ot57 = ot57;
    }

    public RichOutputText getOt57() {
        return ot57;
    }

    public void setPlam47(RichPanelLabelAndMessage plam47) {
        this.plam47 = plam47;
    }

    public RichPanelLabelAndMessage getPlam47() {
        return plam47;
    }

    public void setOt58(RichOutputText ot58) {
        this.ot58 = ot58;
    }

    public RichOutputText getOt58() {
        return ot58;
    }

    public void setPlam48(RichPanelLabelAndMessage plam48) {
        this.plam48 = plam48;
    }

    public RichPanelLabelAndMessage getPlam48() {
        return plam48;
    }

    public void setOt59(RichOutputText ot59) {
        this.ot59 = ot59;
    }

    public RichOutputText getOt59() {
        return ot59;
    }

    public void setPlam49(RichPanelLabelAndMessage plam49) {
        this.plam49 = plam49;
    }

    public RichPanelLabelAndMessage getPlam49() {
        return plam49;
    }

    public void setOt60(RichOutputText ot60) {
        this.ot60 = ot60;
    }

    public RichOutputText getOt60() {
        return ot60;
    }

    public void setPlam50(RichPanelLabelAndMessage plam50) {
        this.plam50 = plam50;
    }

    public RichPanelLabelAndMessage getPlam50() {
        return plam50;
    }

    public void setOt61(RichOutputText ot61) {
        this.ot61 = ot61;
    }

    public RichOutputText getOt61() {
        return ot61;
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

    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }

    public void setPlam51(RichPanelLabelAndMessage plam51) {
        this.plam51 = plam51;
    }

    public RichPanelLabelAndMessage getPlam51() {
        return plam51;
    }

    public void setOt62(RichOutputText ot62) {
        this.ot62 = ot62;
    }

    public RichOutputText getOt62() {
        return ot62;
    }

    public void setPlam52(RichPanelLabelAndMessage plam52) {
        this.plam52 = plam52;
    }

    public RichPanelLabelAndMessage getPlam52() {
        return plam52;
    }

    public void setOt63(RichOutputText ot63) {
        this.ot63 = ot63;
    }

    public RichOutputText getOt63() {
        return ot63;
    }

    public void setPlam53(RichPanelLabelAndMessage plam53) {
        this.plam53 = plam53;
    }

    public RichPanelLabelAndMessage getPlam53() {
        return plam53;
    }

    public void setOt64(RichOutputText ot64) {
        this.ot64 = ot64;
    }

    public RichOutputText getOt64() {
        return ot64;
    }

    public void setPlam54(RichPanelLabelAndMessage plam54) {
        this.plam54 = plam54;
    }

    public RichPanelLabelAndMessage getPlam54() {
        return plam54;
    }

    public void setOt65(RichOutputText ot65) {
        this.ot65 = ot65;
    }

    public RichOutputText getOt65() {
        return ot65;
    }

    public void setPlam55(RichPanelLabelAndMessage plam55) {
        this.plam55 = plam55;
    }

    public RichPanelLabelAndMessage getPlam55() {
        return plam55;
    }

    public void setOt66(RichOutputText ot66) {
        this.ot66 = ot66;
    }

    public RichOutputText getOt66() {
        return ot66;
    }

    public void setPlam56(RichPanelLabelAndMessage plam56) {
        this.plam56 = plam56;
    }

    public RichPanelLabelAndMessage getPlam56() {
        return plam56;
    }

    public void setOt67(RichOutputText ot67) {
        this.ot67 = ot67;
    }

    public RichOutputText getOt67() {
        return ot67;
    }

    public void setPlam57(RichPanelLabelAndMessage plam57) {
        this.plam57 = plam57;
    }

    public RichPanelLabelAndMessage getPlam57() {
        return plam57;
    }

    public void setOt68(RichOutputText ot68) {
        this.ot68 = ot68;
    }

    public RichOutputText getOt68() {
        return ot68;
    }

    public void setPlam58(RichPanelLabelAndMessage plam58) {
        this.plam58 = plam58;
    }

    public RichPanelLabelAndMessage getPlam58() {
        return plam58;
    }

    public void setOt69(RichOutputText ot69) {
        this.ot69 = ot69;
    }

    public RichOutputText getOt69() {
        return ot69;
    }

    public void setPlam59(RichPanelLabelAndMessage plam59) {
        this.plam59 = plam59;
    }

    public RichPanelLabelAndMessage getPlam59() {
        return plam59;
    }

    public void setOt70(RichOutputText ot70) {
        this.ot70 = ot70;
    }

    public RichOutputText getOt70() {
        return ot70;
    }

    public void setP3(RichPopup p3) {
        this.p3 = p3;
    }

    public RichPopup getP3() {
        return p3;
    }

    public void setD4(RichDialog d4) {
        this.d4 = d4;
    }

    public RichDialog getD4() {
        return d4;
    }

    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
    }

    public void setPlam60(RichPanelLabelAndMessage plam60) {
        this.plam60 = plam60;
    }

    public RichPanelLabelAndMessage getPlam60() {
        return plam60;
    }

    public void setOt71(RichOutputText ot71) {
        this.ot71 = ot71;
    }

    public RichOutputText getOt71() {
        return ot71;
    }

    public void setPlam61(RichPanelLabelAndMessage plam61) {
        this.plam61 = plam61;
    }

    public RichPanelLabelAndMessage getPlam61() {
        return plam61;
    }

    public void setOt72(RichOutputText ot72) {
        this.ot72 = ot72;
    }

    public RichOutputText getOt72() {
        return ot72;
    }

    public void setPlam62(RichPanelLabelAndMessage plam62) {
        this.plam62 = plam62;
    }

    public RichPanelLabelAndMessage getPlam62() {
        return plam62;
    }

    public void setOt73(RichOutputText ot73) {
        this.ot73 = ot73;
    }

    public RichOutputText getOt73() {
        return ot73;
    }

    public void setP4(RichPopup p4) {
        this.p4 = p4;
    }

    public RichPopup getP4() {
        return p4;
    }

    public void setD5(RichDialog d5) {
        this.d5 = d5;
    }

    public RichDialog getD5() {
        return d5;
    }

    public void setPfl4(RichPanelFormLayout pfl4) {
        this.pfl4 = pfl4;
    }

    public RichPanelFormLayout getPfl4() {
        return pfl4;
    }

    public void setPlam63(RichPanelLabelAndMessage plam63) {
        this.plam63 = plam63;
    }

    public RichPanelLabelAndMessage getPlam63() {
        return plam63;
    }

    public void setOt74(RichOutputText ot74) {
        this.ot74 = ot74;
    }

    public RichOutputText getOt74() {
        return ot74;
    }

    public void setPlam64(RichPanelLabelAndMessage plam64) {
        this.plam64 = plam64;
    }

    public RichPanelLabelAndMessage getPlam64() {
        return plam64;
    }

    public void setOt75(RichOutputText ot75) {
        this.ot75 = ot75;
    }

    public RichOutputText getOt75() {
        return ot75;
    }

    public void setPlam65(RichPanelLabelAndMessage plam65) {
        this.plam65 = plam65;
    }

    public RichPanelLabelAndMessage getPlam65() {
        return plam65;
    }

    public void setOt76(RichOutputText ot76) {
        this.ot76 = ot76;
    }

    public RichOutputText getOt76() {
        return ot76;
    }

    public void setPlam66(RichPanelLabelAndMessage plam66) {
        this.plam66 = plam66;
    }

    public RichPanelLabelAndMessage getPlam66() {
        return plam66;
    }

    public void setOt77(RichOutputText ot77) {
        this.ot77 = ot77;
    }

    public RichOutputText getOt77() {
        return ot77;
    }

    public void setPlam67(RichPanelLabelAndMessage plam67) {
        this.plam67 = plam67;
    }

    public RichPanelLabelAndMessage getPlam67() {
        return plam67;
    }

    public void setOt78(RichOutputText ot78) {
        this.ot78 = ot78;
    }

    public RichOutputText getOt78() {
        return ot78;
    }

    public void setPlam68(RichPanelLabelAndMessage plam68) {
        this.plam68 = plam68;
    }

    public RichPanelLabelAndMessage getPlam68() {
        return plam68;
    }

    public void setOt79(RichOutputText ot79) {
        this.ot79 = ot79;
    }

    public RichOutputText getOt79() {
        return ot79;
    }

    public void setPlam69(RichPanelLabelAndMessage plam69) {
        this.plam69 = plam69;
    }

    public RichPanelLabelAndMessage getPlam69() {
        return plam69;
    }

    public void setOt80(RichOutputText ot80) {
        this.ot80 = ot80;
    }

    public RichOutputText getOt80() {
        return ot80;
    }

    public void setPlam70(RichPanelLabelAndMessage plam70) {
        this.plam70 = plam70;
    }

    public RichPanelLabelAndMessage getPlam70() {
        return plam70;
    }

    public void setOt81(RichOutputText ot81) {
        this.ot81 = ot81;
    }

    public RichOutputText getOt81() {
        return ot81;
    }

    public void setPlam71(RichPanelLabelAndMessage plam71) {
        this.plam71 = plam71;
    }

    public RichPanelLabelAndMessage getPlam71() {
        return plam71;
    }

    public void setOt82(RichOutputText ot82) {
        this.ot82 = ot82;
    }

    public RichOutputText getOt82() {
        return ot82;
    }

    public void setPlam72(RichPanelLabelAndMessage plam72) {
        this.plam72 = plam72;
    }

    public RichPanelLabelAndMessage getPlam72() {
        return plam72;
    }

    public void setOt83(RichOutputText ot83) {
        this.ot83 = ot83;
    }

    public RichOutputText getOt83() {
        return ot83;
    }

    public void setPlam73(RichPanelLabelAndMessage plam73) {
        this.plam73 = plam73;
    }

    public RichPanelLabelAndMessage getPlam73() {
        return plam73;
    }

    public void setOt84(RichOutputText ot84) {
        this.ot84 = ot84;
    }

    public RichOutputText getOt84() {
        return ot84;
    }

    public void setPlam74(RichPanelLabelAndMessage plam74) {
        this.plam74 = plam74;
    }

    public RichPanelLabelAndMessage getPlam74() {
        return plam74;
    }

    public void setOt85(RichOutputText ot85) {
        this.ot85 = ot85;
    }

    public RichOutputText getOt85() {
        return ot85;
    }

    public void setPlam75(RichPanelLabelAndMessage plam75) {
        this.plam75 = plam75;
    }

    public RichPanelLabelAndMessage getPlam75() {
        return plam75;
    }

    public void setOt86(RichOutputText ot86) {
        this.ot86 = ot86;
    }

    public RichOutputText getOt86() {
        return ot86;
    }

    public void setPlam76(RichPanelLabelAndMessage plam76) {
        this.plam76 = plam76;
    }

    public RichPanelLabelAndMessage getPlam76() {
        return plam76;
    }

    public void setOt87(RichOutputText ot87) {
        this.ot87 = ot87;
    }

    public RichOutputText getOt87() {
        return ot87;
    }

    public void setPlam77(RichPanelLabelAndMessage plam77) {
        this.plam77 = plam77;
    }

    public RichPanelLabelAndMessage getPlam77() {
        return plam77;
    }

    public void setOt88(RichOutputText ot88) {
        this.ot88 = ot88;
    }

    public RichOutputText getOt88() {
        return ot88;
    }

    public void setPlam78(RichPanelLabelAndMessage plam78) {
        this.plam78 = plam78;
    }

    public RichPanelLabelAndMessage getPlam78() {
        return plam78;
    }

    public void setOt89(RichOutputText ot89) {
        this.ot89 = ot89;
    }

    public RichOutputText getOt89() {
        return ot89;
    }

    public void setPlam79(RichPanelLabelAndMessage plam79) {
        this.plam79 = plam79;
    }

    public RichPanelLabelAndMessage getPlam79() {
        return plam79;
    }

    public void setOt90(RichOutputText ot90) {
        this.ot90 = ot90;
    }

    public RichOutputText getOt90() {
        return ot90;
    }

    public void setPlam80(RichPanelLabelAndMessage plam80) {
        this.plam80 = plam80;
    }

    public RichPanelLabelAndMessage getPlam80() {
        return plam80;
    }

    public void setOt91(RichOutputText ot91) {
        this.ot91 = ot91;
    }

    public RichOutputText getOt91() {
        return ot91;
    }

    public void setPlam81(RichPanelLabelAndMessage plam81) {
        this.plam81 = plam81;
    }

    public RichPanelLabelAndMessage getPlam81() {
        return plam81;
    }

    public void setOt92(RichOutputText ot92) {
        this.ot92 = ot92;
    }

    public RichOutputText getOt92() {
        return ot92;
    }

    public void setPlam82(RichPanelLabelAndMessage plam82) {
        this.plam82 = plam82;
    }

    public RichPanelLabelAndMessage getPlam82() {
        return plam82;
    }

    public void setOt93(RichOutputText ot93) {
        this.ot93 = ot93;
    }

    public RichOutputText getOt93() {
        return ot93;
    }

    public void setPlam83(RichPanelLabelAndMessage plam83) {
        this.plam83 = plam83;
    }

    public RichPanelLabelAndMessage getPlam83() {
        return plam83;
    }

    public void setOt94(RichOutputText ot94) {
        this.ot94 = ot94;
    }

    public RichOutputText getOt94() {
        return ot94;
    }

    public void setPlam84(RichPanelLabelAndMessage plam84) {
        this.plam84 = plam84;
    }

    public RichPanelLabelAndMessage getPlam84() {
        return plam84;
    }

    public void setOt95(RichOutputText ot95) {
        this.ot95 = ot95;
    }

    public RichOutputText getOt95() {
        return ot95;
    }

    public void setPlam85(RichPanelLabelAndMessage plam85) {
        this.plam85 = plam85;
    }

    public RichPanelLabelAndMessage getPlam85() {
        return plam85;
    }

    public void setOt96(RichOutputText ot96) {
        this.ot96 = ot96;
    }

    public RichOutputText getOt96() {
        return ot96;
    }

    public void setPlam86(RichPanelLabelAndMessage plam86) {
        this.plam86 = plam86;
    }

    public RichPanelLabelAndMessage getPlam86() {
        return plam86;
    }

    public void setOt97(RichOutputText ot97) {
        this.ot97 = ot97;
    }

    public RichOutputText getOt97() {
        return ot97;
    }

    public void setPlam87(RichPanelLabelAndMessage plam87) {
        this.plam87 = plam87;
    }

    public RichPanelLabelAndMessage getPlam87() {
        return plam87;
    }

    public void setOt98(RichOutputText ot98) {
        this.ot98 = ot98;
    }

    public RichOutputText getOt98() {
        return ot98;
    }

    public void setPlam88(RichPanelLabelAndMessage plam88) {
        this.plam88 = plam88;
    }

    public RichPanelLabelAndMessage getPlam88() {
        return plam88;
    }

    public void setOt99(RichOutputText ot99) {
        this.ot99 = ot99;
    }

    public RichOutputText getOt99() {
        return ot99;
    }

    public void setPlam89(RichPanelLabelAndMessage plam89) {
        this.plam89 = plam89;
    }

    public RichPanelLabelAndMessage getPlam89() {
        return plam89;
    }

    public void setOt100(RichOutputText ot100) {
        this.ot100 = ot100;
    }

    public RichOutputText getOt100() {
        return ot100;
    }

    public void setPlam90(RichPanelLabelAndMessage plam90) {
        this.plam90 = plam90;
    }

    public RichPanelLabelAndMessage getPlam90() {
        return plam90;
    }

    public void setOt101(RichOutputText ot101) {
        this.ot101 = ot101;
    }

    public RichOutputText getOt101() {
        return ot101;
    }

    public void setPlam91(RichPanelLabelAndMessage plam91) {
        this.plam91 = plam91;
    }

    public RichPanelLabelAndMessage getPlam91() {
        return plam91;
    }

    public void setOt102(RichOutputText ot102) {
        this.ot102 = ot102;
    }

    public RichOutputText getOt102() {
        return ot102;
    }

    public void setPlam92(RichPanelLabelAndMessage plam92) {
        this.plam92 = plam92;
    }

    public RichPanelLabelAndMessage getPlam92() {
        return plam92;
    }

    public void setOt103(RichOutputText ot103) {
        this.ot103 = ot103;
    }

    public RichOutputText getOt103() {
        return ot103;
    }

    public void setPlam93(RichPanelLabelAndMessage plam93) {
        this.plam93 = plam93;
    }

    public RichPanelLabelAndMessage getPlam93() {
        return plam93;
    }

    public void setOt104(RichOutputText ot104) {
        this.ot104 = ot104;
    }

    public RichOutputText getOt104() {
        return ot104;
    }

    public void setPlam94(RichPanelLabelAndMessage plam94) {
        this.plam94 = plam94;
    }

    public RichPanelLabelAndMessage getPlam94() {
        return plam94;
    }

    public void setOt105(RichOutputText ot105) {
        this.ot105 = ot105;
    }

    public RichOutputText getOt105() {
        return ot105;
    }

    public void setPlam95(RichPanelLabelAndMessage plam95) {
        this.plam95 = plam95;
    }

    public RichPanelLabelAndMessage getPlam95() {
        return plam95;
    }

    public void setOt106(RichOutputText ot106) {
        this.ot106 = ot106;
    }

    public RichOutputText getOt106() {
        return ot106;
    }

    public void setPlam96(RichPanelLabelAndMessage plam96) {
        this.plam96 = plam96;
    }

    public RichPanelLabelAndMessage getPlam96() {
        return plam96;
    }

    public void setOt107(RichOutputText ot107) {
        this.ot107 = ot107;
    }

    public RichOutputText getOt107() {
        return ot107;
    }

    public void setPlam97(RichPanelLabelAndMessage plam97) {
        this.plam97 = plam97;
    }

    public RichPanelLabelAndMessage getPlam97() {
        return plam97;
    }

    public void setOt108(RichOutputText ot108) {
        this.ot108 = ot108;
    }

    public RichOutputText getOt108() {
        return ot108;
    }

    public void setPlam98(RichPanelLabelAndMessage plam98) {
        this.plam98 = plam98;
    }

    public RichPanelLabelAndMessage getPlam98() {
        return plam98;
    }

    public void setOt109(RichOutputText ot109) {
        this.ot109 = ot109;
    }

    public RichOutputText getOt109() {
        return ot109;
    }

    public void setPlam99(RichPanelLabelAndMessage plam99) {
        this.plam99 = plam99;
    }

    public RichPanelLabelAndMessage getPlam99() {
        return plam99;
    }

    public void setOt110(RichOutputText ot110) {
        this.ot110 = ot110;
    }

    public RichOutputText getOt110() {
        return ot110;
    }

    public void setPlam100(RichPanelLabelAndMessage plam100) {
        this.plam100 = plam100;
    }

    public RichPanelLabelAndMessage getPlam100() {
        return plam100;
    }

    public void setOt111(RichOutputText ot111) {
        this.ot111 = ot111;
    }

    public RichOutputText getOt111() {
        return ot111;
    }

    public void setPlam101(RichPanelLabelAndMessage plam101) {
        this.plam101 = plam101;
    }

    public RichPanelLabelAndMessage getPlam101() {
        return plam101;
    }

    public void setOt112(RichOutputText ot112) {
        this.ot112 = ot112;
    }

    public RichOutputText getOt112() {
        return ot112;
    }

    public void setPlam102(RichPanelLabelAndMessage plam102) {
        this.plam102 = plam102;
    }

    public RichPanelLabelAndMessage getPlam102() {
        return plam102;
    }

    public void setOt113(RichOutputText ot113) {
        this.ot113 = ot113;
    }

    public RichOutputText getOt113() {
        return ot113;
    }

    public void setPlam103(RichPanelLabelAndMessage plam103) {
        this.plam103 = plam103;
    }

    public RichPanelLabelAndMessage getPlam103() {
        return plam103;
    }

    public void setOt114(RichOutputText ot114) {
        this.ot114 = ot114;
    }

    public RichOutputText getOt114() {
        return ot114;
    }

    public void setPlam104(RichPanelLabelAndMessage plam104) {
        this.plam104 = plam104;
    }

    public RichPanelLabelAndMessage getPlam104() {
        return plam104;
    }

    public void setOt115(RichOutputText ot115) {
        this.ot115 = ot115;
    }

    public RichOutputText getOt115() {
        return ot115;
    }

    public void setPlam105(RichPanelLabelAndMessage plam105) {
        this.plam105 = plam105;
    }

    public RichPanelLabelAndMessage getPlam105() {
        return plam105;
    }

    public void setOt116(RichOutputText ot116) {
        this.ot116 = ot116;
    }

    public RichOutputText getOt116() {
        return ot116;
    }

    public void setPlam106(RichPanelLabelAndMessage plam106) {
        this.plam106 = plam106;
    }

    public RichPanelLabelAndMessage getPlam106() {
        return plam106;
    }

    public void setOt117(RichOutputText ot117) {
        this.ot117 = ot117;
    }

    public RichOutputText getOt117() {
        return ot117;
    }

    public void setPlam107(RichPanelLabelAndMessage plam107) {
        this.plam107 = plam107;
    }

    public RichPanelLabelAndMessage getPlam107() {
        return plam107;
    }

    public void setOt118(RichOutputText ot118) {
        this.ot118 = ot118;
    }

    public RichOutputText getOt118() {
        return ot118;
    }

    public void setPlam108(RichPanelLabelAndMessage plam108) {
        this.plam108 = plam108;
    }

    public RichPanelLabelAndMessage getPlam108() {
        return plam108;
    }

    public void setOt119(RichOutputText ot119) {
        this.ot119 = ot119;
    }

    public RichOutputText getOt119() {
        return ot119;
    }

    public void setPlam109(RichPanelLabelAndMessage plam109) {
        this.plam109 = plam109;
    }

    public RichPanelLabelAndMessage getPlam109() {
        return plam109;
    }

    public void setOt120(RichOutputText ot120) {
        this.ot120 = ot120;
    }

    public RichOutputText getOt120() {
        return ot120;
    }

    public void setPlam110(RichPanelLabelAndMessage plam110) {
        this.plam110 = plam110;
    }

    public RichPanelLabelAndMessage getPlam110() {
        return plam110;
    }

    public void setOt121(RichOutputText ot121) {
        this.ot121 = ot121;
    }

    public RichOutputText getOt121() {
        return ot121;
    }

    public void setPlam111(RichPanelLabelAndMessage plam111) {
        this.plam111 = plam111;
    }

    public RichPanelLabelAndMessage getPlam111() {
        return plam111;
    }

    public void setOt122(RichOutputText ot122) {
        this.ot122 = ot122;
    }

    public RichOutputText getOt122() {
        return ot122;
    }

    public void setPlam112(RichPanelLabelAndMessage plam112) {
        this.plam112 = plam112;
    }

    public RichPanelLabelAndMessage getPlam112() {
        return plam112;
    }

    public void setOt123(RichOutputText ot123) {
        this.ot123 = ot123;
    }

    public RichOutputText getOt123() {
        return ot123;
    }


    public void setP5(RichPopup p5) {
        this.p5 = p5;
    }

    public RichPopup getP5() {
        return p5;
    }

    public void setD6(RichDialog d6) {
        this.d6 = d6;
    }

    public RichDialog getD6() {
        return d6;
    }

    public void setPfl5(RichPanelFormLayout pfl5) {
        this.pfl5 = pfl5;
    }

    public RichPanelFormLayout getPfl5() {
        return pfl5;
    }

    public void setPlam113(RichPanelLabelAndMessage plam113) {
        this.plam113 = plam113;
    }

    public RichPanelLabelAndMessage getPlam113() {
        return plam113;
    }

    public void setOt124(RichOutputText ot124) {
        this.ot124 = ot124;
    }

    public RichOutputText getOt124() {
        return ot124;
    }

    public void setPlam114(RichPanelLabelAndMessage plam114) {
        this.plam114 = plam114;
    }

    public RichPanelLabelAndMessage getPlam114() {
        return plam114;
    }

    public void setOt125(RichOutputText ot125) {
        this.ot125 = ot125;
    }

    public RichOutputText getOt125() {
        return ot125;
    }

    public void setP6(RichPopup p6) {
        this.p6 = p6;
    }

    public RichPopup getP6() {
        return p6;
    }

    public void setD7(RichDialog d7) {
        this.d7 = d7;
    }

    public RichDialog getD7() {
        return d7;
    }

    public void setPfl6(RichPanelFormLayout pfl6) {
        this.pfl6 = pfl6;
    }

    public RichPanelFormLayout getPfl6() {
        return pfl6;
    }

    public void setPlam115(RichPanelLabelAndMessage plam115) {
        this.plam115 = plam115;
    }

    public RichPanelLabelAndMessage getPlam115() {
        return plam115;
    }

    public void setOt126(RichOutputText ot126) {
        this.ot126 = ot126;
    }

    public RichOutputText getOt126() {
        return ot126;
    }

    public void setPlam116(RichPanelLabelAndMessage plam116) {
        this.plam116 = plam116;
    }

    public RichPanelLabelAndMessage getPlam116() {
        return plam116;
    }

    public void setOt127(RichOutputText ot127) {
        this.ot127 = ot127;
    }

    public RichOutputText getOt127() {
        return ot127;
    }

    public void setPlam117(RichPanelLabelAndMessage plam117) {
        this.plam117 = plam117;
    }

    public RichPanelLabelAndMessage getPlam117() {
        return plam117;
    }

    public void setOt128(RichOutputText ot128) {
        this.ot128 = ot128;
    }

    public RichOutputText getOt128() {
        return ot128;
    }

    public void setCb1(RichButton cb1) {
        this.cb1 = cb1;
    }

    public RichButton getCb1() {
        return cb1;
    }

    public void setCb3(RichButton cb3) {
        this.cb3 = cb3;
    }

    public RichButton getCb3() {
        return cb3;
    }

    public void setCb2(RichButton cb2) {
        this.cb2 = cb2;
    }

    public RichButton getCb2() {
        return cb2;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setOt130(RichOutputText ot130) {
        this.ot130 = ot130;
    }

    public RichOutputText getOt130() {
        return ot130;
    }

    public void setL1(RichLink l1) {
        this.l1 = l1;
    }

    public RichLink getL1() {
        return l1;
    }

    public void setT2(RichToolbar t2) {
        this.t2 = t2;
    }

    public RichToolbar getT2() {
        return t2;
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

    public void beforePhase(PhaseEvent phaseEvent) {
        BindingContext bindingContext;
        bindingContext = BindingContext.getCurrent();
        DCDataControl dc = bindingContext.findDataControl("MARealEstateLeaseAMDataControl");
        MARealEstateLeaseAMImpl am = (MARealEstateLeaseAMImpl) dc.getDataProvider();
        am.set_lang();
    }


}

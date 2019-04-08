package ma.oracle.apps.cx.realestate.lease.backing;

import java.util.Iterator;

import javax.faces.component.UISelectItems;

import javax.faces.event.PhaseEvent;

import ma.oracle.apps.cx.realestate.lease.modules.MARealEstateLeaseAMImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.view.rich.component.UIXTable;
import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelTabbed;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailHeader;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.domain.Number;

import org.apache.myfaces.trinidad.event.DisclosureEvent;


public class MALeaseCreationBean {
    private RichForm f1;
    private RichDocument d1;
    private RichInputText it1;
    private RichInputText it2;
    private RichSelectOneChoice soc1;
    private UISelectItems si1;
    private RichInputText it3;
    private RichInputText it4;
    private RichMessages m1;
    private RichPanelGridLayout pgl3;
    private RichGridRow gr5;
    private RichGridCell gc9;
    private RichGridCell gc10;
    private RichPanelFormLayout pfl2;
    private RichPanelFormLayout pfl3;
    private RichShowDetailHeader sdh1;
    private RichPanelGridLayout pgl1;
    private RichGridRow gr6;
    private RichGridCell gc11;
    private RichGridCell gc12;
    private RichPanelFormLayout pfl1;
    private RichSelectOneChoice soc2;
    private UISelectItems si2;
    private RichSelectOneChoice soc3;
    private UISelectItems si3;
    private RichSelectOneChoice soc4;
    private UISelectItems si4;
    private RichInputDate id1;
    private RichInputDate id2;
    private RichInputDate id3;
    private RichInputText it5;
    private RichInputText it6;
    private RichInputText it8;
    private RichInputText it9;
    private RichPanelFormLayout pfl4;
    private RichShowDetailHeader sdh2;
    private RichPanelFormLayout pfl5;
    private RichSelectOneChoice soc5;
    private UISelectItems si5;
    private RichInputText it10;
    private RichInputText it11;
    private RichInputText it12;
    private RichInputText it13;
    private RichInputText it14;
    private RichSelectOneChoice soc6;
    private UISelectItems si6;
    private RichInputText it15;
    private RichInputText it16;
    private RichInputText it17;
    private RichInputText it18;
    private RichInputText it19;
    private RichPanelGridLayout pgl5;
    private RichGridRow gr7;
    private RichGridCell gc13;
    private RichGridCell gc14;
    private RichPanelFormLayout pfl6;
    private RichShowDetailHeader sdh3;
    private RichPanelGridLayout pgl6;
    private RichGridRow gr8;
    private RichGridCell gc15;
    private RichGridCell gc16;
    private RichPanelFormLayout pfl7;
    private RichPanelFormLayout pfl8;
    private RichInputDate id4;
    private RichInputDate id5;
    private RichInputText it20;
    private RichInputDate id6;
    private RichInputDate id7;
    private RichShowDetailHeader sdh4;
    private RichPanelFormLayout pfl9;
    private RichInputDate id8;
    private RichInputDate id9;
    private RichSelectOneChoice soc9;
    private UISelectItems si9;
    private RichInputText it21;
    private RichInputText it22;
    private RichInputText it24;
    private RichInputText it26;
    private RichSelectOneChoice soc10;
    private UISelectItems si10;
    private RichPanelGridLayout pgl7;
    private RichGridRow gr9;
    private RichGridCell gc17;
    private RichGridCell gc18;
    private RichPanelFormLayout pfl10;
    private RichPanelTabbed pt2;
    private RichShowDetailItem sdi5;
    private RichPanelGroupLayout pgl2;
    private RichPanelGroupLayout pgl8;
    private RichPanelGroupLayout pgl9;
    private RichPanelGroupLayout pgl10;
    private RichPanelGroupLayout pgl11;
    private RichPanelGroupLayout pgl12;
    private RichPanelGridLayout pgl13;
    private RichGridRow gr1;
    private RichGridRow gr2;
    private RichGridRow gr3;
    private RichGridCell gc4;
    private RichGridCell gc5;
    private RichPanelGroupLayout pgl4;
    private RichToolbar t10;
    private RichSelectOneChoice soc7;
    private UISelectItems si7;
    private RichSelectOneChoice soc8;
    private UISelectItems si8;
    private RichShowDetailItem sdi1;
    private RichPanelCollection pc1;
    private RichTable t2;
    private RichToolbar t3;
    private RichPopup p1;
    private RichDialog d2;
    private RichShowDetailItem sdi2;
    private RichPanelGroupLayout pgl15;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichTable resId1;
    private RichPanelGroupLayout pgl16;
    private RichShowDetailItem sdi3;
    private RichTable t1;
    private RichPanelCollection pc2;
    private RichToolbar t5;
    private RichPanelCollection pc3;
    private RichTable t6;
    private RichToolbar t7;
    private RichPopup p2;
    private RichDialog d3;
    private RichPanelGroupLayout panelGroupLayout1;
    private RichPanelHeader panelHeader1;
    private RichQuery query1;
    private RichTable table1;
    private RichPanelGroupLayout panelGroupLayout2;
    private RichPanelGroupLayout pgl17;
    private RichPanelGroupLayout pgl14;
    private RichToolbar t4;
    private RichPanelGroupLayout pgl18;
    private RichGridCell gc1;
    private RichInputText it43;
    private RichInputText it44;
    private RichInputText it45;
    private RichInputText it46;
    private RichInputText it47;
    private RichSelectBooleanCheckbox sbc1;
    private RichSelectBooleanCheckbox sbc2;
    private RichSelectBooleanCheckbox sbc3;
    private RichSelectBooleanCheckbox sbc4;
    private RichButton b1;
    private RichButton b2;
    private RichButton cb4;
    private RichButton cb1;
    private RichButton cb5;
    private RichButton cb9;
    private RichButton cb8;
    private RichButton cb3;
    private RichButton cb2;
    private RichButton cb6;
    private RichButton cb7;
    private RichButton cb20;
    private RichButton cb21;
    private RichButton cb22;
    private RichButton cb23;
    private RichOutputText ot1;
    private RichToolbar t8;
    private RichButton b3;
    private RichButton b4;

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

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }


    public void setPgl3(RichPanelGridLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGridLayout getPgl3() {
        return pgl3;
    }

    public void setGr5(RichGridRow gr5) {
        this.gr5 = gr5;
    }

    public RichGridRow getGr5() {
        return gr5;
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


    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }

    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
    }


    public void setSdh1(RichShowDetailHeader sdh1) {
        this.sdh1 = sdh1;
    }

    public RichShowDetailHeader getSdh1() {
        return sdh1;
    }

    public void setPgl1(RichPanelGridLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGridLayout getPgl1() {
        return pgl1;
    }

    public void setGr6(RichGridRow gr6) {
        this.gr6 = gr6;
    }

    public RichGridRow getGr6() {
        return gr6;
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

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
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

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
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

    public void setPfl4(RichPanelFormLayout pfl4) {
        this.pfl4 = pfl4;
    }

    public RichPanelFormLayout getPfl4() {
        return pfl4;
    }


    public void setSdh2(RichShowDetailHeader sdh2) {
        this.sdh2 = sdh2;
    }

    public RichShowDetailHeader getSdh2() {
        return sdh2;
    }

    public void setPfl5(RichPanelFormLayout pfl5) {
        this.pfl5 = pfl5;
    }

    public RichPanelFormLayout getPfl5() {
        return pfl5;
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

    public void setIt13(RichInputText it13) {
        this.it13 = it13;
    }

    public RichInputText getIt13() {
        return it13;
    }

    public void setIt14(RichInputText it14) {
        this.it14 = it14;
    }

    public RichInputText getIt14() {
        return it14;
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

    public void setIt17(RichInputText it17) {
        this.it17 = it17;
    }

    public RichInputText getIt17() {
        return it17;
    }

    public void setIt18(RichInputText it18) {
        this.it18 = it18;
    }

    public RichInputText getIt18() {
        return it18;
    }

    public void setIt19(RichInputText it19) {
        this.it19 = it19;
    }

    public RichInputText getIt19() {
        return it19;
    }

    public void setPgl5(RichPanelGridLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGridLayout getPgl5() {
        return pgl5;
    }

    public void setGr7(RichGridRow gr7) {
        this.gr7 = gr7;
    }

    public RichGridRow getGr7() {
        return gr7;
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

    public void setPfl6(RichPanelFormLayout pfl6) {
        this.pfl6 = pfl6;
    }

    public RichPanelFormLayout getPfl6() {
        return pfl6;
    }

    public void setSdh3(RichShowDetailHeader sdh3) {
        this.sdh3 = sdh3;
    }

    public RichShowDetailHeader getSdh3() {
        return sdh3;
    }

    public void setPgl6(RichPanelGridLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGridLayout getPgl6() {
        return pgl6;
    }

    public void setGr8(RichGridRow gr8) {
        this.gr8 = gr8;
    }

    public RichGridRow getGr8() {
        return gr8;
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

    public void setPfl7(RichPanelFormLayout pfl7) {
        this.pfl7 = pfl7;
    }

    public RichPanelFormLayout getPfl7() {
        return pfl7;
    }


    public void setPfl8(RichPanelFormLayout pfl8) {
        this.pfl8 = pfl8;
    }

    public RichPanelFormLayout getPfl8() {
        return pfl8;
    }

    public void setId4(RichInputDate id4) {
        this.id4 = id4;
    }

    public RichInputDate getId4() {
        return id4;
    }

    public void setId5(RichInputDate id5) {
        this.id5 = id5;
    }

    public RichInputDate getId5() {
        return id5;
    }


    public void setIt20(RichInputText it20) {
        this.it20 = it20;
    }

    public RichInputText getIt20() {
        return it20;
    }

    public void setId6(RichInputDate id6) {
        this.id6 = id6;
    }

    public RichInputDate getId6() {
        return id6;
    }

    public void setId7(RichInputDate id7) {
        this.id7 = id7;
    }

    public RichInputDate getId7() {
        return id7;
    }

    public void setSdh4(RichShowDetailHeader sdh4) {
        this.sdh4 = sdh4;
    }

    public RichShowDetailHeader getSdh4() {
        return sdh4;
    }

    public void setPfl9(RichPanelFormLayout pfl9) {
        this.pfl9 = pfl9;
    }

    public RichPanelFormLayout getPfl9() {
        return pfl9;
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


    public void setIt24(RichInputText it24) {
        this.it24 = it24;
    }

    public RichInputText getIt24() {
        return it24;
    }


    public void setIt26(RichInputText it26) {
        this.it26 = it26;
    }

    public RichInputText getIt26() {
        return it26;
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

    public void setPgl7(RichPanelGridLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGridLayout getPgl7() {
        return pgl7;
    }

    public void setGr9(RichGridRow gr9) {
        this.gr9 = gr9;
    }

    public RichGridRow getGr9() {
        return gr9;
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

    public void setPfl10(RichPanelFormLayout pfl10) {
        this.pfl10 = pfl10;
    }

    public RichPanelFormLayout getPfl10() {
        return pfl10;
    }

    public void setPt2(RichPanelTabbed pt2) {
        this.pt2 = pt2;
    }

    public RichPanelTabbed getPt2() {
        return pt2;
    }

    public void setSdi5(RichShowDetailItem sdi5) {
        this.sdi5 = sdi5;
    }

    public RichShowDetailItem getSdi5() {
        return sdi5;
    }


    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setPgl8(RichPanelGroupLayout pgl8) {
        this.pgl8 = pgl8;
    }

    public RichPanelGroupLayout getPgl8() {
        return pgl8;
    }

    public void setPgl9(RichPanelGroupLayout pgl9) {
        this.pgl9 = pgl9;
    }

    public RichPanelGroupLayout getPgl9() {
        return pgl9;
    }


    public void setPgl10(RichPanelGroupLayout pgl10) {
        this.pgl10 = pgl10;
    }

    public RichPanelGroupLayout getPgl10() {
        return pgl10;
    }

    public void setPgl11(RichPanelGroupLayout pgl11) {
        this.pgl11 = pgl11;
    }

    public RichPanelGroupLayout getPgl11() {
        return pgl11;
    }

    public void setPgl12(RichPanelGroupLayout pgl12) {
        this.pgl12 = pgl12;
    }

    public RichPanelGroupLayout getPgl12() {
        return pgl12;
    }

    public void setPgl13(RichPanelGridLayout pgl13) {
        this.pgl13 = pgl13;
    }

    public RichPanelGridLayout getPgl13() {
        return pgl13;
    }

    public void setGr1(RichGridRow gr1) {
        this.gr1 = gr1;
    }

    public RichGridRow getGr1() {
        return gr1;
    }


    public void setGr2(RichGridRow gr2) {
        this.gr2 = gr2;
    }

    public RichGridRow getGr2() {
        return gr2;
    }

    public void setGr3(RichGridRow gr3) {
        this.gr3 = gr3;
    }

    public RichGridRow getGr3() {
        return gr3;
    }

    public void setGc4(RichGridCell gc4) {
        this.gc4 = gc4;
    }

    public RichGridCell getGc4() {
        return gc4;
    }

    public void setGc5(RichGridCell gc5) {
        this.gc5 = gc5;
    }

    public RichGridCell getGc5() {
        return gc5;
    }

    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }


    public void setT1(RichToolbar t1) {
        this.t10 = t1;
    }

    public RichToolbar getT10() {
        return t10;
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


    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String cancelCreateLease() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Rollback");
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return "ReturnToSearch";
        }
        return "ReturnToSearch";
    }

    public String saveCreateLease() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Commit");
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return "ReturnToSearch";
        }
        return "ReturnToSearch";
    }

    public void setSdi1(RichShowDetailItem sdi1) {
        this.sdi1 = sdi1;
    }

    public RichShowDetailItem getSdi1() {
        return sdi1;
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

    public void setSdi2(RichShowDetailItem sdi2) {
        this.sdi2 = sdi2;
    }

    public RichShowDetailItem getSdi2() {
        return sdi2;
    }

    public void setPgl15(RichPanelGroupLayout pgl15) {
        this.pgl15 = pgl15;
    }

    public RichPanelGroupLayout getPgl15() {
        return pgl15;
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

    public void setPgl16(RichPanelGroupLayout pgl16) {
        this.pgl16 = pgl16;
    }

    public RichPanelGroupLayout getPgl16() {
        return pgl16;
    }


    public String addNewChargesProperty() {

        BindingContainer bindings = getBindings();
        OperationBinding commitOB = bindings.getOperationBinding("Commit");
        commitOB.execute();

        OperationBinding operationBinding =
            bindings.getOperationBinding("CreateInsert");
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public void setSdi3(RichShowDetailItem sdi3) {
        this.sdi3 = sdi3;
    }

    public RichShowDetailItem getSdi3() {
        return sdi3;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
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

    public void setCb23(RichButton cb23) {
        this.cb23 = cb23;
    }

    public RichButton getCb23() {
        return cb23;
    }

    public void setCb22(RichButton cb22) {
        this.cb22 = cb22;
    }

    public RichButton getCb22() {
        return cb22;
    }

    public void setPc3(RichPanelCollection pc3) {
        this.pc3 = pc3;
    }

    public RichPanelCollection getPc3() {
        return pc3;
    }

    public void setT6(RichTable t6) {
        this.t6 = t6;
    }

    public RichTable getT6() {
        return t6;
    }

    public void setT7(RichToolbar t7) {
        this.t7 = t7;
    }

    public RichToolbar getT7() {
        return t7;
    }


    public void disclosureListner(DisclosureEvent disclosureEvent) {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Commit");
        operationBinding.execute();
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

    public void setPanelGroupLayout1(RichPanelGroupLayout panelGroupLayout1) {
        this.panelGroupLayout1 = panelGroupLayout1;
    }

    public RichPanelGroupLayout getPanelGroupLayout1() {
        return panelGroupLayout1;
    }

    public void setPanelHeader1(RichPanelHeader panelHeader1) {
        this.panelHeader1 = panelHeader1;
    }

    public RichPanelHeader getPanelHeader1() {
        return panelHeader1;
    }

    public void setQuery1(RichQuery query1) {
        this.query1 = query1;
    }

    public RichQuery getQuery1() {
        return query1;
    }

    public void setTable1(RichTable table1) {
        this.table1 = table1;
    }

    public RichTable getTable1() {
        return table1;
    }

    public String addPropertyRow() {
        BindingContainer bindings = getBindings();
        OperationBinding commitOB = bindings.getOperationBinding("Commit");
        commitOB.execute();

        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        this.getP2().show(hints);
        return null;
    }

    public void setPanelGroupLayout2(RichPanelGroupLayout panelGroupLayout2) {
        this.panelGroupLayout2 = panelGroupLayout2;
    }

    public RichPanelGroupLayout getPanelGroupLayout2() {
        return panelGroupLayout2;
    }


    public void setPgl17(RichPanelGroupLayout pgl17) {
        this.pgl17 = pgl17;
    }

    public RichPanelGroupLayout getPgl17() {
        return pgl17;
    }

    public Number getCurrentProperty() {
        Number propertyId = null;
        UIXTable table = getTable1();
        Iterator selectionIt = table.getSelectedRowKeys().iterator();
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();
            propertyId = (Number)selectedRow.getAttribute("PropertyId");
        }
        return propertyId;
    }

    @SuppressWarnings("unchecked")
    public String addLeasePropertyRowOK() {

        Number leaseID;
        BindingContainer bindings = getBindings();
        OperationBinding createLeasePropertyOB =
            bindings.getOperationBinding("createLeasePropertyRow");
        createLeasePropertyOB.getParamsMap().put("propertyId",
                                                 getCurrentProperty());
        leaseID = (Number)createLeasePropertyOB.execute();

        OperationBinding commitOB = bindings.getOperationBinding("Commit");
        commitOB.execute();

        RichPopup popup = getP2();
        popup.hide();

        return null;
    }

    public String cancelPropertyPopup() {
        RichPopup popup = getP2();
        popup.hide();

        return null;
    }


    public void setPgl14(RichPanelGroupLayout pgl14) {
        this.pgl14 = pgl14;
    }

    public RichPanelGroupLayout getPgl14() {
        return pgl14;
    }

    public void setT4(RichToolbar t4) {
        this.t4 = t4;
    }

    public RichToolbar getT4() {
        return t4;
    }


    public void setPgl18(RichPanelGroupLayout pgl18) {
        this.pgl18 = pgl18;
    }

    public RichPanelGroupLayout getPgl18() {
        return pgl18;
    }


    public void setGc1(RichGridCell gc1) {
        this.gc1 = gc1;
    }

    public RichGridCell getGc1() {
        return gc1;
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

    public void setIt46(RichInputText it46) {
        this.it46 = it46;
    }

    public RichInputText getIt46() {
        return it46;
    }

    public void setIt47(RichInputText it47) {
        this.it47 = it47;
    }

    public RichInputText getIt47() {
        return it47;
    }


    public void setSbc1(RichSelectBooleanCheckbox sbc1) {
        this.sbc1 = sbc1;
    }

    public RichSelectBooleanCheckbox getSbc1() {
        return sbc1;
    }

    public void setSbc2(RichSelectBooleanCheckbox sbc2) {
        this.sbc2 = sbc2;
    }

    public RichSelectBooleanCheckbox getSbc2() {
        return sbc2;
    }

    public void setSbc3(RichSelectBooleanCheckbox sbc3) {
        this.sbc3 = sbc3;
    }

    public RichSelectBooleanCheckbox getSbc3() {
        return sbc3;
    }

    public void setSbc4(RichSelectBooleanCheckbox sbc4) {
        this.sbc4 = sbc4;
    }

    public RichSelectBooleanCheckbox getSbc4() {
        return sbc4;
    }


    public String addPaymentRow() {

        BindingContainer bindings = getBindings();
        OperationBinding commitOB = bindings.getOperationBinding("Commit");
        commitOB.execute();

        OperationBinding operationBinding =
            bindings.getOperationBinding("CreateInsert1");
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
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

    public void setCb4(RichButton cb4) {
        this.cb4 = cb4;
    }

    public RichButton getCb4() {
        return cb4;
    }

    public void setCb1(RichButton cb1) {
        this.cb1 = cb1;
    }

    public RichButton getCb1() {
        return cb1;
    }

    public void setCb5(RichButton cb5) {
        this.cb5 = cb5;
    }

    public RichButton getCb5() {
        return cb5;
    }

    public void setCb9(RichButton cb9) {
        this.cb9 = cb9;
    }

    public RichButton getCb9() {
        return cb9;
    }

    public void setCb8(RichButton cb8) {
        this.cb8 = cb8;
    }

    public RichButton getCb8() {
        return cb8;
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

    public void setCb6(RichButton cb6) {
        this.cb6 = cb6;
    }

    public RichButton getCb6() {
        return cb6;
    }

    public void setCb7(RichButton cb7) {
        this.cb7 = cb7;
    }

    public RichButton getCb7() {
        return cb7;
    }

    public void setCb20(RichButton cb20) {
        this.cb20 = cb20;
    }

    public RichButton getCb20() {
        return cb20;
    }

    public void setCb21(RichButton cb21) {
        this.cb21 = cb21;
    }

    public RichButton getCb21() {
        return cb21;
    }

    public void setOt1(RichOutputText ot1) {
        this.ot1 = ot1;
    }

    public RichOutputText getOt1() {
        return ot1;
    }

    public void beforePhase(PhaseEvent phaseEvent) {
        BindingContext bindingContext;
        bindingContext = BindingContext.getCurrent();
        DCDataControl dc = bindingContext.findDataControl("MARealEstateLeaseAMDataControl");
        MARealEstateLeaseAMImpl am = (MARealEstateLeaseAMImpl) dc.getDataProvider();
        am.set_lang();
    }

    public void setT8(RichToolbar t8) {
        this.t8 = t8;
    }

    public RichToolbar getT8() {
        return t8;
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
}

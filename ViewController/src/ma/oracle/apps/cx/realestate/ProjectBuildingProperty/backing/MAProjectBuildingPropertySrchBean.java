package ma.oracle.apps.cx.realestate.ProjectBuildingProperty.backing;

import java.sql.SQLException;

import java.util.Iterator;

import java.util.List;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UISelectItems;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.faces.event.ActionEvent;
import javax.faces.event.PhaseEvent;

import javax.faces.event.ValueChangeEvent;

import javax.servlet.http.HttpSession;

import ma.oracle.apps.cx.realestate.project.views.MARealEstateProjectVORowImpl;
import ma.oracle.apps.cx.realestate.property.modules.MARealEstatePropertyAMImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputNumberSpinbox;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelStretchLayout;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;

import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.jbo.ViewObject;
import oracle.jbo.uicli.binding.JUCtrlHierBinding;

import org.apache.myfaces.trinidad.event.RowDisclosureEvent;
import org.apache.myfaces.trinidad.model.CollectionModel;
import org.apache.myfaces.trinidad.model.RowKeySet;


public class MAProjectBuildingPropertySrchBean {
    private RichForm f1;
    private RichDocument d1;
    private RichMessages m1;
    private RichTable t1;
    private RichPanelCollection pc1;
    private RichTable t2;
    private RichTable t3;
    private RichPanelCollection pc2;
    private RichPanelStretchLayout psl1;
    private RichLink l3;
    private RichToolbar t4;
    private RichButton b1;
    private RichPanelCollection pc3;
    private RichToolbar t5;
    private RichButton b2;
    private RichPanelCollection pc4;
    private RichToolbar t6;
    private RichButton b3;
    private RichPanelStretchLayout psl2;
    private RichPanelStretchLayout psl3;
    private RichToolbar t7;
    private RichButton b4;
    private RichButton b5;
    private RichPopup p1;
    private RichDialog d2;
    private RichPanelFormLayout pfl1;
    private RichSelectOneChoice soc2;
    private UISelectItems si2;
    private RichInputText it3;
    private RichInputText it4;
    private RichToolbar t8;
    private RichSelectBooleanCheckbox it1;
    private RichInputNumberSpinbox it2;
    private RichPanelGroupLayout pgl1;
    //private RichPanelCollection pc2;

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


    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
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


    public void rowDisclosureListener(RowDisclosureEvent rowDisclosureEvent) {
        // Add event code here...
        
            // Add event code here...
            // CommitAction();
               RichTable table = (RichTable) rowDisclosureEvent.getSource();
               RowKeySet discloseRowKeySet = table.getDisclosedRowKeys();
               RowKeySet lastAddedRowKeySet = rowDisclosureEvent.getAddedSet();
               Iterator lastAddedRowKeySetIter = lastAddedRowKeySet.iterator();
               if (lastAddedRowKeySetIter.hasNext())
               {
                 discloseRowKeySet.clear();
                 Object lastRowKey = lastAddedRowKeySetIter.next();
                 discloseRowKeySet.add(lastRowKey);
                 makeDisclosedRowCurrent(table, lastAddedRowKeySet);
                 AdfFacesContext adfFacesContext = null;
                 adfFacesContext = AdfFacesContext.getCurrentInstance();
                 adfFacesContext.addPartialTarget(table.getParent());
               }
             }
        private void makeDisclosedRowCurrent(RichTable table, RowKeySet keySet)
        {
          table.setSelectedRowKeys(keySet);
          CollectionModel tableModel = (CollectionModel) table.getValue();
          JUCtrlHierBinding tableHierBinding = null;
          tableHierBinding = (JUCtrlHierBinding) (tableModel).getWrappedData();
          DCIteratorBinding dCIteratorBindin = null;
          dCIteratorBindin = tableHierBinding.getDCIteratorBinding();
          Iterator keySetIter = keySet.iterator();
          List firstKey = (List) keySetIter.next();
          oracle.jbo.Key key = (oracle.jbo.Key) firstKey.get(0);
          dCIteratorBindin.setCurrentRowWithKey(key.toStringFormat(true));
        }

    public void setT3(RichTable t3) {
        this.t3 = t3;
    }

    public RichTable getT3() {
        return t3;
    }

    public void setPc2(RichPanelCollection pc2) {
        this.pc2 = pc2;
    }

    public RichPanelCollection getPc2() {
        return pc2;
    }

    public void rowBuildDisclosureListener(RowDisclosureEvent rowDisclosureEvent) {
        RichTable table = (RichTable) rowDisclosureEvent.getSource();
        RowKeySet discloseRowKeySet = table.getDisclosedRowKeys();
        RowKeySet lastAddedRowKeySet = rowDisclosureEvent.getAddedSet();
        Iterator lastAddedRowKeySetIter = lastAddedRowKeySet.iterator();
        if (lastAddedRowKeySetIter.hasNext())
        {
          discloseRowKeySet.clear();
          Object lastRowKey = lastAddedRowKeySetIter.next();
          discloseRowKeySet.add(lastRowKey);
          makeDisclosedRowCurrent(table, lastAddedRowKeySet);
          AdfFacesContext adfFacesContext = null;
          adfFacesContext = AdfFacesContext.getCurrentInstance();
          adfFacesContext.addPartialTarget(table.getParent());
        }
    }
    public void rowPropDisclosureListener(RowDisclosureEvent rowDisclosureEvent) {
        RichTable table = (RichTable) rowDisclosureEvent.getSource();
        RowKeySet discloseRowKeySet = table.getDisclosedRowKeys();
        RowKeySet lastAddedRowKeySet = rowDisclosureEvent.getAddedSet();
        Iterator lastAddedRowKeySetIter = lastAddedRowKeySet.iterator();
        if (lastAddedRowKeySetIter.hasNext())
        {
          discloseRowKeySet.clear();
          Object lastRowKey = lastAddedRowKeySetIter.next();
          discloseRowKeySet.add(lastRowKey);
          makeDisclosedRowCurrent(table, lastAddedRowKeySet);
          AdfFacesContext adfFacesContext = null;
          adfFacesContext = AdfFacesContext.getCurrentInstance();
          adfFacesContext.addPartialTarget(table.getParent());
        }
    }

    public void setPsl1(RichPanelStretchLayout psl1) {
        this.psl1 = psl1;
    }

    public RichPanelStretchLayout getPsl1() {
        return psl1;
    }
    public String editBuilding()
    {
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession) ectx.getSession(false);
        userSession.setAttribute("buildingEdit", "buildingEdit");
        //BindingContext bindingContext = BindingContext.getCurrent();
        //DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
          //     MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();

        return "editCreateProject";
    }
    public String editProperty()
    {
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession) ectx.getSession(false);
        userSession.setAttribute("propEdit", "propEdit");
        //BindingContext bindingContext = BindingContext.getCurrent();
        //DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
          //     MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();

        return "editCreateProject";
    }
    public void setL3(RichLink l3) {
        this.l3 = l3;
    }

    public RichLink getL3() {
        return l3;
    }

    public void setT4(RichToolbar t4) {
        this.t4 = t4;
    }

    public RichToolbar getT4() {
        return t4;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setPc3(RichPanelCollection pc3) {
        this.pc3 = pc3;
    }

    public RichPanelCollection getPc3() {
        return pc3;
    }

    public void setT5(RichToolbar t5) {
        this.t5 = t5;
    }

    public RichToolbar getT5() {
        return t5;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }
    public String creatBuild() {
        // Add event code here...
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
               MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
               am.createBuilding();
               am.createBuildRentOption();
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession) ectx.getSession(false);
        userSession.setAttribute("buildingEdit", "buildingEdit");       
               return "editCreateProject";
    }
    public String creatProperty() {
        // Add event code here...
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
               MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        am.createProperty();
        am.createPropRentOption();
        am.createPropFinancials();
        am.createPropOwner();
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession) ectx.getSession(false);
        userSession.setAttribute("propEdit", "propEdit");
               return "editCreateProject";
    }

    public void setPc4(RichPanelCollection pc4) {
        this.pc4 = pc4;
    }

    public RichPanelCollection getPc4() {
        return pc4;
    }

    public void setT6(RichToolbar t6) {
        this.t6 = t6;
    }

    public RichToolbar getT6() {
        return t6;
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

    public void setPsl2(RichPanelStretchLayout psl2) {
        this.psl2 = psl2;
    }

    public RichPanelStretchLayout getPsl2() {
        return psl2;
    }

    public void setPsl3(RichPanelStretchLayout psl3) {
        this.psl3 = psl3;
    }

    public RichPanelStretchLayout getPsl3() {
        return psl3;
    }


    public void setT7(RichToolbar t7) {
        this.t7 = t7;
    }

    public RichToolbar getT7() {
        return t7;
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


    public void setT8(RichToolbar t8) {
        this.t8 = t8;
    }

    public RichToolbar getT8() {
        return t8;
    }

    public void creatWizard(ActionEvent actionEvent) throws SQLException {
        // Add event code here...
        BindingContext bindingContext;
        bindingContext = BindingContext.getCurrent();
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();

        am.getDBTransaction().commit();
       
           
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        String propPaternValue = (String)sessionScope.get("propPaternValue");
        oracle.jbo.domain.Number propId = new oracle.jbo.domain.Number(propPaternValue);
            //(oracle.jbo.domain.Number) am.getMARealEstateBuildingVO().getCurrentRow().getAttribute("ExtAttribute12");
          //  (oracle.jbo.domain.Number) soc2.getValue();//
                                                       //

            //String error = throwable.getMessage();;
                    //Handle the error or log the error
                    //throw throwable;
                    //Log it 
//                    FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,it1.getValue().toString(), null );
//                     
//                    FacesContext.getCurrentInstance().addMessage(null, message);
        oracle.jbo.domain.Number buildId = (oracle.jbo.domain.Number) am.getMARealEstateBuildingVO().getCurrentRow().getAttribute("BuildingId");
        //String propPaternValue = (String)sessionScope.get("propPaternValue");
//        //it1.getva
        String spicfyCond = null;
        if (it1.getValue().equals(true))
        {
            spicfyCond = "Y";
        }
        else
        {
            spicfyCond = "N";
        }
        //String spicfyCond = (String)sessionScope.get("SpcfypropPaternCreation");//(String) am.getMARealEstateBuildingVO().getCurrentRow().getAttribute("IntAttribute15");
        am.createWizardProperties(propId, buildId, spicfyCond);
        ViewObject buildingVO = am.findViewObject("MARealEstatePropertyVO1"); 
        buildingVO.clearCache();
        buildingVO.executeQuery();
        p1.hide();
    }

    public void cancelCreation(ActionEvent actionEvent) {
        // Add event code here...
        BindingContext bindingContext;
        bindingContext = BindingContext.getCurrent();
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        am.getDBTransaction().rollback();
        p1.hide();
    }

    public void setIt1(RichSelectBooleanCheckbox it1) {
        this.it1 = it1;
    }

    public RichSelectBooleanCheckbox getIt1() {
        return it1;
    }

    public void setIt2(RichInputNumberSpinbox it2) {
        this.it2 = it2;
    }

    public RichInputNumberSpinbox getIt2() {
        return it2;
    }

    public void saveValue(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
      //  FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,valueChangeEvent.getNewValue().toString(), null );
                             
                     //      FacesContext.getCurrentInstance().addMessage(null, message);
                     FacesContext fctx = FacesContext.getCurrentInstance();
                     ExternalContext ectx = fctx.getExternalContext();
                     HttpSession userSession = (HttpSession) ectx.getSession(false);
                     userSession.setAttribute("propPaternValue", valueChangeEvent.getNewValue().toString());
                    
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void specifyCreationType(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession) ectx.getSession(false);
        userSession.setAttribute("SpcfypropPaternCreation", valueChangeEvent.getNewValue().toString());
    }
}

package ma.oracle.apps.cx.realestate.property.backing;


import java.sql.SQLException;

import java.util.Iterator;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;

import ma.oracle.apps.cx.realestate.property.modules.MARealEstatePropertyAMImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.UIXTable;
import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.VariableValueManager;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaManager;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;


public class MAOpportunityPropertiesBean {
    private RichForm f1;
    private RichMessages m1;
    private RichDocument d1;
    private RichPanelCollection pc1;
    private RichToolbar t2;
    private RichPopup p1;
    private RichDialog d2;
    private RichPanelGroupLayout pgl1;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichTable resId1;
    private RichPanelGroupLayout panelGroupLayout2;
    private RichPanelGroupLayout pgl17;
    private RichTable t1;
    private RichButton cb30;
    private RichInputText it9;
    private RichOutputText ot8;
    private RichButton cb1;
    private RichButton cb3;
    private RichButton cb2;
    private RichButton cb9;
    private RichButton cb8;
    private RichToolbar t3;
    private RichButton b1;
    private RichButton b2;

    public MAOpportunityPropertiesBean() {
    }

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }


    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }


    public void setT2(RichToolbar t2) {
        this.t2 = t2;
    }

    public RichToolbar getT2() {
        return t2;
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


    public String createPropertyLease() {
        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        this.getP1().show(hints);
        return null;
    }

    @SuppressWarnings("oracle.jdeveloper.java.unchecked-conversion-or-cast")
    public String addLeasePropertyRowOK() {

        ADFContext adfCtxx = ADFContext.getCurrent();
        Map pageFlowScope = adfCtxx.getPageFlowScope();
        String pageFlowScopeValue = (String) pageFlowScope.get("opportunityId");

        BindingContainer bindings = getBindings();
        OperationBinding createLeasePropertyOB = bindings.getOperationBinding("createOppLeasePropertyRow");
        createLeasePropertyOB.getParamsMap().put("propertyId", getCurrentProperty());
        try {
            createLeasePropertyOB.getParamsMap().put("opportunityId",
                                                     new Number(pageFlowScopeValue)); //opportunityId));
        } catch (SQLException e) {
            throw new JboException(e.getMessage());
        }
        createLeasePropertyOB.execute();

        OperationBinding commitOB = bindings.getOperationBinding("Commit");
        commitOB.execute();

        RichPopup popup = getP1();
        popup.hide();

        OperationBinding initOppLeasePropOB = bindings.getOperationBinding("initOppLeasePropertyQuery");
        try {
            initOppLeasePropOB.getParamsMap().put("opportunityId", new Number(pageFlowScopeValue)); //opportunityId));
        } catch (SQLException e) {
            throw new JboException(e.getMessage());
        }
        initOppLeasePropOB.execute();

        return null;
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public Number getCurrentProperty() {
        Number propertyId = null;
        UIXTable table = getResId1();
        Iterator selectionIt = table.getSelectedRowKeys().iterator();
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row = (FacesCtrlHierNodeBinding) table.getRowData(index);
            Row selectedRow = row.getRow();
            propertyId = (Number) selectedRow.getAttribute("PropertyId");
        }
        return propertyId;
    }

    @SuppressWarnings("unchecked")
    public String cancelPropertyPopup() {

        ADFContext adfCtxx = ADFContext.getCurrent();
        Map pageFlowScope = adfCtxx.getPageFlowScope();
        String pageFlowScopeValue = (String) pageFlowScope.get("opportunityId");

        RichPopup popup = getP1();
        popup.hide();

        BindingContainer bindings = getBindings();
        OperationBinding initOppLeasePropOB = bindings.getOperationBinding("initOppLeasePropertyQuery");
        try {
            initOppLeasePropOB.getParamsMap().put("opportunityId", new Number(pageFlowScopeValue));
        } catch (SQLException e) {
            throw new JboException(e.getMessage());
        }
        initOppLeasePropOB.execute();
        return null;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    @SuppressWarnings("oracle.jdeveloper.java.unchecked-conversion-or-cast")
    public void initOppPropertiesQuery(PhaseEvent phaseEvent) {
        ADFContext adfCtxx = ADFContext.getCurrent();
        Map pageFlowScope = adfCtxx.getPageFlowScope();
        String pageFlowScopeValue = (String) pageFlowScope.get("opportunityId");
        if (pageFlowScopeValue != null) {
        } else {
            Map params = null;
            params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
            ADFContext adfCtx = ADFContext.getCurrent();
            Map appScope = adfCtx.getPageFlowScope();
            appScope.put("opportunityId", params.get("OptyId").toString());
        }
        DCBindingContainer bind = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();

        DCIteratorBinding oppLeasePropItr = bind.findIteratorBinding("MARSOppLeasePropertyVOIterator");
        ViewObject oppLeasePropVO = oppLeasePropItr.getViewObject();
        ViewCriteriaManager vcm = oppLeasePropVO.getViewCriteriaManager();
        ViewCriteria vc = vcm.getViewCriteria("MARSOppLeasePropertyVOCriteria");
        VariableValueManager vvm = vc.ensureVariableManager();
        vvm.setVariableValue("OpportunityID", pageFlowScopeValue);
        oppLeasePropVO.applyViewCriteria(vc);
        oppLeasePropVO.executeQuery();
        
        BindingContext bindingContext;
        bindingContext = BindingContext.getCurrent();
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
        MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();
        am.set_lang();
    }

    public void setCb30(RichButton cb30) {
        this.cb30 = cb30;
    }

    public RichButton getCb30() {
        return cb30;
    }

    @SuppressWarnings("oracle.jdeveloper.java.unchecked-conversion-or-cast")
    public String createLeaseAction() {
        String leaseSubject;
        leaseSubject = (String) it9.getValue();
        if (leaseSubject != null) {
            Number leaseId;

            ADFContext adfCtxx = ADFContext.getCurrent();
            Map pageFlowScope = adfCtxx.getPageFlowScope();
            String pageFlowScopeValue = (String) pageFlowScope.get("opportunityId");

            BindingContainer bindings = getBindings();
            OperationBinding createLeaseFromOppOB = bindings.getOperationBinding("createLeaseFromOpportunity");
            try {
                createLeaseFromOppOB.getParamsMap().put("opportunityId", new Number(pageFlowScopeValue));
                createLeaseFromOppOB.getParamsMap().put("leaseSubject", leaseSubject);
            } catch (SQLException e) {
                throw new JboException(e.getMessage());
            }
            leaseId = (Number) createLeaseFromOppOB.execute();

            FacesMessage msg;
            msg =
                new FacesMessage(FacesMessage.SEVERITY_INFO,
                                 "Lease Created Successfully With Id  " + leaseId +
                                 " You Can Return To Lease Search Page To Update It", "");
            FacesContext.getCurrentInstance().addMessage(null, msg);

            return null;
        } else {
            FacesMessage msg;
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Please Add Lease Subject", "");
            FacesContext.getCurrentInstance().addMessage(null, msg);
            return null;
        }

    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public void setOt8(RichOutputText ot8) {
        this.ot8 = ot8;
    }

    public RichOutputText getOt8() {
        return ot8;
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
}

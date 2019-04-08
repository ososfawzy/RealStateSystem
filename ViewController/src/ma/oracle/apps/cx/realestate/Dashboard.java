package ma.oracle.apps.cx.realestate;


import java.util.Locale;

import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;

import ma.oracle.apps.cx.realestate.property.modules.MARealEstatePropertyAMImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.share.ADFContext;

public class Dashboard {
    public Dashboard() {
    }
 
    public void beforePhase(PhaseEvent phaseEvent) {
        BindingContext bindingContext;
        bindingContext = BindingContext.getCurrent();
        DCDataControl dc = bindingContext.findDataControl("MARealEstatePropertyAMDataControl");
       MARealEstatePropertyAMImpl am = (MARealEstatePropertyAMImpl) dc.getDataProvider();  
       
       Map sessionScope = ADFContext.getCurrent().getSessionScope();
       if (sessionScope.get("session") != null) {
           
       }
       else {
           sessionScope.put("session", "en");
       }
       am.set_lang();
   }
}

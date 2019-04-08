package ma.oracle.apps.cx.realestate.building.views;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Mar 17 13:00:41 EET 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MABuildingOwnerExportVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public MABuildingOwnerExportVOImpl() {
    }
    
    public void VOSetWhereClause (Number buildId){
        this.setWhereClause("BUILDING_ID=:build_Id");
        this.defineNamedWhereClauseParam("build_Id", null, null);
        this.setNamedWhereClauseParam("build_Id", buildId);
        this.executeQuery();
    }
}

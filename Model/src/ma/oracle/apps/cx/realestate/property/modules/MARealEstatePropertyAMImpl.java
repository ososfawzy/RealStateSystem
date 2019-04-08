package ma.oracle.apps.cx.realestate.property.modules;

import java.sql.CallableStatement;
import java.sql.SQLException;

import java.util.Locale;

import java.util.Map;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import ma.oracle.apps.cx.realestate.building.views.MABuildingAttachmentExportVOImpl;
import ma.oracle.apps.cx.realestate.building.views.MABuildingAttachmentImportVOImpl;
import ma.oracle.apps.cx.realestate.building.views.MABuildingAttachmentVOImpl;
import ma.oracle.apps.cx.realestate.building.views.MABuildingAttachmentVORowImpl;
import ma.oracle.apps.cx.realestate.building.views.MABuildingOwnerExportVOImpl;
import ma.oracle.apps.cx.realestate.building.views.MABuildingOwnerVOImpl;
import ma.oracle.apps.cx.realestate.building.views.MAParentBuildingTypeVVOImpl;
import ma.oracle.apps.cx.realestate.building.views.MARealEstateBuildingVOImpl;
import ma.oracle.apps.cx.realestate.building.views.MARealEstateBuildingVORowImpl;
import ma.oracle.apps.cx.realestate.building.views.MARsBuildingTypeVOImpl;
import ma.oracle.apps.cx.realestate.contract.views.MAContractOwnerVOImpl;
import ma.oracle.apps.cx.realestate.contract.views.MAContractOwnerVORowImpl;
import ma.oracle.apps.cx.realestate.contract.views.MAContractPropertyPaymentVOImpl;
import ma.oracle.apps.cx.realestate.contract.views.MAContractsVOImpl;
import ma.oracle.apps.cx.realestate.payments.views.MABuildingRentOptionExportVOImpl;
import ma.oracle.apps.cx.realestate.payments.views.MABuildingRentOptionVOImpl;
import ma.oracle.apps.cx.realestate.payments.views.MABuildingRentOptionVORowImpl;
import ma.oracle.apps.cx.realestate.payments.views.MADummyPaymentTypeVVOImpl;
import ma.oracle.apps.cx.realestate.payments.views.MAInstallmentPaymentTermsDetailsVOImpl;
import ma.oracle.apps.cx.realestate.payments.views.MAInstallmentPaymentTermsVOImpl;
import ma.oracle.apps.cx.realestate.payments.views.MAPropertyInstallmentVOImpl;
import ma.oracle.apps.cx.realestate.payments.views.MAPropertyRentOptionVOImpl;
import ma.oracle.apps.cx.realestate.payments.views.MAPropertyRentOptionVORowImpl;
import ma.oracle.apps.cx.realestate.payments.views.MARentPaymentTermsDetailsVOImpl;
import ma.oracle.apps.cx.realestate.payments.views.MARentPaymentTermsVOImpl;
import ma.oracle.apps.cx.realestate.project.views.MAProjectImagesVOImpl;
import ma.oracle.apps.cx.realestate.project.views.MAProjectImagesVORowImpl;
import ma.oracle.apps.cx.realestate.project.views.MAProjectPhasesVOImpl;
import ma.oracle.apps.cx.realestate.project.views.MARealEstateProjectVOImpl;
import ma.oracle.apps.cx.realestate.project.views.MARealEstateProjectVVOImpl;
import ma.oracle.apps.cx.realestate.property.modules.common.MARealEstatePropertyAM;
import ma.oracle.apps.cx.realestate.property.views.MABlockBuildingNameVVOImpl;
import ma.oracle.apps.cx.realestate.property.views.MAFinancialVOImpl;
import ma.oracle.apps.cx.realestate.property.views.MAFinancialVORowImpl;
import ma.oracle.apps.cx.realestate.property.views.MAFloorNumberVVOImpl;
import ma.oracle.apps.cx.realestate.property.views.MAGenericViewVVOImpl;
import ma.oracle.apps.cx.realestate.property.views.MAGridViewVVOImpl;
import ma.oracle.apps.cx.realestate.property.views.MAPropertyDuplexVVOImpl;
import ma.oracle.apps.cx.realestate.property.views.MAPropertyStatusVVOImpl;
import ma.oracle.apps.cx.realestate.property.views.MARSPropertyTypeVOImpl;
import ma.oracle.apps.cx.realestate.property.views.MARealEstateContractVOImpl;
import ma.oracle.apps.cx.realestate.property.views.MARealEstateContractVORowImpl;
import ma.oracle.apps.cx.realestate.property.views.MARealEstatePaternPropVOImpl;
import ma.oracle.apps.cx.realestate.property.views.MARealEstatePropertyExportVOImpl;
import ma.oracle.apps.cx.realestate.property.views.MARealEstatePropertySubTypesVVOImpl;
import ma.oracle.apps.cx.realestate.property.views.MARealEstatePropertyTypesVVOImpl;
import ma.oracle.apps.cx.realestate.property.views.MARealEstatePropertyVOImpl;
import ma.oracle.apps.cx.realestate.property.views.MARealEstatePropertyVORowImpl;
import ma.oracle.apps.cx.realestate.property.views.MARealEstatepropertyparentVVOImpl;
import ma.oracle.apps.cx.realestate.property.views.MASlideImagesVOImpl;
import ma.oracle.apps.cx.realestate.property.views.MAUsersVVOImpl;
import ma.oracle.apps.cx.realestate.services.views.MAProjPropServicesVOImpl;
import ma.oracle.apps.cx.realestate.services.views.MARealEstateProjServicesVOImpl;
import ma.oracle.apps.cx.realestate.services.views.MARealEstatePropertyServicesImpl;
import ma.oracle.apps.cx.realestate.services.views.MARealEstateServicesVOImpl;
import ma.oracle.apps.cx.realestate.setup.views.MAAttachedDocumentsVOImpl;
import ma.oracle.apps.cx.realestate.setup.views.MAAttachedDocumentsVORowImpl;
import ma.oracle.apps.cx.realestate.setup.views.MALookupTypesVOImpl;
import ma.oracle.apps.cx.realestate.setup.views.MALookupValuesVOImpl;

import oracle.adf.share.ADFContext;

import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue May 22 13:03:01 EEST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MARealEstatePropertyAMImpl extends ApplicationModuleImpl implements MARealEstatePropertyAM {
    /**
     * This is the default constructor (do not remove).
     */
    public MARealEstatePropertyAMImpl() {
    }

    public void servicesRequery() {
        ViewObject servicesVO = this.getMARealEstateServicesVO();
        servicesVO.executeQuery();
    }


    /**
     * Container's getter for MABlockBuildingNameVVO1.
     * @return MABlockBuildingNameVVO1
     */
    public MABlockBuildingNameVVOImpl getMABlockBuildingNameVVO1() {
        return (MABlockBuildingNameVVOImpl) findViewObject("MABlockBuildingNameVVO1");
    }

    /**
     * Container's getter for MAFloorNumberVVO1.
     * @return MAFloorNumberVVO1
     */
    public MAFloorNumberVVOImpl getMAFloorNumberVVO1() {
        return (MAFloorNumberVVOImpl) findViewObject("MAFloorNumberVVO1");
    }


    /**
     * Container's getter for MAUsersVVO1.
     * @return MAUsersVVO1
     */
    public MAUsersVVOImpl getMAUsersVVO1() {
        return (MAUsersVVOImpl) findViewObject("MAUsersVVO1");
    }


    /**
     * Container's getter for MAGenericViewVVO1.
     * @return MAGenericViewVVO1
     */
    public MAGenericViewVVOImpl getMAGenericViewVVO1() {
        return (MAGenericViewVVOImpl) findViewObject("MAGenericViewVVO1");
    }

    /**
     * Container's getter for MARealEstateContractVO2.
     * @return MARealEstateContractVO2
     */
    public MARealEstateContractVOImpl getMARealEstateContractVO2() {
        return (MARealEstateContractVOImpl) findViewObject("MARealEstateContractVO2");
    }


    /**
     * Container's getter for MARealEstatepropertyparentVVO1.
     * @return MARealEstatepropertyparentVVO1
     */
    public MARealEstatepropertyparentVVOImpl getMARealEstatepropertyparentVVO1() {
        return (MARealEstatepropertyparentVVOImpl) findViewObject("MARealEstatepropertyparentVVO1");
    }

    /**
     * Container's getter for MARealEstatePropertyTypesVVO1.
     * @return MARealEstatePropertyTypesVVO1
     */
    public MARealEstatePropertyTypesVVOImpl getMARealEstatePropertyTypesVVO1() {
        return (MARealEstatePropertyTypesVVOImpl) findViewObject("MARealEstatePropertyTypesVVO1");
    }

    /**
     * Container's getter for MARealEstatePropertySubTypesVVO1.
     * @return MARealEstatePropertySubTypesVVO1
     */
    public MARealEstatePropertySubTypesVVOImpl getMARealEstatePropertySubTypesVVO1() {
        return (MARealEstatePropertySubTypesVVOImpl) findViewObject("MARealEstatePropertySubTypesVVO1");
    }

    /**
     * Container's getter for MAGridViewVVO1.
     * @return MAGridViewVVO1
     */
    public MAGridViewVVOImpl getMAGridViewVVO1() {
        return (MAGridViewVVOImpl) findViewObject("MAGridViewVVO1");
    }

    /**
     * Container's getter for MARealEstatePropertySearchVVO1.
     * @return MARealEstatePropertySearchVVO1
     */
    public ViewObjectImpl getMARealEstatePropertySearchVVO1() {
        return (ViewObjectImpl) findViewObject("MARealEstatePropertySearchVVO1");
    }

    /**
     * Container's getter for MARealEstateContractSearchVVO1.
     * @return MARealEstateContractSearchVVO1
     */
    public ViewObjectImpl getMARealEstateContractSearchVVO1() {
        return (ViewObjectImpl) findViewObject("MARealEstateContractSearchVVO1");
    }


    /**
     * Container's getter for MAGridViewSearchToPropertySearchVL1.
     * @return MAGridViewSearchToPropertySearchVL1
     */
    public ViewLinkImpl getMAGridViewSearchToPropertySearchVL1() {
        return (ViewLinkImpl) findViewLink("MAGridViewSearchToPropertySearchVL1");
    }

    /**
     * Container's getter for MAPropertySearchToContractSearchVL1.
     * @return MAPropertySearchToContractSearchVL1
     */
    public ViewLinkImpl getMAPropertySearchToContractSearchVL1() {
        return (ViewLinkImpl) findViewLink("MAPropertySearchToContractSearchVL1");
    }


    /**
     * Container's getter for MARealEstateParentPropertySearchVVO1.
     * @return MARealEstateParentPropertySearchVVO1
     */
    public ViewObjectImpl getMARealEstateParentPropertySearchVVO1() {
        return (ViewObjectImpl) findViewObject("MARealEstateParentPropertySearchVVO1");
    }

    /**
     * Container's getter for MAGridViewSearchToParentPropertySearchVL1.
     * @return MAGridViewSearchToParentPropertySearchVL1
     */
    public ViewLinkImpl getMAGridViewSearchToParentPropertySearchVL1() {
        return (ViewLinkImpl) findViewLink("MAGridViewSearchToParentPropertySearchVL1");
    }

    /**
     * Container's getter for MARealEstateParentContractSearchVVO1.
     * @return MARealEstateParentContractSearchVVO1
     */
    public ViewObjectImpl getMARealEstateParentContractSearchVVO1() {
        return (ViewObjectImpl) findViewObject("MARealEstateParentContractSearchVVO1");
    }

    /**
     * Container's getter for MAParentPropertySearchToParentContractSearchVL1.
     * @return MAParentPropertySearchToParentContractSearchVL1
     */
    public ViewLinkImpl getMAParentPropertySearchToParentContractSearchVL1() {
        return (ViewLinkImpl) findViewLink("MAParentPropertySearchToParentContractSearchVL1");
    }

    public void gridViewEdit(oracle.jbo.domain.Number propId) {
        ViewObjectImpl vo = this.getMARealEstatePropertyVO1();
        vo.setWhereClauseParams(null);
        vo.setWhereClause("PROPERTY_ID=:1");
        vo.setWhereClauseParam(0, propId);
        vo.executeQuery();

    }

    public void fakeDelete(oracle.jbo.domain.Number propId) {
        ViewObjectImpl vo = this.getMARealEstatePropertyVO1();
        vo.setWhereClauseParams(null);
        vo.setWhereClause("PROPERTY_ID=:1");
        vo.setWhereClauseParam(0, propId);
        vo.executeQuery();
        MARealEstatePropertyVORowImpl curRow = (MARealEstatePropertyVORowImpl) vo.first();
        curRow.setIsDeletedFlag("Y");
        this.getTransaction().commit();


    }

    /**
     * Container's getter for MARealEstateGenericPropertySearchVVO1.
     * @return MARealEstateGenericPropertySearchVVO1
     */
    public ViewObjectImpl getMARealEstateGenericPropertySearchVVO1() {
        return (ViewObjectImpl) findViewObject("MARealEstateGenericPropertySearchVVO1");
    }

    /**
     * Container's getter for MAGenericViewSearchToPropertySearchVL1.
     * @return MAGenericViewSearchToPropertySearchVL1
     */
    public ViewLinkImpl getMAGenericViewSearchToPropertySearchVL1() {
        return (ViewLinkImpl) findViewLink("MAGenericViewSearchToPropertySearchVL1");
    }

    /**
     * Container's getter for MARealEstateGenericContractSearchVVO1.
     * @return MARealEstateGenericContractSearchVVO1
     */
    public ViewObjectImpl getMARealEstateGenericContractSearchVVO1() {
        return (ViewObjectImpl) findViewObject("MARealEstateGenericContractSearchVVO1");
    }

    /**
     * Container's getter for MAGenericPropertySearchToGenericContractSearchVL1.
     * @return MAGenericPropertySearchToGenericContractSearchVL1
     */
    public ViewLinkImpl getMAGenericPropertySearchToGenericContractSearchVL1() {
        return (ViewLinkImpl) findViewLink("MAGenericPropertySearchToGenericContractSearchVL1");
    }

    /**
     * Container's getter for MAGenericOwnerVVO1.
     * @return MAGenericOwnerVVO1
     */
    public ViewObjectImpl getMAGenericOwnerVVO1() {
        return (ViewObjectImpl) findViewObject("MAGenericOwnerVVO1");
    }

    /**
     * Container's getter for MAOwnerSearchToGenericViewSearchVL1.
     * @return MAOwnerSearchToGenericViewSearchVL1
     */
    public ViewLinkImpl getMAOwnerSearchToGenericViewSearchVL1() {
        return (ViewLinkImpl) findViewLink("MAOwnerSearchToGenericViewSearchVL1");
    }


    /**
     * Container's getter for MATotalOpporunitesVVO1.
     * @return MATotalOpporunitesVVO1
     */
    public ViewObjectImpl getMATotalOpporunitesVVO1() {
        return (ViewObjectImpl) findViewObject("MATotalOpporunitesVVO1");
    }

    /**
     * Container's getter for MATotalPropertiesVVO1.
     * @return MATotalPropertiesVVO1
     */
    public ViewObjectImpl getMATotalPropertiesVVO1() {
        return (ViewObjectImpl) findViewObject("MATotalPropertiesVVO1");
    }

    /**
     * Container's getter for MATotalLeasiesVVO1.
     * @return MATotalLeasiesVVO1
     */
    public ViewObjectImpl getMATotalLeasiesVVO1() {
        return (ViewObjectImpl) findViewObject("MATotalLeasiesVVO1");
    }

    /**
     * Container's getter for MAProertyMapVVO1.
     * @return MAProertyMapVVO1
     */
    public ViewObjectImpl getMAProertyMapVVO1() {
        return (ViewObjectImpl) findViewObject("MAProertyMapVVO1");
    }

    /**
     * Container's getter for MASlideImagesVO1.
     * @return MASlideImagesVO1
     */
    public MASlideImagesVOImpl getMASlideImagesVO1() {
        return (MASlideImagesVOImpl) findViewObject("MASlideImagesVO1");
    }


    /**
     * Container's getter for MAPropertyDuplexVVO1.
     * @return MAPropertyDuplexVVO1
     */
    public MAPropertyDuplexVVOImpl getMAPropertyDuplexVVO1() {
        return (MAPropertyDuplexVVOImpl) findViewObject("MAPropertyDuplexVVO1");
    }


    /**
     * Container's getter for MARealEstateProjectVO1.
     * @return MARealEstateProjectVO1
     */
    public MARealEstateProjectVOImpl getMARealEstateProjectVO() {
        return (MARealEstateProjectVOImpl) findViewObject("MARealEstateProjectVO");
    }

    /**
     * Container's getter for MAProjectImagesVO1.
     * @return MAProjectImagesVO1
     */
    public MAProjectImagesVOImpl getMAProjectImagesVO() {
        return (MAProjectImagesVOImpl) findViewObject("MAProjectImagesVO");
    }

    /**
     * Container's getter for MAProjectToProjectImagesVL1.
     * @return MAProjectToProjectImagesVL1
     */
    public ViewLinkImpl getMAProjectToProjectImagesVL1() {
        return (ViewLinkImpl) findViewLink("MAProjectToProjectImagesVL1");
    }

    /**
     * Container's getter for MAProjectPhasesVO1.
     * @return MAProjectPhasesVO1
     */
    public MAProjectPhasesVOImpl getMAProjectPhasesVO() {
        return (MAProjectPhasesVOImpl) findViewObject("MAProjectPhasesVO");
    }

    /**
     * Container's getter for MAProjectToProjectPhasesVL1.
     * @return MAProjectToProjectPhasesVL1
     */
    public ViewLinkImpl getMAProjectToProjectPhasesVL1() {
        return (ViewLinkImpl) findViewLink("MAProjectToProjectPhasesVL1");
    }


    /**
     * Container's getter for MARealEstateBuildingVO1.
     * @return MARealEstateBuildingVO1
     */
    public MARealEstateBuildingVOImpl getMARealEstateBuildingVO() {
        return (MARealEstateBuildingVOImpl) findViewObject("MARealEstateBuildingVO");
    }

    /**
     * Container's getter for MAProjectToBuildingsVL1.
     * @return MAProjectToBuildingsVL1
     */
    public ViewLinkImpl getMAProjectToBuildingsVL1() {
        return (ViewLinkImpl) findViewLink("MAProjectToBuildingsVL1");
    }

    /**
     * Container's getter for MABuildingOwnerVO1.
     * @return MABuildingOwnerVO1
     */
    public MABuildingOwnerVOImpl getMABuildingOwnerVO() {
        return (MABuildingOwnerVOImpl) findViewObject("MABuildingOwnerVO");
    }

    /**
     * Container's getter for MABuildingToBuildingOwnerVL1.
     * @return MABuildingToBuildingOwnerVL1
     */
    public ViewLinkImpl getMABuildingToBuildingOwnerVL1() {
        return (ViewLinkImpl) findViewLink("MABuildingToBuildingOwnerVL1");
    }

    /**
     * Container's getter for MARealEstatePropertyVO1.
     * @return MARealEstatePropertyVO1
     */
    public MARealEstatePropertyVOImpl getMARealEstatePropertyVO1() {
        return (MARealEstatePropertyVOImpl) findViewObject("MARealEstatePropertyVO1");
    }

    /**
     * Container's getter for MABuildingToPropertyVL1.
     * @return MABuildingToPropertyVL1
     */
    public ViewLinkImpl getMABuildingToPropertyVL1() {
        return (ViewLinkImpl) findViewLink("MABuildingToPropertyVL1");
    }

    /**
     * Container's getter for MARealEstateContractVO1.
     * @return MARealEstateContractVO1
     */
    public MARealEstateContractVOImpl getMARealEstateContractVO1() {
        return (MARealEstateContractVOImpl) findViewObject("MARealEstateContractVO1");
    }

    /**
     * Container's getter for MAPropertyToContractVL1.
     * @return MAPropertyToContractVL1
     */
    public ViewLinkImpl getMAPropertyToContractVL1() {
        return (ViewLinkImpl) findViewLink("MAPropertyToContractVL1");
    }

    /**
     * Container's getter for MABuildingRentOptionVO1.
     * @return MABuildingRentOptionVO1
     */
    public MABuildingRentOptionVOImpl getMABuildingRentOptionVO() {
        return (MABuildingRentOptionVOImpl) findViewObject("MABuildingRentOptionVO");
    }

    /**
     * Container's getter for MABuildingToBuildingRentVL1.
     * @return MABuildingToBuildingRentVL1
     */
    public ViewLinkImpl getMABuildingToBuildingRentVL1() {
        return (ViewLinkImpl) findViewLink("MABuildingToBuildingRentVL1");
    }

    /**
     * Container's getter for MAContractCurrencyVVO1.
     * @return MAContractCurrencyVVO1
     */
    public ViewObjectImpl getMAContractCurrencyVVO() {
        return (ViewObjectImpl) findViewObject("MAContractCurrencyVVO");
    }

    /**
     * Container's getter for MAContractTypeVVO1.
     * @return MAContractTypeVVO1
     */
    public ViewObjectImpl getMAContractTypeVVO() {
        return (ViewObjectImpl) findViewObject("MAContractTypeVVO");
    }

    /**
     * Container's getter for MAProjPropServicesVO1.
     * @return MAProjPropServicesVO1
     */
    public MAProjPropServicesVOImpl getMAPropertyProjPropServicesVO() {
        return (MAProjPropServicesVOImpl) findViewObject("MAPropertyProjPropServicesVO");
    }

    /**
     * Container's getter for MAPropertyToPropertyServicesVL1.
     * @return MAPropertyToPropertyServicesVL1
     */
    public ViewLinkImpl getMAPropertyToPropertyServicesVL1() {
        return (ViewLinkImpl) findViewLink("MAPropertyToPropertyServicesVL1");
    }

    /**
     * Container's getter for MARealEstateServicesVO1.
     * @return MARealEstateServicesVO1
     */
    public MARealEstateServicesVOImpl getMARealEstateServicesVO() {
        return (MARealEstateServicesVOImpl) findViewObject("MARealEstateServicesVO");
    }


    /**
     * Container's getter for MAProjPropServicesVO1.
     * @return MAProjPropServicesVO1
     */
    public MAProjPropServicesVOImpl getMAProjectProjPropServicesVO() {
        return (MAProjPropServicesVOImpl) findViewObject("MAProjectProjPropServicesVO");
    }

    /**
     * Container's getter for MAProjectToProjectServicesVL1.
     * @return MAProjectToProjectServicesVL1
     */
    public ViewLinkImpl getMAProjectToProjectServicesVL1() {
        return (ViewLinkImpl) findViewLink("MAProjectToProjectServicesVL1");
    }

    /**
     * Container's getter for MAContractsVO1.
     * @return MAContractsVO1
     */
    public MAContractsVOImpl getMAContractsVO() {
        return (MAContractsVOImpl) findViewObject("MAContractsVO");
    }

    /**
     * Container's getter for MAContractOwnerVO1.
     * @return MAContractOwnerVO1
     */
    public MAContractOwnerVOImpl getMAContractOwnerVO() {
        return (MAContractOwnerVOImpl) findViewObject("MAContractOwnerVO");
    }

    /**
     * Container's getter for MAContractToContractOwnerVL1.
     * @return MAContractToContractOwnerVL1
     */
    public ViewLinkImpl getMAContractToContractOwnerVL1() {
        return (ViewLinkImpl) findViewLink("MAContractToContractOwnerVL1");
    }


    /**
     * Container's getter for MAInstallmentPaymentTermsVO1.
     * @return MAInstallmentPaymentTermsVO1
     */
    public MAInstallmentPaymentTermsVOImpl getMAInstallmentPaymentTermsVO() {
        return (MAInstallmentPaymentTermsVOImpl) findViewObject("MAInstallmentPaymentTermsVO");
    }

    /**
     * Container's getter for MAInstallmentPaymentTermsDetailsVO1.
     * @return MAInstallmentPaymentTermsDetailsVO1
     */
    public MAInstallmentPaymentTermsDetailsVOImpl getMAInstallmentPaymentTermsDetailsVO() {
        return (MAInstallmentPaymentTermsDetailsVOImpl) findViewObject("MAInstallmentPaymentTermsDetailsVO");
    }

    /**
     * Container's getter for MAInstallmentToInstallmentDetailsVL1.
     * @return MAInstallmentToInstallmentDetailsVL1
     */
    public ViewLinkImpl getMAInstallmentToInstallmentDetailsVL1() {
        return (ViewLinkImpl) findViewLink("MAInstallmentToInstallmentDetailsVL1");
    }

    /**
     * Container's getter for MAPropertyInstallmentVO1.
     * @return MAPropertyInstallmentVO1
     */
    public MAPropertyInstallmentVOImpl getMAInstallmentsPropertyInstallmentVO() {
        return (MAPropertyInstallmentVOImpl) findViewObject("MAInstallmentsPropertyInstallmentVO");
    }

    /**
     * Container's getter for MAInstallmentToInstallmentPropertyVL1.
     * @return MAInstallmentToInstallmentPropertyVL1
     */
    public ViewLinkImpl getMAInstallmentToInstallmentPropertyVL1() {
        return (ViewLinkImpl) findViewLink("MAInstallmentToInstallmentPropertyVL1");
    }

    /**
     * Container's getter for MARentPaymentTermsVO1.
     * @return MARentPaymentTermsVO1
     */
    public MARentPaymentTermsVOImpl getMARentPaymentTermsVO() {
        return (MARentPaymentTermsVOImpl) findViewObject("MARentPaymentTermsVO");
    }

    /**
     * Container's getter for MABuildingRentOptionVO1.
     * @return MABuildingRentOptionVO1
     */
    public MABuildingRentOptionVOImpl getMARentBuildingRentOptionVO() {
        return (MABuildingRentOptionVOImpl) findViewObject("MARentBuildingRentOptionVO");
    }

    /**
     * Container's getter for MARentToBuildingRentVL1.
     * @return MARentToBuildingRentVL1
     */
    public ViewLinkImpl getMARentToBuildingRentVL1() {
        return (ViewLinkImpl) findViewLink("MARentToBuildingRentVL1");
    }

    /**
     * Container's getter for MAPropertyRentOptionVO1.
     * @return MAPropertyRentOptionVO1
     */
    public MAPropertyRentOptionVOImpl getMARentPropertyRentOptionVO() {
        return (MAPropertyRentOptionVOImpl) findViewObject("MARentPropertyRentOptionVO");
    }

    /**
     * Container's getter for MARentToPropertyRentVL1.
     * @return MARentToPropertyRentVL1
     */
    public ViewLinkImpl getMARentToPropertyRentVL1() {
        return (ViewLinkImpl) findViewLink("MARentToPropertyRentVL1");
    }

    /**
     * Container's getter for MARentPaymentTermsDetailsVO1.
     * @return MARentPaymentTermsDetailsVO1
     */
    public MARentPaymentTermsDetailsVOImpl getMARentPaymentTermsDetailsVO() {
        return (MARentPaymentTermsDetailsVOImpl) findViewObject("MARentPaymentTermsDetailsVO");
    }

    /**
     * Container's getter for MARentToRentDetailsVL1.
     * @return MARentToRentDetailsVL1
     */
    public ViewLinkImpl getMARentToRentDetailsVL1() {
        return (ViewLinkImpl) findViewLink("MARentToRentDetailsVL1");
    }

    /**
     * Container's getter for MAContractPropertyPaymentVO1.
     * @return MAContractPropertyPaymentVO1
     */
    public MAContractPropertyPaymentVOImpl getMAPropertiesContractPropertyPaymentVO() {
        return (MAContractPropertyPaymentVOImpl) findViewObject("MAPropertiesContractPropertyPaymentVO");
    }

    /**
     * Container's getter for MAPropertyToPropertyContractInstallmentVL1.
     * @return MAPropertyToPropertyContractInstallmentVL1
     */
    public ViewLinkImpl getMAPropertyToPropertyContractInstallmentVL1() {
        return (ViewLinkImpl) findViewLink("MAPropertyToPropertyContractInstallmentVL1");
    }


    /**
     * Container's getter for MAPropertyInstallmentVO1.
     * @return MAPropertyInstallmentVO1
     */
    public MAPropertyInstallmentVOImpl getMAPropertiesPropertyInstallmentVO() {
        return (MAPropertyInstallmentVOImpl) findViewObject("MAPropertiesPropertyInstallmentVO");
    }

    /**
     * Container's getter for MAPropertyToInstallmentPropertyVL1.
     * @return MAPropertyToInstallmentPropertyVL1
     */
    public ViewLinkImpl getMAPropertyToInstallmentPropertyVL1() {
        return (ViewLinkImpl) findViewLink("MAPropertyToInstallmentPropertyVL1");
    }

    /**
     * Container's getter for MAPropertyRentOptionVO1.
     * @return MAPropertyRentOptionVO1
     */
    public MAPropertyRentOptionVOImpl getMAPropertiesPropertyRentOptionVO() {
        return (MAPropertyRentOptionVOImpl) findViewObject("MAPropertiesPropertyRentOptionVO");
    }

    /**
     * Container's getter for MAPropertyToPropertyRentVL1.
     * @return MAPropertyToPropertyRentVL1
     */
    public ViewLinkImpl getMAPropertyToPropertyRentVL1() {
        return (ViewLinkImpl) findViewLink("MAPropertyToPropertyRentVL1");
    }

    /**
     * Container's getter for MABuildingStatusVVO1.
     * @return MABuildingStatusVVO1
     */
    public ViewObjectImpl getMABuildingStatusVVO() {
        return (ViewObjectImpl) findViewObject("MABuildingStatusVVO");
    }


    /**
     * Container's getter for MAContBuildingNumberVVO1.
     * @return MAContBuildingNumberVVO1
     */
    public ViewObjectImpl getMAContBuildingNumberVVO() {
        return (ViewObjectImpl) findViewObject("MAContBuildingNumberVVO");
    }

    /**
     * Container's getter for MAContInstallmentRuleVVO1.
     * @return MAContInstallmentRuleVVO1
     */
    public ViewObjectImpl getMAContInstallmentRuleVVO() {
        return (ViewObjectImpl) findViewObject("MAContInstallmentRuleVVO");
    }

    /**
     * Container's getter for MAContProjectNameVVO1.
     * @return MAContProjectNameVVO1
     */
    public ViewObjectImpl getMAContProjectNameVVO() {
        return (ViewObjectImpl) findViewObject("MAContProjectNameVVO");
    }

    /**
     * Container's getter for MAContPropertyNumberVVO1.
     * @return MAContPropertyNumberVVO1
     */
    public ViewObjectImpl getMAContPropertyNumberVVO() {
        return (ViewObjectImpl) findViewObject("MAContPropertyNumberVVO");
    }


    /**
     * Container's getter for MAOwnerNameVVO1.
     * @return MAOwnerNameVVO1
     */
    public ViewObjectImpl getMAOwnerNameVVO() {
        return (ViewObjectImpl) findViewObject("MAOwnerNameVVO");
    }

    /**
     * Container's getter for MAStageNumberVVO1.
     * @return MAStageNumberVVO1
     */
    public ViewObjectImpl getMAStageNumberVVO() {
        return (ViewObjectImpl) findViewObject("MAStageNumberVVO");
    }

    /**
     * Container's getter for MAInstallmentCalculationTypeVVO1.
     * @return MAInstallmentCalculationTypeVVO1
     */
    public ViewObjectImpl getMAInstallmentCalculationTypeVVO() {
        return (ViewObjectImpl) findViewObject("MAInstallmentCalculationTypeVVO");
    }

    /**
     * Container's getter for MAInstallmentPaymentTermsVVO1.
     * @return MAInstallmentPaymentTermsVVO1
     */
    public ViewObjectImpl getMAInstallmentPaymentTermsVVO() {
        return (ViewObjectImpl) findViewObject("MAInstallmentPaymentTermsVVO");
    }

    /**
     * Container's getter for MAInstallmentPaymentTypeVVO1.
     * @return MAInstallmentPaymentTypeVVO1
     */
    public ViewObjectImpl getMAInstallmentPaymentTypeVVO() {
        return (ViewObjectImpl) findViewObject("MAInstallmentPaymentTypeVVO");
    }

    /**
     * Container's getter for MAPaymentStatusVVO1.
     * @return MAPaymentStatusVVO1
     */
    public ViewObjectImpl getMAPaymentStatusVVO() {
        return (ViewObjectImpl) findViewObject("MAPaymentStatusVVO");
    }

    /**
     * Container's getter for MAPaymentTypeVVO1.
     * @return MAPaymentTypeVVO1
     */
    public ViewObjectImpl getMAPaymentTypeVVO() {
        return (ViewObjectImpl) findViewObject("MAPaymentTypeVVO");
    }

    /**
     * Container's getter for MAPaymentValueBaseVVO1.
     * @return MAPaymentValueBaseVVO1
     */
    public ViewObjectImpl getMAPaymentValueBaseVVO() {
        return (ViewObjectImpl) findViewObject("MAPaymentValueBaseVVO");
    }

    /**
     * Container's getter for MARentCalculationTypeVVO1.
     * @return MARentCalculationTypeVVO1
     */
    public ViewObjectImpl getMARentCalculationTypeVVO() {
        return (ViewObjectImpl) findViewObject("MARentCalculationTypeVVO");
    }

    /**
     * Container's getter for MARentDurationScaleVVO1.
     * @return MARentDurationScaleVVO1
     */
    public ViewObjectImpl getMARentDurationScaleVVO() {
        return (ViewObjectImpl) findViewObject("MARentDurationScaleVVO");
    }

    /**
     * Container's getter for MARentPaymentTermsVVO1.
     * @return MARentPaymentTermsVVO1
     */
    public ViewObjectImpl getMARentPaymentTermsVVO() {
        return (ViewObjectImpl) findViewObject("MARentPaymentTermsVVO");
    }

    /**
     * Container's getter for MARentPaymentTypeVVO1.
     * @return MARentPaymentTypeVVO1
     */
    public ViewObjectImpl getMARentPaymentTypeVVO() {
        return (ViewObjectImpl) findViewObject("MARentPaymentTypeVVO");
    }

    /**
     * Container's getter for MARentRepetitionVVO1.
     * @return MARentRepetitionVVO1
     */
    public ViewObjectImpl getMARentRepetitionVVO() {
        return (ViewObjectImpl) findViewObject("MARentRepetitionVVO");
    }

    /**
     * Container's getter for MARealEstateProjectVVO1.
     * @return MARealEstateProjectVVO1
     */
    public MARealEstateProjectVVOImpl getMARealEstateProjectVVO() {
        return (MARealEstateProjectVVOImpl) findViewObject("MARealEstateProjectVVO");
    }

    /**
     * Container's getter for MAPropertyActivityVVO1.
     * @return MAPropertyActivityVVO1
     */
    public ViewObjectImpl getMAPropertyActivityVVO() {
        return (ViewObjectImpl) findViewObject("MAPropertyActivityVVO");
    }

    /**
     * Container's getter for MAPropertyRentOptionVVO1.
     * @return MAPropertyRentOptionVVO1
     */
    public ViewObjectImpl getMAPropertyRentOptionVVO() {
        return (ViewObjectImpl) findViewObject("MAPropertyRentOptionVVO");
    }

    /**
     * Container's getter for MAPropertyStatusVVO1.
     * @return MAPropertyStatusVVO1
     */
    public MAPropertyStatusVVOImpl getMAPropertyStatusVVO() {
        return (MAPropertyStatusVVOImpl) findViewObject("MAPropertyStatusVVO");
    }

    /**
     * Container's getter for MARealEstateBuildingVVO1.
     * @return MARealEstateBuildingVVO1
     */
    public ViewObjectImpl getMARealEstateBuildingVVO() {
        return (ViewObjectImpl) findViewObject("MARealEstateBuildingVVO");
    }

    /**
     * Container's getter for MAProjPropServicesVO1.
     * @return MAProjPropServicesVO1
     */
    public MAProjPropServicesVOImpl getMAServicesProjPropServicesVO() {
        return (MAProjPropServicesVOImpl) findViewObject("MAServicesProjPropServicesVO");
    }

    /**
     * Container's getter for MAServicesToProjectServicesVL1.
     * @return MAServicesToProjectServicesVL1
     */
    public ViewLinkImpl getMAServicesToProjectServicesVL1() {
        return (ViewLinkImpl) findViewLink("MAServicesToProjectServicesVL1");
    }

    /**
     * Container's getter for MARSPropertyTypeVO1.
     * @return MARSPropertyTypeVO1
     */
    public MARSPropertyTypeVOImpl getMARSPropertyTypeVO() {
        return (MARSPropertyTypeVOImpl) findViewObject("MARSPropertyTypeVO");
    }

    /**
     * Container's getter for MARSInstallmentRuleVVO1.
     * @return MARSInstallmentRuleVVO1
     */
    public ViewObjectImpl getMARSInstallmentRuleVVO() {
        return (ViewObjectImpl) findViewObject("MARSInstallmentRuleVVO");
    }


    /**
     * Container's getter for MAOwnerVVO1.
     * @return MAOwnerVVO1
     */
    public ViewObjectImpl getMAOwnerVVO1() {
        return (ViewObjectImpl) findViewObject("MAOwnerVVO1");
    }

    /**
     * Container's getter for MAChildBuildingTypeVVO1.
     * @return MAChildBuildingTypeVVO1
     */
    public ViewObjectImpl getMAChildBuildingTypeVVO() {
        return (ViewObjectImpl) findViewObject("MAChildBuildingTypeVVO");
    }

    /**
     * Container's getter for MAParentBuildingTypeVVO1.
     * @return MAParentBuildingTypeVVO1
     */
    public MAParentBuildingTypeVVOImpl getMAParentBuildingTypeVVO() {
        return (MAParentBuildingTypeVVOImpl) findViewObject("MAParentBuildingTypeVVO");
    }

    /**
     * Container's getter for MALookupTypesVO1.
     * @return MALookupTypesVO1
     */
    public MALookupTypesVOImpl getMALookupTypesVO() {
        return (MALookupTypesVOImpl) findViewObject("MALookupTypesVO");
    }

    /**
     * Container's getter for MALookupValuesVO1.
     * @return MALookupValuesVO1
     */
    public MALookupValuesVOImpl getMALookupValuesVO() {
        return (MALookupValuesVOImpl) findViewObject("MALookupValuesVO");
    }

    /**
     * Container's getter for MALookupTypeToLookupValueVL1.
     * @return MALookupTypeToLookupValueVL1
     */
    public ViewLinkImpl getMALookupTypeToLookupValueVL1() {
        return (ViewLinkImpl) findViewLink("MALookupTypeToLookupValueVL1");
    }

    /**
     * Container's getter for MAAttachedDocumentsVO1.
     * @return MAAttachedDocumentsVO1
     */
    public MAAttachedDocumentsVOImpl getMABuildingOwnerAttachedDocumentsVO() {
        return (MAAttachedDocumentsVOImpl) findViewObject("MABuildingOwnerAttachedDocumentsVO");
    }

    /**
     * Container's getter for MABuildingOwnerToAttachmentVL1.
     * @return MABuildingOwnerToAttachmentVL1
     */
    public ViewLinkImpl getMABuildingOwnerToAttachmentVL1() {
        return (ViewLinkImpl) findViewLink("MABuildingOwnerToAttachmentVL1");
    }


    /**
     * Container's getter for MAAttachedDocumentsVO1.
     * @return MAAttachedDocumentsVO1
     */
    public MAAttachedDocumentsVOImpl getMAContractOwnerAttachedDocumentsVO() {
        return (MAAttachedDocumentsVOImpl) findViewObject("MAContractOwnerAttachedDocumentsVO");
    }

    /**
     * Container's getter for MAContractOwnerToAttachmentsVL1.
     * @return MAContractOwnerToAttachmentsVL1
     */
    public ViewLinkImpl getMAContractOwnerToAttachmentsVL1() {
        return (ViewLinkImpl) findViewLink("MAContractOwnerToAttachmentsVL1");
    }

    /**
     * Container's getter for MAAttachedDocumentsVO1.
     * @return MAAttachedDocumentsVO1
     */
    public MAAttachedDocumentsVOImpl getMAContractAttachedDocumentsVO() {
        return (MAAttachedDocumentsVOImpl) findViewObject("MAContractAttachedDocumentsVO");
    }

    /**
     * Container's getter for MAContractToContractAttachmentsVL1.
     * @return MAContractToContractAttachmentsVL1
     */
    public ViewLinkImpl getMAContractToContractAttachmentsVL1() {
        return (ViewLinkImpl) findViewLink("MAContractToContractAttachmentsVL1");
    }

    /**
     * Container's getter for MAAttachedDocumentsVO1.
     * @return MAAttachedDocumentsVO1
     */
    public MAAttachedDocumentsVOImpl getMAInstallPaymentDetailsAttachedDocumentsVO() {
        return (MAAttachedDocumentsVOImpl) findViewObject("MAInstallPaymentDetailsAttachedDocumentsVO");
    }

    /**
     * Container's getter for MAInstallmentPaymentTermDetailsToAttachmentVL1.
     * @return MAInstallmentPaymentTermDetailsToAttachmentVL1
     */
    public ViewLinkImpl getMAInstallmentPaymentTermDetailsToAttachmentVL1() {
        return (ViewLinkImpl) findViewLink("MAInstallmentPaymentTermDetailsToAttachmentVL1");
    }

    /**
     * Container's getter for MAAttachedDocumentsVO1.
     * @return MAAttachedDocumentsVO1
     */
    public MAAttachedDocumentsVOImpl getMAInstallPayTermsAttachedDocumentsVO() {
        return (MAAttachedDocumentsVOImpl) findViewObject("MAInstallPayTermsAttachedDocumentsVO");
    }

    /**
     * Container's getter for MAInstallmentPaymentTermToAttachmentVL1.
     * @return MAInstallmentPaymentTermToAttachmentVL1
     */
    public ViewLinkImpl getMAInstallmentPaymentTermToAttachmentVL1() {
        return (ViewLinkImpl) findViewLink("MAInstallmentPaymentTermToAttachmentVL1");
    }

    /**
     * Container's getter for MAAttachedDocumentsVO1.
     * @return MAAttachedDocumentsVO1
     */
    public MAAttachedDocumentsVOImpl getMARentPayDetailsAttachedDocumentsVO() {
        return (MAAttachedDocumentsVOImpl) findViewObject("MARentPayDetailsAttachedDocumentsVO");
    }

    /**
     * Container's getter for MARentPaymentTermDetailsToAttachmentsVL1.
     * @return MARentPaymentTermDetailsToAttachmentsVL1
     */
    public ViewLinkImpl getMARentPaymentTermDetailsToAttachmentsVL1() {
        return (ViewLinkImpl) findViewLink("MARentPaymentTermDetailsToAttachmentsVL1");
    }

    /**
     * Container's getter for MAAttachedDocumentsVO1.
     * @return MAAttachedDocumentsVO1
     */
    public MAAttachedDocumentsVOImpl getMARentPayTermsAttachedDocumentsVO() {
        return (MAAttachedDocumentsVOImpl) findViewObject("MARentPayTermsAttachedDocumentsVO");
    }

    /**
     * Container's getter for MARentPaymentTermToAttachments1.
     * @return MARentPaymentTermToAttachments1
     */
    public ViewLinkImpl getMARentPaymentTermToAttachments1() {
        return (ViewLinkImpl) findViewLink("MARentPaymentTermToAttachments1");
    }

    /**
     * Container's getter for MAFinancialVO1.
     * @return MAFinancialVO1
     */
    public MAFinancialVOImpl getMAFinancialVO() {
        return (MAFinancialVOImpl) findViewObject("MAFinancialVO");
    }

    /**
     * Container's getter for MAPropertyToPropertyFinancialsVL1.
     * @return MAPropertyToPropertyFinancialsVL1
     */
    public ViewLinkImpl getMAPropertyToPropertyFinancialsVL1() {
        return (ViewLinkImpl) findViewLink("MAPropertyToPropertyFinancialsVL1");
    }

    /**
     * Container's getter for MAAttachedDocumentsVO1.
     * @return MAAttachedDocumentsVO1
     */
    public MAAttachedDocumentsVOImpl getMAFinancialAttachedDocumentsVO() {
        return (MAAttachedDocumentsVOImpl) findViewObject("MAFinancialAttachedDocumentsVO");
    }

    /**
     * Container's getter for MAPropertyFinancialToAttachmentsVL1.
     * @return MAPropertyFinancialToAttachmentsVL1
     */
    public ViewLinkImpl getMAPropertyFinancialToAttachmentsVL1() {
        return (ViewLinkImpl) findViewLink("MAPropertyFinancialToAttachmentsVL1");
    }

    /**
     * Container's getter for MAAttachedDocumentsVO1.
     * @return MAAttachedDocumentsVO1
     */
    public MAAttachedDocumentsVOImpl getMAPropertyAttachedDocumentsVO() {
        return (MAAttachedDocumentsVOImpl) findViewObject("MAPropertyAttachedDocumentsVO");
    }

    /**
     * Container's getter for MAPropertyToAttachmentsVL1.
     * @return MAPropertyToAttachmentsVL1
     */
    public ViewLinkImpl getMAPropertyToAttachmentsVL1() {
        return (ViewLinkImpl) findViewLink("MAPropertyToAttachmentsVL1");
    }

    /**
     * Container's getter for MAAttachedDocumentsVO1.
     * @return MAAttachedDocumentsVO1
     */
    public MAAttachedDocumentsVOImpl getMAPropertyTypeAttachedDocumentsVO() {
        return (MAAttachedDocumentsVOImpl) findViewObject("MAPropertyTypeAttachedDocumentsVO");
    }

    /**
     * Container's getter for MAPropertyTypeToAttachmentsVL1.
     * @return MAPropertyTypeToAttachmentsVL1
     */
    public ViewLinkImpl getMAPropertyTypeToAttachmentsVL1() {
        return (ViewLinkImpl) findViewLink("MAPropertyTypeToAttachmentsVL1");
    }

    /**
     * Container's getter for MAAttachedDocumentsVO1.
     * @return MAAttachedDocumentsVO1
     */
    public MAAttachedDocumentsVOImpl getMAServicesAttachedDocumentsVO() {
        return (MAAttachedDocumentsVOImpl) findViewObject("MAServicesAttachedDocumentsVO");
    }

    /**
     * Container's getter for MAServicesToAttachmentsVL1.
     * @return MAServicesToAttachmentsVL1
     */
    public ViewLinkImpl getMAServicesToAttachmentsVL1() {
        return (ViewLinkImpl) findViewLink("MAServicesToAttachmentsVL1");
    }

    /**
     * Container's getter for MAAttachedDocumentsVO1.
     * @return MAAttachedDocumentsVO1
     */
    public MAAttachedDocumentsVOImpl getMAProjectAttachedDocumentsVO() {
        return (MAAttachedDocumentsVOImpl) findViewObject("MAProjectAttachedDocumentsVO");
    }

    /**
     * Container's getter for MAProjectToAttachmentsVL1.
     * @return MAProjectToAttachmentsVL1
     */
    public ViewLinkImpl getMAProjectToAttachmentsVL1() {
        return (ViewLinkImpl) findViewLink("MAProjectToAttachmentsVL1");
    }

    public void setFileData(String name, String path, String contTyp) {
        ViewObject fileVo = this.getMAProjectImagesVO();
        MAProjectImagesVORowImpl newRow = (MAProjectImagesVORowImpl) fileVo.createRow();
        newRow.setIntAttribute11(name); // setAttribute("FileName", name);
        newRow.setImagePath(path); // setAttribute("Path", path);
        newRow.setIntAttribute12(contTyp); //setAttribute("ContentType", contTyp);
        fileVo.insertRow(newRow);
    }

    public String checkDuplicateFile(String fileNm) {
        ViewObject fileVo = this.getMAProjectImagesVO();
        Row duplFile[] = fileVo.getFilteredRows("IntAttribute11", fileNm);
        if (duplFile.length > 0) {
            return "N";
        } else {
            return "Y";
        }
    }

    public void setAttachFileData(String name, String path, String contTyp) {
        ViewObject fileVo = this.getMAProjectAttachedDocumentsVO();
        MAAttachedDocumentsVORowImpl newRow = (MAAttachedDocumentsVORowImpl) fileVo.createRow();
        newRow.setFileName(name); // setAttribute("FileName", name);
        newRow.setAttribute11(path); // setAttribute("Path", path);
        newRow.setFileContentType(contTyp); //setAttribute("ContentType", contTyp);
        fileVo.insertRow(newRow);
    }

    public String checkAttachDuplicateFile(String fileNm) {
        ViewObject fileVo = this.getMAProjectAttachedDocumentsVO();
        Row duplFile[] = fileVo.getFilteredRows("FileName", fileNm);
        if (duplFile.length > 0) {
            return "N";
        } else {
            return "Y";
        }
    }

    public void setBuildAttachFileData(String name, String path, String contTyp) {
        ViewObject fileVo = this.getMABuildingAttachmentVO();
        MABuildingAttachmentVORowImpl newRow = (MABuildingAttachmentVORowImpl) fileVo.createRow();
        newRow.setFileName(name); // setAttribute("FileName", name);
        newRow.setAttribute11(path); // setAttribute("Path", path);
        newRow.setFileContentType(contTyp); //setAttribute("ContentType", contTyp);
        fileVo.insertRow(newRow);
    }

    public String checkBuildAttachDuplicateFile(String fileNm) {
        ViewObject fileVo = this.getMABuildingAttachmentVO();
        Row duplFile[] = fileVo.getFilteredRows("FileName", fileNm);
        if (duplFile.length > 0) {
            return "N";
        } else {
            return "Y";
        }
    }

    public void setPropAttachFileData(String name, String path, String contTyp) {
        ViewObject fileVo = this.getMAPropertyAttachedDocumentsVO();
        MAAttachedDocumentsVORowImpl newRow = (MAAttachedDocumentsVORowImpl) fileVo.createRow();
        newRow.setFileName(name); // setAttribute("FileName", name);
        newRow.setAttribute11(path); // setAttribute("Path", path);
        newRow.setFileContentType(contTyp); //setAttribute("ContentType", contTyp);
        fileVo.insertRow(newRow);
    }

    public String checkPropAttachDuplicateFile(String fileNm) {
        ViewObject fileVo = this.getMAPropertyAttachedDocumentsVO();
        Row duplFile[] = fileVo.getFilteredRows("FileName", fileNm);
        if (duplFile.length > 0) {
            return "N";
        } else {
            return "Y";
        }
    }

    public void createBuilding() {
        ViewObject vo = this.getMARealEstateBuildingVO();
        MARealEstateBuildingVORowImpl row = (MARealEstateBuildingVORowImpl) vo.createRow();
        vo.last();
        vo.insertRow(row);
        //this.getDBTransaction().commit();
        // vo.executeQuery();
    }

    public void createBuildRentOption() {
        ViewObject vo = this.getMABuildingRentOptionVO();
        MABuildingRentOptionVORowImpl row = (MABuildingRentOptionVORowImpl) vo.createRow();
        vo.last();
        vo.insertRow(row);
        //this.getDBTransaction().commit();
        // vo.executeQuery();
    }

    public void createProperty() {
        ViewObject vo = this.getMARealEstatePropertyVO1();
        MARealEstatePropertyVORowImpl row = (MARealEstatePropertyVORowImpl) vo.createRow();
        vo.last();
        vo.insertRow(row);
        //this.getDBTransaction().commit();
        // vo.executeQuery();
    }

    public void createPropRentOption() {
        ViewObject vo = this.getMAPropertiesPropertyRentOptionVO();
        MAPropertyRentOptionVORowImpl row = (MAPropertyRentOptionVORowImpl) vo.createRow();
        vo.last();
        vo.insertRow(row);
        //this.getDBTransaction().commit();
        // vo.executeQuery();
    }

    public void createPropFinancials() {
        ViewObject vo = this.getMAFinancialVO();
        MAFinancialVORowImpl row = (MAFinancialVORowImpl) vo.createRow();
        vo.last();
        vo.insertRow(row);
        //this.getDBTransaction().commit();
        // vo.executeQuery();
    }

    public void createPropOwner() {
        ViewObject vo = this.getMARealEstateContractVO1();
        MARealEstateContractVORowImpl row = (MARealEstateContractVORowImpl) vo.createRow();
        vo.last();
        vo.insertRow(row);
        //this.getDBTransaction().commit();
        // vo.executeQuery();
    }

    /**
     * Container's getter for MABuildingAttachmentVO1.
     * @return MABuildingAttachmentVO1
     */
    public MABuildingAttachmentVOImpl getMABuildingAttachmentVO() {
        return (MABuildingAttachmentVOImpl) findViewObject("MABuildingAttachmentVO");
    }

    /**
     * Container's getter for MABuildingToBuildingAttachmentsVL1.
     * @return MABuildingToBuildingAttachmentsVL1
     */
    public ViewLinkImpl getMABuildingToBuildingAttachmentsVL1() {
        return (ViewLinkImpl) findViewLink("MABuildingToBuildingAttachmentsVL1");
    }

    /**
     * Container's getter for MARealEstateProjServicesVO1.
     * @return MARealEstateProjServicesVO1
     */
    public MARealEstateProjServicesVOImpl getMARealEstateProjServicesVO() {
        return (MARealEstateProjServicesVOImpl) findViewObject("MARealEstateProjServicesVO");
    }

    /**
     * Container's getter for MARealEstatePropertyServices1.
     * @return MARealEstatePropertyServices1
     */
    public MARealEstatePropertyServicesImpl getMARealEstatePropertyServices() {
        return (MARealEstatePropertyServicesImpl) findViewObject("MARealEstatePropertyServices");
    }

    /**
     * Container's getter for MARealEstatePrpServicesVL1.
     * @return MARealEstatePrpServicesVL1
     */
    public ViewLinkImpl getMARealEstatePrpServicesVL1() {
        return (ViewLinkImpl) findViewLink("MARealEstatePrpServicesVL1");
    }

    /**
     * Container's getter for MARealEstateProjServicesVO1.
     * @return MARealEstateProjServicesVO1
     */
    public MARealEstateProjServicesVOImpl getMARealEstateProjServicesVO1() {
        return (MARealEstateProjServicesVOImpl) findViewObject("MARealEstateProjServicesVO1");
    }

    /**
     * Container's getter for MARealEstateProjPropServVL1.
     * @return MARealEstateProjPropServVL1
     */
    public ViewLinkImpl getMARealEstateProjPropServVL1() {
        return (ViewLinkImpl) findViewLink("MARealEstateProjPropServVL1");
    }


    /**
     * Container's getter for MAContractsSearchVVO1.
     * @return MAContractsSearchVVO1
     */
    public ViewObjectImpl getMAContractsSearchVVO() {
        return (ViewObjectImpl) findViewObject("MAContractsSearchVVO");
    }

    /**
     * Container's getter for MAContractPropertyPaymentVVO1.
     * @return MAContractPropertyPaymentVVO1
     */
    public ViewObjectImpl getMAContractPropertyPaymentVVO() {
        return (ViewObjectImpl) findViewObject("MAContractPropertyPaymentVVO");
    }

    /**
     * Container's getter for MAContractToContractPaymentVL1.
     * @return MAContractToContractPaymentVL1
     */
    public ViewLinkImpl getMAContractToContractPaymentVL1() {
        return (ViewLinkImpl) findViewLink("MAContractToContractPaymentVL1");
    }

    /**
     * Container's getter for MAContractPropertyPaymentVO1.
     * @return MAContractPropertyPaymentVO1
     */
    public MAContractPropertyPaymentVOImpl getMAContractsContractPropertyPaymentVO() {
        return (MAContractPropertyPaymentVOImpl) findViewObject("MAContractsContractPropertyPaymentVO");
    }

    /**
     * Container's getter for MAContractToPropertyContractInstallmentVL1.
     * @return MAContractToPropertyContractInstallmentVL1
     */
    public ViewLinkImpl getMAContractToPropertyContractInstallmentVL1() {
        return (ViewLinkImpl) findViewLink("MAContractToPropertyContractInstallmentVL1");
    }

    /**
     * Container's getter for MADummyPaymentTypeVVO1.
     * @return MADummyPaymentTypeVVO1
     */
    public MADummyPaymentTypeVVOImpl getMADummyPaymentTypeVVO() {
        return (MADummyPaymentTypeVVOImpl) findViewObject("MADummyPaymentTypeVVO");
    }


    /**
     * Container's getter for MAPropertyBuildingProjectLovVVO1.
     * @return MAPropertyBuildingProjectLovVVO1
     */
    public ViewObjectImpl getMAPropertyBuildingProjectLovVVO() {
        return (ViewObjectImpl) findViewObject("MAPropertyBuildingProjectLovVVO");
    }

    /**
     * Container's getter for MAPropertyIdLovVVO1.
     * @return MAPropertyIdLovVVO1
     */
    public ViewObjectImpl getMAPropertyIdLovVVO() {
        return (ViewObjectImpl) findViewObject("MAPropertyIdLovVVO");
    }

    /**
     * Container's getter for MARealEstatePropertyVO2.
     * @return MARealEstatePropertyVO2
     */
    public ma.oracle.apps.cx.realestate.contract.views.MARealEstatePropertyVOImpl getMARealEstateContractsPropertyVO() {
        return (ma.oracle.apps.cx.realestate.contract.views.MARealEstatePropertyVOImpl) findViewObject("MARealEstateContractsPropertyVO");
    }

    /**
     * Container's getter for MAPropertySearchToPropertyVL1.
     * @return MAPropertySearchToPropertyVL1
     */
    public ViewLinkImpl getMAPropertySearchToPropertyVL1() {
        return (ViewLinkImpl) findViewLink("MAPropertySearchToPropertyVL1");
    }

    /**
     * Container's getter for MAPropertyParentTypeVVO1.
     * @return MAPropertyParentTypeVVO1
     */
    public ViewObjectImpl getMAPropertyParentTypeVVO() {
        return (ViewObjectImpl) findViewObject("MAPropertyParentTypeVVO");
    }

    /**
     * Container's getter for MAPropertySearchVVO1.
     * @return MAPropertySearchVVO1
     */
    public ViewObjectImpl getMAPropertySearchVVO() {
        return (ViewObjectImpl) findViewObject("MAPropertySearchVVO");
    }

    /**
     * Container's getter for MARealEstatePropertyVO2.
     * @return MARealEstatePropertyVO2
     */
    public ma.oracle.apps.cx.realestate.contract.views.MARealEstatePropertyVOImpl getMARealEstateContractPropertyVO() {
        return (ma.oracle.apps.cx.realestate.contract.views.MARealEstatePropertyVOImpl) findViewObject("MARealEstateContractPropertyVO");
    }

    /**
     * Container's getter for MARsBuildingTypeVO1.
     * @return MARsBuildingTypeVO1
     */
    public MARsBuildingTypeVOImpl getMARsBuildingTypeVO() {
        return (MARsBuildingTypeVOImpl) findViewObject("MARsBuildingTypeVO");
    }


    public void initPaymentTypeQuery() {
        ViewObject paymentTypeVO = this.getMAPaymentTypeVVO();
        paymentTypeVO.executeQuery();
    }


    public void deleteLookup(Number lookupId) {
        CallableStatement cs = null;
        try {
            cs =
                getDBTransaction().createCallableStatement("begin xxma_real_estate_pkg.xxma_delete_lookup(?); end;", 0);
            cs.setInt(1, lookupId.intValue());
            cs.executeUpdate();
        } catch (SQLException e) {
            throw new JboException(e);
        }
    }


    public void deleteService(Number serviceId) {
        CallableStatement cs = null;
        try {
            cs =
                getDBTransaction().createCallableStatement("begin xxma_real_estate_pkg.xxma_delete_service(?); end;",
                                                           0);
            cs.setInt(1, serviceId.intValue());
            cs.executeUpdate();
        } catch (SQLException e) {
            throw new JboException(e);
        }
    }

    public void deletePayment(Number installmentId, Number rentId) {
        CallableStatement cs = null;
        try {
            cs =
                getDBTransaction().createCallableStatement("begin xxma_real_estate_pkg.xxma_delete_payment(?,?); end;",
                                                           0);
            if (installmentId != null) {
                cs.setInt(1, installmentId.intValue());
                cs.setInt(2, new Number(0).intValue());
            } else {
                cs.setInt(1, new Number(0).intValue());
                cs.setInt(2, rentId.intValue());
            }

            cs.executeUpdate();
        } catch (SQLException e) {
            throw new JboException(e);
        }
    }

    public void createInstallments(Number installPayId, Number propertyId) {
        CallableStatement cs = null;
        //        Number installPaymentId = null;
        //        Number propertyIdd = null;
        Number contractId = (Number) getMAContractsVO().getCurrentRow().getAttribute("ContractId");
        //        try {
        //            installPaymentId = new Number(installPayId);
        //            propertyIdd = new Number(propertyId);
        //        } catch (SQLException e) {
        //            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Test ", null);
        //            FacesContext.getCurrentInstance().addMessage(null, message);
        //        }
        try {
            cs =
                getDBTransaction().createCallableStatement("begin xxma_real_estate_pkg.xxma_add_installment_schedule(?,?,?); end;",
                                                           0);

            cs.setInt(1, contractId.intValue());
            cs.setInt(2, propertyId.intValue());
            cs.setInt(3, installPayId.intValue());
            ////            cs.setInt(2, propertyIdd.intValue());
            ////            cs.setInt(3, installPaymentId.intValue());
            cs.executeUpdate();

            //             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Test "+installPayId+" "+propertyId+" "+contractId, null);
            //            FacesContext.getCurrentInstance().addMessage(null, message);
        } catch (SQLException e) {
            throw new JboException(e);
        }
    }

    public void setPrimaryOwner(Number contractOwnerId) {
        ViewObject vo = getMAContractOwnerVO();
        int rowCount = vo.getFetchedRowCount();
        for (int i = 0; i < rowCount; i++) {
            MAContractOwnerVORowImpl contractOwnerRow = (MAContractOwnerVORowImpl) vo.getRowAtRangeIndex(i);
            if (contractOwnerRow.getContractOwnerId().compareTo(contractOwnerId) == 0) {
                contractOwnerRow.setIntAttribute3("Y");
            } else {
                contractOwnerRow.setIntAttribute3("N");
            }
        }
    }

    public void deleteContract(Number contractId) {
        CallableStatement cs = null;
        try {
            cs =
                getDBTransaction().createCallableStatement("begin xxma_real_estate_pkg.xxma_delete_contract(?); end;",
                                                           0);
            cs.setInt(1, contractId.intValue());

            cs.executeUpdate();
        } catch (SQLException e) {
            throw new JboException(e);
        }
    }

    public void deletePropertyType(Number propertyTypeId) {
        CallableStatement cs = null;
        try {
            cs =
                getDBTransaction().createCallableStatement("begin xxma_real_estate_pkg.xxma_delete_property_type(?); end;",
                                                           0);
            cs.setInt(1, propertyTypeId.intValue());

            cs.executeUpdate();
        } catch (SQLException e) {
            throw new JboException(e);
        }
    }

    public void deleteBuildingType(Number buildingTypeId) {
        CallableStatement cs = null;
        try {
            cs =
                getDBTransaction().createCallableStatement("begin xxma_real_estate_pkg.xxma_delete_building_type(?); end;",
                                                           0);
            cs.setInt(1, buildingTypeId.intValue());

            cs.executeUpdate();
        } catch (SQLException e) {
            throw new JboException(e);
        }
    }


    /**
     * Container's getter for MAAttachedDocumentsVO1.
     * @return MAAttachedDocumentsVO1
     */
    public MAAttachedDocumentsVOImpl getMABuildingAttachedDocumentsVO() {
        return (MAAttachedDocumentsVOImpl) findViewObject("MABuildingAttachedDocumentsVO");
    }

    /**
     * Container's getter for MAReceiptsContractSearchVVO1.
     * @return MAReceiptsContractSearchVVO1
     */
    public ViewObjectImpl getMAReceiptsContractSearchVVO() {
        return (ViewObjectImpl) findViewObject("MAReceiptsContractSearchVVO");
    }

    /**
     * Container's getter for MAReceiptsPropertySearchVVO1.
     * @return MAReceiptsPropertySearchVVO1
     */
    public ViewObjectImpl getMAReceiptsPropertySearchVVO() {
        return (ViewObjectImpl) findViewObject("MAReceiptsPropertySearchVVO");
    }


    /**
     * Container's getter for MAInstallmentRuleVVO1.
     * @return MAInstallmentRuleVVO1
     */
    public ViewObjectImpl getMAInstallmentRuleVVO() {
        return (ViewObjectImpl) findViewObject("MAInstallmentRuleVVO");
    }
    
    public void chang_lang(String lang) {
       Locale newLocale = new Locale(lang);
       FacesContext context = FacesContext.getCurrentInstance();
       context.getViewRoot().setLocale(newLocale);
    }
    
    public void ar_lang() {
//        Locale newLocale = new Locale("ar");
//        FacesContext context = FacesContext.getCurrentInstance();
//        context.getViewRoot().setLocale(newLocale);
//        
////        ExternalContext ectx = context.getExternalContext();
////        HttpSession arSession = (HttpSession) ectx.getSession(false);
////        arSession.setAttribute("sessionAR", "ar");
////        HttpSession enSession = (HttpSession) ectx.getSession(false);
////        enSession.setAttribute("sessionEN", null);
//        Map sessionScope=ADFContext.getCurrent().getSessionScope();
//        sessionScope.put("sessionAR", "ar");
//                sessionScope.put("sessionEN", null);
        
        chang_lang("ar");    
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        sessionScope.put("session", "ar");
    }
    
    public void en_lang() {
//        Locale newLocale = new Locale("en");
//        FacesContext context = FacesContext.getCurrentInstance();
//        context.getViewRoot().setLocale(newLocale);
//        
////        ExternalContext ectx = context.getExternalContext();
////        HttpSession arSession = (HttpSession) ectx.getSession(false);
////        arSession.setAttribute("sessionAR", null);
////        HttpSession enSession = (HttpSession) ectx.getSession(false);
////        enSession.setAttribute("sessionEN", "en");
//                Map sessionScope=ADFContext.getCurrent().getSessionScope();
//        sessionScope.put("sessionAR", null);
//                sessionScope.put("sessionEN", "en");
        chang_lang("en");
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        sessionScope.put("session", "en");
    }
    
    public void set_lang() {
////        String arSessvalue = ADFContext.getCurrent().getSessionScope().get("sessionAR").toString();
////        String enSessvalue = ADFContext.getCurrent().getSessionScope().get("sessionEN").toString();
//        Locale newLocale;
////        if (arSessvalue != null) {
////            newLocale = new Locale("ar");
////        }
////        
////        else {
////            newLocale = new Locale("en");
////        }
//        Map sessionScope=ADFContext.getCurrent().getSessionScope();
//        if(sessionScope.get("sessionAR")!=null){
//            newLocale = new Locale("ar");
//        }else{
//            newLocale = new Locale("en");
//        }
//        
//        
//        FacesContext context = FacesContext.getCurrentInstance();
//        context.getViewRoot().setLocale(newLocale);
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        Locale newLocale;
        String lang = sessionScope.get("session").toString();
        newLocale = new Locale(lang);
        FacesContext context = FacesContext.getCurrentInstance();
        context.getViewRoot().setLocale(newLocale);    
    }

    /**
     * Container's getter for MAContractPropertyPaymentVO.
     * @return MAContractPropertyPaymentVO
     */
    public MAContractPropertyPaymentVOImpl getMAContractPropertyPaymentVO() {
        return (MAContractPropertyPaymentVOImpl) findViewObject("MAContractPropertyPaymentVO");
    }

    /**
     * Container's getter for MARealEstatePaternPropVO1.
     * @return MARealEstatePaternPropVO1
     */
    public MARealEstatePaternPropVOImpl getMARealEstatePaternPropVO() {
        return (MARealEstatePaternPropVOImpl) findViewObject("MARealEstatePaternPropVO");
    }
   
    public void createWizardProperties(Number propId, Number buildId, String spfyCond) {
        CallableStatement cs = null;
        try {
            cs =
                getDBTransaction().createCallableStatement("begin xxma_real_estate_pkg.create_wizard_properties(?,?,?); end;",
                                                           0);
            cs.setInt(1, propId.intValue());
            cs.setInt(2, buildId.intValue());
            cs.setString(3, spfyCond);
            
            cs.executeUpdate();
        } catch (SQLException e) {
            throw new JboException(e);
        }
    }


    /**
     * Container's getter for MARSBuildingSearchVO1.
     * @return MARSBuildingSearchVO1
     */
    public ViewObjectImpl getMARSBuildingSearchVO1() {
        return (ViewObjectImpl) findViewObject("MARSBuildingSearchVO1");
    }

    /**
     * Container's getter for MARSBuildingTableVO1.
     * @return MARSBuildingTableVO1
     */
    public ViewObjectImpl getMARSBuildingTableVO1() {
        return (ViewObjectImpl) findViewObject("MARSBuildingTableVO1");
    }

    /**
     * Container's getter for MARealEstatePropertyExportVO1.
     * @return MARealEstatePropertyExportVO1
     */
    public MARealEstatePropertyExportVOImpl getMARealEstatePropertyExportVO1() {
        return (MARealEstatePropertyExportVOImpl) findViewObject("MARealEstatePropertyExportVO1");
    }

    /**
     * Container's getter for MABuildingRentOptionExportVO1.
     * @return MABuildingRentOptionExportVO1
     */
    public MABuildingRentOptionExportVOImpl getMABuildingRentOptionExportVO1() {
        return (MABuildingRentOptionExportVOImpl) findViewObject("MABuildingRentOptionExportVO1");
    }

    /**
     * Container's getter for MABuildingRentOptionExportVO2.
     * @return MABuildingRentOptionExportVO2
     */
    public ViewObjectImpl getMABuildingRentOptionExportVO2() {
        return (ViewObjectImpl) findViewObject("MABuildingRentOptionExportVO2");
    }

    /**
     * Container's getter for MABuildingOwnerExportVO1.
     * @return MABuildingOwnerExportVO1
     */
    public MABuildingOwnerExportVOImpl getMABuildingOwnerExportVO1() {
        return (MABuildingOwnerExportVOImpl) findViewObject("MABuildingOwnerExportVO1");
    }

    /**
     * Container's getter for MABuildingAttachmentExportVO1.
     * @return MABuildingAttachmentExportVO1
     */
    public MABuildingAttachmentExportVOImpl getMABuildingAttachmentExportVO1() {
        return (MABuildingAttachmentExportVOImpl) findViewObject("MABuildingAttachmentExportVO1");
    }

    /**
     * Container's getter for MABuildingAttachmentImportVO1.
     * @return MABuildingAttachmentImportVO1
     */
    public MABuildingAttachmentImportVOImpl getMABuildingAttachmentImportVO1() {
        return (MABuildingAttachmentImportVOImpl) findViewObject("MABuildingAttachmentImportVO1");
    }
}

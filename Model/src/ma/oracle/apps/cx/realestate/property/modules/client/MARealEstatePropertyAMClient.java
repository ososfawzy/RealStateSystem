package ma.oracle.apps.cx.realestate.property.modules.client;

import ma.oracle.apps.cx.realestate.property.modules.common.MARealEstatePropertyAM;

import oracle.jbo.client.remote.ApplicationModuleImpl;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue May 15 19:33:39 EEST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MARealEstatePropertyAMClient extends ApplicationModuleImpl implements MARealEstatePropertyAM {
    /**
     * This is the default constructor (do not remove).
     */
    public MARealEstatePropertyAMClient() {
    }


    public void chang_lang(String lang) {
        Object _ret = this.riInvokeExportedMethod(this, "chang_lang", new String[] { "java.lang.String" }, new Object[] {
                                                  lang });
        return;
    }


    public void ar_lang() {
        Object _ret = this.riInvokeExportedMethod(this, "ar_lang", null, null);
        return;
    }

    public String checkAttachDuplicateFile(String fileNm) {
        Object _ret = this.riInvokeExportedMethod(this, "checkAttachDuplicateFile", new String[] { "java.lang.String" }, new Object[] {
                                                  fileNm });
        return (String) _ret;
    }

    public String checkBuildAttachDuplicateFile(String fileNm) {
        Object _ret = this.riInvokeExportedMethod(this, "checkBuildAttachDuplicateFile", new String[] {
                                                  "java.lang.String" }, new Object[] { fileNm });
        return (String) _ret;
    }

    public String checkDuplicateFile(String fileNm) {
        Object _ret = this.riInvokeExportedMethod(this, "checkDuplicateFile", new String[] { "java.lang.String" }, new Object[] {
                                                  fileNm });
        return (String) _ret;
    }

    public String checkPropAttachDuplicateFile(String fileNm) {
        Object _ret = this.riInvokeExportedMethod(this, "checkPropAttachDuplicateFile", new String[] {
                                                  "java.lang.String" }, new Object[] { fileNm });
        return (String) _ret;
    }

    public void createBuildRentOption() {
        Object _ret = this.riInvokeExportedMethod(this, "createBuildRentOption", null, null);
        return;
    }

    public void createBuilding() {
        Object _ret = this.riInvokeExportedMethod(this, "createBuilding", null, null);
        return;
    }

    public void createPropRentOption() {
        Object _ret = this.riInvokeExportedMethod(this, "createPropRentOption", null, null);
        return;
    }

    public void createProperty() {
        Object _ret = this.riInvokeExportedMethod(this, "createProperty", null, null);
        return;
    }

    public void en_lang() {
        Object _ret = this.riInvokeExportedMethod(this, "en_lang", null, null);
        return;
    }

    public void fakeDelete(Number propId) {
        Object _ret = this.riInvokeExportedMethod(this, "fakeDelete", new String[] { "oracle.jbo.domain.Number" }, new Object[] {
                                                  propId });
        return;
    }

    public void gridViewEdit(Number propId) {
        Object _ret = this.riInvokeExportedMethod(this, "gridViewEdit", new String[] { "oracle.jbo.domain.Number" }, new Object[] {
                                                  propId });
        return;
    }

    public void servicesRequery() {
        Object _ret = this.riInvokeExportedMethod(this, "servicesRequery", null, null);
        return;
    }

    public void setAttachFileData(String name, String path, String contTyp) {
        Object _ret = this.riInvokeExportedMethod(this, "setAttachFileData", new String[] {
                                                  "java.lang.String", "java.lang.String", "java.lang.String"
        }, new Object[] { name, path, contTyp });
        return;
    }

    public void setBuildAttachFileData(String name, String path, String contTyp) {
        Object _ret = this.riInvokeExportedMethod(this, "setBuildAttachFileData", new String[] {
                                                  "java.lang.String", "java.lang.String", "java.lang.String"
        }, new Object[] { name, path, contTyp });
        return;
    }

    public void setFileData(String name, String path, String contTyp) {
        Object _ret = this.riInvokeExportedMethod(this, "setFileData", new String[] {
                                                  "java.lang.String", "java.lang.String", "java.lang.String"
        }, new Object[] { name, path, contTyp });
        return;
    }

    public void setPropAttachFileData(String name, String path, String contTyp) {
        Object _ret = this.riInvokeExportedMethod(this, "setPropAttachFileData", new String[] {
                                                  "java.lang.String", "java.lang.String", "java.lang.String"
        }, new Object[] { name, path, contTyp });
        return;
    }
}

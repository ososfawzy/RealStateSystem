package ma.oracle.apps.cx.realestate.payments.views;

import java.sql.Date;

import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Dec 17 14:39:28 EET 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MAInstallmentPaymentTermsDetailsVORowImpl extends ViewRowImpl {


    public static final int ENTITY_MARSINSTALLTERMDETAILSEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CreatedBy {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CreationDate {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute1 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute10 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute11 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute12 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute13 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute14 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute15 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute2 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute3 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute4 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute5 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute6 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute7 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute8 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute9 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttributeCategory {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        InstallMonths {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        InstallYears {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        InstallmentPaymentTermId {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        InstallmentTermDetailId {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        InstallmentValue {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute1 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute10 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute11 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute12 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute13 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute14 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute15 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute2 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute3 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute4 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute5 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute6 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute7 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute8 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute9 {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttributeCategory {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastUpdateLogin {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        NumberOfInstallments {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PaymentType {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Repetition {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ValueBase {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        MAInstallmentPaymentTermsVO {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        MAAttachedDocumentsVO {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        MAInstallmentPaymentTypeVVO {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        MAPaymentValueBaseVVO {
            public Object get(MAInstallmentPaymentTermsDetailsVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAInstallmentPaymentTermsDetailsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        public abstract Object get(MAInstallmentPaymentTermsDetailsVORowImpl object);

        public abstract void put(MAInstallmentPaymentTermsDetailsVORowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int EXTATTRIBUTE1 = AttributesEnum.ExtAttribute1.index();
    public static final int EXTATTRIBUTE10 = AttributesEnum.ExtAttribute10.index();
    public static final int EXTATTRIBUTE11 = AttributesEnum.ExtAttribute11.index();
    public static final int EXTATTRIBUTE12 = AttributesEnum.ExtAttribute12.index();
    public static final int EXTATTRIBUTE13 = AttributesEnum.ExtAttribute13.index();
    public static final int EXTATTRIBUTE14 = AttributesEnum.ExtAttribute14.index();
    public static final int EXTATTRIBUTE15 = AttributesEnum.ExtAttribute15.index();
    public static final int EXTATTRIBUTE2 = AttributesEnum.ExtAttribute2.index();
    public static final int EXTATTRIBUTE3 = AttributesEnum.ExtAttribute3.index();
    public static final int EXTATTRIBUTE4 = AttributesEnum.ExtAttribute4.index();
    public static final int EXTATTRIBUTE5 = AttributesEnum.ExtAttribute5.index();
    public static final int EXTATTRIBUTE6 = AttributesEnum.ExtAttribute6.index();
    public static final int EXTATTRIBUTE7 = AttributesEnum.ExtAttribute7.index();
    public static final int EXTATTRIBUTE8 = AttributesEnum.ExtAttribute8.index();
    public static final int EXTATTRIBUTE9 = AttributesEnum.ExtAttribute9.index();
    public static final int EXTATTRIBUTECATEGORY = AttributesEnum.ExtAttributeCategory.index();
    public static final int INSTALLMONTHS = AttributesEnum.InstallMonths.index();
    public static final int INSTALLYEARS = AttributesEnum.InstallYears.index();
    public static final int INSTALLMENTPAYMENTTERMID = AttributesEnum.InstallmentPaymentTermId.index();
    public static final int INSTALLMENTTERMDETAILID = AttributesEnum.InstallmentTermDetailId.index();
    public static final int INSTALLMENTVALUE = AttributesEnum.InstallmentValue.index();
    public static final int INTATTRIBUTE1 = AttributesEnum.IntAttribute1.index();
    public static final int INTATTRIBUTE10 = AttributesEnum.IntAttribute10.index();
    public static final int INTATTRIBUTE11 = AttributesEnum.IntAttribute11.index();
    public static final int INTATTRIBUTE12 = AttributesEnum.IntAttribute12.index();
    public static final int INTATTRIBUTE13 = AttributesEnum.IntAttribute13.index();
    public static final int INTATTRIBUTE14 = AttributesEnum.IntAttribute14.index();
    public static final int INTATTRIBUTE15 = AttributesEnum.IntAttribute15.index();
    public static final int INTATTRIBUTE2 = AttributesEnum.IntAttribute2.index();
    public static final int INTATTRIBUTE3 = AttributesEnum.IntAttribute3.index();
    public static final int INTATTRIBUTE4 = AttributesEnum.IntAttribute4.index();
    public static final int INTATTRIBUTE5 = AttributesEnum.IntAttribute5.index();
    public static final int INTATTRIBUTE6 = AttributesEnum.IntAttribute6.index();
    public static final int INTATTRIBUTE7 = AttributesEnum.IntAttribute7.index();
    public static final int INTATTRIBUTE8 = AttributesEnum.IntAttribute8.index();
    public static final int INTATTRIBUTE9 = AttributesEnum.IntAttribute9.index();
    public static final int INTATTRIBUTECATEGORY = AttributesEnum.IntAttributeCategory.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int NUMBEROFINSTALLMENTS = AttributesEnum.NumberOfInstallments.index();
    public static final int PAYMENTTYPE = AttributesEnum.PaymentType.index();
    public static final int REPETITION = AttributesEnum.Repetition.index();
    public static final int VALUEBASE = AttributesEnum.ValueBase.index();
    public static final int MAINSTALLMENTPAYMENTTERMSVO = AttributesEnum.MAInstallmentPaymentTermsVO.index();
    public static final int MAATTACHEDDOCUMENTSVO = AttributesEnum.MAAttachedDocumentsVO.index();
    public static final int MAINSTALLMENTPAYMENTTYPEVVO = AttributesEnum.MAInstallmentPaymentTypeVVO.index();
    public static final int MAPAYMENTVALUEBASEVVO = AttributesEnum.MAPaymentValueBaseVVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MAInstallmentPaymentTermsDetailsVORowImpl() {
    }
}

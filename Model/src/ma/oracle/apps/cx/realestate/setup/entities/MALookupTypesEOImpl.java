package ma.oracle.apps.cx.realestate.setup.entities;

import java.sql.Date;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Dec 24 15:21:11 EET 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MALookupTypesEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        LookupId {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getLookupId();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setLookupId((Number) value);
            }
        }
        ,
        LookupType {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getLookupType();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setLookupType((String) value);
            }
        }
        ,
        CreatedBy {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setCreatedBy((Number) value);
            }
        }
        ,
        CreationDate {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setCreationDate((Date) value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setLastUpdatedBy((Number) value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setLastUpdateDate((Date) value);
            }
        }
        ,
        LastUpdateLogin {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getLastUpdateLogin();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setLastUpdateLogin((Number) value);
            }
        }
        ,
        AttributeCategory {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getAttributeCategory();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setAttributeCategory((String) value);
            }
        }
        ,
        Attribute1 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getAttribute1();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setAttribute1((String) value);
            }
        }
        ,
        Attribute2 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getAttribute2();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setAttribute2((String) value);
            }
        }
        ,
        Attribute3 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getAttribute3();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setAttribute3((String) value);
            }
        }
        ,
        Attribute4 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getAttribute4();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setAttribute4((String) value);
            }
        }
        ,
        Attribute5 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getAttribute5();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setAttribute5((String) value);
            }
        }
        ,
        Attribute6 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getAttribute6();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setAttribute6((String) value);
            }
        }
        ,
        Attribute7 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getAttribute7();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setAttribute7((String) value);
            }
        }
        ,
        Attribute8 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getAttribute8();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setAttribute8((String) value);
            }
        }
        ,
        Attribute9 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getAttribute9();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setAttribute9((String) value);
            }
        }
        ,
        Attribute10 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getAttribute10();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setAttribute10((String) value);
            }
        }
        ,
        Attribute11 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getAttribute11();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setAttribute11((String) value);
            }
        }
        ,
        Attribute12 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getAttribute12();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setAttribute12((String) value);
            }
        }
        ,
        Attribute13 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getAttribute13();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setAttribute13((String) value);
            }
        }
        ,
        Attribute14 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getAttribute14();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setAttribute14((String) value);
            }
        }
        ,
        Attribute15 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getAttribute15();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setAttribute15((String) value);
            }
        }
        ,
        ExtAttributeCategory {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getExtAttributeCategory();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setExtAttributeCategory((String) value);
            }
        }
        ,
        ExtAttribute1 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getExtAttribute1();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setExtAttribute1((String) value);
            }
        }
        ,
        ExtAttribute2 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getExtAttribute2();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setExtAttribute2((String) value);
            }
        }
        ,
        ExtAttribute3 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getExtAttribute3();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setExtAttribute3((String) value);
            }
        }
        ,
        ExtAttribute4 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getExtAttribute4();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setExtAttribute4((String) value);
            }
        }
        ,
        ExtAttribute5 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getExtAttribute5();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setExtAttribute5((String) value);
            }
        }
        ,
        ExtAttribute6 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getExtAttribute6();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setExtAttribute6((String) value);
            }
        }
        ,
        ExtAttribute7 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getExtAttribute7();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setExtAttribute7((String) value);
            }
        }
        ,
        ExtAttribute8 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getExtAttribute8();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setExtAttribute8((String) value);
            }
        }
        ,
        ExtAttribute9 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getExtAttribute9();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setExtAttribute9((String) value);
            }
        }
        ,
        ExtAttribute10 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getExtAttribute10();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setExtAttribute10((String) value);
            }
        }
        ,
        ExtAttribute11 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getExtAttribute11();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setExtAttribute11((String) value);
            }
        }
        ,
        ExtAttribute12 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getExtAttribute12();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setExtAttribute12((String) value);
            }
        }
        ,
        ExtAttribute13 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getExtAttribute13();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setExtAttribute13((String) value);
            }
        }
        ,
        ExtAttribute14 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getExtAttribute14();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setExtAttribute14((String) value);
            }
        }
        ,
        ExtAttribute15 {
            public Object get(MALookupTypesEOImpl obj) {
                return obj.getExtAttribute15();
            }

            public void put(MALookupTypesEOImpl obj, Object value) {
                obj.setExtAttribute15((String) value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(MALookupTypesEOImpl object);

        public abstract void put(MALookupTypesEOImpl object, Object value);

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

    public static final int LOOKUPID = AttributesEnum.LookupId.index();
    public static final int LOOKUPTYPE = AttributesEnum.LookupType.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int ATTRIBUTECATEGORY = AttributesEnum.AttributeCategory.index();
    public static final int ATTRIBUTE1 = AttributesEnum.Attribute1.index();
    public static final int ATTRIBUTE2 = AttributesEnum.Attribute2.index();
    public static final int ATTRIBUTE3 = AttributesEnum.Attribute3.index();
    public static final int ATTRIBUTE4 = AttributesEnum.Attribute4.index();
    public static final int ATTRIBUTE5 = AttributesEnum.Attribute5.index();
    public static final int ATTRIBUTE6 = AttributesEnum.Attribute6.index();
    public static final int ATTRIBUTE7 = AttributesEnum.Attribute7.index();
    public static final int ATTRIBUTE8 = AttributesEnum.Attribute8.index();
    public static final int ATTRIBUTE9 = AttributesEnum.Attribute9.index();
    public static final int ATTRIBUTE10 = AttributesEnum.Attribute10.index();
    public static final int ATTRIBUTE11 = AttributesEnum.Attribute11.index();
    public static final int ATTRIBUTE12 = AttributesEnum.Attribute12.index();
    public static final int ATTRIBUTE13 = AttributesEnum.Attribute13.index();
    public static final int ATTRIBUTE14 = AttributesEnum.Attribute14.index();
    public static final int ATTRIBUTE15 = AttributesEnum.Attribute15.index();
    public static final int EXTATTRIBUTECATEGORY = AttributesEnum.ExtAttributeCategory.index();
    public static final int EXTATTRIBUTE1 = AttributesEnum.ExtAttribute1.index();
    public static final int EXTATTRIBUTE2 = AttributesEnum.ExtAttribute2.index();
    public static final int EXTATTRIBUTE3 = AttributesEnum.ExtAttribute3.index();
    public static final int EXTATTRIBUTE4 = AttributesEnum.ExtAttribute4.index();
    public static final int EXTATTRIBUTE5 = AttributesEnum.ExtAttribute5.index();
    public static final int EXTATTRIBUTE6 = AttributesEnum.ExtAttribute6.index();
    public static final int EXTATTRIBUTE7 = AttributesEnum.ExtAttribute7.index();
    public static final int EXTATTRIBUTE8 = AttributesEnum.ExtAttribute8.index();
    public static final int EXTATTRIBUTE9 = AttributesEnum.ExtAttribute9.index();
    public static final int EXTATTRIBUTE10 = AttributesEnum.ExtAttribute10.index();
    public static final int EXTATTRIBUTE11 = AttributesEnum.ExtAttribute11.index();
    public static final int EXTATTRIBUTE12 = AttributesEnum.ExtAttribute12.index();
    public static final int EXTATTRIBUTE13 = AttributesEnum.ExtAttribute13.index();
    public static final int EXTATTRIBUTE14 = AttributesEnum.ExtAttribute14.index();
    public static final int EXTATTRIBUTE15 = AttributesEnum.ExtAttribute15.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MALookupTypesEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("ma.oracle.apps.cx.realestate.setup.entities.MALookupTypesEO");
    }

    /**
     * Gets the attribute value for LookupId, using the alias name LookupId.
     * @return the value of LookupId
     */
    public Number getLookupId() {
        return (Number) getAttributeInternal(LOOKUPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LookupId.
     * @param value value to set the LookupId
     */
    public void setLookupId(Number value) {
        setAttributeInternal(LOOKUPID, value);
    }

    /**
     * Gets the attribute value for LookupType, using the alias name LookupType.
     * @return the value of LookupType
     */
    public String getLookupType() {
        return (String) getAttributeInternal(LOOKUPTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LookupType.
     * @param value value to set the LookupType
     */
    public void setLookupType(String value) {
        setAttributeInternal(LOOKUPTYPE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the value of CreationDate
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the value of LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateDate.
     * @param value value to set the LastUpdateDate
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdateLogin, using the alias name LastUpdateLogin.
     * @return the value of LastUpdateLogin
     */
    public Number getLastUpdateLogin() {
        return (Number) getAttributeInternal(LASTUPDATELOGIN);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateLogin.
     * @param value value to set the LastUpdateLogin
     */
    public void setLastUpdateLogin(Number value) {
        setAttributeInternal(LASTUPDATELOGIN, value);
    }

    /**
     * Gets the attribute value for AttributeCategory, using the alias name AttributeCategory.
     * @return the value of AttributeCategory
     */
    public String getAttributeCategory() {
        return (String) getAttributeInternal(ATTRIBUTECATEGORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for AttributeCategory.
     * @param value value to set the AttributeCategory
     */
    public void setAttributeCategory(String value) {
        setAttributeInternal(ATTRIBUTECATEGORY, value);
    }

    /**
     * Gets the attribute value for Attribute1, using the alias name Attribute1.
     * @return the value of Attribute1
     */
    public String getAttribute1() {
        return (String) getAttributeInternal(ATTRIBUTE1);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute1.
     * @param value value to set the Attribute1
     */
    public void setAttribute1(String value) {
        setAttributeInternal(ATTRIBUTE1, value);
    }

    /**
     * Gets the attribute value for Attribute2, using the alias name Attribute2.
     * @return the value of Attribute2
     */
    public String getAttribute2() {
        return (String) getAttributeInternal(ATTRIBUTE2);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute2.
     * @param value value to set the Attribute2
     */
    public void setAttribute2(String value) {
        setAttributeInternal(ATTRIBUTE2, value);
    }

    /**
     * Gets the attribute value for Attribute3, using the alias name Attribute3.
     * @return the value of Attribute3
     */
    public String getAttribute3() {
        return (String) getAttributeInternal(ATTRIBUTE3);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute3.
     * @param value value to set the Attribute3
     */
    public void setAttribute3(String value) {
        setAttributeInternal(ATTRIBUTE3, value);
    }

    /**
     * Gets the attribute value for Attribute4, using the alias name Attribute4.
     * @return the value of Attribute4
     */
    public String getAttribute4() {
        return (String) getAttributeInternal(ATTRIBUTE4);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute4.
     * @param value value to set the Attribute4
     */
    public void setAttribute4(String value) {
        setAttributeInternal(ATTRIBUTE4, value);
    }

    /**
     * Gets the attribute value for Attribute5, using the alias name Attribute5.
     * @return the value of Attribute5
     */
    public String getAttribute5() {
        return (String) getAttributeInternal(ATTRIBUTE5);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute5.
     * @param value value to set the Attribute5
     */
    public void setAttribute5(String value) {
        setAttributeInternal(ATTRIBUTE5, value);
    }

    /**
     * Gets the attribute value for Attribute6, using the alias name Attribute6.
     * @return the value of Attribute6
     */
    public String getAttribute6() {
        return (String) getAttributeInternal(ATTRIBUTE6);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute6.
     * @param value value to set the Attribute6
     */
    public void setAttribute6(String value) {
        setAttributeInternal(ATTRIBUTE6, value);
    }

    /**
     * Gets the attribute value for Attribute7, using the alias name Attribute7.
     * @return the value of Attribute7
     */
    public String getAttribute7() {
        return (String) getAttributeInternal(ATTRIBUTE7);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute7.
     * @param value value to set the Attribute7
     */
    public void setAttribute7(String value) {
        setAttributeInternal(ATTRIBUTE7, value);
    }

    /**
     * Gets the attribute value for Attribute8, using the alias name Attribute8.
     * @return the value of Attribute8
     */
    public String getAttribute8() {
        return (String) getAttributeInternal(ATTRIBUTE8);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute8.
     * @param value value to set the Attribute8
     */
    public void setAttribute8(String value) {
        setAttributeInternal(ATTRIBUTE8, value);
    }

    /**
     * Gets the attribute value for Attribute9, using the alias name Attribute9.
     * @return the value of Attribute9
     */
    public String getAttribute9() {
        return (String) getAttributeInternal(ATTRIBUTE9);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute9.
     * @param value value to set the Attribute9
     */
    public void setAttribute9(String value) {
        setAttributeInternal(ATTRIBUTE9, value);
    }

    /**
     * Gets the attribute value for Attribute10, using the alias name Attribute10.
     * @return the value of Attribute10
     */
    public String getAttribute10() {
        return (String) getAttributeInternal(ATTRIBUTE10);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute10.
     * @param value value to set the Attribute10
     */
    public void setAttribute10(String value) {
        setAttributeInternal(ATTRIBUTE10, value);
    }

    /**
     * Gets the attribute value for Attribute11, using the alias name Attribute11.
     * @return the value of Attribute11
     */
    public String getAttribute11() {
        return (String) getAttributeInternal(ATTRIBUTE11);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute11.
     * @param value value to set the Attribute11
     */
    public void setAttribute11(String value) {
        setAttributeInternal(ATTRIBUTE11, value);
    }

    /**
     * Gets the attribute value for Attribute12, using the alias name Attribute12.
     * @return the value of Attribute12
     */
    public String getAttribute12() {
        return (String) getAttributeInternal(ATTRIBUTE12);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute12.
     * @param value value to set the Attribute12
     */
    public void setAttribute12(String value) {
        setAttributeInternal(ATTRIBUTE12, value);
    }

    /**
     * Gets the attribute value for Attribute13, using the alias name Attribute13.
     * @return the value of Attribute13
     */
    public String getAttribute13() {
        return (String) getAttributeInternal(ATTRIBUTE13);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute13.
     * @param value value to set the Attribute13
     */
    public void setAttribute13(String value) {
        setAttributeInternal(ATTRIBUTE13, value);
    }

    /**
     * Gets the attribute value for Attribute14, using the alias name Attribute14.
     * @return the value of Attribute14
     */
    public String getAttribute14() {
        return (String) getAttributeInternal(ATTRIBUTE14);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute14.
     * @param value value to set the Attribute14
     */
    public void setAttribute14(String value) {
        setAttributeInternal(ATTRIBUTE14, value);
    }

    /**
     * Gets the attribute value for Attribute15, using the alias name Attribute15.
     * @return the value of Attribute15
     */
    public String getAttribute15() {
        return (String) getAttributeInternal(ATTRIBUTE15);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute15.
     * @param value value to set the Attribute15
     */
    public void setAttribute15(String value) {
        setAttributeInternal(ATTRIBUTE15, value);
    }

    /**
     * Gets the attribute value for ExtAttributeCategory, using the alias name ExtAttributeCategory.
     * @return the value of ExtAttributeCategory
     */
    public String getExtAttributeCategory() {
        return (String) getAttributeInternal(EXTATTRIBUTECATEGORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtAttributeCategory.
     * @param value value to set the ExtAttributeCategory
     */
    public void setExtAttributeCategory(String value) {
        setAttributeInternal(EXTATTRIBUTECATEGORY, value);
    }

    /**
     * Gets the attribute value for ExtAttribute1, using the alias name ExtAttribute1.
     * @return the value of ExtAttribute1
     */
    public String getExtAttribute1() {
        return (String) getAttributeInternal(EXTATTRIBUTE1);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtAttribute1.
     * @param value value to set the ExtAttribute1
     */
    public void setExtAttribute1(String value) {
        setAttributeInternal(EXTATTRIBUTE1, value);
    }

    /**
     * Gets the attribute value for ExtAttribute2, using the alias name ExtAttribute2.
     * @return the value of ExtAttribute2
     */
    public String getExtAttribute2() {
        return (String) getAttributeInternal(EXTATTRIBUTE2);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtAttribute2.
     * @param value value to set the ExtAttribute2
     */
    public void setExtAttribute2(String value) {
        setAttributeInternal(EXTATTRIBUTE2, value);
    }

    /**
     * Gets the attribute value for ExtAttribute3, using the alias name ExtAttribute3.
     * @return the value of ExtAttribute3
     */
    public String getExtAttribute3() {
        return (String) getAttributeInternal(EXTATTRIBUTE3);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtAttribute3.
     * @param value value to set the ExtAttribute3
     */
    public void setExtAttribute3(String value) {
        setAttributeInternal(EXTATTRIBUTE3, value);
    }

    /**
     * Gets the attribute value for ExtAttribute4, using the alias name ExtAttribute4.
     * @return the value of ExtAttribute4
     */
    public String getExtAttribute4() {
        return (String) getAttributeInternal(EXTATTRIBUTE4);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtAttribute4.
     * @param value value to set the ExtAttribute4
     */
    public void setExtAttribute4(String value) {
        setAttributeInternal(EXTATTRIBUTE4, value);
    }

    /**
     * Gets the attribute value for ExtAttribute5, using the alias name ExtAttribute5.
     * @return the value of ExtAttribute5
     */
    public String getExtAttribute5() {
        return (String) getAttributeInternal(EXTATTRIBUTE5);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtAttribute5.
     * @param value value to set the ExtAttribute5
     */
    public void setExtAttribute5(String value) {
        setAttributeInternal(EXTATTRIBUTE5, value);
    }

    /**
     * Gets the attribute value for ExtAttribute6, using the alias name ExtAttribute6.
     * @return the value of ExtAttribute6
     */
    public String getExtAttribute6() {
        return (String) getAttributeInternal(EXTATTRIBUTE6);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtAttribute6.
     * @param value value to set the ExtAttribute6
     */
    public void setExtAttribute6(String value) {
        setAttributeInternal(EXTATTRIBUTE6, value);
    }

    /**
     * Gets the attribute value for ExtAttribute7, using the alias name ExtAttribute7.
     * @return the value of ExtAttribute7
     */
    public String getExtAttribute7() {
        return (String) getAttributeInternal(EXTATTRIBUTE7);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtAttribute7.
     * @param value value to set the ExtAttribute7
     */
    public void setExtAttribute7(String value) {
        setAttributeInternal(EXTATTRIBUTE7, value);
    }

    /**
     * Gets the attribute value for ExtAttribute8, using the alias name ExtAttribute8.
     * @return the value of ExtAttribute8
     */
    public String getExtAttribute8() {
        return (String) getAttributeInternal(EXTATTRIBUTE8);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtAttribute8.
     * @param value value to set the ExtAttribute8
     */
    public void setExtAttribute8(String value) {
        setAttributeInternal(EXTATTRIBUTE8, value);
    }

    /**
     * Gets the attribute value for ExtAttribute9, using the alias name ExtAttribute9.
     * @return the value of ExtAttribute9
     */
    public String getExtAttribute9() {
        return (String) getAttributeInternal(EXTATTRIBUTE9);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtAttribute9.
     * @param value value to set the ExtAttribute9
     */
    public void setExtAttribute9(String value) {
        setAttributeInternal(EXTATTRIBUTE9, value);
    }

    /**
     * Gets the attribute value for ExtAttribute10, using the alias name ExtAttribute10.
     * @return the value of ExtAttribute10
     */
    public String getExtAttribute10() {
        return (String) getAttributeInternal(EXTATTRIBUTE10);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtAttribute10.
     * @param value value to set the ExtAttribute10
     */
    public void setExtAttribute10(String value) {
        setAttributeInternal(EXTATTRIBUTE10, value);
    }

    /**
     * Gets the attribute value for ExtAttribute11, using the alias name ExtAttribute11.
     * @return the value of ExtAttribute11
     */
    public String getExtAttribute11() {
        return (String) getAttributeInternal(EXTATTRIBUTE11);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtAttribute11.
     * @param value value to set the ExtAttribute11
     */
    public void setExtAttribute11(String value) {
        setAttributeInternal(EXTATTRIBUTE11, value);
    }

    /**
     * Gets the attribute value for ExtAttribute12, using the alias name ExtAttribute12.
     * @return the value of ExtAttribute12
     */
    public String getExtAttribute12() {
        return (String) getAttributeInternal(EXTATTRIBUTE12);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtAttribute12.
     * @param value value to set the ExtAttribute12
     */
    public void setExtAttribute12(String value) {
        setAttributeInternal(EXTATTRIBUTE12, value);
    }

    /**
     * Gets the attribute value for ExtAttribute13, using the alias name ExtAttribute13.
     * @return the value of ExtAttribute13
     */
    public String getExtAttribute13() {
        return (String) getAttributeInternal(EXTATTRIBUTE13);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtAttribute13.
     * @param value value to set the ExtAttribute13
     */
    public void setExtAttribute13(String value) {
        setAttributeInternal(EXTATTRIBUTE13, value);
    }

    /**
     * Gets the attribute value for ExtAttribute14, using the alias name ExtAttribute14.
     * @return the value of ExtAttribute14
     */
    public String getExtAttribute14() {
        return (String) getAttributeInternal(EXTATTRIBUTE14);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtAttribute14.
     * @param value value to set the ExtAttribute14
     */
    public void setExtAttribute14(String value) {
        setAttributeInternal(EXTATTRIBUTE14, value);
    }

    /**
     * Gets the attribute value for ExtAttribute15, using the alias name ExtAttribute15.
     * @return the value of ExtAttribute15
     */
    public String getExtAttribute15() {
        return (String) getAttributeInternal(EXTATTRIBUTE15);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtAttribute15.
     * @param value value to set the ExtAttribute15
     */
    public void setExtAttribute15(String value) {
        setAttributeInternal(EXTATTRIBUTE15, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }


    /**
     * @param lookupId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number lookupId) {
        return new Key(new Object[] { lookupId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl seq =
            new SequenceImpl("XXMA.XXMA_LOOKUPS_SEQ", getDBTransaction());
        setLookupId(seq.getSequenceNumber());
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}

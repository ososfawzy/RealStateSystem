package ma.oracle.apps.cx.realestate.building.views;

import java.math.BigDecimal;

import java.sql.Date;

import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Dec 17 13:04:26 EET 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MAParentBuildingTypeVVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        BuildingTypeId {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getBuildingTypeId();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ParentBuildingTypeId {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getParentBuildingTypeId();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        BuildingTypeName {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getBuildingTypeName();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CreatedBy {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CreationDate {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastUpdateLogin {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getLastUpdateLogin();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttributeCategory {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getIntAttributeCategory();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute1 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getIntAttribute1();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute2 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getIntAttribute2();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute3 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getIntAttribute3();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute4 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getIntAttribute4();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute5 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getIntAttribute5();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute6 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getIntAttribute6();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute7 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getIntAttribute7();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute8 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getIntAttribute8();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute9 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getIntAttribute9();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute10 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getIntAttribute10();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute11 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getIntAttribute11();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute12 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getIntAttribute12();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute13 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getIntAttribute13();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute14 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getIntAttribute14();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IntAttribute15 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getIntAttribute15();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttributeCategory {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getExtAttributeCategory();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute1 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getExtAttribute1();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute2 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getExtAttribute2();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute3 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getExtAttribute3();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute4 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getExtAttribute4();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute5 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getExtAttribute5();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute6 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getExtAttribute6();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute7 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getExtAttribute7();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute8 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getExtAttribute8();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute9 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getExtAttribute9();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute10 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getExtAttribute10();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute11 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getExtAttribute11();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute12 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getExtAttribute12();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute13 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getExtAttribute13();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute14 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getExtAttribute14();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute15 {
            public Object get(MAParentBuildingTypeVVORowImpl obj) {
                return obj.getExtAttribute15();
            }

            public void put(MAParentBuildingTypeVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(MAParentBuildingTypeVVORowImpl object);

        public abstract void put(MAParentBuildingTypeVVORowImpl object, Object value);

        public int index() {
            return MAParentBuildingTypeVVORowImpl.AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return MAParentBuildingTypeVVORowImpl.AttributesEnum.firstIndex() +
                   MAParentBuildingTypeVVORowImpl.AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = MAParentBuildingTypeVVORowImpl.AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int BUILDINGTYPEID = AttributesEnum.BuildingTypeId.index();
    public static final int PARENTBUILDINGTYPEID = AttributesEnum.ParentBuildingTypeId.index();
    public static final int BUILDINGTYPENAME = AttributesEnum.BuildingTypeName.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int INTATTRIBUTECATEGORY = AttributesEnum.IntAttributeCategory.index();
    public static final int INTATTRIBUTE1 = AttributesEnum.IntAttribute1.index();
    public static final int INTATTRIBUTE2 = AttributesEnum.IntAttribute2.index();
    public static final int INTATTRIBUTE3 = AttributesEnum.IntAttribute3.index();
    public static final int INTATTRIBUTE4 = AttributesEnum.IntAttribute4.index();
    public static final int INTATTRIBUTE5 = AttributesEnum.IntAttribute5.index();
    public static final int INTATTRIBUTE6 = AttributesEnum.IntAttribute6.index();
    public static final int INTATTRIBUTE7 = AttributesEnum.IntAttribute7.index();
    public static final int INTATTRIBUTE8 = AttributesEnum.IntAttribute8.index();
    public static final int INTATTRIBUTE9 = AttributesEnum.IntAttribute9.index();
    public static final int INTATTRIBUTE10 = AttributesEnum.IntAttribute10.index();
    public static final int INTATTRIBUTE11 = AttributesEnum.IntAttribute11.index();
    public static final int INTATTRIBUTE12 = AttributesEnum.IntAttribute12.index();
    public static final int INTATTRIBUTE13 = AttributesEnum.IntAttribute13.index();
    public static final int INTATTRIBUTE14 = AttributesEnum.IntAttribute14.index();
    public static final int INTATTRIBUTE15 = AttributesEnum.IntAttribute15.index();
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
    public MAParentBuildingTypeVVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute BuildingTypeId.
     * @return the BuildingTypeId
     */
    public Number getBuildingTypeId() {
        return (Number) getAttributeInternal(BUILDINGTYPEID);
    }

    /**
     * Gets the attribute value for the calculated attribute ParentBuildingTypeId.
     * @return the ParentBuildingTypeId
     */
    public Number getParentBuildingTypeId() {
        return (Number) getAttributeInternal(PARENTBUILDINGTYPEID);
    }

    /**
     * Gets the attribute value for the calculated attribute BuildingTypeName.
     * @return the BuildingTypeName
     */
    public String getBuildingTypeName() {
        return (String) getAttributeInternal(BUILDINGTYPENAME);
    }

    /**
     * Gets the attribute value for the calculated attribute CreatedBy.
     * @return the CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Gets the attribute value for the calculated attribute CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Gets the attribute value for the calculated attribute LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Gets the attribute value for the calculated attribute LastUpdateDate.
     * @return the LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Gets the attribute value for the calculated attribute LastUpdateLogin.
     * @return the LastUpdateLogin
     */
    public Number getLastUpdateLogin() {
        return (Number) getAttributeInternal(LASTUPDATELOGIN);
    }

    /**
     * Gets the attribute value for the calculated attribute IntAttributeCategory.
     * @return the IntAttributeCategory
     */
    public String getIntAttributeCategory() {
        return (String) getAttributeInternal(INTATTRIBUTECATEGORY);
    }

    /**
     * Gets the attribute value for the calculated attribute IntAttribute1.
     * @return the IntAttribute1
     */
    public String getIntAttribute1() {
        return (String) getAttributeInternal(INTATTRIBUTE1);
    }

    /**
     * Gets the attribute value for the calculated attribute IntAttribute2.
     * @return the IntAttribute2
     */
    public String getIntAttribute2() {
        return (String) getAttributeInternal(INTATTRIBUTE2);
    }

    /**
     * Gets the attribute value for the calculated attribute IntAttribute3.
     * @return the IntAttribute3
     */
    public String getIntAttribute3() {
        return (String) getAttributeInternal(INTATTRIBUTE3);
    }

    /**
     * Gets the attribute value for the calculated attribute IntAttribute4.
     * @return the IntAttribute4
     */
    public String getIntAttribute4() {
        return (String) getAttributeInternal(INTATTRIBUTE4);
    }

    /**
     * Gets the attribute value for the calculated attribute IntAttribute5.
     * @return the IntAttribute5
     */
    public String getIntAttribute5() {
        return (String) getAttributeInternal(INTATTRIBUTE5);
    }

    /**
     * Gets the attribute value for the calculated attribute IntAttribute6.
     * @return the IntAttribute6
     */
    public String getIntAttribute6() {
        return (String) getAttributeInternal(INTATTRIBUTE6);
    }

    /**
     * Gets the attribute value for the calculated attribute IntAttribute7.
     * @return the IntAttribute7
     */
    public String getIntAttribute7() {
        return (String) getAttributeInternal(INTATTRIBUTE7);
    }

    /**
     * Gets the attribute value for the calculated attribute IntAttribute8.
     * @return the IntAttribute8
     */
    public String getIntAttribute8() {
        return (String) getAttributeInternal(INTATTRIBUTE8);
    }

    /**
     * Gets the attribute value for the calculated attribute IntAttribute9.
     * @return the IntAttribute9
     */
    public String getIntAttribute9() {
        return (String) getAttributeInternal(INTATTRIBUTE9);
    }

    /**
     * Gets the attribute value for the calculated attribute IntAttribute10.
     * @return the IntAttribute10
     */
    public String getIntAttribute10() {
        return (String) getAttributeInternal(INTATTRIBUTE10);
    }

    /**
     * Gets the attribute value for the calculated attribute IntAttribute11.
     * @return the IntAttribute11
     */
    public String getIntAttribute11() {
        return (String) getAttributeInternal(INTATTRIBUTE11);
    }

    /**
     * Gets the attribute value for the calculated attribute IntAttribute12.
     * @return the IntAttribute12
     */
    public String getIntAttribute12() {
        return (String) getAttributeInternal(INTATTRIBUTE12);
    }

    /**
     * Gets the attribute value for the calculated attribute IntAttribute13.
     * @return the IntAttribute13
     */
    public String getIntAttribute13() {
        return (String) getAttributeInternal(INTATTRIBUTE13);
    }

    /**
     * Gets the attribute value for the calculated attribute IntAttribute14.
     * @return the IntAttribute14
     */
    public String getIntAttribute14() {
        return (String) getAttributeInternal(INTATTRIBUTE14);
    }

    /**
     * Gets the attribute value for the calculated attribute IntAttribute15.
     * @return the IntAttribute15
     */
    public String getIntAttribute15() {
        return (String) getAttributeInternal(INTATTRIBUTE15);
    }

    /**
     * Gets the attribute value for the calculated attribute ExtAttributeCategory.
     * @return the ExtAttributeCategory
     */
    public String getExtAttributeCategory() {
        return (String) getAttributeInternal(EXTATTRIBUTECATEGORY);
    }

    /**
     * Gets the attribute value for the calculated attribute ExtAttribute1.
     * @return the ExtAttribute1
     */
    public String getExtAttribute1() {
        return (String) getAttributeInternal(EXTATTRIBUTE1);
    }

    /**
     * Gets the attribute value for the calculated attribute ExtAttribute2.
     * @return the ExtAttribute2
     */
    public String getExtAttribute2() {
        return (String) getAttributeInternal(EXTATTRIBUTE2);
    }

    /**
     * Gets the attribute value for the calculated attribute ExtAttribute3.
     * @return the ExtAttribute3
     */
    public String getExtAttribute3() {
        return (String) getAttributeInternal(EXTATTRIBUTE3);
    }

    /**
     * Gets the attribute value for the calculated attribute ExtAttribute4.
     * @return the ExtAttribute4
     */
    public String getExtAttribute4() {
        return (String) getAttributeInternal(EXTATTRIBUTE4);
    }

    /**
     * Gets the attribute value for the calculated attribute ExtAttribute5.
     * @return the ExtAttribute5
     */
    public String getExtAttribute5() {
        return (String) getAttributeInternal(EXTATTRIBUTE5);
    }

    /**
     * Gets the attribute value for the calculated attribute ExtAttribute6.
     * @return the ExtAttribute6
     */
    public String getExtAttribute6() {
        return (String) getAttributeInternal(EXTATTRIBUTE6);
    }

    /**
     * Gets the attribute value for the calculated attribute ExtAttribute7.
     * @return the ExtAttribute7
     */
    public String getExtAttribute7() {
        return (String) getAttributeInternal(EXTATTRIBUTE7);
    }

    /**
     * Gets the attribute value for the calculated attribute ExtAttribute8.
     * @return the ExtAttribute8
     */
    public String getExtAttribute8() {
        return (String) getAttributeInternal(EXTATTRIBUTE8);
    }

    /**
     * Gets the attribute value for the calculated attribute ExtAttribute9.
     * @return the ExtAttribute9
     */
    public String getExtAttribute9() {
        return (String) getAttributeInternal(EXTATTRIBUTE9);
    }

    /**
     * Gets the attribute value for the calculated attribute ExtAttribute10.
     * @return the ExtAttribute10
     */
    public String getExtAttribute10() {
        return (String) getAttributeInternal(EXTATTRIBUTE10);
    }

    /**
     * Gets the attribute value for the calculated attribute ExtAttribute11.
     * @return the ExtAttribute11
     */
    public String getExtAttribute11() {
        return (String) getAttributeInternal(EXTATTRIBUTE11);
    }

    /**
     * Gets the attribute value for the calculated attribute ExtAttribute12.
     * @return the ExtAttribute12
     */
    public String getExtAttribute12() {
        return (String) getAttributeInternal(EXTATTRIBUTE12);
    }

    /**
     * Gets the attribute value for the calculated attribute ExtAttribute13.
     * @return the ExtAttribute13
     */
    public String getExtAttribute13() {
        return (String) getAttributeInternal(EXTATTRIBUTE13);
    }

    /**
     * Gets the attribute value for the calculated attribute ExtAttribute14.
     * @return the ExtAttribute14
     */
    public String getExtAttribute14() {
        return (String) getAttributeInternal(EXTATTRIBUTE14);
    }

    /**
     * Gets the attribute value for the calculated attribute ExtAttribute15.
     * @return the ExtAttribute15
     */
    public String getExtAttribute15() {
        return (String) getAttributeInternal(EXTATTRIBUTE15);
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
}

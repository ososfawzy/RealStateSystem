package ma.oracle.apps.cx.realestate.lease.views;

import ma.oracle.apps.cx.realestate.lease.entities.MARSLeasePropertyEOImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jun 06 15:06:24 EEST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MARSUpdateLeasePropertyVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Attribute1 {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getAttribute1();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setAttribute1((String)value);
            }
        }
        ,
        Attribute10 {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getAttribute10();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setAttribute10((String)value);
            }
        }
        ,
        Attribute11 {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getAttribute11();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setAttribute11((String)value);
            }
        }
        ,
        Attribute12 {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getAttribute12();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setAttribute12((String)value);
            }
        }
        ,
        Attribute13 {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getAttribute13();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setAttribute13((String)value);
            }
        }
        ,
        Attribute14 {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getAttribute14();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setAttribute14((String)value);
            }
        }
        ,
        Attribute15 {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getAttribute15();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setAttribute15((String)value);
            }
        }
        ,
        Attribute2 {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getAttribute2();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setAttribute2((String)value);
            }
        }
        ,
        Attribute3 {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getAttribute3();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setAttribute3((String)value);
            }
        }
        ,
        Attribute4 {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getAttribute4();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setAttribute4((String)value);
            }
        }
        ,
        Attribute5 {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getAttribute5();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setAttribute5((String)value);
            }
        }
        ,
        Attribute6 {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getAttribute6();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setAttribute6((String)value);
            }
        }
        ,
        Attribute7 {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getAttribute7();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setAttribute7((String)value);
            }
        }
        ,
        Attribute8 {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getAttribute8();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setAttribute8((String)value);
            }
        }
        ,
        Attribute9 {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getAttribute9();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setAttribute9((String)value);
            }
        }
        ,
        AttributeCategory {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getAttributeCategory();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setAttributeCategory((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        EndDate {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getEndDate();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setEndDate((Date)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setLastUpdateDate((Date)value);
            }
        }
        ,
        LastUpdateLogin {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getLastUpdateLogin();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setLastUpdateLogin((Number)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        LeaseId {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getLeaseId();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setLeaseId((Number)value);
            }
        }
        ,
        OpportunityId {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getOpportunityId();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setOpportunityId((Number)value);
            }
        }
        ,
        PropLeaseId {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getPropLeaseId();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setPropLeaseId((Number)value);
            }
        }
        ,
        PropertyId {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getPropertyId();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setPropertyId((Number)value);
            }
        }
        ,
        StartDate {
            public Object get(MARSUpdateLeasePropertyVORowImpl obj) {
                return obj.getStartDate();
            }

            public void put(MARSUpdateLeasePropertyVORowImpl obj,
                            Object value) {
                obj.setStartDate((Date)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(MARSUpdateLeasePropertyVORowImpl object);

        public abstract void put(MARSUpdateLeasePropertyVORowImpl object,
                                 Object value);

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
    public static final int ATTRIBUTE1 = AttributesEnum.Attribute1.index();
    public static final int ATTRIBUTE10 = AttributesEnum.Attribute10.index();
    public static final int ATTRIBUTE11 = AttributesEnum.Attribute11.index();
    public static final int ATTRIBUTE12 = AttributesEnum.Attribute12.index();
    public static final int ATTRIBUTE13 = AttributesEnum.Attribute13.index();
    public static final int ATTRIBUTE14 = AttributesEnum.Attribute14.index();
    public static final int ATTRIBUTE15 = AttributesEnum.Attribute15.index();
    public static final int ATTRIBUTE2 = AttributesEnum.Attribute2.index();
    public static final int ATTRIBUTE3 = AttributesEnum.Attribute3.index();
    public static final int ATTRIBUTE4 = AttributesEnum.Attribute4.index();
    public static final int ATTRIBUTE5 = AttributesEnum.Attribute5.index();
    public static final int ATTRIBUTE6 = AttributesEnum.Attribute6.index();
    public static final int ATTRIBUTE7 = AttributesEnum.Attribute7.index();
    public static final int ATTRIBUTE8 = AttributesEnum.Attribute8.index();
    public static final int ATTRIBUTE9 = AttributesEnum.Attribute9.index();
    public static final int ATTRIBUTECATEGORY = AttributesEnum.AttributeCategory.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LEASEID = AttributesEnum.LeaseId.index();
    public static final int OPPORTUNITYID = AttributesEnum.OpportunityId.index();
    public static final int PROPLEASEID = AttributesEnum.PropLeaseId.index();
    public static final int PROPERTYID = AttributesEnum.PropertyId.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MARSUpdateLeasePropertyVORowImpl() {
    }

    /**
     * Gets MARSLeasePropertyEO entity object.
     * @return the MARSLeasePropertyEO
     */
    public MARSLeasePropertyEOImpl getMARSLeasePropertyEO() {
        return (MARSLeasePropertyEOImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for ATTRIBUTE1 using the alias name Attribute1.
     * @return the ATTRIBUTE1
     */
    public String getAttribute1() {
        return (String) getAttributeInternal(ATTRIBUTE1);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE1 using the alias name Attribute1.
     * @param value value to set the ATTRIBUTE1
     */
    public void setAttribute1(String value) {
        setAttributeInternal(ATTRIBUTE1, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE10 using the alias name Attribute10.
     * @return the ATTRIBUTE10
     */
    public String getAttribute10() {
        return (String) getAttributeInternal(ATTRIBUTE10);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE10 using the alias name Attribute10.
     * @param value value to set the ATTRIBUTE10
     */
    public void setAttribute10(String value) {
        setAttributeInternal(ATTRIBUTE10, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE11 using the alias name Attribute11.
     * @return the ATTRIBUTE11
     */
    public String getAttribute11() {
        return (String) getAttributeInternal(ATTRIBUTE11);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE11 using the alias name Attribute11.
     * @param value value to set the ATTRIBUTE11
     */
    public void setAttribute11(String value) {
        setAttributeInternal(ATTRIBUTE11, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE12 using the alias name Attribute12.
     * @return the ATTRIBUTE12
     */
    public String getAttribute12() {
        return (String) getAttributeInternal(ATTRIBUTE12);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE12 using the alias name Attribute12.
     * @param value value to set the ATTRIBUTE12
     */
    public void setAttribute12(String value) {
        setAttributeInternal(ATTRIBUTE12, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE13 using the alias name Attribute13.
     * @return the ATTRIBUTE13
     */
    public String getAttribute13() {
        return (String) getAttributeInternal(ATTRIBUTE13);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE13 using the alias name Attribute13.
     * @param value value to set the ATTRIBUTE13
     */
    public void setAttribute13(String value) {
        setAttributeInternal(ATTRIBUTE13, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE14 using the alias name Attribute14.
     * @return the ATTRIBUTE14
     */
    public String getAttribute14() {
        return (String) getAttributeInternal(ATTRIBUTE14);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE14 using the alias name Attribute14.
     * @param value value to set the ATTRIBUTE14
     */
    public void setAttribute14(String value) {
        setAttributeInternal(ATTRIBUTE14, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE15 using the alias name Attribute15.
     * @return the ATTRIBUTE15
     */
    public String getAttribute15() {
        return (String) getAttributeInternal(ATTRIBUTE15);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE15 using the alias name Attribute15.
     * @param value value to set the ATTRIBUTE15
     */
    public void setAttribute15(String value) {
        setAttributeInternal(ATTRIBUTE15, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE2 using the alias name Attribute2.
     * @return the ATTRIBUTE2
     */
    public String getAttribute2() {
        return (String) getAttributeInternal(ATTRIBUTE2);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE2 using the alias name Attribute2.
     * @param value value to set the ATTRIBUTE2
     */
    public void setAttribute2(String value) {
        setAttributeInternal(ATTRIBUTE2, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE3 using the alias name Attribute3.
     * @return the ATTRIBUTE3
     */
    public String getAttribute3() {
        return (String) getAttributeInternal(ATTRIBUTE3);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE3 using the alias name Attribute3.
     * @param value value to set the ATTRIBUTE3
     */
    public void setAttribute3(String value) {
        setAttributeInternal(ATTRIBUTE3, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE4 using the alias name Attribute4.
     * @return the ATTRIBUTE4
     */
    public String getAttribute4() {
        return (String) getAttributeInternal(ATTRIBUTE4);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE4 using the alias name Attribute4.
     * @param value value to set the ATTRIBUTE4
     */
    public void setAttribute4(String value) {
        setAttributeInternal(ATTRIBUTE4, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE5 using the alias name Attribute5.
     * @return the ATTRIBUTE5
     */
    public String getAttribute5() {
        return (String) getAttributeInternal(ATTRIBUTE5);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE5 using the alias name Attribute5.
     * @param value value to set the ATTRIBUTE5
     */
    public void setAttribute5(String value) {
        setAttributeInternal(ATTRIBUTE5, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE6 using the alias name Attribute6.
     * @return the ATTRIBUTE6
     */
    public String getAttribute6() {
        return (String) getAttributeInternal(ATTRIBUTE6);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE6 using the alias name Attribute6.
     * @param value value to set the ATTRIBUTE6
     */
    public void setAttribute6(String value) {
        setAttributeInternal(ATTRIBUTE6, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE7 using the alias name Attribute7.
     * @return the ATTRIBUTE7
     */
    public String getAttribute7() {
        return (String) getAttributeInternal(ATTRIBUTE7);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE7 using the alias name Attribute7.
     * @param value value to set the ATTRIBUTE7
     */
    public void setAttribute7(String value) {
        setAttributeInternal(ATTRIBUTE7, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE8 using the alias name Attribute8.
     * @return the ATTRIBUTE8
     */
    public String getAttribute8() {
        return (String) getAttributeInternal(ATTRIBUTE8);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE8 using the alias name Attribute8.
     * @param value value to set the ATTRIBUTE8
     */
    public void setAttribute8(String value) {
        setAttributeInternal(ATTRIBUTE8, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE9 using the alias name Attribute9.
     * @return the ATTRIBUTE9
     */
    public String getAttribute9() {
        return (String) getAttributeInternal(ATTRIBUTE9);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE9 using the alias name Attribute9.
     * @param value value to set the ATTRIBUTE9
     */
    public void setAttribute9(String value) {
        setAttributeInternal(ATTRIBUTE9, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE_CATEGORY using the alias name AttributeCategory.
     * @return the ATTRIBUTE_CATEGORY
     */
    public String getAttributeCategory() {
        return (String) getAttributeInternal(ATTRIBUTECATEGORY);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE_CATEGORY using the alias name AttributeCategory.
     * @param value value to set the ATTRIBUTE_CATEGORY
     */
    public void setAttributeCategory(String value) {
        setAttributeInternal(ATTRIBUTECATEGORY, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public Number getCreatedBy() {
        return (Number)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for END_DATE using the alias name EndDate.
     * @return the END_DATE
     */
    public Date getEndDate() {
        return (Date)getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for END_DATE using the alias name EndDate.
     * @param value value to set the END_DATE
     */
    public void setEndDate(Date value) {
        setAttributeInternal(ENDDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Date getLastUpdateDate() {
        return (Date)getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @param value value to set the LAST_UPDATE_DATE
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin.
     * @return the LAST_UPDATE_LOGIN
     */
    public Number getLastUpdateLogin() {
        return (Number)getAttributeInternal(LASTUPDATELOGIN);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin.
     * @param value value to set the LAST_UPDATE_LOGIN
     */
    public void setLastUpdateLogin(Number value) {
        setAttributeInternal(LASTUPDATELOGIN, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public Number getLastUpdatedBy() {
        return (Number)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LEASE_ID using the alias name LeaseId.
     * @return the LEASE_ID
     */
    public Number getLeaseId() {
        return (Number)getAttributeInternal(LEASEID);
    }

    /**
     * Sets <code>value</code> as attribute value for LEASE_ID using the alias name LeaseId.
     * @param value value to set the LEASE_ID
     */
    public void setLeaseId(Number value) {
        setAttributeInternal(LEASEID, value);
    }

    /**
     * Gets the attribute value for OPPORTUNITY_ID using the alias name OpportunityId.
     * @return the OPPORTUNITY_ID
     */
    public Number getOpportunityId() {
        return (Number)getAttributeInternal(OPPORTUNITYID);
    }

    /**
     * Sets <code>value</code> as attribute value for OPPORTUNITY_ID using the alias name OpportunityId.
     * @param value value to set the OPPORTUNITY_ID
     */
    public void setOpportunityId(Number value) {
        setAttributeInternal(OPPORTUNITYID, value);
    }

    /**
     * Gets the attribute value for PROP_LEASE_ID using the alias name PropLeaseId.
     * @return the PROP_LEASE_ID
     */
    public Number getPropLeaseId() {
        return (Number)getAttributeInternal(PROPLEASEID);
    }

    /**
     * Sets <code>value</code> as attribute value for PROP_LEASE_ID using the alias name PropLeaseId.
     * @param value value to set the PROP_LEASE_ID
     */
    public void setPropLeaseId(Number value) {
        setAttributeInternal(PROPLEASEID, value);
    }

    /**
     * Gets the attribute value for PROPERTY_ID using the alias name PropertyId.
     * @return the PROPERTY_ID
     */
    public Number getPropertyId() {
        return (Number)getAttributeInternal(PROPERTYID);
    }

    /**
     * Sets <code>value</code> as attribute value for PROPERTY_ID using the alias name PropertyId.
     * @param value value to set the PROPERTY_ID
     */
    public void setPropertyId(Number value) {
        setAttributeInternal(PROPERTYID, value);
    }

    /**
     * Gets the attribute value for START_DATE using the alias name StartDate.
     * @return the START_DATE
     */
    public Date getStartDate() {
        return (Date)getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for START_DATE using the alias name StartDate.
     * @param value value to set the START_DATE
     */
    public void setStartDate(Date value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
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
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}

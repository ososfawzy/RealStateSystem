package ma.oracle.apps.cx.realestate.property.views;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed May 02 14:05:23 EEST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MAPropertyDuplexVVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        LookupCode {
            public Object get(MAPropertyDuplexVVORowImpl obj) {
                return obj.getLookupCode();
            }

            public void put(MAPropertyDuplexVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PropertyDuplex {
            public Object get(MAPropertyDuplexVVORowImpl obj) {
                return obj.getPropertyDuplex();
            }

            public void put(MAPropertyDuplexVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LookupType {
            public Object get(MAPropertyDuplexVVORowImpl obj) {
                return obj.getLookupType();
            }

            public void put(MAPropertyDuplexVVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(MAPropertyDuplexVVORowImpl object);

        public abstract void put(MAPropertyDuplexVVORowImpl object,
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


    public static final int LOOKUPCODE = AttributesEnum.LookupCode.index();
    public static final int PROPERTYDUPLEX = AttributesEnum.PropertyDuplex.index();
    public static final int LOOKUPTYPE = AttributesEnum.LookupType.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MAPropertyDuplexVVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute LookupCode.
     * @return the LookupCode
     */
    public String getLookupCode() {
        return (String) getAttributeInternal(LOOKUPCODE);
    }


    /**
     * Gets the attribute value for the calculated attribute PropertyDuplex.
     * @return the PropertyDuplex
     */
    public String getPropertyDuplex() {
        return (String) getAttributeInternal(PROPERTYDUPLEX);
    }


    /**
     * Gets the attribute value for the calculated attribute LookupType.
     * @return the LookupType
     */
    public String getLookupType() {
        return (String) getAttributeInternal(LOOKUPTYPE);
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
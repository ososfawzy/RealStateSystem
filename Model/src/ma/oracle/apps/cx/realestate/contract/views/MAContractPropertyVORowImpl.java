package ma.oracle.apps.cx.realestate.contract.views;

import java.math.BigDecimal;

import java.sql.Date;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Dec 17 15:20:36 EET 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MAContractPropertyVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        PropertyId {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ParentPropertyId {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PropertySegment {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PropertyName {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        BlockBuldingName {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        FloorNumber {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PropertyStatus {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        StartDate {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        EndDate {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        AvailableForRentFlag {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UnitNumber {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UnitSqMt {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        NumberOfRooms {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        NumberOfBathrooms {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        NumberOfParkings {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        DuplexFlag {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        RentAmount {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Comments {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastLeasedAmount {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LocationX {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LocationY {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PropertyCountry {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PropertyCity {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PropertyRegion {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ContractId {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        IsDeletedFlag {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PropertySite {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CreatedBy {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CreationDate {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastUpdateLogin {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        AttributeCategory {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Attribute1 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Attribute2 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Attribute3 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Attribute4 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Attribute5 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Attribute6 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Attribute7 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Attribute8 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Attribute9 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Attribute10 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Attribute11 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Attribute12 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Attribute13 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Attribute14 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Attribute15 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttributeCategory {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute1 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute2 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute3 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute4 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute5 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute6 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute7 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute8 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute9 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute10 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute11 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute12 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute13 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute14 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExtAttribute15 {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        TypeId {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ParentTypeId {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        BuildingId {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PropertyPrice {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PropertyCode {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PropertyActivity {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PropertyPattern {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Status {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ElectricMeter {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        WaterMeter {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        EstimatedDeliveryDate {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        FurnishedFlag {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        AcFlag {
            public Object get(MAContractPropertyVORowImpl obj) {
                return obj.getAttributeInternal(index());
            }

            public void put(MAContractPropertyVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(MAContractPropertyVORowImpl object);

        public abstract void put(MAContractPropertyVORowImpl object, Object value);

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
    public static final int PROPERTYID = AttributesEnum.PropertyId.index();
    public static final int PARENTPROPERTYID = AttributesEnum.ParentPropertyId.index();
    public static final int PROPERTYSEGMENT = AttributesEnum.PropertySegment.index();
    public static final int PROPERTYNAME = AttributesEnum.PropertyName.index();
    public static final int BLOCKBULDINGNAME = AttributesEnum.BlockBuldingName.index();
    public static final int FLOORNUMBER = AttributesEnum.FloorNumber.index();
    public static final int PROPERTYSTATUS = AttributesEnum.PropertyStatus.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int AVAILABLEFORRENTFLAG = AttributesEnum.AvailableForRentFlag.index();
    public static final int UNITNUMBER = AttributesEnum.UnitNumber.index();
    public static final int UNITSQMT = AttributesEnum.UnitSqMt.index();
    public static final int NUMBEROFROOMS = AttributesEnum.NumberOfRooms.index();
    public static final int NUMBEROFBATHROOMS = AttributesEnum.NumberOfBathrooms.index();
    public static final int NUMBEROFPARKINGS = AttributesEnum.NumberOfParkings.index();
    public static final int DUPLEXFLAG = AttributesEnum.DuplexFlag.index();
    public static final int RENTAMOUNT = AttributesEnum.RentAmount.index();
    public static final int COMMENTS = AttributesEnum.Comments.index();
    public static final int LASTLEASEDAMOUNT = AttributesEnum.LastLeasedAmount.index();
    public static final int LOCATIONX = AttributesEnum.LocationX.index();
    public static final int LOCATIONY = AttributesEnum.LocationY.index();
    public static final int PROPERTYCOUNTRY = AttributesEnum.PropertyCountry.index();
    public static final int PROPERTYCITY = AttributesEnum.PropertyCity.index();
    public static final int PROPERTYREGION = AttributesEnum.PropertyRegion.index();
    public static final int CONTRACTID = AttributesEnum.ContractId.index();
    public static final int ISDELETEDFLAG = AttributesEnum.IsDeletedFlag.index();
    public static final int PROPERTYSITE = AttributesEnum.PropertySite.index();
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
    public static final int TYPEID = AttributesEnum.TypeId.index();
    public static final int PARENTTYPEID = AttributesEnum.ParentTypeId.index();
    public static final int BUILDINGID = AttributesEnum.BuildingId.index();
    public static final int PROPERTYPRICE = AttributesEnum.PropertyPrice.index();
    public static final int PROPERTYCODE = AttributesEnum.PropertyCode.index();
    public static final int PROPERTYACTIVITY = AttributesEnum.PropertyActivity.index();
    public static final int PROPERTYPATTERN = AttributesEnum.PropertyPattern.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int ELECTRICMETER = AttributesEnum.ElectricMeter.index();
    public static final int WATERMETER = AttributesEnum.WaterMeter.index();
    public static final int ESTIMATEDDELIVERYDATE = AttributesEnum.EstimatedDeliveryDate.index();
    public static final int FURNISHEDFLAG = AttributesEnum.FurnishedFlag.index();
    public static final int ACFLAG = AttributesEnum.AcFlag.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MAContractPropertyVORowImpl() {
    }
}

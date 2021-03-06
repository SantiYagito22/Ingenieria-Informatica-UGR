/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class operacionVectores implements org.apache.thrift.TBase<operacionVectores, operacionVectores._Fields>, java.io.Serializable, Cloneable, Comparable<operacionVectores> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("operacionVectores");

  private static final org.apache.thrift.protocol.TField V1_FIELD_DESC = new org.apache.thrift.protocol.TField("v1", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField V2_FIELD_DESC = new org.apache.thrift.protocol.TField("v2", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new operacionVectoresStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new operacionVectoresTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<Double> v1; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<Double> v2; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    V1((short)1, "v1"),
    V2((short)2, "v2");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // V1
          return V1;
        case 2: // V2
          return V2;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.V1, new org.apache.thrift.meta_data.FieldMetaData("v1", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.V2, new org.apache.thrift.meta_data.FieldMetaData("v2", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(operacionVectores.class, metaDataMap);
  }

  public operacionVectores() {
  }

  public operacionVectores(
    java.util.List<Double> v1,
    java.util.List<Double> v2)
  {
    this();
    this.v1 = v1;
    this.v2 = v2;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public operacionVectores(operacionVectores other) {
    if (other.isSetV1()) {
      java.util.List<Double> __this__v1 = new java.util.ArrayList<Double>(other.v1);
      this.v1 = __this__v1;
    }
    if (other.isSetV2()) {
      java.util.List<Double> __this__v2 = new java.util.ArrayList<Double>(other.v2);
      this.v2 = __this__v2;
    }
  }

  public operacionVectores deepCopy() {
    return new operacionVectores(this);
  }

  @Override
  public void clear() {
    this.v1 = null;
    this.v2 = null;
  }

  public int getV1Size() {
    return (this.v1 == null) ? 0 : this.v1.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<Double> getV1Iterator() {
    return (this.v1 == null) ? null : this.v1.iterator();
  }

  public void addToV1(double elem) {
    if (this.v1 == null) {
      this.v1 = new java.util.ArrayList<Double>();
    }
    this.v1.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<Double> getV1() {
    return this.v1;
  }

  public operacionVectores setV1(@org.apache.thrift.annotation.Nullable java.util.List<Double> v1) {
    this.v1 = v1;
    return this;
  }

  public void unsetV1() {
    this.v1 = null;
  }

  /** Returns true if field v1 is set (has been assigned a value) and false otherwise */
  public boolean isSetV1() {
    return this.v1 != null;
  }

  public void setV1IsSet(boolean value) {
    if (!value) {
      this.v1 = null;
    }
  }

  public int getV2Size() {
    return (this.v2 == null) ? 0 : this.v2.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<Double> getV2Iterator() {
    return (this.v2 == null) ? null : this.v2.iterator();
  }

  public void addToV2(double elem) {
    if (this.v2 == null) {
      this.v2 = new java.util.ArrayList<Double>();
    }
    this.v2.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<Double> getV2() {
    return this.v2;
  }

  public operacionVectores setV2(@org.apache.thrift.annotation.Nullable java.util.List<Double> v2) {
    this.v2 = v2;
    return this;
  }

  public void unsetV2() {
    this.v2 = null;
  }

  /** Returns true if field v2 is set (has been assigned a value) and false otherwise */
  public boolean isSetV2() {
    return this.v2 != null;
  }

  public void setV2IsSet(boolean value) {
    if (!value) {
      this.v2 = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable Object value) {
    switch (field) {
    case V1:
      if (value == null) {
        unsetV1();
      } else {
        setV1((java.util.List<Double>)value);
      }
      break;

    case V2:
      if (value == null) {
        unsetV2();
      } else {
        setV2((java.util.List<Double>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case V1:
      return getV1();

    case V2:
      return getV2();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case V1:
      return isSetV1();
    case V2:
      return isSetV2();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof operacionVectores)
      return this.equals((operacionVectores)that);
    return false;
  }

  public boolean equals(operacionVectores that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_v1 = true && this.isSetV1();
    boolean that_present_v1 = true && that.isSetV1();
    if (this_present_v1 || that_present_v1) {
      if (!(this_present_v1 && that_present_v1))
        return false;
      if (!this.v1.equals(that.v1))
        return false;
    }

    boolean this_present_v2 = true && this.isSetV2();
    boolean that_present_v2 = true && that.isSetV2();
    if (this_present_v2 || that_present_v2) {
      if (!(this_present_v2 && that_present_v2))
        return false;
      if (!this.v2.equals(that.v2))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetV1()) ? 131071 : 524287);
    if (isSetV1())
      hashCode = hashCode * 8191 + v1.hashCode();

    hashCode = hashCode * 8191 + ((isSetV2()) ? 131071 : 524287);
    if (isSetV2())
      hashCode = hashCode * 8191 + v2.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(operacionVectores other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetV1()).compareTo(other.isSetV1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetV1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.v1, other.v1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetV2()).compareTo(other.isSetV2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetV2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.v2, other.v2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("operacionVectores(");
    boolean first = true;

    sb.append("v1:");
    if (this.v1 == null) {
      sb.append("null");
    } else {
      sb.append(this.v1);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("v2:");
    if (this.v2 == null) {
      sb.append("null");
    } else {
      sb.append(this.v2);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class operacionVectoresStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public operacionVectoresStandardScheme getScheme() {
      return new operacionVectoresStandardScheme();
    }
  }

  private static class operacionVectoresStandardScheme extends org.apache.thrift.scheme.StandardScheme<operacionVectores> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, operacionVectores struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // V1
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.v1 = new java.util.ArrayList<Double>(_list0.size);
                double _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readDouble();
                  struct.v1.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setV1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // V2
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.v2 = new java.util.ArrayList<Double>(_list3.size);
                double _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = iprot.readDouble();
                  struct.v2.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setV2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, operacionVectores struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.v1 != null) {
        oprot.writeFieldBegin(V1_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, struct.v1.size()));
          for (double _iter6 : struct.v1)
          {
            oprot.writeDouble(_iter6);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.v2 != null) {
        oprot.writeFieldBegin(V2_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, struct.v2.size()));
          for (double _iter7 : struct.v2)
          {
            oprot.writeDouble(_iter7);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class operacionVectoresTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public operacionVectoresTupleScheme getScheme() {
      return new operacionVectoresTupleScheme();
    }
  }

  private static class operacionVectoresTupleScheme extends org.apache.thrift.scheme.TupleScheme<operacionVectores> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, operacionVectores struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetV1()) {
        optionals.set(0);
      }
      if (struct.isSetV2()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetV1()) {
        {
          oprot.writeI32(struct.v1.size());
          for (double _iter8 : struct.v1)
          {
            oprot.writeDouble(_iter8);
          }
        }
      }
      if (struct.isSetV2()) {
        {
          oprot.writeI32(struct.v2.size());
          for (double _iter9 : struct.v2)
          {
            oprot.writeDouble(_iter9);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, operacionVectores struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list10 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
          struct.v1 = new java.util.ArrayList<Double>(_list10.size);
          double _elem11;
          for (int _i12 = 0; _i12 < _list10.size; ++_i12)
          {
            _elem11 = iprot.readDouble();
            struct.v1.add(_elem11);
          }
        }
        struct.setV1IsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
          struct.v2 = new java.util.ArrayList<Double>(_list13.size);
          double _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = iprot.readDouble();
            struct.v2.add(_elem14);
          }
        }
        struct.setV2IsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package one.show.manage.thrift.view;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MasterLevelView implements org.apache.thrift.TBase<MasterLevelView, MasterLevelView._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MasterLevelView");

  private static final org.apache.thrift.protocol.TField MASTER_LEVEL_FIELD_DESC = new org.apache.thrift.protocol.TField("masterLevel", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField EXP_FIELD_DESC = new org.apache.thrift.protocol.TField("exp", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField PIC_FIELD_DESC = new org.apache.thrift.protocol.TField("pic", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField LEVEL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("levelName", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MasterLevelViewStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MasterLevelViewTupleSchemeFactory());
  }

  public int masterLevel; // required
  public long exp; // required
  public String pic; // required
  public String levelName; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MASTER_LEVEL((short)1, "masterLevel"),
    EXP((short)2, "exp"),
    PIC((short)3, "pic"),
    LEVEL_NAME((short)4, "levelName");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MASTER_LEVEL
          return MASTER_LEVEL;
        case 2: // EXP
          return EXP;
        case 3: // PIC
          return PIC;
        case 4: // LEVEL_NAME
          return LEVEL_NAME;
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
  private static final int __MASTERLEVEL_ISSET_ID = 0;
  private static final int __EXP_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MASTER_LEVEL, new org.apache.thrift.meta_data.FieldMetaData("masterLevel", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EXP, new org.apache.thrift.meta_data.FieldMetaData("exp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PIC, new org.apache.thrift.meta_data.FieldMetaData("pic", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LEVEL_NAME, new org.apache.thrift.meta_data.FieldMetaData("levelName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MasterLevelView.class, metaDataMap);
  }

  public MasterLevelView() {
  }

  public MasterLevelView(
    int masterLevel,
    long exp,
    String pic,
    String levelName)
  {
    this();
    this.masterLevel = masterLevel;
    setMasterLevelIsSet(true);
    this.exp = exp;
    setExpIsSet(true);
    this.pic = pic;
    this.levelName = levelName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MasterLevelView(MasterLevelView other) {
    __isset_bitfield = other.__isset_bitfield;
    this.masterLevel = other.masterLevel;
    this.exp = other.exp;
    if (other.isSetPic()) {
      this.pic = other.pic;
    }
    if (other.isSetLevelName()) {
      this.levelName = other.levelName;
    }
  }

  public MasterLevelView deepCopy() {
    return new MasterLevelView(this);
  }

  @Override
  public void clear() {
    setMasterLevelIsSet(false);
    this.masterLevel = 0;
    setExpIsSet(false);
    this.exp = 0;
    this.pic = null;
    this.levelName = null;
  }

  public int getMasterLevel() {
    return this.masterLevel;
  }

  public MasterLevelView setMasterLevel(int masterLevel) {
    this.masterLevel = masterLevel;
    setMasterLevelIsSet(true);
    return this;
  }

  public void unsetMasterLevel() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MASTERLEVEL_ISSET_ID);
  }

  /** Returns true if field masterLevel is set (has been assigned a value) and false otherwise */
  public boolean isSetMasterLevel() {
    return EncodingUtils.testBit(__isset_bitfield, __MASTERLEVEL_ISSET_ID);
  }

  public void setMasterLevelIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MASTERLEVEL_ISSET_ID, value);
  }

  public long getExp() {
    return this.exp;
  }

  public MasterLevelView setExp(long exp) {
    this.exp = exp;
    setExpIsSet(true);
    return this;
  }

  public void unsetExp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EXP_ISSET_ID);
  }

  /** Returns true if field exp is set (has been assigned a value) and false otherwise */
  public boolean isSetExp() {
    return EncodingUtils.testBit(__isset_bitfield, __EXP_ISSET_ID);
  }

  public void setExpIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EXP_ISSET_ID, value);
  }

  public String getPic() {
    return this.pic;
  }

  public MasterLevelView setPic(String pic) {
    this.pic = pic;
    return this;
  }

  public void unsetPic() {
    this.pic = null;
  }

  /** Returns true if field pic is set (has been assigned a value) and false otherwise */
  public boolean isSetPic() {
    return this.pic != null;
  }

  public void setPicIsSet(boolean value) {
    if (!value) {
      this.pic = null;
    }
  }

  public String getLevelName() {
    return this.levelName;
  }

  public MasterLevelView setLevelName(String levelName) {
    this.levelName = levelName;
    return this;
  }

  public void unsetLevelName() {
    this.levelName = null;
  }

  /** Returns true if field levelName is set (has been assigned a value) and false otherwise */
  public boolean isSetLevelName() {
    return this.levelName != null;
  }

  public void setLevelNameIsSet(boolean value) {
    if (!value) {
      this.levelName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MASTER_LEVEL:
      if (value == null) {
        unsetMasterLevel();
      } else {
        setMasterLevel((Integer)value);
      }
      break;

    case EXP:
      if (value == null) {
        unsetExp();
      } else {
        setExp((Long)value);
      }
      break;

    case PIC:
      if (value == null) {
        unsetPic();
      } else {
        setPic((String)value);
      }
      break;

    case LEVEL_NAME:
      if (value == null) {
        unsetLevelName();
      } else {
        setLevelName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MASTER_LEVEL:
      return Integer.valueOf(getMasterLevel());

    case EXP:
      return Long.valueOf(getExp());

    case PIC:
      return getPic();

    case LEVEL_NAME:
      return getLevelName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MASTER_LEVEL:
      return isSetMasterLevel();
    case EXP:
      return isSetExp();
    case PIC:
      return isSetPic();
    case LEVEL_NAME:
      return isSetLevelName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MasterLevelView)
      return this.equals((MasterLevelView)that);
    return false;
  }

  public boolean equals(MasterLevelView that) {
    if (that == null)
      return false;

    boolean this_present_masterLevel = true;
    boolean that_present_masterLevel = true;
    if (this_present_masterLevel || that_present_masterLevel) {
      if (!(this_present_masterLevel && that_present_masterLevel))
        return false;
      if (this.masterLevel != that.masterLevel)
        return false;
    }

    boolean this_present_exp = true;
    boolean that_present_exp = true;
    if (this_present_exp || that_present_exp) {
      if (!(this_present_exp && that_present_exp))
        return false;
      if (this.exp != that.exp)
        return false;
    }

    boolean this_present_pic = true && this.isSetPic();
    boolean that_present_pic = true && that.isSetPic();
    if (this_present_pic || that_present_pic) {
      if (!(this_present_pic && that_present_pic))
        return false;
      if (!this.pic.equals(that.pic))
        return false;
    }

    boolean this_present_levelName = true && this.isSetLevelName();
    boolean that_present_levelName = true && that.isSetLevelName();
    if (this_present_levelName || that_present_levelName) {
      if (!(this_present_levelName && that_present_levelName))
        return false;
      if (!this.levelName.equals(that.levelName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(MasterLevelView other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    MasterLevelView typedOther = (MasterLevelView)other;

    lastComparison = Boolean.valueOf(isSetMasterLevel()).compareTo(typedOther.isSetMasterLevel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMasterLevel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.masterLevel, typedOther.masterLevel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExp()).compareTo(typedOther.isSetExp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exp, typedOther.exp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPic()).compareTo(typedOther.isSetPic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPic()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pic, typedOther.pic);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLevelName()).compareTo(typedOther.isSetLevelName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLevelName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.levelName, typedOther.levelName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MasterLevelView(");
    boolean first = true;

    sb.append("masterLevel:");
    sb.append(this.masterLevel);
    first = false;
    if (!first) sb.append(", ");
    sb.append("exp:");
    sb.append(this.exp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("pic:");
    if (this.pic == null) {
      sb.append("null");
    } else {
      sb.append(this.pic);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("levelName:");
    if (this.levelName == null) {
      sb.append("null");
    } else {
      sb.append(this.levelName);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MasterLevelViewStandardSchemeFactory implements SchemeFactory {
    public MasterLevelViewStandardScheme getScheme() {
      return new MasterLevelViewStandardScheme();
    }
  }

  private static class MasterLevelViewStandardScheme extends StandardScheme<MasterLevelView> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MasterLevelView struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MASTER_LEVEL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.masterLevel = iprot.readI32();
              struct.setMasterLevelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.exp = iprot.readI64();
              struct.setExpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PIC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pic = iprot.readString();
              struct.setPicIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LEVEL_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.levelName = iprot.readString();
              struct.setLevelNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MasterLevelView struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(MASTER_LEVEL_FIELD_DESC);
      oprot.writeI32(struct.masterLevel);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(EXP_FIELD_DESC);
      oprot.writeI64(struct.exp);
      oprot.writeFieldEnd();
      if (struct.pic != null) {
        oprot.writeFieldBegin(PIC_FIELD_DESC);
        oprot.writeString(struct.pic);
        oprot.writeFieldEnd();
      }
      if (struct.levelName != null) {
        oprot.writeFieldBegin(LEVEL_NAME_FIELD_DESC);
        oprot.writeString(struct.levelName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MasterLevelViewTupleSchemeFactory implements SchemeFactory {
    public MasterLevelViewTupleScheme getScheme() {
      return new MasterLevelViewTupleScheme();
    }
  }

  private static class MasterLevelViewTupleScheme extends TupleScheme<MasterLevelView> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MasterLevelView struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMasterLevel()) {
        optionals.set(0);
      }
      if (struct.isSetExp()) {
        optionals.set(1);
      }
      if (struct.isSetPic()) {
        optionals.set(2);
      }
      if (struct.isSetLevelName()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetMasterLevel()) {
        oprot.writeI32(struct.masterLevel);
      }
      if (struct.isSetExp()) {
        oprot.writeI64(struct.exp);
      }
      if (struct.isSetPic()) {
        oprot.writeString(struct.pic);
      }
      if (struct.isSetLevelName()) {
        oprot.writeString(struct.levelName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MasterLevelView struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.masterLevel = iprot.readI32();
        struct.setMasterLevelIsSet(true);
      }
      if (incoming.get(1)) {
        struct.exp = iprot.readI64();
        struct.setExpIsSet(true);
      }
      if (incoming.get(2)) {
        struct.pic = iprot.readString();
        struct.setPicIsSet(true);
      }
      if (incoming.get(3)) {
        struct.levelName = iprot.readString();
        struct.setLevelNameIsSet(true);
      }
    }
  }

}


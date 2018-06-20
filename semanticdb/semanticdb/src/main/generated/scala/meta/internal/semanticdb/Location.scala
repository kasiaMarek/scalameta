// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package scala.meta.internal.semanticdb

@SerialVersionUID(0L)
final case class Location(
    uri: _root_.scala.Predef.String = "",
    range: _root_.scala.Option[scala.meta.internal.semanticdb.Range] = None
    ) extends scalapb.GeneratedMessage with scalapb.Message[Location] with scalapb.lenses.Updatable[Location] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = uri
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      if (range.isDefined) {
        val __value = range.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = uri
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      range.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): scala.meta.internal.semanticdb.Location = {
      var __uri = this.uri
      var __range = this.range
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __uri = _input__.readString()
          case 18 =>
            __range = Option(_root_.scalapb.LiteParser.readMessage(_input__, __range.getOrElse(scala.meta.internal.semanticdb.Range.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      scala.meta.internal.semanticdb.Location(
          uri = __uri,
          range = __range
      )
    }
    def withUri(__v: _root_.scala.Predef.String): Location = copy(uri = __v)
    def getRange: scala.meta.internal.semanticdb.Range = range.getOrElse(scala.meta.internal.semanticdb.Range.defaultInstance)
    def clearRange: Location = copy(range = None)
    def withRange(__v: scala.meta.internal.semanticdb.Range): Location = copy(range = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = uri
          if (__t != "") __t else null
        }
        case 2 => range.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(uri)
        case 2 => range.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = scala.meta.internal.semanticdb.Location
}

object Location extends scalapb.GeneratedMessageCompanion[scala.meta.internal.semanticdb.Location] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scala.meta.internal.semanticdb.Location] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): scala.meta.internal.semanticdb.Location = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    scala.meta.internal.semanticdb.Location(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[scala.meta.internal.semanticdb.Range]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scala.meta.internal.semanticdb.Location] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      scala.meta.internal.semanticdb.Location(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[scala.meta.internal.semanticdb.Range]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = SemanticdbProto.javaDescriptor.getMessageTypes.get(3)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = SemanticdbProto.scalaDescriptor.messages(3)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = scala.meta.internal.semanticdb.Range
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = scala.meta.internal.semanticdb.Location(
  )
  implicit class LocationLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scala.meta.internal.semanticdb.Location]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scala.meta.internal.semanticdb.Location](_l) {
    def uri: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.uri)((c_, f_) => c_.copy(uri = f_))
    def range: _root_.scalapb.lenses.Lens[UpperPB, scala.meta.internal.semanticdb.Range] = field(_.getRange)((c_, f_) => c_.copy(range = Option(f_)))
    def optionalRange: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[scala.meta.internal.semanticdb.Range]] = field(_.range)((c_, f_) => c_.copy(range = f_))
  }
  final val URI_FIELD_NUMBER = 1
  final val RANGE_FIELD_NUMBER = 2
}

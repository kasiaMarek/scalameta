// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package scala.meta.internal.semanticdb

object SemanticidxProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq(
    scala.meta.internal.semanticdb.Index,
    scala.meta.internal.semanticdb.PackageEntry,
    scala.meta.internal.semanticdb.ToplevelEntry
  )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.Seq(
  """CidzZW1hbnRpY2RiL3NlbWFudGljZGIvc2VtYW50aWNpZHgucHJvdG8SHnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkY
  iKeAQoFSW5kZXgSSAoIcGFja2FnZXMYASADKAsyLC5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuUGFja2FnZUVudHJ5U
  ghwYWNrYWdlcxJLCgl0b3BsZXZlbHMYAiADKAsyLS5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuVG9wbGV2ZWxFbnRye
  VIJdG9wbGV2ZWxzIkAKDFBhY2thZ2VFbnRyeRIWCgZzeW1ib2wYASABKAlSBnN5bWJvbBIYCgdtZW1iZXJzGAIgAygJUgdtZW1iZ
  XJzIjkKDVRvcGxldmVsRW50cnkSFgoGc3ltYm9sGAEgASgJUgZzeW1ib2wSEAoDdXJpGAIgASgJUgN1cmliBnByb3RvMw=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}
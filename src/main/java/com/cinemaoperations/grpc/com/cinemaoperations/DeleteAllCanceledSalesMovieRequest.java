// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Cinema.proto

package com.cinemaoperations;

/**
 * Protobuf type {@code DeleteAllCanceledSalesMovieRequest}
 */
public  final class DeleteAllCanceledSalesMovieRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:DeleteAllCanceledSalesMovieRequest)
    DeleteAllCanceledSalesMovieRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteAllCanceledSalesMovieRequest.newBuilder() to construct.
  private DeleteAllCanceledSalesMovieRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteAllCanceledSalesMovieRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteAllCanceledSalesMovieRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cinemaoperations.Cinema.internal_static_DeleteAllCanceledSalesMovieRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cinemaoperations.Cinema.internal_static_DeleteAllCanceledSalesMovieRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cinemaoperations.DeleteAllCanceledSalesMovieRequest.class, com.cinemaoperations.DeleteAllCanceledSalesMovieRequest.Builder.class);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.cinemaoperations.DeleteAllCanceledSalesMovieRequest)) {
      return super.equals(obj);
    }
    com.cinemaoperations.DeleteAllCanceledSalesMovieRequest other = (com.cinemaoperations.DeleteAllCanceledSalesMovieRequest) obj;

    boolean result = true;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cinemaoperations.DeleteAllCanceledSalesMovieRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cinemaoperations.DeleteAllCanceledSalesMovieRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cinemaoperations.DeleteAllCanceledSalesMovieRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cinemaoperations.DeleteAllCanceledSalesMovieRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cinemaoperations.DeleteAllCanceledSalesMovieRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cinemaoperations.DeleteAllCanceledSalesMovieRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cinemaoperations.DeleteAllCanceledSalesMovieRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cinemaoperations.DeleteAllCanceledSalesMovieRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cinemaoperations.DeleteAllCanceledSalesMovieRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cinemaoperations.DeleteAllCanceledSalesMovieRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cinemaoperations.DeleteAllCanceledSalesMovieRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cinemaoperations.DeleteAllCanceledSalesMovieRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.cinemaoperations.DeleteAllCanceledSalesMovieRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code DeleteAllCanceledSalesMovieRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:DeleteAllCanceledSalesMovieRequest)
      com.cinemaoperations.DeleteAllCanceledSalesMovieRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cinemaoperations.Cinema.internal_static_DeleteAllCanceledSalesMovieRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cinemaoperations.Cinema.internal_static_DeleteAllCanceledSalesMovieRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cinemaoperations.DeleteAllCanceledSalesMovieRequest.class, com.cinemaoperations.DeleteAllCanceledSalesMovieRequest.Builder.class);
    }

    // Construct using com.cinemaoperations.DeleteAllCanceledSalesMovieRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cinemaoperations.Cinema.internal_static_DeleteAllCanceledSalesMovieRequest_descriptor;
    }

    @java.lang.Override
    public com.cinemaoperations.DeleteAllCanceledSalesMovieRequest getDefaultInstanceForType() {
      return com.cinemaoperations.DeleteAllCanceledSalesMovieRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.cinemaoperations.DeleteAllCanceledSalesMovieRequest build() {
      com.cinemaoperations.DeleteAllCanceledSalesMovieRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cinemaoperations.DeleteAllCanceledSalesMovieRequest buildPartial() {
      com.cinemaoperations.DeleteAllCanceledSalesMovieRequest result = new com.cinemaoperations.DeleteAllCanceledSalesMovieRequest(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cinemaoperations.DeleteAllCanceledSalesMovieRequest) {
        return mergeFrom((com.cinemaoperations.DeleteAllCanceledSalesMovieRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cinemaoperations.DeleteAllCanceledSalesMovieRequest other) {
      if (other == com.cinemaoperations.DeleteAllCanceledSalesMovieRequest.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.cinemaoperations.DeleteAllCanceledSalesMovieRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.cinemaoperations.DeleteAllCanceledSalesMovieRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:DeleteAllCanceledSalesMovieRequest)
  }

  // @@protoc_insertion_point(class_scope:DeleteAllCanceledSalesMovieRequest)
  private static final com.cinemaoperations.DeleteAllCanceledSalesMovieRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cinemaoperations.DeleteAllCanceledSalesMovieRequest();
  }

  public static com.cinemaoperations.DeleteAllCanceledSalesMovieRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteAllCanceledSalesMovieRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteAllCanceledSalesMovieRequest>() {
    @java.lang.Override
    public DeleteAllCanceledSalesMovieRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteAllCanceledSalesMovieRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteAllCanceledSalesMovieRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteAllCanceledSalesMovieRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cinemaoperations.DeleteAllCanceledSalesMovieRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


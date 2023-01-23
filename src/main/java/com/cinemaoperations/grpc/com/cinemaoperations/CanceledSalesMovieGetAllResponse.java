// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Cinema.proto

package com.cinemaoperations;

/**
 * Protobuf type {@code CanceledSalesMovieGetAllResponse}
 */
public  final class CanceledSalesMovieGetAllResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CanceledSalesMovieGetAllResponse)
    CanceledSalesMovieGetAllResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CanceledSalesMovieGetAllResponse.newBuilder() to construct.
  private CanceledSalesMovieGetAllResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CanceledSalesMovieGetAllResponse() {
    salesMovie_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CanceledSalesMovieGetAllResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              salesMovie_ = new java.util.ArrayList<com.cinemaoperations.SalesMovie>();
              mutable_bitField0_ |= 0x00000001;
            }
            salesMovie_.add(
                input.readMessage(com.cinemaoperations.SalesMovie.parser(), extensionRegistry));
            break;
          }
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        salesMovie_ = java.util.Collections.unmodifiableList(salesMovie_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cinemaoperations.Cinema.internal_static_CanceledSalesMovieGetAllResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cinemaoperations.Cinema.internal_static_CanceledSalesMovieGetAllResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cinemaoperations.CanceledSalesMovieGetAllResponse.class, com.cinemaoperations.CanceledSalesMovieGetAllResponse.Builder.class);
  }

  public static final int SALESMOVIE_FIELD_NUMBER = 1;
  private java.util.List<com.cinemaoperations.SalesMovie> salesMovie_;
  /**
   * <code>repeated .SalesMovie salesMovie = 1;</code>
   */
  public java.util.List<com.cinemaoperations.SalesMovie> getSalesMovieList() {
    return salesMovie_;
  }
  /**
   * <code>repeated .SalesMovie salesMovie = 1;</code>
   */
  public java.util.List<? extends com.cinemaoperations.SalesMovieOrBuilder> 
      getSalesMovieOrBuilderList() {
    return salesMovie_;
  }
  /**
   * <code>repeated .SalesMovie salesMovie = 1;</code>
   */
  public int getSalesMovieCount() {
    return salesMovie_.size();
  }
  /**
   * <code>repeated .SalesMovie salesMovie = 1;</code>
   */
  public com.cinemaoperations.SalesMovie getSalesMovie(int index) {
    return salesMovie_.get(index);
  }
  /**
   * <code>repeated .SalesMovie salesMovie = 1;</code>
   */
  public com.cinemaoperations.SalesMovieOrBuilder getSalesMovieOrBuilder(
      int index) {
    return salesMovie_.get(index);
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
    for (int i = 0; i < salesMovie_.size(); i++) {
      output.writeMessage(1, salesMovie_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < salesMovie_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, salesMovie_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.cinemaoperations.CanceledSalesMovieGetAllResponse)) {
      return super.equals(obj);
    }
    com.cinemaoperations.CanceledSalesMovieGetAllResponse other = (com.cinemaoperations.CanceledSalesMovieGetAllResponse) obj;

    boolean result = true;
    result = result && getSalesMovieList()
        .equals(other.getSalesMovieList());
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
    if (getSalesMovieCount() > 0) {
      hash = (37 * hash) + SALESMOVIE_FIELD_NUMBER;
      hash = (53 * hash) + getSalesMovieList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cinemaoperations.CanceledSalesMovieGetAllResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cinemaoperations.CanceledSalesMovieGetAllResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cinemaoperations.CanceledSalesMovieGetAllResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cinemaoperations.CanceledSalesMovieGetAllResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cinemaoperations.CanceledSalesMovieGetAllResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cinemaoperations.CanceledSalesMovieGetAllResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cinemaoperations.CanceledSalesMovieGetAllResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cinemaoperations.CanceledSalesMovieGetAllResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cinemaoperations.CanceledSalesMovieGetAllResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cinemaoperations.CanceledSalesMovieGetAllResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cinemaoperations.CanceledSalesMovieGetAllResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cinemaoperations.CanceledSalesMovieGetAllResponse parseFrom(
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
  public static Builder newBuilder(com.cinemaoperations.CanceledSalesMovieGetAllResponse prototype) {
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
   * Protobuf type {@code CanceledSalesMovieGetAllResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CanceledSalesMovieGetAllResponse)
      com.cinemaoperations.CanceledSalesMovieGetAllResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cinemaoperations.Cinema.internal_static_CanceledSalesMovieGetAllResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cinemaoperations.Cinema.internal_static_CanceledSalesMovieGetAllResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cinemaoperations.CanceledSalesMovieGetAllResponse.class, com.cinemaoperations.CanceledSalesMovieGetAllResponse.Builder.class);
    }

    // Construct using com.cinemaoperations.CanceledSalesMovieGetAllResponse.newBuilder()
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
        getSalesMovieFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (salesMovieBuilder_ == null) {
        salesMovie_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        salesMovieBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cinemaoperations.Cinema.internal_static_CanceledSalesMovieGetAllResponse_descriptor;
    }

    @java.lang.Override
    public com.cinemaoperations.CanceledSalesMovieGetAllResponse getDefaultInstanceForType() {
      return com.cinemaoperations.CanceledSalesMovieGetAllResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cinemaoperations.CanceledSalesMovieGetAllResponse build() {
      com.cinemaoperations.CanceledSalesMovieGetAllResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cinemaoperations.CanceledSalesMovieGetAllResponse buildPartial() {
      com.cinemaoperations.CanceledSalesMovieGetAllResponse result = new com.cinemaoperations.CanceledSalesMovieGetAllResponse(this);
      int from_bitField0_ = bitField0_;
      if (salesMovieBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          salesMovie_ = java.util.Collections.unmodifiableList(salesMovie_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.salesMovie_ = salesMovie_;
      } else {
        result.salesMovie_ = salesMovieBuilder_.build();
      }
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
      if (other instanceof com.cinemaoperations.CanceledSalesMovieGetAllResponse) {
        return mergeFrom((com.cinemaoperations.CanceledSalesMovieGetAllResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cinemaoperations.CanceledSalesMovieGetAllResponse other) {
      if (other == com.cinemaoperations.CanceledSalesMovieGetAllResponse.getDefaultInstance()) return this;
      if (salesMovieBuilder_ == null) {
        if (!other.salesMovie_.isEmpty()) {
          if (salesMovie_.isEmpty()) {
            salesMovie_ = other.salesMovie_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSalesMovieIsMutable();
            salesMovie_.addAll(other.salesMovie_);
          }
          onChanged();
        }
      } else {
        if (!other.salesMovie_.isEmpty()) {
          if (salesMovieBuilder_.isEmpty()) {
            salesMovieBuilder_.dispose();
            salesMovieBuilder_ = null;
            salesMovie_ = other.salesMovie_;
            bitField0_ = (bitField0_ & ~0x00000001);
            salesMovieBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSalesMovieFieldBuilder() : null;
          } else {
            salesMovieBuilder_.addAllMessages(other.salesMovie_);
          }
        }
      }
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
      com.cinemaoperations.CanceledSalesMovieGetAllResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.cinemaoperations.CanceledSalesMovieGetAllResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.cinemaoperations.SalesMovie> salesMovie_ =
      java.util.Collections.emptyList();
    private void ensureSalesMovieIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        salesMovie_ = new java.util.ArrayList<com.cinemaoperations.SalesMovie>(salesMovie_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cinemaoperations.SalesMovie, com.cinemaoperations.SalesMovie.Builder, com.cinemaoperations.SalesMovieOrBuilder> salesMovieBuilder_;

    /**
     * <code>repeated .SalesMovie salesMovie = 1;</code>
     */
    public java.util.List<com.cinemaoperations.SalesMovie> getSalesMovieList() {
      if (salesMovieBuilder_ == null) {
        return java.util.Collections.unmodifiableList(salesMovie_);
      } else {
        return salesMovieBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .SalesMovie salesMovie = 1;</code>
     */
    public int getSalesMovieCount() {
      if (salesMovieBuilder_ == null) {
        return salesMovie_.size();
      } else {
        return salesMovieBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .SalesMovie salesMovie = 1;</code>
     */
    public com.cinemaoperations.SalesMovie getSalesMovie(int index) {
      if (salesMovieBuilder_ == null) {
        return salesMovie_.get(index);
      } else {
        return salesMovieBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .SalesMovie salesMovie = 1;</code>
     */
    public Builder setSalesMovie(
        int index, com.cinemaoperations.SalesMovie value) {
      if (salesMovieBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSalesMovieIsMutable();
        salesMovie_.set(index, value);
        onChanged();
      } else {
        salesMovieBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .SalesMovie salesMovie = 1;</code>
     */
    public Builder setSalesMovie(
        int index, com.cinemaoperations.SalesMovie.Builder builderForValue) {
      if (salesMovieBuilder_ == null) {
        ensureSalesMovieIsMutable();
        salesMovie_.set(index, builderForValue.build());
        onChanged();
      } else {
        salesMovieBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SalesMovie salesMovie = 1;</code>
     */
    public Builder addSalesMovie(com.cinemaoperations.SalesMovie value) {
      if (salesMovieBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSalesMovieIsMutable();
        salesMovie_.add(value);
        onChanged();
      } else {
        salesMovieBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .SalesMovie salesMovie = 1;</code>
     */
    public Builder addSalesMovie(
        int index, com.cinemaoperations.SalesMovie value) {
      if (salesMovieBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSalesMovieIsMutable();
        salesMovie_.add(index, value);
        onChanged();
      } else {
        salesMovieBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .SalesMovie salesMovie = 1;</code>
     */
    public Builder addSalesMovie(
        com.cinemaoperations.SalesMovie.Builder builderForValue) {
      if (salesMovieBuilder_ == null) {
        ensureSalesMovieIsMutable();
        salesMovie_.add(builderForValue.build());
        onChanged();
      } else {
        salesMovieBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SalesMovie salesMovie = 1;</code>
     */
    public Builder addSalesMovie(
        int index, com.cinemaoperations.SalesMovie.Builder builderForValue) {
      if (salesMovieBuilder_ == null) {
        ensureSalesMovieIsMutable();
        salesMovie_.add(index, builderForValue.build());
        onChanged();
      } else {
        salesMovieBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SalesMovie salesMovie = 1;</code>
     */
    public Builder addAllSalesMovie(
        java.lang.Iterable<? extends com.cinemaoperations.SalesMovie> values) {
      if (salesMovieBuilder_ == null) {
        ensureSalesMovieIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, salesMovie_);
        onChanged();
      } else {
        salesMovieBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .SalesMovie salesMovie = 1;</code>
     */
    public Builder clearSalesMovie() {
      if (salesMovieBuilder_ == null) {
        salesMovie_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        salesMovieBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .SalesMovie salesMovie = 1;</code>
     */
    public Builder removeSalesMovie(int index) {
      if (salesMovieBuilder_ == null) {
        ensureSalesMovieIsMutable();
        salesMovie_.remove(index);
        onChanged();
      } else {
        salesMovieBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .SalesMovie salesMovie = 1;</code>
     */
    public com.cinemaoperations.SalesMovie.Builder getSalesMovieBuilder(
        int index) {
      return getSalesMovieFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .SalesMovie salesMovie = 1;</code>
     */
    public com.cinemaoperations.SalesMovieOrBuilder getSalesMovieOrBuilder(
        int index) {
      if (salesMovieBuilder_ == null) {
        return salesMovie_.get(index);  } else {
        return salesMovieBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .SalesMovie salesMovie = 1;</code>
     */
    public java.util.List<? extends com.cinemaoperations.SalesMovieOrBuilder> 
         getSalesMovieOrBuilderList() {
      if (salesMovieBuilder_ != null) {
        return salesMovieBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(salesMovie_);
      }
    }
    /**
     * <code>repeated .SalesMovie salesMovie = 1;</code>
     */
    public com.cinemaoperations.SalesMovie.Builder addSalesMovieBuilder() {
      return getSalesMovieFieldBuilder().addBuilder(
          com.cinemaoperations.SalesMovie.getDefaultInstance());
    }
    /**
     * <code>repeated .SalesMovie salesMovie = 1;</code>
     */
    public com.cinemaoperations.SalesMovie.Builder addSalesMovieBuilder(
        int index) {
      return getSalesMovieFieldBuilder().addBuilder(
          index, com.cinemaoperations.SalesMovie.getDefaultInstance());
    }
    /**
     * <code>repeated .SalesMovie salesMovie = 1;</code>
     */
    public java.util.List<com.cinemaoperations.SalesMovie.Builder> 
         getSalesMovieBuilderList() {
      return getSalesMovieFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cinemaoperations.SalesMovie, com.cinemaoperations.SalesMovie.Builder, com.cinemaoperations.SalesMovieOrBuilder> 
        getSalesMovieFieldBuilder() {
      if (salesMovieBuilder_ == null) {
        salesMovieBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cinemaoperations.SalesMovie, com.cinemaoperations.SalesMovie.Builder, com.cinemaoperations.SalesMovieOrBuilder>(
                salesMovie_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        salesMovie_ = null;
      }
      return salesMovieBuilder_;
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


    // @@protoc_insertion_point(builder_scope:CanceledSalesMovieGetAllResponse)
  }

  // @@protoc_insertion_point(class_scope:CanceledSalesMovieGetAllResponse)
  private static final com.cinemaoperations.CanceledSalesMovieGetAllResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cinemaoperations.CanceledSalesMovieGetAllResponse();
  }

  public static com.cinemaoperations.CanceledSalesMovieGetAllResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CanceledSalesMovieGetAllResponse>
      PARSER = new com.google.protobuf.AbstractParser<CanceledSalesMovieGetAllResponse>() {
    @java.lang.Override
    public CanceledSalesMovieGetAllResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CanceledSalesMovieGetAllResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CanceledSalesMovieGetAllResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CanceledSalesMovieGetAllResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cinemaoperations.CanceledSalesMovieGetAllResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


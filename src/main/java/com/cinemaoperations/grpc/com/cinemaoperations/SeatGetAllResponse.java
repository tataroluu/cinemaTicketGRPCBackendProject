// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Cinema.proto

package com.cinemaoperations;

/**
 * Protobuf type {@code SeatGetAllResponse}
 */
public  final class SeatGetAllResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SeatGetAllResponse)
    SeatGetAllResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SeatGetAllResponse.newBuilder() to construct.
  private SeatGetAllResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SeatGetAllResponse() {
    seat_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SeatGetAllResponse(
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
              seat_ = new java.util.ArrayList<com.cinemaoperations.Seat>();
              mutable_bitField0_ |= 0x00000001;
            }
            seat_.add(
                input.readMessage(com.cinemaoperations.Seat.parser(), extensionRegistry));
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
        seat_ = java.util.Collections.unmodifiableList(seat_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cinemaoperations.Cinema.internal_static_SeatGetAllResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cinemaoperations.Cinema.internal_static_SeatGetAllResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cinemaoperations.SeatGetAllResponse.class, com.cinemaoperations.SeatGetAllResponse.Builder.class);
  }

  public static final int SEAT_FIELD_NUMBER = 1;
  private java.util.List<com.cinemaoperations.Seat> seat_;
  /**
   * <code>repeated .Seat seat = 1;</code>
   */
  public java.util.List<com.cinemaoperations.Seat> getSeatList() {
    return seat_;
  }
  /**
   * <code>repeated .Seat seat = 1;</code>
   */
  public java.util.List<? extends com.cinemaoperations.SeatOrBuilder> 
      getSeatOrBuilderList() {
    return seat_;
  }
  /**
   * <code>repeated .Seat seat = 1;</code>
   */
  public int getSeatCount() {
    return seat_.size();
  }
  /**
   * <code>repeated .Seat seat = 1;</code>
   */
  public com.cinemaoperations.Seat getSeat(int index) {
    return seat_.get(index);
  }
  /**
   * <code>repeated .Seat seat = 1;</code>
   */
  public com.cinemaoperations.SeatOrBuilder getSeatOrBuilder(
      int index) {
    return seat_.get(index);
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
    for (int i = 0; i < seat_.size(); i++) {
      output.writeMessage(1, seat_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < seat_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, seat_.get(i));
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
    if (!(obj instanceof com.cinemaoperations.SeatGetAllResponse)) {
      return super.equals(obj);
    }
    com.cinemaoperations.SeatGetAllResponse other = (com.cinemaoperations.SeatGetAllResponse) obj;

    boolean result = true;
    result = result && getSeatList()
        .equals(other.getSeatList());
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
    if (getSeatCount() > 0) {
      hash = (37 * hash) + SEAT_FIELD_NUMBER;
      hash = (53 * hash) + getSeatList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cinemaoperations.SeatGetAllResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cinemaoperations.SeatGetAllResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cinemaoperations.SeatGetAllResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cinemaoperations.SeatGetAllResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cinemaoperations.SeatGetAllResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cinemaoperations.SeatGetAllResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cinemaoperations.SeatGetAllResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cinemaoperations.SeatGetAllResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cinemaoperations.SeatGetAllResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cinemaoperations.SeatGetAllResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cinemaoperations.SeatGetAllResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cinemaoperations.SeatGetAllResponse parseFrom(
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
  public static Builder newBuilder(com.cinemaoperations.SeatGetAllResponse prototype) {
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
   * Protobuf type {@code SeatGetAllResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SeatGetAllResponse)
      com.cinemaoperations.SeatGetAllResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cinemaoperations.Cinema.internal_static_SeatGetAllResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cinemaoperations.Cinema.internal_static_SeatGetAllResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cinemaoperations.SeatGetAllResponse.class, com.cinemaoperations.SeatGetAllResponse.Builder.class);
    }

    // Construct using com.cinemaoperations.SeatGetAllResponse.newBuilder()
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
        getSeatFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (seatBuilder_ == null) {
        seat_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        seatBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cinemaoperations.Cinema.internal_static_SeatGetAllResponse_descriptor;
    }

    @java.lang.Override
    public com.cinemaoperations.SeatGetAllResponse getDefaultInstanceForType() {
      return com.cinemaoperations.SeatGetAllResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cinemaoperations.SeatGetAllResponse build() {
      com.cinemaoperations.SeatGetAllResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cinemaoperations.SeatGetAllResponse buildPartial() {
      com.cinemaoperations.SeatGetAllResponse result = new com.cinemaoperations.SeatGetAllResponse(this);
      int from_bitField0_ = bitField0_;
      if (seatBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          seat_ = java.util.Collections.unmodifiableList(seat_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.seat_ = seat_;
      } else {
        result.seat_ = seatBuilder_.build();
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
      if (other instanceof com.cinemaoperations.SeatGetAllResponse) {
        return mergeFrom((com.cinemaoperations.SeatGetAllResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cinemaoperations.SeatGetAllResponse other) {
      if (other == com.cinemaoperations.SeatGetAllResponse.getDefaultInstance()) return this;
      if (seatBuilder_ == null) {
        if (!other.seat_.isEmpty()) {
          if (seat_.isEmpty()) {
            seat_ = other.seat_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSeatIsMutable();
            seat_.addAll(other.seat_);
          }
          onChanged();
        }
      } else {
        if (!other.seat_.isEmpty()) {
          if (seatBuilder_.isEmpty()) {
            seatBuilder_.dispose();
            seatBuilder_ = null;
            seat_ = other.seat_;
            bitField0_ = (bitField0_ & ~0x00000001);
            seatBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSeatFieldBuilder() : null;
          } else {
            seatBuilder_.addAllMessages(other.seat_);
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
      com.cinemaoperations.SeatGetAllResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.cinemaoperations.SeatGetAllResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.cinemaoperations.Seat> seat_ =
      java.util.Collections.emptyList();
    private void ensureSeatIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        seat_ = new java.util.ArrayList<com.cinemaoperations.Seat>(seat_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cinemaoperations.Seat, com.cinemaoperations.Seat.Builder, com.cinemaoperations.SeatOrBuilder> seatBuilder_;

    /**
     * <code>repeated .Seat seat = 1;</code>
     */
    public java.util.List<com.cinemaoperations.Seat> getSeatList() {
      if (seatBuilder_ == null) {
        return java.util.Collections.unmodifiableList(seat_);
      } else {
        return seatBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Seat seat = 1;</code>
     */
    public int getSeatCount() {
      if (seatBuilder_ == null) {
        return seat_.size();
      } else {
        return seatBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Seat seat = 1;</code>
     */
    public com.cinemaoperations.Seat getSeat(int index) {
      if (seatBuilder_ == null) {
        return seat_.get(index);
      } else {
        return seatBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Seat seat = 1;</code>
     */
    public Builder setSeat(
        int index, com.cinemaoperations.Seat value) {
      if (seatBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSeatIsMutable();
        seat_.set(index, value);
        onChanged();
      } else {
        seatBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Seat seat = 1;</code>
     */
    public Builder setSeat(
        int index, com.cinemaoperations.Seat.Builder builderForValue) {
      if (seatBuilder_ == null) {
        ensureSeatIsMutable();
        seat_.set(index, builderForValue.build());
        onChanged();
      } else {
        seatBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Seat seat = 1;</code>
     */
    public Builder addSeat(com.cinemaoperations.Seat value) {
      if (seatBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSeatIsMutable();
        seat_.add(value);
        onChanged();
      } else {
        seatBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Seat seat = 1;</code>
     */
    public Builder addSeat(
        int index, com.cinemaoperations.Seat value) {
      if (seatBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSeatIsMutable();
        seat_.add(index, value);
        onChanged();
      } else {
        seatBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Seat seat = 1;</code>
     */
    public Builder addSeat(
        com.cinemaoperations.Seat.Builder builderForValue) {
      if (seatBuilder_ == null) {
        ensureSeatIsMutable();
        seat_.add(builderForValue.build());
        onChanged();
      } else {
        seatBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Seat seat = 1;</code>
     */
    public Builder addSeat(
        int index, com.cinemaoperations.Seat.Builder builderForValue) {
      if (seatBuilder_ == null) {
        ensureSeatIsMutable();
        seat_.add(index, builderForValue.build());
        onChanged();
      } else {
        seatBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Seat seat = 1;</code>
     */
    public Builder addAllSeat(
        java.lang.Iterable<? extends com.cinemaoperations.Seat> values) {
      if (seatBuilder_ == null) {
        ensureSeatIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, seat_);
        onChanged();
      } else {
        seatBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Seat seat = 1;</code>
     */
    public Builder clearSeat() {
      if (seatBuilder_ == null) {
        seat_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        seatBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Seat seat = 1;</code>
     */
    public Builder removeSeat(int index) {
      if (seatBuilder_ == null) {
        ensureSeatIsMutable();
        seat_.remove(index);
        onChanged();
      } else {
        seatBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Seat seat = 1;</code>
     */
    public com.cinemaoperations.Seat.Builder getSeatBuilder(
        int index) {
      return getSeatFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Seat seat = 1;</code>
     */
    public com.cinemaoperations.SeatOrBuilder getSeatOrBuilder(
        int index) {
      if (seatBuilder_ == null) {
        return seat_.get(index);  } else {
        return seatBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Seat seat = 1;</code>
     */
    public java.util.List<? extends com.cinemaoperations.SeatOrBuilder> 
         getSeatOrBuilderList() {
      if (seatBuilder_ != null) {
        return seatBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(seat_);
      }
    }
    /**
     * <code>repeated .Seat seat = 1;</code>
     */
    public com.cinemaoperations.Seat.Builder addSeatBuilder() {
      return getSeatFieldBuilder().addBuilder(
          com.cinemaoperations.Seat.getDefaultInstance());
    }
    /**
     * <code>repeated .Seat seat = 1;</code>
     */
    public com.cinemaoperations.Seat.Builder addSeatBuilder(
        int index) {
      return getSeatFieldBuilder().addBuilder(
          index, com.cinemaoperations.Seat.getDefaultInstance());
    }
    /**
     * <code>repeated .Seat seat = 1;</code>
     */
    public java.util.List<com.cinemaoperations.Seat.Builder> 
         getSeatBuilderList() {
      return getSeatFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cinemaoperations.Seat, com.cinemaoperations.Seat.Builder, com.cinemaoperations.SeatOrBuilder> 
        getSeatFieldBuilder() {
      if (seatBuilder_ == null) {
        seatBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cinemaoperations.Seat, com.cinemaoperations.Seat.Builder, com.cinemaoperations.SeatOrBuilder>(
                seat_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        seat_ = null;
      }
      return seatBuilder_;
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


    // @@protoc_insertion_point(builder_scope:SeatGetAllResponse)
  }

  // @@protoc_insertion_point(class_scope:SeatGetAllResponse)
  private static final com.cinemaoperations.SeatGetAllResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cinemaoperations.SeatGetAllResponse();
  }

  public static com.cinemaoperations.SeatGetAllResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SeatGetAllResponse>
      PARSER = new com.google.protobuf.AbstractParser<SeatGetAllResponse>() {
    @java.lang.Override
    public SeatGetAllResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SeatGetAllResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SeatGetAllResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SeatGetAllResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cinemaoperations.SeatGetAllResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


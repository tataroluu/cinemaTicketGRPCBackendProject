// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Cinema.proto

package com.cinemaoperations;

public interface CardInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CardInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>string card_owner_name = 2;</code>
   */
  java.lang.String getCardOwnerName();
  /**
   * <code>string card_owner_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getCardOwnerNameBytes();

  /**
   * <code>int64 card_number = 3;</code>
   */
  long getCardNumber();

  /**
   * <code>int64 expiration = 4;</code>
   */
  long getExpiration();

  /**
   * <code>int64 cvv = 5;</code>
   */
  long getCvv();
}

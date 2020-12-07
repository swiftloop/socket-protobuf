// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IMMessage.proto

package com.xinsiwei.netty.message;

public final class IMMessage {
  private IMMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IMMessageReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IMMessageReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *消息发送方
     * </pre>
     *
     * <code>uint32 form = 1;</code>
     * @return The form.
     */
    int getForm();

    /**
     * <pre>
     *消息接收方
     * </pre>
     *
     * <code>uint32 to = 2;</code>
     * @return The to.
     */
    int getTo();

    /**
     * <pre>
     *消息类型
     * </pre>
     *
     * <code>.MessageType type = 3;</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <pre>
     *消息类型
     * </pre>
     *
     * <code>.MessageType type = 3;</code>
     * @return The type.
     */
    MessagePacket.MessageType getType();

    /**
     * <pre>
     *消息的发送时间
     * </pre>
     *
     * <code>uint32 create = 4;</code>
     * @return The create.
     */
    int getCreate();

    /**
     * <pre>
     *消息内容
     * </pre>
     *
     * <code>bytes body = 5;</code>
     * @return The body.
     */
    com.google.protobuf.ByteString getBody();
  }
  /**
   * <pre>
   *消息发送
   * </pre>
   *
   * Protobuf type {@code IMMessageReq}
   */
  public static final class IMMessageReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IMMessageReq)
      IMMessageReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IMMessageReq.newBuilder() to construct.
    private IMMessageReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IMMessageReq() {
      type_ = 0;
      body_ = com.google.protobuf.ByteString.EMPTY;
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new IMMessageReq();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IMMessageReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 8: {

              form_ = input.readUInt32();
              break;
            }
            case 16: {

              to_ = input.readUInt32();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 32: {

              create_ = input.readUInt32();
              break;
            }
            case 42: {

              body_ = input.readBytes();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return IMMessage.internal_static_IMMessageReq_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return IMMessage.internal_static_IMMessageReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              IMMessageReq.class, Builder.class);
    }

    public static final int FORM_FIELD_NUMBER = 1;
    private int form_;
    /**
     * <pre>
     *消息发送方
     * </pre>
     *
     * <code>uint32 form = 1;</code>
     * @return The form.
     */
    @Override
    public int getForm() {
      return form_;
    }

    public static final int TO_FIELD_NUMBER = 2;
    private int to_;
    /**
     * <pre>
     *消息接收方
     * </pre>
     *
     * <code>uint32 to = 2;</code>
     * @return The to.
     */
    @Override
    public int getTo() {
      return to_;
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    /**
     * <pre>
     *消息类型
     * </pre>
     *
     * <code>.MessageType type = 3;</code>
     * @return The enum numeric value on the wire for type.
     */
    @Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     *消息类型
     * </pre>
     *
     * <code>.MessageType type = 3;</code>
     * @return The type.
     */
    @Override public MessagePacket.MessageType getType() {
      @SuppressWarnings("deprecation")
      MessagePacket.MessageType result = MessagePacket.MessageType.valueOf(type_);
      return result == null ? MessagePacket.MessageType.UNRECOGNIZED : result;
    }

    public static final int CREATE_FIELD_NUMBER = 4;
    private int create_;
    /**
     * <pre>
     *消息的发送时间
     * </pre>
     *
     * <code>uint32 create = 4;</code>
     * @return The create.
     */
    @Override
    public int getCreate() {
      return create_;
    }

    public static final int BODY_FIELD_NUMBER = 5;
    private com.google.protobuf.ByteString body_;
    /**
     * <pre>
     *消息内容
     * </pre>
     *
     * <code>bytes body = 5;</code>
     * @return The body.
     */
    @Override
    public com.google.protobuf.ByteString getBody() {
      return body_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (form_ != 0) {
        output.writeUInt32(1, form_);
      }
      if (to_ != 0) {
        output.writeUInt32(2, to_);
      }
      if (type_ != MessagePacket.MessageType.MSG_TYPE_SINGLE_TEXT.getNumber()) {
        output.writeEnum(3, type_);
      }
      if (create_ != 0) {
        output.writeUInt32(4, create_);
      }
      if (!body_.isEmpty()) {
        output.writeBytes(5, body_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (form_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, form_);
      }
      if (to_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, to_);
      }
      if (type_ != MessagePacket.MessageType.MSG_TYPE_SINGLE_TEXT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, type_);
      }
      if (create_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, create_);
      }
      if (!body_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, body_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof IMMessageReq)) {
        return super.equals(obj);
      }
      IMMessageReq other = (IMMessageReq) obj;

      if (getForm()
          != other.getForm()) return false;
      if (getTo()
          != other.getTo()) return false;
      if (type_ != other.type_) return false;
      if (getCreate()
          != other.getCreate()) return false;
      if (!getBody()
          .equals(other.getBody())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + FORM_FIELD_NUMBER;
      hash = (53 * hash) + getForm();
      hash = (37 * hash) + TO_FIELD_NUMBER;
      hash = (53 * hash) + getTo();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + CREATE_FIELD_NUMBER;
      hash = (53 * hash) + getCreate();
      hash = (37 * hash) + BODY_FIELD_NUMBER;
      hash = (53 * hash) + getBody().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static IMMessageReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static IMMessageReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static IMMessageReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static IMMessageReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static IMMessageReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static IMMessageReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static IMMessageReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static IMMessageReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static IMMessageReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static IMMessageReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static IMMessageReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static IMMessageReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(IMMessageReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *消息发送
     * </pre>
     *
     * Protobuf type {@code IMMessageReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IMMessageReq)
        IMMessageReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return IMMessage.internal_static_IMMessageReq_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return IMMessage.internal_static_IMMessageReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                IMMessageReq.class, Builder.class);
      }

      // Construct using com.xinsiwei.netty.message.IMMessage.IMMessageReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        form_ = 0;

        to_ = 0;

        type_ = 0;

        create_ = 0;

        body_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return IMMessage.internal_static_IMMessageReq_descriptor;
      }

      @Override
      public IMMessageReq getDefaultInstanceForType() {
        return IMMessageReq.getDefaultInstance();
      }

      @Override
      public IMMessageReq build() {
        IMMessageReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public IMMessageReq buildPartial() {
        IMMessageReq result = new IMMessageReq(this);
        result.form_ = form_;
        result.to_ = to_;
        result.type_ = type_;
        result.create_ = create_;
        result.body_ = body_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof IMMessageReq) {
          return mergeFrom((IMMessageReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(IMMessageReq other) {
        if (other == IMMessageReq.getDefaultInstance()) return this;
        if (other.getForm() != 0) {
          setForm(other.getForm());
        }
        if (other.getTo() != 0) {
          setTo(other.getTo());
        }
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (other.getCreate() != 0) {
          setCreate(other.getCreate());
        }
        if (other.getBody() != com.google.protobuf.ByteString.EMPTY) {
          setBody(other.getBody());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        IMMessageReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (IMMessageReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int form_ ;
      /**
       * <pre>
       *消息发送方
       * </pre>
       *
       * <code>uint32 form = 1;</code>
       * @return The form.
       */
      @Override
      public int getForm() {
        return form_;
      }
      /**
       * <pre>
       *消息发送方
       * </pre>
       *
       * <code>uint32 form = 1;</code>
       * @param value The form to set.
       * @return This builder for chaining.
       */
      public Builder setForm(int value) {
        
        form_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息发送方
       * </pre>
       *
       * <code>uint32 form = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearForm() {
        
        form_ = 0;
        onChanged();
        return this;
      }

      private int to_ ;
      /**
       * <pre>
       *消息接收方
       * </pre>
       *
       * <code>uint32 to = 2;</code>
       * @return The to.
       */
      @Override
      public int getTo() {
        return to_;
      }
      /**
       * <pre>
       *消息接收方
       * </pre>
       *
       * <code>uint32 to = 2;</code>
       * @param value The to to set.
       * @return This builder for chaining.
       */
      public Builder setTo(int value) {
        
        to_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息接收方
       * </pre>
       *
       * <code>uint32 to = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTo() {
        
        to_ = 0;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <pre>
       *消息类型
       * </pre>
       *
       * <code>.MessageType type = 3;</code>
       * @return The enum numeric value on the wire for type.
       */
      @Override public int getTypeValue() {
        return type_;
      }
      /**
       * <pre>
       *消息类型
       * </pre>
       *
       * <code>.MessageType type = 3;</code>
       * @param value The enum numeric value on the wire for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeValue(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息类型
       * </pre>
       *
       * <code>.MessageType type = 3;</code>
       * @return The type.
       */
      @Override
      public MessagePacket.MessageType getType() {
        @SuppressWarnings("deprecation")
        MessagePacket.MessageType result = MessagePacket.MessageType.valueOf(type_);
        return result == null ? MessagePacket.MessageType.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       *消息类型
       * </pre>
       *
       * <code>.MessageType type = 3;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(MessagePacket.MessageType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息类型
       * </pre>
       *
       * <code>.MessageType type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private int create_ ;
      /**
       * <pre>
       *消息的发送时间
       * </pre>
       *
       * <code>uint32 create = 4;</code>
       * @return The create.
       */
      @Override
      public int getCreate() {
        return create_;
      }
      /**
       * <pre>
       *消息的发送时间
       * </pre>
       *
       * <code>uint32 create = 4;</code>
       * @param value The create to set.
       * @return This builder for chaining.
       */
      public Builder setCreate(int value) {
        
        create_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息的发送时间
       * </pre>
       *
       * <code>uint32 create = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCreate() {
        
        create_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString body_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       *消息内容
       * </pre>
       *
       * <code>bytes body = 5;</code>
       * @return The body.
       */
      @Override
      public com.google.protobuf.ByteString getBody() {
        return body_;
      }
      /**
       * <pre>
       *消息内容
       * </pre>
       *
       * <code>bytes body = 5;</code>
       * @param value The body to set.
       * @return This builder for chaining.
       */
      public Builder setBody(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        body_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息内容
       * </pre>
       *
       * <code>bytes body = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearBody() {
        
        body_ = getDefaultInstance().getBody();
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:IMMessageReq)
    }

    // @@protoc_insertion_point(class_scope:IMMessageReq)
    private static final IMMessageReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new IMMessageReq();
    }

    public static IMMessageReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IMMessageReq>
        PARSER = new com.google.protobuf.AbstractParser<IMMessageReq>() {
      @Override
      public IMMessageReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IMMessageReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IMMessageReq> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<IMMessageReq> getParserForType() {
      return PARSER;
    }

    @Override
    public IMMessageReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IMMessageReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IMMessageReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\017IMMessage.proto\032\023MessagePacket.proto\"b" +
      "\n\014IMMessageReq\022\014\n\004form\030\001 \001(\r\022\n\n\002to\030\002 \001(\r" +
      "\022\032\n\004type\030\003 \001(\0162\014.MessageType\022\016\n\006create\030\004" +
      " \001(\r\022\014\n\004body\030\005 \001(\014B\034\n\032com.xinsiwei.netty" +
      ".messageb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          MessagePacket.getDescriptor(),
        });
    internal_static_IMMessageReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IMMessageReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IMMessageReq_descriptor,
        new String[] { "Form", "To", "Type", "Create", "Body", });
    MessagePacket.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

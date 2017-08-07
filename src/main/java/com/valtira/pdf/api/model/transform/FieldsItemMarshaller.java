/**
 * null
 */
package com.valtira.pdf.api.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.valtira.pdf.api.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FieldsItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FieldsItemMarshaller {

    private static final MarshallingInfo<String> FIELDTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fieldType").build();
    private static final MarshallingInfo<StructuredPojo> FONT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("font").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> VALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("value").build();
    private static final MarshallingInfo<Integer> X_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("x").build();
    private static final MarshallingInfo<Integer> Y_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("y").build();

    private static final FieldsItemMarshaller instance = new FieldsItemMarshaller();

    public static FieldsItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FieldsItem fieldsItem, ProtocolMarshaller protocolMarshaller) {

        if (fieldsItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fieldsItem.getFieldType(), FIELDTYPE_BINDING);
            protocolMarshaller.marshall(fieldsItem.getFont(), FONT_BINDING);
            protocolMarshaller.marshall(fieldsItem.getName(), NAME_BINDING);
            protocolMarshaller.marshall(fieldsItem.getValue(), VALUE_BINDING);
            protocolMarshaller.marshall(fieldsItem.getX(), X_BINDING);
            protocolMarshaller.marshall(fieldsItem.getY(), Y_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

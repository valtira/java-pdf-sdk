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
 * BorderMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BorderMarshaller {

    private static final MarshallingInfo<StructuredPojo> COLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("color").build();
    private static final MarshallingInfo<Double> WIDTH_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("width").build();

    private static final BorderMarshaller instance = new BorderMarshaller();

    public static BorderMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Border border, ProtocolMarshaller protocolMarshaller) {

        if (border == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(border.getColor(), COLOR_BINDING);
            protocolMarshaller.marshall(border.getWidth(), WIDTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

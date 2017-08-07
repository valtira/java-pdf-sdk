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
 * ColorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ColorMarshaller {

    private static final MarshallingInfo<Integer> B_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("b").build();
    private static final MarshallingInfo<String> BASECOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("baseColor").build();
    private static final MarshallingInfo<Integer> G_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("g").build();
    private static final MarshallingInfo<Integer> R_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("r").build();

    private static final ColorMarshaller instance = new ColorMarshaller();

    public static ColorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Color color, ProtocolMarshaller protocolMarshaller) {

        if (color == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(color.getB(), B_BINDING);
            protocolMarshaller.marshall(color.getBaseColor(), BASECOLOR_BINDING);
            protocolMarshaller.marshall(color.getG(), G_BINDING);
            protocolMarshaller.marshall(color.getR(), R_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

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
 * EmbedImageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EmbedImageMarshaller {

    private static final MarshallingInfo<StructuredPojo> COORDINATES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("coordinates").build();
    private static final MarshallingInfo<StructuredPojo> IMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("image").build();
    private static final MarshallingInfo<StructuredPojo> TEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("template").build();

    private static final EmbedImageMarshaller instance = new EmbedImageMarshaller();

    public static EmbedImageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EmbedImage embedImage, ProtocolMarshaller protocolMarshaller) {

        if (embedImage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(embedImage.getCoordinates(), COORDINATES_BINDING);
            protocolMarshaller.marshall(embedImage.getImage(), IMAGE_BINDING);
            protocolMarshaller.marshall(embedImage.getTemplate(), TEMPLATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

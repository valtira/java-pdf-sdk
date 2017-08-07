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
 * PostFillAcroFormRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostFillAcroFormRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACROFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).build();
    private static final MarshallingInfo<String> APIKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.HEADER)
            .marshallLocationName("x-api-key").build();

    private static final PostFillAcroFormRequestMarshaller instance = new PostFillAcroFormRequestMarshaller();

    public static PostFillAcroFormRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PostFillAcroFormRequest postFillAcroFormRequest, ProtocolMarshaller protocolMarshaller) {

        if (postFillAcroFormRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(postFillAcroFormRequest.getAcroForm(), ACROFORM_BINDING);
            protocolMarshaller.marshall(postFillAcroFormRequest.getApiKey(), APIKEY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

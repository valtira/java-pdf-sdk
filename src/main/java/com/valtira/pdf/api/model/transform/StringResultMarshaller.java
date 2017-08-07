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
 * StringResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StringResultMarshaller {

    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("message").build();
    private static final MarshallingInfo<Boolean> SUCCEEDED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("succeeded").build();
    private static final MarshallingInfo<String> VALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("value").build();

    private static final StringResultMarshaller instance = new StringResultMarshaller();

    public static StringResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StringResult stringResult, ProtocolMarshaller protocolMarshaller) {

        if (stringResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(stringResult.getMessage(), MESSAGE_BINDING);
            protocolMarshaller.marshall(stringResult.getSucceeded(), SUCCEEDED_BINDING);
            protocolMarshaller.marshall(stringResult.getValue(), VALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

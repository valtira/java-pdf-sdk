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
 * Base64FileMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Base64FileMarshaller {

    private static final MarshallingInfo<String> CONTENTS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("contents").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();

    private static final Base64FileMarshaller instance = new Base64FileMarshaller();

    public static Base64FileMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Base64File base64File, ProtocolMarshaller protocolMarshaller) {

        if (base64File == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(base64File.getContents(), CONTENTS_BINDING);
            protocolMarshaller.marshall(base64File.getName(), NAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

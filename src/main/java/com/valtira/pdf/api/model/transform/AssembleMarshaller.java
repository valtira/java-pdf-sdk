/**
 * null
 */
package com.valtira.pdf.api.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.valtira.pdf.api.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssembleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssembleMarshaller {

    private static final MarshallingInfo<List> PDFS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pdfs").build();
    private static final MarshallingInfo<StructuredPojo> SEPARATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("separator").build();
    private static final MarshallingInfo<Boolean> STEPS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("steps").build();

    private static final AssembleMarshaller instance = new AssembleMarshaller();

    public static AssembleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Assemble assemble, ProtocolMarshaller protocolMarshaller) {

        if (assemble == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(assemble.getPdfs(), PDFS_BINDING);
            protocolMarshaller.marshall(assemble.getSeparator(), SEPARATOR_BINDING);
            protocolMarshaller.marshall(assemble.getSteps(), STEPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

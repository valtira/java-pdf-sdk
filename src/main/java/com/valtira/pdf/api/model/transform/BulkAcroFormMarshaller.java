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
 * BulkAcroFormMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BulkAcroFormMarshaller {

    private static final MarshallingInfo<List> FORMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("forms").build();
    private static final MarshallingInfo<StructuredPojo> TEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("template").build();

    private static final BulkAcroFormMarshaller instance = new BulkAcroFormMarshaller();

    public static BulkAcroFormMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BulkAcroForm bulkAcroForm, ProtocolMarshaller protocolMarshaller) {

        if (bulkAcroForm == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(bulkAcroForm.getForms(), FORMS_BINDING);
            protocolMarshaller.marshall(bulkAcroForm.getTemplate(), TEMPLATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

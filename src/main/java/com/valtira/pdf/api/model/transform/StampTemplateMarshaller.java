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
 * StampTemplateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StampTemplateMarshaller {

    private static final MarshallingInfo<String> HORIZONTALALIGNMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("horizontalAlignment").build();
    private static final MarshallingInfo<StructuredPojo> PAGERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pageRange").build();
    private static final MarshallingInfo<StructuredPojo> TABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("table").build();
    private static final MarshallingInfo<StructuredPojo> TEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("template").build();
    private static final MarshallingInfo<String> VERTICALALIGNMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("verticalAlignment").build();

    private static final StampTemplateMarshaller instance = new StampTemplateMarshaller();

    public static StampTemplateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StampTemplate stampTemplate, ProtocolMarshaller protocolMarshaller) {

        if (stampTemplate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(stampTemplate.getHorizontalAlignment(), HORIZONTALALIGNMENT_BINDING);
            protocolMarshaller.marshall(stampTemplate.getPageRange(), PAGERANGE_BINDING);
            protocolMarshaller.marshall(stampTemplate.getTable(), TABLE_BINDING);
            protocolMarshaller.marshall(stampTemplate.getTemplate(), TEMPLATE_BINDING);
            protocolMarshaller.marshall(stampTemplate.getVerticalAlignment(), VERTICALALIGNMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

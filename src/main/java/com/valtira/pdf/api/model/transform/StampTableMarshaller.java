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
 * StampTableMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StampTableMarshaller {

    private static final MarshallingInfo<String> HORIZONTALALIGNMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("horizontalAlignment").build();
    private static final MarshallingInfo<StructuredPojo> PAGERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pageRange").build();
    private static final MarshallingInfo<StructuredPojo> TARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("target").build();
    private static final MarshallingInfo<StructuredPojo> TEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("template").build();
    private static final MarshallingInfo<String> VERTICALALIGNMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("verticalAlignment").build();

    private static final StampTableMarshaller instance = new StampTableMarshaller();

    public static StampTableMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StampTable stampTable, ProtocolMarshaller protocolMarshaller) {

        if (stampTable == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(stampTable.getHorizontalAlignment(), HORIZONTALALIGNMENT_BINDING);
            protocolMarshaller.marshall(stampTable.getPageRange(), PAGERANGE_BINDING);
            protocolMarshaller.marshall(stampTable.getTarget(), TARGET_BINDING);
            protocolMarshaller.marshall(stampTable.getTemplate(), TEMPLATE_BINDING);
            protocolMarshaller.marshall(stampTable.getVerticalAlignment(), VERTICALALIGNMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

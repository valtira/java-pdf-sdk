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
 * TableCellMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TableCellMarshaller {

    private static final MarshallingInfo<StructuredPojo> FILLCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fillColor").build();
    private static final MarshallingInfo<StructuredPojo> FONT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("font").build();
    private static final MarshallingInfo<StructuredPojo> IMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("image").build();
    private static final MarshallingInfo<String> LABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("label").build();
    private static final MarshallingInfo<String> LINK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("link").build();
    private static final MarshallingInfo<Integer> LOCALPAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("localPage").build();

    private static final TableCellMarshaller instance = new TableCellMarshaller();

    public static TableCellMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TableCell tableCell, ProtocolMarshaller protocolMarshaller) {

        if (tableCell == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(tableCell.getFillColor(), FILLCOLOR_BINDING);
            protocolMarshaller.marshall(tableCell.getFont(), FONT_BINDING);
            protocolMarshaller.marshall(tableCell.getImage(), IMAGE_BINDING);
            protocolMarshaller.marshall(tableCell.getLabel(), LABEL_BINDING);
            protocolMarshaller.marshall(tableCell.getLink(), LINK_BINDING);
            protocolMarshaller.marshall(tableCell.getLocalPage(), LOCALPAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

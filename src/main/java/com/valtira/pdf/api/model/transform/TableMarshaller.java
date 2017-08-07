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
 * TableMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TableMarshaller {

    private static final MarshallingInfo<StructuredPojo> BORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("border").build();
    private static final MarshallingInfo<List> CELLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cells").build();
    private static final MarshallingInfo<Double> FIXEDHEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fixedHeight").build();
    private static final MarshallingInfo<String> HORIZONTALALIGNMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("horizontalAlignment").build();
    private static final MarshallingInfo<Double> TOTALWIDTH_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalWidth").build();
    private static final MarshallingInfo<String> VERTICALALIGNMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("verticalAlignment").build();
    private static final MarshallingInfo<List> WIDTHS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("widths").build();

    private static final TableMarshaller instance = new TableMarshaller();

    public static TableMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Table table, ProtocolMarshaller protocolMarshaller) {

        if (table == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(table.getBorder(), BORDER_BINDING);
            protocolMarshaller.marshall(table.getCells(), CELLS_BINDING);
            protocolMarshaller.marshall(table.getFixedHeight(), FIXEDHEIGHT_BINDING);
            protocolMarshaller.marshall(table.getHorizontalAlignment(), HORIZONTALALIGNMENT_BINDING);
            protocolMarshaller.marshall(table.getTotalWidth(), TOTALWIDTH_BINDING);
            protocolMarshaller.marshall(table.getVerticalAlignment(), VERTICALALIGNMENT_BINDING);
            protocolMarshaller.marshall(table.getWidths(), WIDTHS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

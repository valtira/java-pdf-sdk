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
 * CoordinatesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CoordinatesMarshaller {

    private static final MarshallingInfo<Integer> PAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("page").build();
    private static final MarshallingInfo<Double> X_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("x").build();
    private static final MarshallingInfo<Double> Y_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("y").build();

    private static final CoordinatesMarshaller instance = new CoordinatesMarshaller();

    public static CoordinatesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Coordinates coordinates, ProtocolMarshaller protocolMarshaller) {

        if (coordinates == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(coordinates.getPage(), PAGE_BINDING);
            protocolMarshaller.marshall(coordinates.getX(), X_BINDING);
            protocolMarshaller.marshall(coordinates.getY(), Y_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

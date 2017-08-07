/**
 * null
 */
package com.valtira.pdf.api.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;

import com.amazonaws.http.HttpMethodName;
import com.valtira.pdf.api.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PostFillAcroFormBulkRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostFillAcroFormBulkRequestProtocolMarshaller implements Marshaller<Request<PostFillAcroFormBulkRequest>, PostFillAcroFormBulkRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.API_GATEWAY)
            .requestUri("/marketplace/fill-acro-form/bulk").httpMethodName(HttpMethodName.POST).hasExplicitPayloadMember(true).hasPayloadMembers(true)
            .serviceName("PDFAPIClient").build();

    private final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory;

    public PostFillAcroFormBulkRequestProtocolMarshaller(com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<PostFillAcroFormBulkRequest> marshall(PostFillAcroFormBulkRequest postFillAcroFormBulkRequest) {

        if (postFillAcroFormBulkRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<PostFillAcroFormBulkRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(SDK_OPERATION_BINDING,
                    postFillAcroFormBulkRequest);

            protocolMarshaller.startMarshalling();
            PostFillAcroFormBulkRequestMarshaller.getInstance().marshall(postFillAcroFormBulkRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

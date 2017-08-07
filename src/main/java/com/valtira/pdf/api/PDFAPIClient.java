/**
 * null
 */
package com.valtira.pdf.api;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.opensdk.protect.model.transform.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;

import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;
import com.amazonaws.SdkBaseException;

import com.valtira.pdf.api.model.*;
import com.valtira.pdf.api.model.transform.*;

/**
 * Client for accessing PDFAPIClient. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * 
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
class PDFAPIClient implements PDFAPI {

    private final ClientHandler clientHandler;

    private final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory = new com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl(
            new JsonClientMetadata().withProtocolVersion("1.1").withSupportsCbor(false).withSupportsIon(false).withContentTypeOverride("application/json")
                    .withBaseServiceExceptionClass(com.valtira.pdf.api.model.PDFAPIClientException.class));

    /**
     * Constructs a new client to invoke service methods on PDFAPIClient using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    PDFAPIClient(AwsSyncClientParams clientParams) {
        this.clientHandler = new SdkClientHandler(new ClientHandlerParams().withClientParams(clientParams));
    }

    /**
     * @param postAssembleRequest
     * @return Result of the PostAssemble operation returned by the service.
     * @sample PDFAPIClient.PostAssemble
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostAssemble" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PostAssembleResult postAssemble(PostAssembleRequest postAssembleRequest) {
        HttpResponseHandler<PostAssembleResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostAssembleResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostAssembleRequest, PostAssembleResult>()
                .withMarshaller(new PostAssembleRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postAssembleRequest));
    }

    /**
     * @param postBookmarkRequest
     * @return Result of the PostBookmark operation returned by the service.
     * @sample PDFAPIClient.PostBookmark
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostBookmark" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PostBookmarkResult postBookmark(PostBookmarkRequest postBookmarkRequest) {
        HttpResponseHandler<PostBookmarkResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostBookmarkResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostBookmarkRequest, PostBookmarkResult>()
                .withMarshaller(new PostBookmarkRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postBookmarkRequest));
    }

    /**
     * @param postBuildTableRequest
     * @return Result of the PostBuildTable operation returned by the service.
     * @sample PDFAPIClient.PostBuildTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostBuildTable" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PostBuildTableResult postBuildTable(PostBuildTableRequest postBuildTableRequest) {
        HttpResponseHandler<PostBuildTableResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostBuildTableResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostBuildTableRequest, PostBuildTableResult>()
                .withMarshaller(new PostBuildTableRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postBuildTableRequest));
    }

    /**
     * @param postEmbedImageRequest
     * @return Result of the PostEmbedImage operation returned by the service.
     * @sample PDFAPIClient.PostEmbedImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostEmbedImage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PostEmbedImageResult postEmbedImage(PostEmbedImageRequest postEmbedImageRequest) {
        HttpResponseHandler<PostEmbedImageResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostEmbedImageResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostEmbedImageRequest, PostEmbedImageResult>()
                .withMarshaller(new PostEmbedImageRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postEmbedImageRequest));
    }

    /**
     * @param postExecuteStepsRequest
     * @return Result of the PostExecuteSteps operation returned by the service.
     * @sample PDFAPIClient.PostExecuteSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostExecuteSteps" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PostExecuteStepsResult postExecuteSteps(PostExecuteStepsRequest postExecuteStepsRequest) {
        HttpResponseHandler<PostExecuteStepsResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostExecuteStepsResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostExecuteStepsRequest, PostExecuteStepsResult>()
                .withMarshaller(new PostExecuteStepsRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postExecuteStepsRequest));
    }

    /**
     * @param postExtractTextRequest
     * @return Result of the PostExtractText operation returned by the service.
     * @sample PDFAPIClient.PostExtractText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostExtractText" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PostExtractTextResult postExtractText(PostExtractTextRequest postExtractTextRequest) {
        HttpResponseHandler<PostExtractTextResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostExtractTextResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostExtractTextRequest, PostExtractTextResult>()
                .withMarshaller(new PostExtractTextRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postExtractTextRequest));
    }

    /**
     * @param postFillAcroFormRequest
     * @return Result of the PostFillAcroForm operation returned by the service.
     * @sample PDFAPIClient.PostFillAcroForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostFillAcroForm" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PostFillAcroFormResult postFillAcroForm(PostFillAcroFormRequest postFillAcroFormRequest) {
        HttpResponseHandler<PostFillAcroFormResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostFillAcroFormResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostFillAcroFormRequest, PostFillAcroFormResult>()
                .withMarshaller(new PostFillAcroFormRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postFillAcroFormRequest));
    }

    /**
     * @param postFillAcroFormBulkRequest
     * @return Result of the PostFillAcroFormBulk operation returned by the service.
     * @sample PDFAPIClient.PostFillAcroFormBulk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostFillAcroFormBulk" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PostFillAcroFormBulkResult postFillAcroFormBulk(PostFillAcroFormBulkRequest postFillAcroFormBulkRequest) {
        HttpResponseHandler<PostFillAcroFormBulkResult> responseHandler = protocolFactory.createResponseHandler(
                new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PostFillAcroFormBulkResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostFillAcroFormBulkRequest, PostFillAcroFormBulkResult>()
                .withMarshaller(new PostFillAcroFormBulkRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postFillAcroFormBulkRequest));
    }

    /**
     * @param postHtmlToPdfRequest
     * @return Result of the PostHtmlToPdf operation returned by the service.
     * @sample PDFAPIClient.PostHtmlToPdf
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostHtmlToPdf" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PostHtmlToPdfResult postHtmlToPdf(PostHtmlToPdfRequest postHtmlToPdfRequest) {
        HttpResponseHandler<PostHtmlToPdfResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostHtmlToPdfResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostHtmlToPdfRequest, PostHtmlToPdfResult>()
                .withMarshaller(new PostHtmlToPdfRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postHtmlToPdfRequest));
    }

    /**
     * @param postStampTableRequest
     * @return Result of the PostStampTable operation returned by the service.
     * @sample PDFAPIClient.PostStampTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostStampTable" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PostStampTableResult postStampTable(PostStampTableRequest postStampTableRequest) {
        HttpResponseHandler<PostStampTableResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostStampTableResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostStampTableRequest, PostStampTableResult>()
                .withMarshaller(new PostStampTableRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postStampTableRequest));
    }

    /**
     * @param postStampTemplateRequest
     * @return Result of the PostStampTemplate operation returned by the service.
     * @sample PDFAPIClient.PostStampTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostStampTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PostStampTemplateResult postStampTemplate(PostStampTemplateRequest postStampTemplateRequest) {
        HttpResponseHandler<PostStampTemplateResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostStampTemplateResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostStampTemplateRequest, PostStampTemplateResult>()
                .withMarshaller(new PostStampTemplateRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postStampTemplateRequest));
    }

    /**
     * Create the error response handler for the operation.
     * 
     * @param errorShapeMetadata
     *        Error metadata for the given operation
     * @return Configured error response handler to pass to HTTP layer
     */
    private HttpResponseHandler<SdkBaseException> createErrorResponseHandler(JsonErrorShapeMetadata... errorShapeMetadata) {
        return protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata().withErrorShapes(Arrays.asList(errorShapeMetadata)));
    }

    @Override
    public void shutdown() {
        clientHandler.shutdown();
    }

}

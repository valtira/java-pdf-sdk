/**
 * null
 */
package com.valtira.pdf.api;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import com.valtira.pdf.api.model.*;

/**
 * Interface for accessing PDFAPIClient.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface PDFAPI {

    /**
     * @param postAssembleRequest
     * @return Result of the PostAssemble operation returned by the service.
     * @sample PDFAPIClient.PostAssemble
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostAssemble" target="_top">AWS API
     *      Documentation</a>
     */
    PostAssembleResult postAssemble(PostAssembleRequest postAssembleRequest);

    /**
     * @param postBookmarkRequest
     * @return Result of the PostBookmark operation returned by the service.
     * @sample PDFAPIClient.PostBookmark
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostBookmark" target="_top">AWS API
     *      Documentation</a>
     */
    PostBookmarkResult postBookmark(PostBookmarkRequest postBookmarkRequest);

    /**
     * @param postBuildTableRequest
     * @return Result of the PostBuildTable operation returned by the service.
     * @sample PDFAPIClient.PostBuildTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostBuildTable" target="_top">AWS API
     *      Documentation</a>
     */
    PostBuildTableResult postBuildTable(PostBuildTableRequest postBuildTableRequest);

    /**
     * @param postEmbedImageRequest
     * @return Result of the PostEmbedImage operation returned by the service.
     * @sample PDFAPIClient.PostEmbedImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostEmbedImage" target="_top">AWS API
     *      Documentation</a>
     */
    PostEmbedImageResult postEmbedImage(PostEmbedImageRequest postEmbedImageRequest);

    /**
     * @param postExecuteStepsRequest
     * @return Result of the PostExecuteSteps operation returned by the service.
     * @sample PDFAPIClient.PostExecuteSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostExecuteSteps" target="_top">AWS API
     *      Documentation</a>
     */
    PostExecuteStepsResult postExecuteSteps(PostExecuteStepsRequest postExecuteStepsRequest);

    /**
     * @param postExtractTextRequest
     * @return Result of the PostExtractText operation returned by the service.
     * @sample PDFAPIClient.PostExtractText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostExtractText" target="_top">AWS API
     *      Documentation</a>
     */
    PostExtractTextResult postExtractText(PostExtractTextRequest postExtractTextRequest);

    /**
     * @param postFillAcroFormRequest
     * @return Result of the PostFillAcroForm operation returned by the service.
     * @sample PDFAPIClient.PostFillAcroForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostFillAcroForm" target="_top">AWS API
     *      Documentation</a>
     */
    PostFillAcroFormResult postFillAcroForm(PostFillAcroFormRequest postFillAcroFormRequest);

    /**
     * @param postFillAcroFormBulkRequest
     * @return Result of the PostFillAcroFormBulk operation returned by the service.
     * @sample PDFAPIClient.PostFillAcroFormBulk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostFillAcroFormBulk" target="_top">AWS API
     *      Documentation</a>
     */
    PostFillAcroFormBulkResult postFillAcroFormBulk(PostFillAcroFormBulkRequest postFillAcroFormBulkRequest);

    /**
     * @param postHtmlToPdfRequest
     * @return Result of the PostHtmlToPdf operation returned by the service.
     * @sample PDFAPIClient.PostHtmlToPdf
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostHtmlToPdf" target="_top">AWS API
     *      Documentation</a>
     */
    PostHtmlToPdfResult postHtmlToPdf(PostHtmlToPdfRequest postHtmlToPdfRequest);

    /**
     * @param postStampTableRequest
     * @return Result of the PostStampTable operation returned by the service.
     * @sample PDFAPIClient.PostStampTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostStampTable" target="_top">AWS API
     *      Documentation</a>
     */
    PostStampTableResult postStampTable(PostStampTableRequest postStampTableRequest);

    /**
     * @param postStampTemplateRequest
     * @return Result of the PostStampTemplate operation returned by the service.
     * @sample PDFAPIClient.PostStampTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostStampTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    PostStampTemplateResult postStampTemplate(PostStampTemplateRequest postStampTemplateRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static PDFAPIClientBuilder builder() {
        return new PDFAPIClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}

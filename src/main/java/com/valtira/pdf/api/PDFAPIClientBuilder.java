/**
 * null
 */
package com.valtira.pdf.api;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.Protocol;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link com.valtira.pdf.api.PDFAPI}.
 * 
 * @see com.valtira.pdf.api.PDFAPI#builder
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class PDFAPIClientBuilder extends SdkSyncClientBuilder<PDFAPIClientBuilder, PDFAPI> {

    private static final URI DEFAULT_ENDPOINT = RuntimeHttpUtils.toUri("qpa5b6ufv6.execute-api.us-east-2.amazonaws.com", Protocol.HTTPS);
    private static final String DEFAULT_REGION = "us-east-2";

    /**
     * Package private constructor - builder should be created via {@link PDFAPI#builder()}
     */
    PDFAPIClientBuilder() {
        super(new ApiGatewayClientConfigurationFactory());
    }

    /**
     * Specify the API Key to send with requests.
     *
     * @param apiKey
     *        API Key that identifies caller.
     * @return This object for method chaining.
     */
    @Override
    public void setApiKey(String apiKey) {
        super.setApiKey(apiKey);
    }

    /**
     * Specify the API Key to send with requests.
     *
     * @param apiKey
     *        API Key that identifies caller.
     * @return This object for method chaining.
     */
    public PDFAPIClientBuilder apiKey(String apiKey) {
        setApiKey(apiKey);
        return this;
    }

    /**
     * Construct a synchronous implementation of PDFAPIClient using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of PDFAPIClient.
     */
    @Override
    protected PDFAPI build(AwsSyncClientParams params) {
        return new PDFAPIClient(params);
    }

    @Override
    protected URI defaultEndpoint() {
        return DEFAULT_ENDPOINT;
    }

    @Override
    protected String defaultRegion() {
        return DEFAULT_REGION;
    }

}

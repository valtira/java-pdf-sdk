/**
 * null
 */
package com.valtira.pdf.api.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostStampTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostStampTemplateRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String apiKey;

    private StampTemplate stampTemplate;

    /**
     * @param apiKey
     */

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * @return
     */

    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @param apiKey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostStampTemplateRequest apiKey(String apiKey) {
        setApiKey(apiKey);
        return this;
    }

    /**
     * @param stampTemplate
     */

    public void setStampTemplate(StampTemplate stampTemplate) {
        this.stampTemplate = stampTemplate;
    }

    /**
     * @return
     */

    public StampTemplate getStampTemplate() {
        return this.stampTemplate;
    }

    /**
     * @param stampTemplate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostStampTemplateRequest stampTemplate(StampTemplate stampTemplate) {
        setStampTemplate(stampTemplate);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApiKey() != null)
            sb.append("ApiKey: ").append(getApiKey()).append(",");
        if (getStampTemplate() != null)
            sb.append("StampTemplate: ").append(getStampTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostStampTemplateRequest == false)
            return false;
        PostStampTemplateRequest other = (PostStampTemplateRequest) obj;
        if (other.getApiKey() == null ^ this.getApiKey() == null)
            return false;
        if (other.getApiKey() != null && other.getApiKey().equals(this.getApiKey()) == false)
            return false;
        if (other.getStampTemplate() == null ^ this.getStampTemplate() == null)
            return false;
        if (other.getStampTemplate() != null && other.getStampTemplate().equals(this.getStampTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiKey() == null) ? 0 : getApiKey().hashCode());
        hashCode = prime * hashCode + ((getStampTemplate() == null) ? 0 : getStampTemplate().hashCode());
        return hashCode;
    }

    @Override
    public PostStampTemplateRequest clone() {
        return (PostStampTemplateRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public PostStampTemplateRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}

/**
 * null
 */
package com.valtira.pdf.api.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostFillAcroFormBulk" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostFillAcroFormBulkRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String apiKey;

    private BulkAcroForm bulkAcroForm;

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

    public PostFillAcroFormBulkRequest apiKey(String apiKey) {
        setApiKey(apiKey);
        return this;
    }

    /**
     * @param bulkAcroForm
     */

    public void setBulkAcroForm(BulkAcroForm bulkAcroForm) {
        this.bulkAcroForm = bulkAcroForm;
    }

    /**
     * @return
     */

    public BulkAcroForm getBulkAcroForm() {
        return this.bulkAcroForm;
    }

    /**
     * @param bulkAcroForm
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostFillAcroFormBulkRequest bulkAcroForm(BulkAcroForm bulkAcroForm) {
        setBulkAcroForm(bulkAcroForm);
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
        if (getBulkAcroForm() != null)
            sb.append("BulkAcroForm: ").append(getBulkAcroForm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostFillAcroFormBulkRequest == false)
            return false;
        PostFillAcroFormBulkRequest other = (PostFillAcroFormBulkRequest) obj;
        if (other.getApiKey() == null ^ this.getApiKey() == null)
            return false;
        if (other.getApiKey() != null && other.getApiKey().equals(this.getApiKey()) == false)
            return false;
        if (other.getBulkAcroForm() == null ^ this.getBulkAcroForm() == null)
            return false;
        if (other.getBulkAcroForm() != null && other.getBulkAcroForm().equals(this.getBulkAcroForm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiKey() == null) ? 0 : getApiKey().hashCode());
        hashCode = prime * hashCode + ((getBulkAcroForm() == null) ? 0 : getBulkAcroForm().hashCode());
        return hashCode;
    }

    @Override
    public PostFillAcroFormBulkRequest clone() {
        return (PostFillAcroFormBulkRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public PostFillAcroFormBulkRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}

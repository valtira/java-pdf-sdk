/**
 * null
 */
package com.valtira.pdf.api.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostFillAcroForm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostFillAcroFormRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private AcroForm acroForm;

    private String apiKey;

    /**
     * @param acroForm
     */

    public void setAcroForm(AcroForm acroForm) {
        this.acroForm = acroForm;
    }

    /**
     * @return
     */

    public AcroForm getAcroForm() {
        return this.acroForm;
    }

    /**
     * @param acroForm
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostFillAcroFormRequest acroForm(AcroForm acroForm) {
        setAcroForm(acroForm);
        return this;
    }

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

    public PostFillAcroFormRequest apiKey(String apiKey) {
        setApiKey(apiKey);
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
        if (getAcroForm() != null)
            sb.append("AcroForm: ").append(getAcroForm()).append(",");
        if (getApiKey() != null)
            sb.append("ApiKey: ").append(getApiKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostFillAcroFormRequest == false)
            return false;
        PostFillAcroFormRequest other = (PostFillAcroFormRequest) obj;
        if (other.getAcroForm() == null ^ this.getAcroForm() == null)
            return false;
        if (other.getAcroForm() != null && other.getAcroForm().equals(this.getAcroForm()) == false)
            return false;
        if (other.getApiKey() == null ^ this.getApiKey() == null)
            return false;
        if (other.getApiKey() != null && other.getApiKey().equals(this.getApiKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcroForm() == null) ? 0 : getAcroForm().hashCode());
        hashCode = prime * hashCode + ((getApiKey() == null) ? 0 : getApiKey().hashCode());
        return hashCode;
    }

    @Override
    public PostFillAcroFormRequest clone() {
        return (PostFillAcroFormRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public PostFillAcroFormRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}

/**
 * null
 */
package com.valtira.pdf.api.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostAssemble" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostAssembleRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String apiKey;

    private Assemble assemble;

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

    public PostAssembleRequest apiKey(String apiKey) {
        setApiKey(apiKey);
        return this;
    }

    /**
     * @param assemble
     */

    public void setAssemble(Assemble assemble) {
        this.assemble = assemble;
    }

    /**
     * @return
     */

    public Assemble getAssemble() {
        return this.assemble;
    }

    /**
     * @param assemble
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostAssembleRequest assemble(Assemble assemble) {
        setAssemble(assemble);
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
        if (getAssemble() != null)
            sb.append("Assemble: ").append(getAssemble());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostAssembleRequest == false)
            return false;
        PostAssembleRequest other = (PostAssembleRequest) obj;
        if (other.getApiKey() == null ^ this.getApiKey() == null)
            return false;
        if (other.getApiKey() != null && other.getApiKey().equals(this.getApiKey()) == false)
            return false;
        if (other.getAssemble() == null ^ this.getAssemble() == null)
            return false;
        if (other.getAssemble() != null && other.getAssemble().equals(this.getAssemble()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiKey() == null) ? 0 : getApiKey().hashCode());
        hashCode = prime * hashCode + ((getAssemble() == null) ? 0 : getAssemble().hashCode());
        return hashCode;
    }

    @Override
    public PostAssembleRequest clone() {
        return (PostAssembleRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public PostAssembleRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}

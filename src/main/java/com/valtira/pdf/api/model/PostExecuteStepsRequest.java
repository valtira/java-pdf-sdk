/**
 * null
 */
package com.valtira.pdf.api.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostExecuteSteps" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostExecuteStepsRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String apiKey;

    private Steps steps;

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

    public PostExecuteStepsRequest apiKey(String apiKey) {
        setApiKey(apiKey);
        return this;
    }

    /**
     * @param steps
     */

    public void setSteps(Steps steps) {
        this.steps = steps;
    }

    /**
     * @return
     */

    public Steps getSteps() {
        return this.steps;
    }

    /**
     * @param steps
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostExecuteStepsRequest steps(Steps steps) {
        setSteps(steps);
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
        if (getSteps() != null)
            sb.append("Steps: ").append(getSteps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostExecuteStepsRequest == false)
            return false;
        PostExecuteStepsRequest other = (PostExecuteStepsRequest) obj;
        if (other.getApiKey() == null ^ this.getApiKey() == null)
            return false;
        if (other.getApiKey() != null && other.getApiKey().equals(this.getApiKey()) == false)
            return false;
        if (other.getSteps() == null ^ this.getSteps() == null)
            return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiKey() == null) ? 0 : getApiKey().hashCode());
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        return hashCode;
    }

    @Override
    public PostExecuteStepsRequest clone() {
        return (PostExecuteStepsRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public PostExecuteStepsRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}

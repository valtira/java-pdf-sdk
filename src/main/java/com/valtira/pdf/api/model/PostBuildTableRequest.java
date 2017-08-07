/**
 * null
 */
package com.valtira.pdf.api.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostBuildTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostBuildTableRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String apiKey;

    private BuildTable buildTable;

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

    public PostBuildTableRequest apiKey(String apiKey) {
        setApiKey(apiKey);
        return this;
    }

    /**
     * @param buildTable
     */

    public void setBuildTable(BuildTable buildTable) {
        this.buildTable = buildTable;
    }

    /**
     * @return
     */

    public BuildTable getBuildTable() {
        return this.buildTable;
    }

    /**
     * @param buildTable
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostBuildTableRequest buildTable(BuildTable buildTable) {
        setBuildTable(buildTable);
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
        if (getBuildTable() != null)
            sb.append("BuildTable: ").append(getBuildTable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostBuildTableRequest == false)
            return false;
        PostBuildTableRequest other = (PostBuildTableRequest) obj;
        if (other.getApiKey() == null ^ this.getApiKey() == null)
            return false;
        if (other.getApiKey() != null && other.getApiKey().equals(this.getApiKey()) == false)
            return false;
        if (other.getBuildTable() == null ^ this.getBuildTable() == null)
            return false;
        if (other.getBuildTable() != null && other.getBuildTable().equals(this.getBuildTable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiKey() == null) ? 0 : getApiKey().hashCode());
        hashCode = prime * hashCode + ((getBuildTable() == null) ? 0 : getBuildTable().hashCode());
        return hashCode;
    }

    @Override
    public PostBuildTableRequest clone() {
        return (PostBuildTableRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public PostBuildTableRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}

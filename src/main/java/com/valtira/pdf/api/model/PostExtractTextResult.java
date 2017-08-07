/**
 * null
 */
package com.valtira.pdf.api.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostExtractText" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostExtractTextResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private StringResult stringResult;

    /**
     * @param stringResult
     */

    public void setStringResult(StringResult stringResult) {
        this.stringResult = stringResult;
    }

    /**
     * @return
     */

    public StringResult getStringResult() {
        return this.stringResult;
    }

    /**
     * @param stringResult
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostExtractTextResult stringResult(StringResult stringResult) {
        setStringResult(stringResult);
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
        if (getStringResult() != null)
            sb.append("StringResult: ").append(getStringResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostExtractTextResult == false)
            return false;
        PostExtractTextResult other = (PostExtractTextResult) obj;
        if (other.getStringResult() == null ^ this.getStringResult() == null)
            return false;
        if (other.getStringResult() != null && other.getStringResult().equals(this.getStringResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStringResult() == null) ? 0 : getStringResult().hashCode());
        return hashCode;
    }

    @Override
    public PostExtractTextResult clone() {
        try {
            return (PostExtractTextResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

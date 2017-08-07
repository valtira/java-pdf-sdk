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
public class PostAssembleResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private AssembleResult assembleResult;

    /**
     * @param assembleResult
     */

    public void setAssembleResult(AssembleResult assembleResult) {
        this.assembleResult = assembleResult;
    }

    /**
     * @return
     */

    public AssembleResult getAssembleResult() {
        return this.assembleResult;
    }

    /**
     * @param assembleResult
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostAssembleResult assembleResult(AssembleResult assembleResult) {
        setAssembleResult(assembleResult);
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
        if (getAssembleResult() != null)
            sb.append("AssembleResult: ").append(getAssembleResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostAssembleResult == false)
            return false;
        PostAssembleResult other = (PostAssembleResult) obj;
        if (other.getAssembleResult() == null ^ this.getAssembleResult() == null)
            return false;
        if (other.getAssembleResult() != null && other.getAssembleResult().equals(this.getAssembleResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssembleResult() == null) ? 0 : getAssembleResult().hashCode());
        return hashCode;
    }

    @Override
    public PostAssembleResult clone() {
        try {
            return (PostAssembleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

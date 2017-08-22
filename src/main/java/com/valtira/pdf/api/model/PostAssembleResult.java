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

    private AssembleResult result;

    /**
     * @param assembleResult
     */

    public void setResult(AssembleResult assembleResult) {
        this.result = assembleResult;
    }

    /**
     * @return
     */

    public AssembleResult getResult() {
        return this.result;
    }

    /**
     * @param assembleResult
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostAssembleResult assembleResult(AssembleResult assembleResult) {
        setResult(assembleResult);
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
        if (getResult() != null)
            sb.append("AssembleResult: ").append(getResult());
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
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
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

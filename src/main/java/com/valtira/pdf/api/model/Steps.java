/**
 * null
 */
package com.valtira.pdf.api.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/Steps" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Steps implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<Step> steps;

    /**
     * @return
     */

    public java.util.List<Step> getSteps() {
        return steps;
    }

    /**
     * @param steps
     */

    public void setSteps(java.util.Collection<Step> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        this.steps = new java.util.ArrayList<Step>(steps);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSteps(java.util.Collection)} or {@link #withSteps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param steps
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Steps steps(Step... steps) {
        if (this.steps == null) {
            setSteps(new java.util.ArrayList<Step>(steps.length));
        }
        for (Step ele : steps) {
            this.steps.add(ele);
        }
        return this;
    }

    /**
     * @param steps
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Steps steps(java.util.Collection<Step> steps) {
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

        if (obj instanceof Steps == false)
            return false;
        Steps other = (Steps) obj;
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

        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        return hashCode;
    }

    @Override
    public Steps clone() {
        try {
            return (Steps) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.StepsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

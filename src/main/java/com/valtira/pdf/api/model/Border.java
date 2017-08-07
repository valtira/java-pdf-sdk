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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/Border" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Border implements Serializable, Cloneable, StructuredPojo {

    private Color color;

    private Double width;

    /**
     * @param color
     */

    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return
     */

    public Color getColor() {
        return this.color;
    }

    /**
     * @param color
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Border color(Color color) {
        setColor(color);
        return this;
    }

    /**
     * @param width
     */

    public void setWidth(Double width) {
        this.width = width;
    }

    /**
     * @return
     */

    public Double getWidth() {
        return this.width;
    }

    /**
     * @param width
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Border width(Double width) {
        setWidth(width);
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
        if (getColor() != null)
            sb.append("Color: ").append(getColor()).append(",");
        if (getWidth() != null)
            sb.append("Width: ").append(getWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Border == false)
            return false;
        Border other = (Border) obj;
        if (other.getColor() == null ^ this.getColor() == null)
            return false;
        if (other.getColor() != null && other.getColor().equals(this.getColor()) == false)
            return false;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColor() == null) ? 0 : getColor().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        return hashCode;
    }

    @Override
    public Border clone() {
        try {
            return (Border) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.BorderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

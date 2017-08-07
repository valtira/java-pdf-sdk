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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/Color" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Color implements Serializable, Cloneable, StructuredPojo {

    private Integer b;

    private String baseColor;

    private Integer g;

    private Integer r;

    /**
     * @param b
     */

    public void setB(Integer b) {
        this.b = b;
    }

    /**
     * @return
     */

    public Integer getB() {
        return this.b;
    }

    /**
     * @param b
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Color b(Integer b) {
        setB(b);
        return this;
    }

    /**
     * @param baseColor
     */

    public void setBaseColor(String baseColor) {
        this.baseColor = baseColor;
    }

    /**
     * @return
     */

    public String getBaseColor() {
        return this.baseColor;
    }

    /**
     * @param baseColor
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Color baseColor(String baseColor) {
        setBaseColor(baseColor);
        return this;
    }

    /**
     * @param g
     */

    public void setG(Integer g) {
        this.g = g;
    }

    /**
     * @return
     */

    public Integer getG() {
        return this.g;
    }

    /**
     * @param g
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Color g(Integer g) {
        setG(g);
        return this;
    }

    /**
     * @param r
     */

    public void setR(Integer r) {
        this.r = r;
    }

    /**
     * @return
     */

    public Integer getR() {
        return this.r;
    }

    /**
     * @param r
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Color r(Integer r) {
        setR(r);
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
        if (getB() != null)
            sb.append("B: ").append(getB()).append(",");
        if (getBaseColor() != null)
            sb.append("BaseColor: ").append(getBaseColor()).append(",");
        if (getG() != null)
            sb.append("G: ").append(getG()).append(",");
        if (getR() != null)
            sb.append("R: ").append(getR());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Color == false)
            return false;
        Color other = (Color) obj;
        if (other.getB() == null ^ this.getB() == null)
            return false;
        if (other.getB() != null && other.getB().equals(this.getB()) == false)
            return false;
        if (other.getBaseColor() == null ^ this.getBaseColor() == null)
            return false;
        if (other.getBaseColor() != null && other.getBaseColor().equals(this.getBaseColor()) == false)
            return false;
        if (other.getG() == null ^ this.getG() == null)
            return false;
        if (other.getG() != null && other.getG().equals(this.getG()) == false)
            return false;
        if (other.getR() == null ^ this.getR() == null)
            return false;
        if (other.getR() != null && other.getR().equals(this.getR()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getB() == null) ? 0 : getB().hashCode());
        hashCode = prime * hashCode + ((getBaseColor() == null) ? 0 : getBaseColor().hashCode());
        hashCode = prime * hashCode + ((getG() == null) ? 0 : getG().hashCode());
        hashCode = prime * hashCode + ((getR() == null) ? 0 : getR().hashCode());
        return hashCode;
    }

    @Override
    public Color clone() {
        try {
            return (Color) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.ColorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

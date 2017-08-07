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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/Font" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Font implements Serializable, Cloneable, StructuredPojo {

    private Color color;

    private String family;

    private Integer size;

    private String style;

    private String url;

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

    public Font color(Color color) {
        setColor(color);
        return this;
    }

    /**
     * @param family
     */

    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * @return
     */

    public String getFamily() {
        return this.family;
    }

    /**
     * @param family
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Font family(String family) {
        setFamily(family);
        return this;
    }

    /**
     * @param size
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * @return
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * @param size
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Font size(Integer size) {
        setSize(size);
        return this;
    }

    /**
     * @param style
     */

    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * @return
     */

    public String getStyle() {
        return this.style;
    }

    /**
     * @param style
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Font style(String style) {
        setStyle(style);
        return this;
    }

    /**
     * @param url
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * @param url
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Font url(String url) {
        setUrl(url);
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
        if (getFamily() != null)
            sb.append("Family: ").append(getFamily()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getStyle() != null)
            sb.append("Style: ").append(getStyle()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Font == false)
            return false;
        Font other = (Font) obj;
        if (other.getColor() == null ^ this.getColor() == null)
            return false;
        if (other.getColor() != null && other.getColor().equals(this.getColor()) == false)
            return false;
        if (other.getFamily() == null ^ this.getFamily() == null)
            return false;
        if (other.getFamily() != null && other.getFamily().equals(this.getFamily()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getStyle() == null ^ this.getStyle() == null)
            return false;
        if (other.getStyle() != null && other.getStyle().equals(this.getStyle()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColor() == null) ? 0 : getColor().hashCode());
        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getStyle() == null) ? 0 : getStyle().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public Font clone() {
        try {
            return (Font) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.FontMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

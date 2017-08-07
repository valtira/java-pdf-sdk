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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/FieldsItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldsItem implements Serializable, Cloneable, StructuredPojo {

    private String fieldType;

    private Font font;

    private String name;

    private String value;

    private Integer x;

    private Integer y;

    /**
     * @param fieldType
     */

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    /**
     * @return
     */

    public String getFieldType() {
        return this.fieldType;
    }

    /**
     * @param fieldType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldsItem fieldType(String fieldType) {
        setFieldType(fieldType);
        return this;
    }

    /**
     * @param font
     */

    public void setFont(Font font) {
        this.font = font;
    }

    /**
     * @return
     */

    public Font getFont() {
        return this.font;
    }

    /**
     * @param font
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldsItem font(Font font) {
        setFont(font);
        return this;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldsItem name(String name) {
        setName(name);
        return this;
    }

    /**
     * @param value
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return
     */

    public String getValue() {
        return this.value;
    }

    /**
     * @param value
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldsItem value(String value) {
        setValue(value);
        return this;
    }

    /**
     * @param x
     */

    public void setX(Integer x) {
        this.x = x;
    }

    /**
     * @return
     */

    public Integer getX() {
        return this.x;
    }

    /**
     * @param x
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldsItem x(Integer x) {
        setX(x);
        return this;
    }

    /**
     * @param y
     */

    public void setY(Integer y) {
        this.y = y;
    }

    /**
     * @return
     */

    public Integer getY() {
        return this.y;
    }

    /**
     * @param y
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldsItem y(Integer y) {
        setY(y);
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
        if (getFieldType() != null)
            sb.append("FieldType: ").append(getFieldType()).append(",");
        if (getFont() != null)
            sb.append("Font: ").append(getFont()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getX() != null)
            sb.append("X: ").append(getX()).append(",");
        if (getY() != null)
            sb.append("Y: ").append(getY());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldsItem == false)
            return false;
        FieldsItem other = (FieldsItem) obj;
        if (other.getFieldType() == null ^ this.getFieldType() == null)
            return false;
        if (other.getFieldType() != null && other.getFieldType().equals(this.getFieldType()) == false)
            return false;
        if (other.getFont() == null ^ this.getFont() == null)
            return false;
        if (other.getFont() != null && other.getFont().equals(this.getFont()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getX() == null ^ this.getX() == null)
            return false;
        if (other.getX() != null && other.getX().equals(this.getX()) == false)
            return false;
        if (other.getY() == null ^ this.getY() == null)
            return false;
        if (other.getY() != null && other.getY().equals(this.getY()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldType() == null) ? 0 : getFieldType().hashCode());
        hashCode = prime * hashCode + ((getFont() == null) ? 0 : getFont().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getX() == null) ? 0 : getX().hashCode());
        hashCode = prime * hashCode + ((getY() == null) ? 0 : getY().hashCode());
        return hashCode;
    }

    @Override
    public FieldsItem clone() {
        try {
            return (FieldsItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.FieldsItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

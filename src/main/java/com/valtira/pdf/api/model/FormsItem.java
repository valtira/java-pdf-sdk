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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/FormsItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FormsItem implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<FieldsItem> fields;

    /**
     * @return
     */

    public java.util.List<FieldsItem> getFields() {
        return fields;
    }

    /**
     * @param fields
     */

    public void setFields(java.util.Collection<FieldsItem> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new java.util.ArrayList<FieldsItem>(fields);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFields(java.util.Collection)} or {@link #withFields(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fields
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormsItem fields(FieldsItem... fields) {
        if (this.fields == null) {
            setFields(new java.util.ArrayList<FieldsItem>(fields.length));
        }
        for (FieldsItem ele : fields) {
            this.fields.add(ele);
        }
        return this;
    }

    /**
     * @param fields
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormsItem fields(java.util.Collection<FieldsItem> fields) {
        setFields(fields);
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
        if (getFields() != null)
            sb.append("Fields: ").append(getFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FormsItem == false)
            return false;
        FormsItem other = (FormsItem) obj;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        return hashCode;
    }

    @Override
    public FormsItem clone() {
        try {
            return (FormsItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.FormsItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

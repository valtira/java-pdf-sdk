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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/BulkAcroForm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BulkAcroForm implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<FormsItem> forms;

    private FileLocation template;

    /**
     * @return
     */

    public java.util.List<FormsItem> getForms() {
        return forms;
    }

    /**
     * @param forms
     */

    public void setForms(java.util.Collection<FormsItem> forms) {
        if (forms == null) {
            this.forms = null;
            return;
        }

        this.forms = new java.util.ArrayList<FormsItem>(forms);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setForms(java.util.Collection)} or {@link #withForms(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param forms
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkAcroForm forms(FormsItem... forms) {
        if (this.forms == null) {
            setForms(new java.util.ArrayList<FormsItem>(forms.length));
        }
        for (FormsItem ele : forms) {
            this.forms.add(ele);
        }
        return this;
    }

    /**
     * @param forms
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkAcroForm forms(java.util.Collection<FormsItem> forms) {
        setForms(forms);
        return this;
    }

    /**
     * @param template
     */

    public void setTemplate(FileLocation template) {
        this.template = template;
    }

    /**
     * @return
     */

    public FileLocation getTemplate() {
        return this.template;
    }

    /**
     * @param template
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkAcroForm template(FileLocation template) {
        setTemplate(template);
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
        if (getForms() != null)
            sb.append("Forms: ").append(getForms()).append(",");
        if (getTemplate() != null)
            sb.append("Template: ").append(getTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BulkAcroForm == false)
            return false;
        BulkAcroForm other = (BulkAcroForm) obj;
        if (other.getForms() == null ^ this.getForms() == null)
            return false;
        if (other.getForms() != null && other.getForms().equals(this.getForms()) == false)
            return false;
        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForms() == null) ? 0 : getForms().hashCode());
        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        return hashCode;
    }

    @Override
    public BulkAcroForm clone() {
        try {
            return (BulkAcroForm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.BulkAcroFormMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

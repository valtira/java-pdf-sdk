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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/Step" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Step implements Serializable, Cloneable, StructuredPojo {

	public enum Name {
		Assemble,
		FillAcroForm,
		FillAcroFormBulk,
		Bookmark,
		BuildTable,
		EmbedImage,
		ExecuteSteps,
		ExtractText,
		HTMLtoPDF,
		StampTable,
		StampTemplate;
		
		@Override
		public String toString() {
			
			switch (this) {
				case Assemble: return "assemble";
				case FillAcroForm: return "fill-acro-form";
				case FillAcroFormBulk:  return "fill-acro-form/bulk";
				case Bookmark: return "bookmark";
				case BuildTable: return "build-table";
				case EmbedImage: return "embed-image";
				case ExecuteSteps: return "execute-steps";
				case ExtractText: return "extract-text";
				case HTMLtoPDF: return "html-to-pdf";
				case StampTable: return "stamp-table";
				case StampTemplate: return "stamp-template";
				default: return "";
			}			
		}
	};
	
	
    private StructuredPojo details;

    private Name name;

    /**
     * @param details
     */

    public void setDetails(StructuredPojo details) {
        this.details = details;
    }

    /**
     * @return
     */

    public StructuredPojo getDetails() {
        return this.details;
    }

    /**
     * @param details
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step details(StructuredPojo details) {
        setDetails(details);
        return this;
    }

    /**
     * @param name
     */

    public void setName(Name name) {
        this.name = name;
    }

    /**
     * @return
     */

    public Name getName() {
        return this.name;
    }
    
    public String getNameAsString() {
        return this.name.toString();
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step name(Name name) {
        setName(name);
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
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Step == false)
            return false;
        Step other = (Step) obj;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public Step clone() {
        try {
            return (Step) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.StepMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

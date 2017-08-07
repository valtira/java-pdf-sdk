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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/Assemble" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Assemble implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<FileLocation> pdfs;

    private FileLocation separator;

    /**
     * @return
     */

    public java.util.List<FileLocation> getPdfs() {
        return pdfs;
    }

    /**
     * @param pdfs
     */

    public void setPdfs(java.util.Collection<FileLocation> pdfs) {
        if (pdfs == null) {
            this.pdfs = null;
            return;
        }

        this.pdfs = new java.util.ArrayList<FileLocation>(pdfs);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPdfs(java.util.Collection)} or {@link #withPdfs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param pdfs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Assemble pdfs(FileLocation... pdfs) {
        if (this.pdfs == null) {
            setPdfs(new java.util.ArrayList<FileLocation>(pdfs.length));
        }
        for (FileLocation ele : pdfs) {
            this.pdfs.add(ele);
        }
        return this;
    }

    /**
     * @param pdfs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Assemble pdfs(java.util.Collection<FileLocation> pdfs) {
        setPdfs(pdfs);
        return this;
    }

    /**
     * @param separator
     */

    public void setSeparator(FileLocation separator) {
        this.separator = separator;
    }

    /**
     * @return
     */

    public FileLocation getSeparator() {
        return this.separator;
    }

    /**
     * @param separator
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Assemble separator(FileLocation separator) {
        setSeparator(separator);
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
        if (getPdfs() != null)
            sb.append("Pdfs: ").append(getPdfs()).append(",");
        if (getSeparator() != null)
            sb.append("Separator: ").append(getSeparator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Assemble == false)
            return false;
        Assemble other = (Assemble) obj;
        if (other.getPdfs() == null ^ this.getPdfs() == null)
            return false;
        if (other.getPdfs() != null && other.getPdfs().equals(this.getPdfs()) == false)
            return false;
        if (other.getSeparator() == null ^ this.getSeparator() == null)
            return false;
        if (other.getSeparator() != null && other.getSeparator().equals(this.getSeparator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPdfs() == null) ? 0 : getPdfs().hashCode());
        hashCode = prime * hashCode + ((getSeparator() == null) ? 0 : getSeparator().hashCode());
        return hashCode;
    }

    @Override
    public Assemble clone() {
        try {
            return (Assemble) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.AssembleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

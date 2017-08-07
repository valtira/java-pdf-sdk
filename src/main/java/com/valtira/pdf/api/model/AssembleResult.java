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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/AssembleResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssembleResult implements Serializable, Cloneable, StructuredPojo {

    private FileLocation location;

    private String message;

    private java.util.List<PagesItem> pages;

    private Boolean succeeded;

    /**
     * @param location
     */

    public void setLocation(FileLocation location) {
        this.location = location;
    }

    /**
     * @return
     */

    public FileLocation getLocation() {
        return this.location;
    }

    /**
     * @param location
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssembleResult location(FileLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * @param message
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * @param message
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssembleResult message(String message) {
        setMessage(message);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<PagesItem> getPages() {
        return pages;
    }

    /**
     * @param pages
     */

    public void setPages(java.util.Collection<PagesItem> pages) {
        if (pages == null) {
            this.pages = null;
            return;
        }

        this.pages = new java.util.ArrayList<PagesItem>(pages);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPages(java.util.Collection)} or {@link #withPages(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param pages
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssembleResult pages(PagesItem... pages) {
        if (this.pages == null) {
            setPages(new java.util.ArrayList<PagesItem>(pages.length));
        }
        for (PagesItem ele : pages) {
            this.pages.add(ele);
        }
        return this;
    }

    /**
     * @param pages
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssembleResult pages(java.util.Collection<PagesItem> pages) {
        setPages(pages);
        return this;
    }

    /**
     * @param succeeded
     */

    public void setSucceeded(Boolean succeeded) {
        this.succeeded = succeeded;
    }

    /**
     * @return
     */

    public Boolean getSucceeded() {
        return this.succeeded;
    }

    /**
     * @param succeeded
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssembleResult succeeded(Boolean succeeded) {
        setSucceeded(succeeded);
        return this;
    }

    /**
     * @return
     */

    public Boolean isSucceeded() {
        return this.succeeded;
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getPages() != null)
            sb.append("Pages: ").append(getPages()).append(",");
        if (getSucceeded() != null)
            sb.append("Succeeded: ").append(getSucceeded());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssembleResult == false)
            return false;
        AssembleResult other = (AssembleResult) obj;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getPages() == null ^ this.getPages() == null)
            return false;
        if (other.getPages() != null && other.getPages().equals(this.getPages()) == false)
            return false;
        if (other.getSucceeded() == null ^ this.getSucceeded() == null)
            return false;
        if (other.getSucceeded() != null && other.getSucceeded().equals(this.getSucceeded()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getPages() == null) ? 0 : getPages().hashCode());
        hashCode = prime * hashCode + ((getSucceeded() == null) ? 0 : getSucceeded().hashCode());
        return hashCode;
    }

    @Override
    public AssembleResult clone() {
        try {
            return (AssembleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.AssembleResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

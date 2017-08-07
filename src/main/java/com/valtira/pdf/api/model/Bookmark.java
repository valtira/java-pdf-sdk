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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/Bookmark" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Bookmark implements Serializable, Cloneable, StructuredPojo {

    private Integer page;

    private String title;

    /**
     * @param page
     */

    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * @return
     */

    public Integer getPage() {
        return this.page;
    }

    /**
     * @param page
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bookmark page(Integer page) {
        setPage(page);
        return this;
    }

    /**
     * @param title
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * @param title
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bookmark title(String title) {
        setTitle(title);
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
        if (getPage() != null)
            sb.append("Page: ").append(getPage()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Bookmark == false)
            return false;
        Bookmark other = (Bookmark) obj;
        if (other.getPage() == null ^ this.getPage() == null)
            return false;
        if (other.getPage() != null && other.getPage().equals(this.getPage()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPage() == null) ? 0 : getPage().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return hashCode;
    }

    @Override
    public Bookmark clone() {
        try {
            return (Bookmark) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.BookmarkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

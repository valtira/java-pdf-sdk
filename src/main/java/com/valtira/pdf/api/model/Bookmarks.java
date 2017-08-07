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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/Bookmarks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Bookmarks implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<Bookmark> bookmarks;

    private FileLocation template;

    /**
     * @return
     */

    public java.util.List<Bookmark> getBookmarks() {
        return bookmarks;
    }

    /**
     * @param bookmarks
     */

    public void setBookmarks(java.util.Collection<Bookmark> bookmarks) {
        if (bookmarks == null) {
            this.bookmarks = null;
            return;
        }

        this.bookmarks = new java.util.ArrayList<Bookmark>(bookmarks);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBookmarks(java.util.Collection)} or {@link #withBookmarks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param bookmarks
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bookmarks bookmarks(Bookmark... bookmarks) {
        if (this.bookmarks == null) {
            setBookmarks(new java.util.ArrayList<Bookmark>(bookmarks.length));
        }
        for (Bookmark ele : bookmarks) {
            this.bookmarks.add(ele);
        }
        return this;
    }

    /**
     * @param bookmarks
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bookmarks bookmarks(java.util.Collection<Bookmark> bookmarks) {
        setBookmarks(bookmarks);
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

    public Bookmarks template(FileLocation template) {
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
        if (getBookmarks() != null)
            sb.append("Bookmarks: ").append(getBookmarks()).append(",");
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

        if (obj instanceof Bookmarks == false)
            return false;
        Bookmarks other = (Bookmarks) obj;
        if (other.getBookmarks() == null ^ this.getBookmarks() == null)
            return false;
        if (other.getBookmarks() != null && other.getBookmarks().equals(this.getBookmarks()) == false)
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

        hashCode = prime * hashCode + ((getBookmarks() == null) ? 0 : getBookmarks().hashCode());
        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        return hashCode;
    }

    @Override
    public Bookmarks clone() {
        try {
            return (Bookmarks) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.BookmarksMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

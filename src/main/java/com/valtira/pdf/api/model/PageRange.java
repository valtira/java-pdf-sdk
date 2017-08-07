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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PageRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PageRange implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<Integer> pages;

    private Integer start;

    /**
     * @return
     */

    public java.util.List<Integer> getPages() {
        return pages;
    }

    /**
     * @param pages
     */

    public void setPages(java.util.Collection<Integer> pages) {
        if (pages == null) {
            this.pages = null;
            return;
        }

        this.pages = new java.util.ArrayList<Integer>(pages);
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

    public PageRange pages(Integer... pages) {
        if (this.pages == null) {
            setPages(new java.util.ArrayList<Integer>(pages.length));
        }
        for (Integer ele : pages) {
            this.pages.add(ele);
        }
        return this;
    }

    /**
     * @param pages
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PageRange pages(java.util.Collection<Integer> pages) {
        setPages(pages);
        return this;
    }

    /**
     * @param start
     */

    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * @return
     */

    public Integer getStart() {
        return this.start;
    }

    /**
     * @param start
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PageRange start(Integer start) {
        setStart(start);
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
        if (getPages() != null)
            sb.append("Pages: ").append(getPages()).append(",");
        if (getStart() != null)
            sb.append("Start: ").append(getStart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PageRange == false)
            return false;
        PageRange other = (PageRange) obj;
        if (other.getPages() == null ^ this.getPages() == null)
            return false;
        if (other.getPages() != null && other.getPages().equals(this.getPages()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPages() == null) ? 0 : getPages().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        return hashCode;
    }

    @Override
    public PageRange clone() {
        try {
            return (PageRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.PageRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

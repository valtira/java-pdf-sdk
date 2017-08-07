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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/StampTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StampTemplate implements Serializable, Cloneable, StructuredPojo {

    private String horizontalAlignment;

    private PageRange pageRange;

    private Table table;

    private FileLocation template;

    private String verticalAlignment;

    /**
     * @param horizontalAlignment
     */

    public void setHorizontalAlignment(String horizontalAlignment) {
        this.horizontalAlignment = horizontalAlignment;
    }

    /**
     * @return
     */

    public String getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /**
     * @param horizontalAlignment
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StampTemplate horizontalAlignment(String horizontalAlignment) {
        setHorizontalAlignment(horizontalAlignment);
        return this;
    }

    /**
     * @param pageRange
     */

    public void setPageRange(PageRange pageRange) {
        this.pageRange = pageRange;
    }

    /**
     * @return
     */

    public PageRange getPageRange() {
        return this.pageRange;
    }

    /**
     * @param pageRange
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StampTemplate pageRange(PageRange pageRange) {
        setPageRange(pageRange);
        return this;
    }

    /**
     * @param table
     */

    public void setTable(Table table) {
        this.table = table;
    }

    /**
     * @return
     */

    public Table getTable() {
        return this.table;
    }

    /**
     * @param table
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StampTemplate table(Table table) {
        setTable(table);
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

    public StampTemplate template(FileLocation template) {
        setTemplate(template);
        return this;
    }

    /**
     * @param verticalAlignment
     */

    public void setVerticalAlignment(String verticalAlignment) {
        this.verticalAlignment = verticalAlignment;
    }

    /**
     * @return
     */

    public String getVerticalAlignment() {
        return this.verticalAlignment;
    }

    /**
     * @param verticalAlignment
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StampTemplate verticalAlignment(String verticalAlignment) {
        setVerticalAlignment(verticalAlignment);
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
        if (getHorizontalAlignment() != null)
            sb.append("HorizontalAlignment: ").append(getHorizontalAlignment()).append(",");
        if (getPageRange() != null)
            sb.append("PageRange: ").append(getPageRange()).append(",");
        if (getTable() != null)
            sb.append("Table: ").append(getTable()).append(",");
        if (getTemplate() != null)
            sb.append("Template: ").append(getTemplate()).append(",");
        if (getVerticalAlignment() != null)
            sb.append("VerticalAlignment: ").append(getVerticalAlignment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StampTemplate == false)
            return false;
        StampTemplate other = (StampTemplate) obj;
        if (other.getHorizontalAlignment() == null ^ this.getHorizontalAlignment() == null)
            return false;
        if (other.getHorizontalAlignment() != null && other.getHorizontalAlignment().equals(this.getHorizontalAlignment()) == false)
            return false;
        if (other.getPageRange() == null ^ this.getPageRange() == null)
            return false;
        if (other.getPageRange() != null && other.getPageRange().equals(this.getPageRange()) == false)
            return false;
        if (other.getTable() == null ^ this.getTable() == null)
            return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false)
            return false;
        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        if (other.getVerticalAlignment() == null ^ this.getVerticalAlignment() == null)
            return false;
        if (other.getVerticalAlignment() != null && other.getVerticalAlignment().equals(this.getVerticalAlignment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHorizontalAlignment() == null) ? 0 : getHorizontalAlignment().hashCode());
        hashCode = prime * hashCode + ((getPageRange() == null) ? 0 : getPageRange().hashCode());
        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        hashCode = prime * hashCode + ((getVerticalAlignment() == null) ? 0 : getVerticalAlignment().hashCode());
        return hashCode;
    }

    @Override
    public StampTemplate clone() {
        try {
            return (StampTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.StampTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

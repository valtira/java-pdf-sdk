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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/StampTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StampTable implements Serializable, Cloneable, StructuredPojo {

    private String horizontalAlignment;

    private PageRange pageRange;

    private FileLocation target;

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

    public StampTable horizontalAlignment(String horizontalAlignment) {
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

    public StampTable pageRange(PageRange pageRange) {
        setPageRange(pageRange);
        return this;
    }

    /**
     * @param target
     */

    public void setTarget(FileLocation target) {
        this.target = target;
    }

    /**
     * @return
     */

    public FileLocation getTarget() {
        return this.target;
    }

    /**
     * @param target
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StampTable target(FileLocation target) {
        setTarget(target);
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

    public StampTable template(FileLocation template) {
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

    public StampTable verticalAlignment(String verticalAlignment) {
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
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
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

        if (obj instanceof StampTable == false)
            return false;
        StampTable other = (StampTable) obj;
        if (other.getHorizontalAlignment() == null ^ this.getHorizontalAlignment() == null)
            return false;
        if (other.getHorizontalAlignment() != null && other.getHorizontalAlignment().equals(this.getHorizontalAlignment()) == false)
            return false;
        if (other.getPageRange() == null ^ this.getPageRange() == null)
            return false;
        if (other.getPageRange() != null && other.getPageRange().equals(this.getPageRange()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
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
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        hashCode = prime * hashCode + ((getVerticalAlignment() == null) ? 0 : getVerticalAlignment().hashCode());
        return hashCode;
    }

    @Override
    public StampTable clone() {
        try {
            return (StampTable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.StampTableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

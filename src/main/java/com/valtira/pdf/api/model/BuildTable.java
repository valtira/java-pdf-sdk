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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/BuildTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuildTable implements Serializable, Cloneable, StructuredPojo {

    private Integer page;

    private Table table;

    private FileLocation template;

    private Double x;

    private Double y;

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

    public BuildTable page(Integer page) {
        setPage(page);
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

    public BuildTable table(Table table) {
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

    public BuildTable template(FileLocation template) {
        setTemplate(template);
        return this;
    }

    /**
     * @param x
     */

    public void setX(Double x) {
        this.x = x;
    }

    /**
     * @return
     */

    public Double getX() {
        return this.x;
    }

    /**
     * @param x
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildTable x(Double x) {
        setX(x);
        return this;
    }

    /**
     * @param y
     */

    public void setY(Double y) {
        this.y = y;
    }

    /**
     * @return
     */

    public Double getY() {
        return this.y;
    }

    /**
     * @param y
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildTable y(Double y) {
        setY(y);
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
        if (getTable() != null)
            sb.append("Table: ").append(getTable()).append(",");
        if (getTemplate() != null)
            sb.append("Template: ").append(getTemplate()).append(",");
        if (getX() != null)
            sb.append("X: ").append(getX()).append(",");
        if (getY() != null)
            sb.append("Y: ").append(getY());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BuildTable == false)
            return false;
        BuildTable other = (BuildTable) obj;
        if (other.getPage() == null ^ this.getPage() == null)
            return false;
        if (other.getPage() != null && other.getPage().equals(this.getPage()) == false)
            return false;
        if (other.getTable() == null ^ this.getTable() == null)
            return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false)
            return false;
        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        if (other.getX() == null ^ this.getX() == null)
            return false;
        if (other.getX() != null && other.getX().equals(this.getX()) == false)
            return false;
        if (other.getY() == null ^ this.getY() == null)
            return false;
        if (other.getY() != null && other.getY().equals(this.getY()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPage() == null) ? 0 : getPage().hashCode());
        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        hashCode = prime * hashCode + ((getX() == null) ? 0 : getX().hashCode());
        hashCode = prime * hashCode + ((getY() == null) ? 0 : getY().hashCode());
        return hashCode;
    }

    @Override
    public BuildTable clone() {
        try {
            return (BuildTable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.BuildTableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/Table" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Table implements Serializable, Cloneable, StructuredPojo {

    private Border border;

    private java.util.List<TableCell> cells;

    private Double fixedHeight;

    private String horizontalAlignment;

    private Double totalWidth;

    private String verticalAlignment;

    private java.util.List<Integer> widths;

    /**
     * @param border
     */

    public void setBorder(Border border) {
        this.border = border;
    }

    /**
     * @return
     */

    public Border getBorder() {
        return this.border;
    }

    /**
     * @param border
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table border(Border border) {
        setBorder(border);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<TableCell> getCells() {
        return cells;
    }

    /**
     * @param cells
     */

    public void setCells(java.util.Collection<TableCell> cells) {
        if (cells == null) {
            this.cells = null;
            return;
        }

        this.cells = new java.util.ArrayList<TableCell>(cells);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCells(java.util.Collection)} or {@link #withCells(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cells
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table cells(TableCell... cells) {
        if (this.cells == null) {
            setCells(new java.util.ArrayList<TableCell>(cells.length));
        }
        for (TableCell ele : cells) {
            this.cells.add(ele);
        }
        return this;
    }

    /**
     * @param cells
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table cells(java.util.Collection<TableCell> cells) {
        setCells(cells);
        return this;
    }

    /**
     * @param fixedHeight
     */

    public void setFixedHeight(Double fixedHeight) {
        this.fixedHeight = fixedHeight;
    }

    /**
     * @return
     */

    public Double getFixedHeight() {
        return this.fixedHeight;
    }

    /**
     * @param fixedHeight
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table fixedHeight(Double fixedHeight) {
        setFixedHeight(fixedHeight);
        return this;
    }

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

    public Table horizontalAlignment(String horizontalAlignment) {
        setHorizontalAlignment(horizontalAlignment);
        return this;
    }

    /**
     * @param totalWidth
     */

    public void setTotalWidth(Double totalWidth) {
        this.totalWidth = totalWidth;
    }

    /**
     * @return
     */

    public Double getTotalWidth() {
        return this.totalWidth;
    }

    /**
     * @param totalWidth
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table totalWidth(Double totalWidth) {
        setTotalWidth(totalWidth);
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

    public Table verticalAlignment(String verticalAlignment) {
        setVerticalAlignment(verticalAlignment);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Integer> getWidths() {
        return widths;
    }

    /**
     * @param widths
     */

    public void setWidths(java.util.Collection<Integer> widths) {
        if (widths == null) {
            this.widths = null;
            return;
        }

        this.widths = new java.util.ArrayList<Integer>(widths);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWidths(java.util.Collection)} or {@link #withWidths(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param widths
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table widths(Integer... widths) {
        if (this.widths == null) {
            setWidths(new java.util.ArrayList<Integer>(widths.length));
        }
        for (Integer ele : widths) {
            this.widths.add(ele);
        }
        return this;
    }

    /**
     * @param widths
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table widths(java.util.Collection<Integer> widths) {
        setWidths(widths);
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
        if (getBorder() != null)
            sb.append("Border: ").append(getBorder()).append(",");
        if (getCells() != null)
            sb.append("Cells: ").append(getCells()).append(",");
        if (getFixedHeight() != null)
            sb.append("FixedHeight: ").append(getFixedHeight()).append(",");
        if (getHorizontalAlignment() != null)
            sb.append("HorizontalAlignment: ").append(getHorizontalAlignment()).append(",");
        if (getTotalWidth() != null)
            sb.append("TotalWidth: ").append(getTotalWidth()).append(",");
        if (getVerticalAlignment() != null)
            sb.append("VerticalAlignment: ").append(getVerticalAlignment()).append(",");
        if (getWidths() != null)
            sb.append("Widths: ").append(getWidths());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Table == false)
            return false;
        Table other = (Table) obj;
        if (other.getBorder() == null ^ this.getBorder() == null)
            return false;
        if (other.getBorder() != null && other.getBorder().equals(this.getBorder()) == false)
            return false;
        if (other.getCells() == null ^ this.getCells() == null)
            return false;
        if (other.getCells() != null && other.getCells().equals(this.getCells()) == false)
            return false;
        if (other.getFixedHeight() == null ^ this.getFixedHeight() == null)
            return false;
        if (other.getFixedHeight() != null && other.getFixedHeight().equals(this.getFixedHeight()) == false)
            return false;
        if (other.getHorizontalAlignment() == null ^ this.getHorizontalAlignment() == null)
            return false;
        if (other.getHorizontalAlignment() != null && other.getHorizontalAlignment().equals(this.getHorizontalAlignment()) == false)
            return false;
        if (other.getTotalWidth() == null ^ this.getTotalWidth() == null)
            return false;
        if (other.getTotalWidth() != null && other.getTotalWidth().equals(this.getTotalWidth()) == false)
            return false;
        if (other.getVerticalAlignment() == null ^ this.getVerticalAlignment() == null)
            return false;
        if (other.getVerticalAlignment() != null && other.getVerticalAlignment().equals(this.getVerticalAlignment()) == false)
            return false;
        if (other.getWidths() == null ^ this.getWidths() == null)
            return false;
        if (other.getWidths() != null && other.getWidths().equals(this.getWidths()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBorder() == null) ? 0 : getBorder().hashCode());
        hashCode = prime * hashCode + ((getCells() == null) ? 0 : getCells().hashCode());
        hashCode = prime * hashCode + ((getFixedHeight() == null) ? 0 : getFixedHeight().hashCode());
        hashCode = prime * hashCode + ((getHorizontalAlignment() == null) ? 0 : getHorizontalAlignment().hashCode());
        hashCode = prime * hashCode + ((getTotalWidth() == null) ? 0 : getTotalWidth().hashCode());
        hashCode = prime * hashCode + ((getVerticalAlignment() == null) ? 0 : getVerticalAlignment().hashCode());
        hashCode = prime * hashCode + ((getWidths() == null) ? 0 : getWidths().hashCode());
        return hashCode;
    }

    @Override
    public Table clone() {
        try {
            return (Table) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.TableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

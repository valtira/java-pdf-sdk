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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/TableCell" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableCell implements Serializable, Cloneable, StructuredPojo {

    private Color fillColor;

    private Font font;

    private FileLocation image;

    private String label;

    private String link;

    private Integer localPage;

    /**
     * @param fillColor
     */

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    /**
     * @return
     */

    public Color getFillColor() {
        return this.fillColor;
    }

    /**
     * @param fillColor
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCell fillColor(Color fillColor) {
        setFillColor(fillColor);
        return this;
    }

    /**
     * @param font
     */

    public void setFont(Font font) {
        this.font = font;
    }

    /**
     * @return
     */

    public Font getFont() {
        return this.font;
    }

    /**
     * @param font
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCell font(Font font) {
        setFont(font);
        return this;
    }

    /**
     * @param image
     */

    public void setImage(FileLocation image) {
        this.image = image;
    }

    /**
     * @return
     */

    public FileLocation getImage() {
        return this.image;
    }

    /**
     * @param image
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCell image(FileLocation image) {
        setImage(image);
        return this;
    }

    /**
     * @param label
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * @param label
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCell label(String label) {
        setLabel(label);
        return this;
    }

    /**
     * @param link
     */

    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return
     */

    public String getLink() {
        return this.link;
    }

    /**
     * @param link
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCell link(String link) {
        setLink(link);
        return this;
    }

    /**
     * @param localPage
     */

    public void setLocalPage(Integer localPage) {
        this.localPage = localPage;
    }

    /**
     * @return
     */

    public Integer getLocalPage() {
        return this.localPage;
    }

    /**
     * @param localPage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCell localPage(Integer localPage) {
        setLocalPage(localPage);
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
        if (getFillColor() != null)
            sb.append("FillColor: ").append(getFillColor()).append(",");
        if (getFont() != null)
            sb.append("Font: ").append(getFont()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getLink() != null)
            sb.append("Link: ").append(getLink()).append(",");
        if (getLocalPage() != null)
            sb.append("LocalPage: ").append(getLocalPage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableCell == false)
            return false;
        TableCell other = (TableCell) obj;
        if (other.getFillColor() == null ^ this.getFillColor() == null)
            return false;
        if (other.getFillColor() != null && other.getFillColor().equals(this.getFillColor()) == false)
            return false;
        if (other.getFont() == null ^ this.getFont() == null)
            return false;
        if (other.getFont() != null && other.getFont().equals(this.getFont()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getLink() == null ^ this.getLink() == null)
            return false;
        if (other.getLink() != null && other.getLink().equals(this.getLink()) == false)
            return false;
        if (other.getLocalPage() == null ^ this.getLocalPage() == null)
            return false;
        if (other.getLocalPage() != null && other.getLocalPage().equals(this.getLocalPage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFillColor() == null) ? 0 : getFillColor().hashCode());
        hashCode = prime * hashCode + ((getFont() == null) ? 0 : getFont().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getLink() == null) ? 0 : getLink().hashCode());
        hashCode = prime * hashCode + ((getLocalPage() == null) ? 0 : getLocalPage().hashCode());
        return hashCode;
    }

    @Override
    public TableCell clone() {
        try {
            return (TableCell) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.TableCellMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

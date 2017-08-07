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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/EmbedImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmbedImage implements Serializable, Cloneable, StructuredPojo {

    private Coordinates coordinates;

    private FileLocation image;

    private FileLocation template;

    /**
     * @param coordinates
     */

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * @return
     */

    public Coordinates getCoordinates() {
        return this.coordinates;
    }

    /**
     * @param coordinates
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmbedImage coordinates(Coordinates coordinates) {
        setCoordinates(coordinates);
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

    public EmbedImage image(FileLocation image) {
        setImage(image);
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

    public EmbedImage template(FileLocation template) {
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
        if (getCoordinates() != null)
            sb.append("Coordinates: ").append(getCoordinates()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
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

        if (obj instanceof EmbedImage == false)
            return false;
        EmbedImage other = (EmbedImage) obj;
        if (other.getCoordinates() == null ^ this.getCoordinates() == null)
            return false;
        if (other.getCoordinates() != null && other.getCoordinates().equals(this.getCoordinates()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
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

        hashCode = prime * hashCode + ((getCoordinates() == null) ? 0 : getCoordinates().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        return hashCode;
    }

    @Override
    public EmbedImage clone() {
        try {
            return (EmbedImage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.EmbedImageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

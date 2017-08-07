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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/FileLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileLocation implements Serializable, Cloneable, StructuredPojo {

    private Boolean local;

    private String name;

    private S3Location s3Location;

    private String url;

    /**
     * @param local
     */

    public void setLocal(Boolean local) {
        this.local = local;
    }

    /**
     * @return
     */

    public Boolean getLocal() {
        return this.local;
    }

    /**
     * @param local
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileLocation local(Boolean local) {
        setLocal(local);
        return this;
    }

    /**
     * @return
     */

    public Boolean isLocal() {
        return this.local;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileLocation name(String name) {
        setName(name);
        return this;
    }

    /**
     * @param s3Location
     */

    public void setS3Location(S3Location s3Location) {
        this.s3Location = s3Location;
    }

    /**
     * @return
     */

    public S3Location getS3Location() {
        return this.s3Location;
    }

    /**
     * @param s3Location
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileLocation s3Location(S3Location s3Location) {
        setS3Location(s3Location);
        return this;
    }

    /**
     * @param url
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * @param url
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileLocation url(String url) {
        setUrl(url);
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
        if (getLocal() != null)
            sb.append("Local: ").append(getLocal()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getS3Location() != null)
            sb.append("S3Location: ").append(getS3Location()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileLocation == false)
            return false;
        FileLocation other = (FileLocation) obj;
        if (other.getLocal() == null ^ this.getLocal() == null)
            return false;
        if (other.getLocal() != null && other.getLocal().equals(this.getLocal()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getS3Location() == null ^ this.getS3Location() == null)
            return false;
        if (other.getS3Location() != null && other.getS3Location().equals(this.getS3Location()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocal() == null) ? 0 : getLocal().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public FileLocation clone() {
        try {
            return (FileLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.FileLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/S3Location" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Location implements Serializable, Cloneable, StructuredPojo {

    private String bucket;

    private String key;

    private String region;

    /**
     * @param bucket
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * @return
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * @param bucket
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location bucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * @param key
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return
     */

    public String getKey() {
        return this.key;
    }

    /**
     * @param key
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location key(String key) {
        setKey(key);
        return this;
    }

    /**
     * @param region
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * @param region
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location region(String region) {
        setRegion(region);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Location == false)
            return false;
        S3Location other = (S3Location) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public S3Location clone() {
        try {
            return (S3Location) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.S3LocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

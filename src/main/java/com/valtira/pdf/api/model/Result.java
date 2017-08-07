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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/Result" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Result implements Serializable, Cloneable, StructuredPojo {

    private FileLocation location;

    private String message;

    private Boolean succeeded;

    /**
     * @param location
     */

    public void setLocation(FileLocation location) {
        this.location = location;
    }

    /**
     * @return
     */

    public FileLocation getLocation() {
        return this.location;
    }

    /**
     * @param location
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Result location(FileLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * @param message
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * @param message
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Result message(String message) {
        setMessage(message);
        return this;
    }

    /**
     * @param succeeded
     */

    public void setSucceeded(Boolean succeeded) {
        this.succeeded = succeeded;
    }

    /**
     * @return
     */

    public Boolean getSucceeded() {
        return this.succeeded;
    }

    /**
     * @param succeeded
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Result succeeded(Boolean succeeded) {
        setSucceeded(succeeded);
        return this;
    }

    /**
     * @return
     */

    public Boolean isSucceeded() {
        return this.succeeded;
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getSucceeded() != null)
            sb.append("Succeeded: ").append(getSucceeded());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Result == false)
            return false;
        Result other = (Result) obj;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSucceeded() == null ^ this.getSucceeded() == null)
            return false;
        if (other.getSucceeded() != null && other.getSucceeded().equals(this.getSucceeded()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSucceeded() == null) ? 0 : getSucceeded().hashCode());
        return hashCode;
    }

    @Override
    public Result clone() {
        try {
            return (Result) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.ResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

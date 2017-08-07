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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/StringResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StringResult implements Serializable, Cloneable, StructuredPojo {

    private String message;

    private Boolean succeeded;

    private String value;

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

    public StringResult message(String message) {
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

    public StringResult succeeded(Boolean succeeded) {
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
     * @param value
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return
     */

    public String getValue() {
        return this.value;
    }

    /**
     * @param value
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringResult value(String value) {
        setValue(value);
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getSucceeded() != null)
            sb.append("Succeeded: ").append(getSucceeded()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StringResult == false)
            return false;
        StringResult other = (StringResult) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSucceeded() == null ^ this.getSucceeded() == null)
            return false;
        if (other.getSucceeded() != null && other.getSucceeded().equals(this.getSucceeded()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSucceeded() == null) ? 0 : getSucceeded().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public StringResult clone() {
        try {
            return (StringResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.valtira.pdf.api.model.transform.StringResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

/**
 * null
 */
package com.valtira.pdf.api.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qpa5b6ufv6-1.0.2/PostBookmark" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostBookmarkRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String apiKey;

    private Bookmarks bookmarks;

    /**
     * @param apiKey
     */

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * @return
     */

    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @param apiKey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostBookmarkRequest apiKey(String apiKey) {
        setApiKey(apiKey);
        return this;
    }

    /**
     * @param bookmarks
     */

    public void setBookmarks(Bookmarks bookmarks) {
        this.bookmarks = bookmarks;
    }

    /**
     * @return
     */

    public Bookmarks getBookmarks() {
        return this.bookmarks;
    }

    /**
     * @param bookmarks
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostBookmarkRequest bookmarks(Bookmarks bookmarks) {
        setBookmarks(bookmarks);
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
        if (getApiKey() != null)
            sb.append("ApiKey: ").append(getApiKey()).append(",");
        if (getBookmarks() != null)
            sb.append("Bookmarks: ").append(getBookmarks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostBookmarkRequest == false)
            return false;
        PostBookmarkRequest other = (PostBookmarkRequest) obj;
        if (other.getApiKey() == null ^ this.getApiKey() == null)
            return false;
        if (other.getApiKey() != null && other.getApiKey().equals(this.getApiKey()) == false)
            return false;
        if (other.getBookmarks() == null ^ this.getBookmarks() == null)
            return false;
        if (other.getBookmarks() != null && other.getBookmarks().equals(this.getBookmarks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiKey() == null) ? 0 : getApiKey().hashCode());
        hashCode = prime * hashCode + ((getBookmarks() == null) ? 0 : getBookmarks().hashCode());
        return hashCode;
    }

    @Override
    public PostBookmarkRequest clone() {
        return (PostBookmarkRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public PostBookmarkRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}

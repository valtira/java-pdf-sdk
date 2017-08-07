/**
 * null
 */
package com.valtira.pdf.api.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.valtira.pdf.api.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Bookmarks JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BookmarksJsonUnmarshaller implements Unmarshaller<Bookmarks, JsonUnmarshallerContext> {

    public Bookmarks unmarshall(JsonUnmarshallerContext context) throws Exception {
        Bookmarks bookmarks = new Bookmarks();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("bookmarks", targetDepth)) {
                    context.nextToken();
                    bookmarks.setBookmarks(new ListUnmarshaller<Bookmark>(BookmarkJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("template", targetDepth)) {
                    context.nextToken();
                    bookmarks.setTemplate(FileLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return bookmarks;
    }

    private static BookmarksJsonUnmarshaller instance;

    public static BookmarksJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BookmarksJsonUnmarshaller();
        return instance;
    }
}

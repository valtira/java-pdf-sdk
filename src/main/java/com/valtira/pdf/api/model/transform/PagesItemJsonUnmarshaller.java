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
 * PagesItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PagesItemJsonUnmarshaller implements Unmarshaller<PagesItem, JsonUnmarshallerContext> {

    public PagesItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        PagesItem pagesItem = new PagesItem();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    pagesItem.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("page", targetDepth)) {
                    context.nextToken();
                    pagesItem.setPage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pagesItem;
    }

    private static PagesItemJsonUnmarshaller instance;

    public static PagesItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PagesItemJsonUnmarshaller();
        return instance;
    }
}

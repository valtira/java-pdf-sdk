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
 * PageRange JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PageRangeJsonUnmarshaller implements Unmarshaller<PageRange, JsonUnmarshallerContext> {

    public PageRange unmarshall(JsonUnmarshallerContext context) throws Exception {
        PageRange pageRange = new PageRange();

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
                if (context.testExpression("pages", targetDepth)) {
                    context.nextToken();
                    pageRange.setPages(new ListUnmarshaller<Integer>(context.getUnmarshaller(Integer.class)).unmarshall(context));
                }
                if (context.testExpression("start", targetDepth)) {
                    context.nextToken();
                    pageRange.setStart(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pageRange;
    }

    private static PageRangeJsonUnmarshaller instance;

    public static PageRangeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PageRangeJsonUnmarshaller();
        return instance;
    }
}

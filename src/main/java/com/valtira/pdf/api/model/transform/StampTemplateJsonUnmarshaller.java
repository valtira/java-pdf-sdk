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
 * StampTemplate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StampTemplateJsonUnmarshaller implements Unmarshaller<StampTemplate, JsonUnmarshallerContext> {

    public StampTemplate unmarshall(JsonUnmarshallerContext context) throws Exception {
        StampTemplate stampTemplate = new StampTemplate();

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
                if (context.testExpression("horizontalAlignment", targetDepth)) {
                    context.nextToken();
                    stampTemplate.setHorizontalAlignment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pageRange", targetDepth)) {
                    context.nextToken();
                    stampTemplate.setPageRange(PageRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("table", targetDepth)) {
                    context.nextToken();
                    stampTemplate.setTable(TableJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("template", targetDepth)) {
                    context.nextToken();
                    stampTemplate.setTemplate(FileLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("verticalAlignment", targetDepth)) {
                    context.nextToken();
                    stampTemplate.setVerticalAlignment(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return stampTemplate;
    }

    private static StampTemplateJsonUnmarshaller instance;

    public static StampTemplateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StampTemplateJsonUnmarshaller();
        return instance;
    }
}

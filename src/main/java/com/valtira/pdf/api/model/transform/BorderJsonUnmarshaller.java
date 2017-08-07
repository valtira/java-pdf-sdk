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
 * Border JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BorderJsonUnmarshaller implements Unmarshaller<Border, JsonUnmarshallerContext> {

    public Border unmarshall(JsonUnmarshallerContext context) throws Exception {
        Border border = new Border();

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
                if (context.testExpression("color", targetDepth)) {
                    context.nextToken();
                    border.setColor(ColorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("width", targetDepth)) {
                    context.nextToken();
                    border.setWidth(context.getUnmarshaller(Double.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return border;
    }

    private static BorderJsonUnmarshaller instance;

    public static BorderJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BorderJsonUnmarshaller();
        return instance;
    }
}

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
 * Color JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColorJsonUnmarshaller implements Unmarshaller<Color, JsonUnmarshallerContext> {

    public Color unmarshall(JsonUnmarshallerContext context) throws Exception {
        Color color = new Color();

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
                if (context.testExpression("b", targetDepth)) {
                    context.nextToken();
                    color.setB(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("baseColor", targetDepth)) {
                    context.nextToken();
                    color.setBaseColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("g", targetDepth)) {
                    context.nextToken();
                    color.setG(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("r", targetDepth)) {
                    context.nextToken();
                    color.setR(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return color;
    }

    private static ColorJsonUnmarshaller instance;

    public static ColorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ColorJsonUnmarshaller();
        return instance;
    }
}

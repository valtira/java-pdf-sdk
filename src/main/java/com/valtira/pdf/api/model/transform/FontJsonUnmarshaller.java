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
 * Font JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FontJsonUnmarshaller implements Unmarshaller<Font, JsonUnmarshallerContext> {

    public Font unmarshall(JsonUnmarshallerContext context) throws Exception {
        Font font = new Font();

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
                    font.setColor(ColorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("family", targetDepth)) {
                    context.nextToken();
                    font.setFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("size", targetDepth)) {
                    context.nextToken();
                    font.setSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("style", targetDepth)) {
                    context.nextToken();
                    font.setStyle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("url", targetDepth)) {
                    context.nextToken();
                    font.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return font;
    }

    private static FontJsonUnmarshaller instance;

    public static FontJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FontJsonUnmarshaller();
        return instance;
    }
}

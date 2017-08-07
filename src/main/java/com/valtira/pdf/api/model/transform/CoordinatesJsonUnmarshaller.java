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
 * Coordinates JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoordinatesJsonUnmarshaller implements Unmarshaller<Coordinates, JsonUnmarshallerContext> {

    public Coordinates unmarshall(JsonUnmarshallerContext context) throws Exception {
        Coordinates coordinates = new Coordinates();

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
                if (context.testExpression("page", targetDepth)) {
                    context.nextToken();
                    coordinates.setPage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("x", targetDepth)) {
                    context.nextToken();
                    coordinates.setX(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("y", targetDepth)) {
                    context.nextToken();
                    coordinates.setY(context.getUnmarshaller(Double.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return coordinates;
    }

    private static CoordinatesJsonUnmarshaller instance;

    public static CoordinatesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CoordinatesJsonUnmarshaller();
        return instance;
    }
}

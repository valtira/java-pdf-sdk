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
 * Steps JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StepsJsonUnmarshaller implements Unmarshaller<Steps, JsonUnmarshallerContext> {

    public Steps unmarshall(JsonUnmarshallerContext context) throws Exception {
        Steps steps = new Steps();

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
                if (context.testExpression("steps", targetDepth)) {
                    context.nextToken();
                    steps.setSteps(new ListUnmarshaller<Step>(StepJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return steps;
    }

    private static StepsJsonUnmarshaller instance;

    public static StepsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StepsJsonUnmarshaller();
        return instance;
    }
}

/**
 * null
 */
package com.valtira.pdf.api.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import javax.annotation.Generated;

import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.fasterxml.jackson.core.JsonToken;
import com.valtira.pdf.api.model.Step;

/**
 * Step JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StepJsonUnmarshaller implements Unmarshaller<Step, JsonUnmarshallerContext> {

    public Step unmarshall(JsonUnmarshallerContext context) throws Exception {
        Step step = new Step();

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
                if (context.testExpression("details", targetDepth)) {
                    context.nextToken();
                    step.setDetails(context.getUnmarshaller(StructuredPojo.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    step.setName(context.getUnmarshaller(Step.Name.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return step;
    }

    private static StepJsonUnmarshaller instance;

    public static StepJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StepJsonUnmarshaller();
        return instance;
    }
}

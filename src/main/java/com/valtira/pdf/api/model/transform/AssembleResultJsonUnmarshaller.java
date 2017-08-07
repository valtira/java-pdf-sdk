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
 * AssembleResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssembleResultJsonUnmarshaller implements Unmarshaller<AssembleResult, JsonUnmarshallerContext> {

    public AssembleResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssembleResult assembleResult = new AssembleResult();

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
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    assembleResult.setLocation(FileLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    assembleResult.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pages", targetDepth)) {
                    context.nextToken();
                    assembleResult.setPages(new ListUnmarshaller<PagesItem>(PagesItemJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("succeeded", targetDepth)) {
                    context.nextToken();
                    assembleResult.setSucceeded(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return assembleResult;
    }

    private static AssembleResultJsonUnmarshaller instance;

    public static AssembleResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssembleResultJsonUnmarshaller();
        return instance;
    }
}

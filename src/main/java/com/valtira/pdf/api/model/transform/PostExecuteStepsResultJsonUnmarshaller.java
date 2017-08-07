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
 * PostExecuteStepsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostExecuteStepsResultJsonUnmarshaller implements Unmarshaller<PostExecuteStepsResult, JsonUnmarshallerContext> {

    public PostExecuteStepsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostExecuteStepsResult postExecuteStepsResult = new PostExecuteStepsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postExecuteStepsResult;
        }

        while (true) {
            if (token == null)
                break;

            postExecuteStepsResult.setResult(ResultJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postExecuteStepsResult;
    }

    private static PostExecuteStepsResultJsonUnmarshaller instance;

    public static PostExecuteStepsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostExecuteStepsResultJsonUnmarshaller();
        return instance;
    }
}

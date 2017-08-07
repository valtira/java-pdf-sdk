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
 * PostAssembleResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostAssembleResultJsonUnmarshaller implements Unmarshaller<PostAssembleResult, JsonUnmarshallerContext> {

    public PostAssembleResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostAssembleResult postAssembleResult = new PostAssembleResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postAssembleResult;
        }

        while (true) {
            if (token == null)
                break;

            postAssembleResult.setAssembleResult(AssembleResultJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postAssembleResult;
    }

    private static PostAssembleResultJsonUnmarshaller instance;

    public static PostAssembleResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostAssembleResultJsonUnmarshaller();
        return instance;
    }
}

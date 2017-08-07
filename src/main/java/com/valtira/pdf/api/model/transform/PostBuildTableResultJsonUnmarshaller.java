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
 * PostBuildTableResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostBuildTableResultJsonUnmarshaller implements Unmarshaller<PostBuildTableResult, JsonUnmarshallerContext> {

    public PostBuildTableResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostBuildTableResult postBuildTableResult = new PostBuildTableResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postBuildTableResult;
        }

        while (true) {
            if (token == null)
                break;

            postBuildTableResult.setResult(ResultJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postBuildTableResult;
    }

    private static PostBuildTableResultJsonUnmarshaller instance;

    public static PostBuildTableResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostBuildTableResultJsonUnmarshaller();
        return instance;
    }
}

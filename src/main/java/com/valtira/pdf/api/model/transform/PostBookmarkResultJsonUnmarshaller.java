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
 * PostBookmarkResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostBookmarkResultJsonUnmarshaller implements Unmarshaller<PostBookmarkResult, JsonUnmarshallerContext> {

    public PostBookmarkResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostBookmarkResult postBookmarkResult = new PostBookmarkResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postBookmarkResult;
        }

        while (true) {
            if (token == null)
                break;

            postBookmarkResult.setResult(ResultJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postBookmarkResult;
    }

    private static PostBookmarkResultJsonUnmarshaller instance;

    public static PostBookmarkResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostBookmarkResultJsonUnmarshaller();
        return instance;
    }
}

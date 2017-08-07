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
 * PostStampTableResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostStampTableResultJsonUnmarshaller implements Unmarshaller<PostStampTableResult, JsonUnmarshallerContext> {

    public PostStampTableResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostStampTableResult postStampTableResult = new PostStampTableResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postStampTableResult;
        }

        while (true) {
            if (token == null)
                break;

            postStampTableResult.setResult(ResultJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postStampTableResult;
    }

    private static PostStampTableResultJsonUnmarshaller instance;

    public static PostStampTableResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostStampTableResultJsonUnmarshaller();
        return instance;
    }
}

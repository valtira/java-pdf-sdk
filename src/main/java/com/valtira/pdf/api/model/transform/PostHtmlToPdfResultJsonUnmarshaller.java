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
 * PostHtmlToPdfResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostHtmlToPdfResultJsonUnmarshaller implements Unmarshaller<PostHtmlToPdfResult, JsonUnmarshallerContext> {

    public PostHtmlToPdfResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostHtmlToPdfResult postHtmlToPdfResult = new PostHtmlToPdfResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postHtmlToPdfResult;
        }

        while (true) {
            if (token == null)
                break;

            postHtmlToPdfResult.setResult(ResultJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postHtmlToPdfResult;
    }

    private static PostHtmlToPdfResultJsonUnmarshaller instance;

    public static PostHtmlToPdfResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostHtmlToPdfResultJsonUnmarshaller();
        return instance;
    }
}

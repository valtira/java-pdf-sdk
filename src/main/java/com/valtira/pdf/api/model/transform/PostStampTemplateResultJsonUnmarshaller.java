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
 * PostStampTemplateResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostStampTemplateResultJsonUnmarshaller implements Unmarshaller<PostStampTemplateResult, JsonUnmarshallerContext> {

    public PostStampTemplateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostStampTemplateResult postStampTemplateResult = new PostStampTemplateResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postStampTemplateResult;
        }

        while (true) {
            if (token == null)
                break;

            postStampTemplateResult.setResult(ResultJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postStampTemplateResult;
    }

    private static PostStampTemplateResultJsonUnmarshaller instance;

    public static PostStampTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostStampTemplateResultJsonUnmarshaller();
        return instance;
    }
}

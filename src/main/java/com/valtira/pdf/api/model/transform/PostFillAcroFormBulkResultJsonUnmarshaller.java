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
 * PostFillAcroFormBulkResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostFillAcroFormBulkResultJsonUnmarshaller implements Unmarshaller<PostFillAcroFormBulkResult, JsonUnmarshallerContext> {

    public PostFillAcroFormBulkResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostFillAcroFormBulkResult postFillAcroFormBulkResult = new PostFillAcroFormBulkResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postFillAcroFormBulkResult;
        }

        while (true) {
            if (token == null)
                break;

            postFillAcroFormBulkResult.setResult(ResultJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postFillAcroFormBulkResult;
    }

    private static PostFillAcroFormBulkResultJsonUnmarshaller instance;

    public static PostFillAcroFormBulkResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostFillAcroFormBulkResultJsonUnmarshaller();
        return instance;
    }
}

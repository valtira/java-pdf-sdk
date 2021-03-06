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
 * PostFillAcroFormResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostFillAcroFormResultJsonUnmarshaller implements Unmarshaller<PostFillAcroFormResult, JsonUnmarshallerContext> {

    public PostFillAcroFormResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostFillAcroFormResult postFillAcroFormResult = new PostFillAcroFormResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postFillAcroFormResult;
        }

        while (true) {
            if (token == null)
                break;

            postFillAcroFormResult.setResult(ResultJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postFillAcroFormResult;
    }

    private static PostFillAcroFormResultJsonUnmarshaller instance;

    public static PostFillAcroFormResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostFillAcroFormResultJsonUnmarshaller();
        return instance;
    }
}

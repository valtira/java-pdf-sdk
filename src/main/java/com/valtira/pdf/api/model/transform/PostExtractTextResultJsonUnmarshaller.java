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
 * PostExtractTextResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostExtractTextResultJsonUnmarshaller implements Unmarshaller<PostExtractTextResult, JsonUnmarshallerContext> {

    public PostExtractTextResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostExtractTextResult postExtractTextResult = new PostExtractTextResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postExtractTextResult;
        }

        while (true) {
            if (token == null)
                break;

            postExtractTextResult.setResult(StringResultJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postExtractTextResult;
    }

    private static PostExtractTextResultJsonUnmarshaller instance;

    public static PostExtractTextResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostExtractTextResultJsonUnmarshaller();
        return instance;
    }
}

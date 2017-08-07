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
 * PostEmbedImageResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostEmbedImageResultJsonUnmarshaller implements Unmarshaller<PostEmbedImageResult, JsonUnmarshallerContext> {

    public PostEmbedImageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostEmbedImageResult postEmbedImageResult = new PostEmbedImageResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postEmbedImageResult;
        }

        while (true) {
            if (token == null)
                break;

            postEmbedImageResult.setResult(ResultJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postEmbedImageResult;
    }

    private static PostEmbedImageResultJsonUnmarshaller instance;

    public static PostEmbedImageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostEmbedImageResultJsonUnmarshaller();
        return instance;
    }
}

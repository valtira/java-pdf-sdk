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
 * FileLocation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileLocationJsonUnmarshaller implements Unmarshaller<FileLocation, JsonUnmarshallerContext> {

    public FileLocation unmarshall(JsonUnmarshallerContext context) throws Exception {
        FileLocation fileLocation = new FileLocation();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("local", targetDepth)) {
                    context.nextToken();
                    fileLocation.setLocal(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    fileLocation.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("s3Location", targetDepth)) {
                    context.nextToken();
                    fileLocation.setS3Location(S3LocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("url", targetDepth)) {
                    context.nextToken();
                    fileLocation.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return fileLocation;
    }

    private static FileLocationJsonUnmarshaller instance;

    public static FileLocationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FileLocationJsonUnmarshaller();
        return instance;
    }
}

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
 * Assemble JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssembleJsonUnmarshaller implements Unmarshaller<Assemble, JsonUnmarshallerContext> {

    public Assemble unmarshall(JsonUnmarshallerContext context) throws Exception {
        Assemble assemble = new Assemble();

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
                if (context.testExpression("pdfs", targetDepth)) {
                    context.nextToken();
                    assemble.setPdfs(new ListUnmarshaller<FileLocation>(FileLocationJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("separator", targetDepth)) {
                    context.nextToken();
                    assemble.setSeparator(FileLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("steps", targetDepth)) {
                    context.nextToken();
                    assemble.setSteps(BooleanJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return assemble;
    }

    private static AssembleJsonUnmarshaller instance;

    public static AssembleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssembleJsonUnmarshaller();
        return instance;
    }
}

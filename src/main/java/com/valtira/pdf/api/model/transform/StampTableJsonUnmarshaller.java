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
 * StampTable JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StampTableJsonUnmarshaller implements Unmarshaller<StampTable, JsonUnmarshallerContext> {

    public StampTable unmarshall(JsonUnmarshallerContext context) throws Exception {
        StampTable stampTable = new StampTable();

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
                if (context.testExpression("horizontalAlignment", targetDepth)) {
                    context.nextToken();
                    stampTable.setHorizontalAlignment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pageRange", targetDepth)) {
                    context.nextToken();
                    stampTable.setPageRange(PageRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("target", targetDepth)) {
                    context.nextToken();
                    stampTable.setTarget(FileLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("template", targetDepth)) {
                    context.nextToken();
                    stampTable.setTemplate(FileLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("verticalAlignment", targetDepth)) {
                    context.nextToken();
                    stampTable.setVerticalAlignment(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return stampTable;
    }

    private static StampTableJsonUnmarshaller instance;

    public static StampTableJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StampTableJsonUnmarshaller();
        return instance;
    }
}

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
 * BuildTable JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuildTableJsonUnmarshaller implements Unmarshaller<BuildTable, JsonUnmarshallerContext> {

    public BuildTable unmarshall(JsonUnmarshallerContext context) throws Exception {
        BuildTable buildTable = new BuildTable();

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
                if (context.testExpression("page", targetDepth)) {
                    context.nextToken();
                    buildTable.setPage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("table", targetDepth)) {
                    context.nextToken();
                    buildTable.setTable(TableJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("template", targetDepth)) {
                    context.nextToken();
                    buildTable.setTemplate(FileLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("x", targetDepth)) {
                    context.nextToken();
                    buildTable.setX(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("y", targetDepth)) {
                    context.nextToken();
                    buildTable.setY(context.getUnmarshaller(Double.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return buildTable;
    }

    private static BuildTableJsonUnmarshaller instance;

    public static BuildTableJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BuildTableJsonUnmarshaller();
        return instance;
    }
}

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
 * Table JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableJsonUnmarshaller implements Unmarshaller<Table, JsonUnmarshallerContext> {

    public Table unmarshall(JsonUnmarshallerContext context) throws Exception {
        Table table = new Table();

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
                if (context.testExpression("border", targetDepth)) {
                    context.nextToken();
                    table.setBorder(BorderJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("cells", targetDepth)) {
                    context.nextToken();
                    table.setCells(new ListUnmarshaller<TableCell>(TableCellJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("fixedHeight", targetDepth)) {
                    context.nextToken();
                    table.setFixedHeight(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("horizontalAlignment", targetDepth)) {
                    context.nextToken();
                    table.setHorizontalAlignment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("totalWidth", targetDepth)) {
                    context.nextToken();
                    table.setTotalWidth(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("verticalAlignment", targetDepth)) {
                    context.nextToken();
                    table.setVerticalAlignment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("widths", targetDepth)) {
                    context.nextToken();
                    table.setWidths(new ListUnmarshaller<Integer>(context.getUnmarshaller(Integer.class)).unmarshall(context));
                }
                if (context.testExpression("template", targetDepth)) {
                    context.nextToken();
                    table.setTemplate(FileLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("x", targetDepth)) {
                    context.nextToken();
                    table.setX(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("y", targetDepth)) {
                    context.nextToken();
                    table.setY(context.getUnmarshaller(Double.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return table;
    }

    private static TableJsonUnmarshaller instance;

    public static TableJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TableJsonUnmarshaller();
        return instance;
    }
}

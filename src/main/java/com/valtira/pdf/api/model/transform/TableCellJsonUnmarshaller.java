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
 * TableCell JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableCellJsonUnmarshaller implements Unmarshaller<TableCell, JsonUnmarshallerContext> {

    public TableCell unmarshall(JsonUnmarshallerContext context) throws Exception {
        TableCell tableCell = new TableCell();

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
                if (context.testExpression("fillColor", targetDepth)) {
                    context.nextToken();
                    tableCell.setFillColor(ColorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("font", targetDepth)) {
                    context.nextToken();
                    tableCell.setFont(FontJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("image", targetDepth)) {
                    context.nextToken();
                    tableCell.setImage(FileLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("label", targetDepth)) {
                    context.nextToken();
                    tableCell.setLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("link", targetDepth)) {
                    context.nextToken();
                    tableCell.setLink(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localPage", targetDepth)) {
                    context.nextToken();
                    tableCell.setLocalPage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return tableCell;
    }

    private static TableCellJsonUnmarshaller instance;

    public static TableCellJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TableCellJsonUnmarshaller();
        return instance;
    }
}

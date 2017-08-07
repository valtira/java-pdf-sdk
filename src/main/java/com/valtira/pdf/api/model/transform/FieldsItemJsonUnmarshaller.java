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
 * FieldsItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldsItemJsonUnmarshaller implements Unmarshaller<FieldsItem, JsonUnmarshallerContext> {

    public FieldsItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        FieldsItem fieldsItem = new FieldsItem();

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
                if (context.testExpression("fieldType", targetDepth)) {
                    context.nextToken();
                    fieldsItem.setFieldType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("font", targetDepth)) {
                    context.nextToken();
                    fieldsItem.setFont(FontJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    fieldsItem.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("value", targetDepth)) {
                    context.nextToken();
                    fieldsItem.setValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("x", targetDepth)) {
                    context.nextToken();
                    fieldsItem.setX(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("y", targetDepth)) {
                    context.nextToken();
                    fieldsItem.setY(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return fieldsItem;
    }

    private static FieldsItemJsonUnmarshaller instance;

    public static FieldsItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FieldsItemJsonUnmarshaller();
        return instance;
    }
}

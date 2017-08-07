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
 * FormsItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FormsItemJsonUnmarshaller implements Unmarshaller<FormsItem, JsonUnmarshallerContext> {

    public FormsItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        FormsItem formsItem = new FormsItem();

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
                if (context.testExpression("fields", targetDepth)) {
                    context.nextToken();
                    formsItem.setFields(new ListUnmarshaller<FieldsItem>(FieldsItemJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return formsItem;
    }

    private static FormsItemJsonUnmarshaller instance;

    public static FormsItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FormsItemJsonUnmarshaller();
        return instance;
    }
}

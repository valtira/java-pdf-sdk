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
 * AcroForm JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcroFormJsonUnmarshaller implements Unmarshaller<AcroForm, JsonUnmarshallerContext> {

    public AcroForm unmarshall(JsonUnmarshallerContext context) throws Exception {
        AcroForm acroForm = new AcroForm();

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
                    acroForm.setFields(new ListUnmarshaller<FieldsItem>(FieldsItemJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("template", targetDepth)) {
                    context.nextToken();
                    acroForm.setTemplate(FileLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return acroForm;
    }

    private static AcroFormJsonUnmarshaller instance;

    public static AcroFormJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AcroFormJsonUnmarshaller();
        return instance;
    }
}

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
 * BulkAcroForm JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BulkAcroFormJsonUnmarshaller implements Unmarshaller<BulkAcroForm, JsonUnmarshallerContext> {

    public BulkAcroForm unmarshall(JsonUnmarshallerContext context) throws Exception {
        BulkAcroForm bulkAcroForm = new BulkAcroForm();

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
                if (context.testExpression("forms", targetDepth)) {
                    context.nextToken();
                    bulkAcroForm.setForms(new ListUnmarshaller<FormsItem>(FormsItemJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("template", targetDepth)) {
                    context.nextToken();
                    bulkAcroForm.setTemplate(FileLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return bulkAcroForm;
    }

    private static BulkAcroFormJsonUnmarshaller instance;

    public static BulkAcroFormJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BulkAcroFormJsonUnmarshaller();
        return instance;
    }
}

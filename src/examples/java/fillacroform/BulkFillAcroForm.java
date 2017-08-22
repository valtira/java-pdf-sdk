package fillacroform;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.valtira.pdf.api.PDFAPI;
import com.valtira.pdf.api.model.BulkAcroForm;
import com.valtira.pdf.api.model.FieldsItem;
import com.valtira.pdf.api.model.FileLocation;
import com.valtira.pdf.api.model.FormsItem;
import com.valtira.pdf.api.model.PostFillAcroFormBulkRequest;
import com.valtira.pdf.api.model.PostFillAcroFormBulkResult;

/**
 * Shows an example of how to fill in the same form many times, creating
 * a copy of each page in the template with its form fields filled, all 
 * assembled into one giant pdf.
 * 
 * @author morgan
 *
 */
public class BulkFillAcroForm {

	private static final String DEMO_API_KEY = "<your api key here>";
	
	public static void main(String... args) {

		// today's date
		Calendar today = Calendar.getInstance();
		today.add(Calendar.DATE, -1);
		
		// yesterday's date so you can see the difference between each time we fill out the same form template
		Calendar yesterday = Calendar.getInstance();
		yesterday.add(Calendar.DATE, -1);
		
		// let's build a date formatter
		DateFormat df = new SimpleDateFormat("MMMM dd, yyyy");
    	
		// let's assemble the fields we want here to make this easier to read
		List<FieldsItem> fieldsForFirstForm = new ArrayList<FieldsItem>(1);
		fieldsForFirstForm.add(new FieldsItem().name("CreatedDate").value(df.format(today.getTime())));
		
		// let's assemble the fields we want here to make this easier to read
		List<FieldsItem> fieldsForSecondForm = new ArrayList<FieldsItem>(1);
		fieldsForSecondForm.add(new FieldsItem().name("CreatedDate").value(df.format(yesterday.getTime())));
		
		// let's assemble the forms objects here to make this readable
		List<FormsItem> forms = new ArrayList<FormsItem>(2);
		
		// add a form for each time you want to fill out the form
		forms.add(new FormsItem().fields(fieldsForFirstForm));
		forms.add(new FormsItem().fields(fieldsForSecondForm));
		
		// build our api client
		PDFAPI client = PDFAPI.builder()
			    .apiKey(DEMO_API_KEY)
			    .build();
		
		// this fills out a form in the PDF with the date in the lower right hand corner - easily expand this to all sorts of complicated forms
		PostFillAcroFormBulkResult result = client.postFillAcroFormBulk(
				new PostFillAcroFormBulkRequest().bulkAcroForm(
						new BulkAcroForm().template(
								new FileLocation().url("https://s3.us-east-2.amazonaws.com/valtira-lambda-pdf-assets/pdf-unit-tests-assets/508_BROCH_WITH_CR_DATE.pdf"))
						.forms(forms)));		
		
		System.out.println(String.format("The service responded with: %s", result.getResult()));
		
		if (result.getResult().isSucceeded()) {
			System.out.println(String.format("You may download your PDF at: %s", result.getResult().getLocation().getUrl()));
			return;
		} 
		
		System.out.println(String.format("Your request failed with message: %s", result.getResult().getMessage()));
		
		
	}
}

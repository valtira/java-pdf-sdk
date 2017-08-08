package fillacroform;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.valtira.pdf.api.PDFAPI;
import com.valtira.pdf.api.model.AcroForm;
import com.valtira.pdf.api.model.FieldsItem;
import com.valtira.pdf.api.model.FileLocation;
import com.valtira.pdf.api.model.PostFillAcroFormRequest;
import com.valtira.pdf.api.model.PostFillAcroFormResult;

public class FillAcroForm {

	private static final String DEMO_API_KEY = "<your api key here>";
	
	public static void main(String... args) {
	
		// if you want to see old style Java syntax - take a look at HTMLtoPDF
		
		// let's build a date formatter
		DateFormat df = new SimpleDateFormat("MMMM dd, yyyy");
    	
		// build our api client
		PDFAPI client = PDFAPI.builder()
			    .apiKey(DEMO_API_KEY)
			    .build();
		
		// new style syntax - you could build a list of FieldsItem first
		// this fills out a form in the PDF with the date in the lower right hand corner - easily expand this to all sorts of complicated forms
		PostFillAcroFormResult result = client.postFillAcroForm(
				new PostFillAcroFormRequest().acroForm(
						new AcroForm().template(
								new FileLocation().url("https://s3.us-east-2.amazonaws.com/valtira-lambda-pdf-assets/pdf-unit-tests-assets/508_BROCH_WITH_CR_DATE.pdf"))
						.fields(
								new FieldsItem().name("CreatedDate").value(String.format("Created %s", df.format(new Date()))))));
		
		
		System.out.println(String.format("The service responded with: %s", result.getResult()));
		
		if (result.getResult().isSucceeded()) {
			System.out.println(String.format("You may download your PDF at: %s", result.getResult().getLocation().getUrl()));
			return;
		} 
		
		System.out.println(String.format("Your request failed with message: %s", result.getResult().getMessage()));
		
		
	}
}

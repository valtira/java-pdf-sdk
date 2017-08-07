package htmltopdf;

import com.valtira.pdf.api.PDFAPI;
import com.valtira.pdf.api.model.FileLocation;
import com.valtira.pdf.api.model.PostHtmlToPdfRequest;
import com.valtira.pdf.api.model.PostHtmlToPdfResult;

public class HTMLtoPDF {

	private static final String DEMO_API_KEY = "<your api key here>";
	
	public static void main(String... args) {
	
		//Note: old-style Java Syntax
		
		// build a file location that points to the HTML to convert to PDF
		FileLocation fileLocation = new FileLocation();
		fileLocation.setUrl("https://s3.us-east-2.amazonaws.com/valtira-lambda-pdf-assets/pdf-unit-tests-assets/test2017-03.html");
		
		PostHtmlToPdfRequest postHtmlToPdfRequest = new PostHtmlToPdfRequest();
		postHtmlToPdfRequest.setFileLocation(fileLocation);
		
		PDFAPI client = PDFAPI.builder()
			    .apiKey(DEMO_API_KEY)
			    .build();
		
		PostHtmlToPdfResult result = client.postHtmlToPdf(postHtmlToPdfRequest);
		
		System.out.println(String.format("The service responded with: %s", result.getResult()));
		
		if (result.getResult().isSucceeded()) {
			System.out.println(String.format("You may download your PDF at: %s", result.getResult().getLocation().getUrl()));
		} else {
			System.out.println(String.format("Your request failed with message: %s", result.getResult().getMessage()));
		}
		
		System.out.println("**********TRYING WITH NEW JAVA SYNTAX**********");
		
		// new style syntax
		result = client.postHtmlToPdf(
				new PostHtmlToPdfRequest().fileLocation(
						new FileLocation().url("https://s3.us-east-2.amazonaws.com/valtira-lambda-pdf-assets/pdf-unit-tests-assets/test2017-03.html")));
		
		
		System.out.println(String.format("The service responded with: %s", result.getResult()));
		
		if (result.getResult().isSucceeded()) {
			System.out.println(String.format("You may download your PDF at: %s", result.getResult().getLocation().getUrl()));
			return;
		} 
		
		System.out.println(String.format("Your request failed with message: %s", result.getResult().getMessage()));
		
		
	}
}

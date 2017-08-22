package assembler;

import com.valtira.pdf.api.PDFAPI;
import com.valtira.pdf.api.model.Assemble;
import com.valtira.pdf.api.model.FileLocation;
import com.valtira.pdf.api.model.PostAssembleRequest;
import com.valtira.pdf.api.model.PostAssembleResult;

public class Assembler {

	private static final String DEMO_API_KEY = "<your api key here>";
	
	public static void main(String... args) {
		
		// build our api client
		PDFAPI client = PDFAPI.builder()
			    .apiKey(DEMO_API_KEY)
			    .build();
		
		// build our Assemble object for ease of use here
		Assemble assemble = new Assemble().pdfs(
				new FileLocation().name("Brochure").url("https://s3.us-east-2.amazonaws.com/valtira-lambda-pdf-assets/pdf-unit-tests-assets/508_BROCH_WITH_CR_DATE.pdf"),
				new FileLocation().name("HTML").url("https://s3.us-east-2.amazonaws.com/valtira-lambda-pdf-assets/pdf-unit-tests-assets/html.pdf"));
		
		
		// let's execute the steps
		PostAssembleResult result = client.postAssemble(
				new PostAssembleRequest().assemble(assemble));
		
		System.out.println(String.format("The service responded with: %s", result.getResult()));
		
		if (result.getResult().isSucceeded()) {
			System.out.println(String.format("You may download your PDF at: %s", result.getResult().getLocation().getUrl()));
			return;
		} 
		
		System.out.println(String.format("Your request failed with message: %s", result.getResult().getMessage()));			
	}
}
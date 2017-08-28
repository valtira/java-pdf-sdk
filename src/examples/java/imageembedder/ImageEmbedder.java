package imageembedder;

import com.valtira.pdf.api.PDFAPI;
import com.valtira.pdf.api.model.Coordinates;
import com.valtira.pdf.api.model.EmbedImage;
import com.valtira.pdf.api.model.FileLocation;
import com.valtira.pdf.api.model.PostEmbedImageRequest;
import com.valtira.pdf.api.model.PostEmbedImageResult;

public class ImageEmbedder {

	private static final String DEMO_API_KEY = "of3aFaClmlurthuehiLC4uFo8bJZa8s1HihD5ly2";
	
	public static void main(String... args) {
		
		// build our api client
		PDFAPI client = PDFAPI.builder()
			    .apiKey(DEMO_API_KEY)
			    .build();
		
		// build our EmbedImage object
		EmbedImage embedImage = new EmbedImage()
				.template(new FileLocation().url("https://s3.us-east-2.amazonaws.com/valtira-lambda-pdf-assets/pdf-unit-tests-assets/508_BROCH_WITH_CR_DATE.pdf"))
				.image(new FileLocation().url("https://s3.us-east-2.amazonaws.com/valtira-lambda-pdf-assets/pdf-unit-tests-assets/bcvb.png"))
				.coordinates(new Coordinates().x(50.0).y(500.0));
		
		
		// let's execute the embed image request
		PostEmbedImageResult result = client.postEmbedImage(
				new PostEmbedImageRequest().embedImage(embedImage));
		
		System.out.println(String.format("The service responded with: %s", result.getResult()));
		
		if (result.getResult().isSucceeded()) {
			System.out.println(String.format("You may download your PDF at: %s", result.getResult().getLocation().getUrl()));
			return;
		} 
		
		System.out.println(String.format("Your request failed with message: %s", result.getResult().getMessage()));			
	}
}
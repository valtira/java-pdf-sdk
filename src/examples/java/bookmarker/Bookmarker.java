package bookmarker;

import com.valtira.pdf.api.PDFAPI;
import com.valtira.pdf.api.model.Bookmark;
import com.valtira.pdf.api.model.Bookmarks;
import com.valtira.pdf.api.model.FileLocation;
import com.valtira.pdf.api.model.PostAssembleRequest;
import com.valtira.pdf.api.model.PostAssembleResult;
import com.valtira.pdf.api.model.PostBookmarkRequest;
import com.valtira.pdf.api.model.PostBookmarkResult;

public class Bookmarker {

	private static final String DEMO_API_KEY = "<your api key here>";
	
	public static void main(String... args) {
		
		// build our api client
		PDFAPI client = PDFAPI.builder()
			    .apiKey(DEMO_API_KEY)
			    .build();
		
		// build our Bookmark object for ease of use here
		Bookmarks bookmark = new Bookmarks().template(
				new FileLocation().url("https://s3.us-east-2.amazonaws.com/valtira-lambda-pdf-assets/pdf-unit-tests-assets/508_BROCH_WITH_CR_DATE.pdf"))
			.bookmarks(
					new Bookmark().title("Page 1").page(1),
					new Bookmark().title("Page 2").page(2),
					new Bookmark().title("Page 3").page(3),
					new Bookmark().title("Page 4").page(4));
		
		
		// let's execute the steps
		PostBookmarkResult result = client.postBookmark(
				new PostBookmarkRequest().bookmarks(bookmark));
		
		System.out.println(String.format("The service responded with: %s", result.getResult()));
		
		if (result.getResult().isSucceeded()) {
			System.out.println(String.format("You may download your PDF at: %s", result.getResult().getLocation().getUrl()));
			return;
		} 
		
		System.out.println(String.format("Your request failed with message: %s", result.getResult().getMessage()));			
	}
}
package extracttext;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

import com.valtira.pdf.api.PDFAPI;
import com.valtira.pdf.api.model.Base64File;
import com.valtira.pdf.api.model.PostExtractTextRequest;
import com.valtira.pdf.api.model.PostExtractTextResult;

/**
 * 
 * The Extract Text endpoint takes a Base64 encoded PDF, extracts the text that it can, and sends it back. 
 * 
 * @author morgan
 *
 */
public class ExtractText {

	private static final String DEMO_API_KEY = "<your api key here>";
	
	public static void main(String... args) {
		
		// build our api client
		PDFAPI client = PDFAPI.builder()
			    .apiKey(DEMO_API_KEY)
			    .build();
		
		try {
			// build our Base64File object for ease of use here
			Base64File base64File = new Base64File().contents(getBase64EncodedTest());
			
			// let's execute the steps
			PostExtractTextResult result = client.postExtractText(
					new PostExtractTextRequest().base64File(base64File));
			
			System.out.println(String.format("The service responded with: %s", result.getResult()));
			
			if (result.getResult().isSucceeded()) {
				System.out.println(String.format("We extracted this text: %s", result.getResult()));
				return;
			} 
			
			System.out.println(String.format("Your request failed with message: %s", result.getResult().getMessage()));
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	private static String getBase64EncodedTest() throws IOException {
		
		File workingDirectory = new File(".");
		File file = new File(workingDirectory.getAbsolutePath() + "/src/examples/java/extracttext/include_controller_tutorial.pdf");
		InputStream is = new FileInputStream(file);

		long length = file.length();
		if (length > Integer.MAX_VALUE) {
		    // File is too large (set to your 
			is.close();
			throw new IOException("File too large: " + file.getName());
		}
		byte[] bytes = new byte[(int)length];
		
		int offset = 0;
		int numRead = 0;
		while (offset < bytes.length
		       && (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
		    offset += numRead;
		}

		if (offset < bytes.length) {
			is.close();
		    throw new IOException("Could not completely read file: " + file.getName());
		}

		is.close();
		String encodedString = Base64.getEncoder().encodeToString(bytes);
		return encodedString;
	}
}
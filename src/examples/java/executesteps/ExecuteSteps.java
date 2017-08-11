package executesteps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.valtira.pdf.api.PDFAPI;
import com.valtira.pdf.api.model.AcroForm;
import com.valtira.pdf.api.model.Assemble;
import com.valtira.pdf.api.model.Color;
import com.valtira.pdf.api.model.FieldsItem;
import com.valtira.pdf.api.model.FileLocation;
import com.valtira.pdf.api.model.Font;
import com.valtira.pdf.api.model.PostExecuteStepsRequest;
import com.valtira.pdf.api.model.PostExecuteStepsResult;
import com.valtira.pdf.api.model.Step;
import com.valtira.pdf.api.model.Steps;
import com.valtira.pdf.api.model.Table;
import com.valtira.pdf.api.model.TableCell;

public class ExecuteSteps {

	private static final String DEMO_API_KEY = "of3aFaClmlurthuehiLC4uFo8bJZa8s1HihD5ly2";
	
	public static void main(String... args) {
	
		// if you want to see old style Java syntax - take a look at HTMLtoPDF
		
		// let's build a date formatter
		DateFormat df = new SimpleDateFormat("MMMM dd, yyyy");
    	
		// build our api client
		PDFAPI client = PDFAPI.builder()
			    .apiKey(DEMO_API_KEY)
			    .build();
		
		Color fontColor = new Color().r(91).g(143).b(197);
		
		Font cellFont = new Font().size(12).style("BOLD").color(fontColor).url("https://s3.amazonaws.com/bcbsma-lambda-pdf-assets/NotoSansCJKsc-Regular.otf");
		
		TableCell cell = new TableCell().font(cellFont).label("Go to Valtira.com").link("http://www.valtira.com");
		
		Table table = new Table().totalWidth(600.0).fixedHeight(16.08).verticalAlignment("MIDDLE").cells(cell).template(new FileLocation().url("https://s3.us-east-2.amazonaws.com/valtira-lambda-pdf-assets/pdf-unit-tests-assets/blank.pdf")).x(56.0).y(467.0);
		
		AcroForm form = new AcroForm().template(new FileLocation().url("https://s3.us-east-2.amazonaws.com/valtira-lambda-pdf-assets/pdf-unit-tests-assets/508_BROCH_WITH_CR_DATE.pdf"))
				.fields(new FieldsItem().name("CreatedDate").value(String.format("Created %s", df.format(new Date()))));
		
		Step fillAcroForm = new Step().name(Step.Name.FillAcroForm).details(form);
		
		Step htmlToPDF = new Step().name(Step.Name.HTMLtoPDF).details(new FileLocation().url("https://s3.us-east-2.amazonaws.com/valtira-lambda-pdf-assets/pdf-unit-tests-assets/test2017-03.html"));
		
		Step buildTable = new Step().name(Step.Name.BuildTable).details(table);
		
		Step assemble = new Step().name(Step.Name.Assemble).details(new Assemble().steps(true));
		
		// new style syntax - you could build your Step(s) first
		PostExecuteStepsResult result = client.postExecuteSteps(
				new PostExecuteStepsRequest().steps(new Steps().steps(fillAcroForm).steps(htmlToPDF).steps(buildTable).steps(assemble)));
		
		
		System.out.println(String.format("The service responded with: %s", result.getResult()));
		
		if (result.getResult().isSucceeded()) {
			System.out.println(String.format("You may download your PDF at: %s", result.getResult().getLocation().getUrl()));
			return;
		} 
		
		System.out.println(String.format("Your request failed with message: %s", result.getResult().getMessage()));
		
		
	}
}

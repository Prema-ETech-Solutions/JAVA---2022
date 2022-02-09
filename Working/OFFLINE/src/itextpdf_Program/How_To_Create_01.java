package itextpdf_Program;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;

public class How_To_Create_01 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		String Path = "First.pdf";
		PdfWriter  Write = new PdfWriter(Path);
		PdfDocument PdfDoc = new PdfDocument(Write);
		PdfDoc.addNewPage();
		Document Doc = new Document(PdfDoc);
		Doc.close();
		System.out.println("PDF CREATED");
	}

}

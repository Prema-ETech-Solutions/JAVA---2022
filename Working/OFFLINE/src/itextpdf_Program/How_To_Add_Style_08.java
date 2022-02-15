package itextpdf_Program;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Paragraph;

public class How_To_Add_Style_08 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		String Path = "Eight.pdf";
		PdfWriter  Write = new PdfWriter(Path);
		PdfDocument PdfDoc = new PdfDocument(Write);
		PdfDoc.addNewPage();
		Document Doc = new Document(PdfDoc);
		Style style = new Style().setFontColor(Color.RED).setFontSize(30f).setItalic(); 
		Paragraph Para = new Paragraph();
		Para.add("Hello World ").addStyle(style);
		Doc.add(Para);
		Doc.close();
		System.out.println("PDF CREATED");

	}

}

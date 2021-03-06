package itextpdf_Program;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;

public class How_To_Create_Set_Size19 {

	public static void main(String[] args) throws FileNotFoundException {
		String Path = "Nineteen.pdf";
		PdfWriter  Write = new PdfWriter(Path);
		PdfDocument PdfDoc = new PdfDocument(Write);
		PdfDoc.setDefaultPageSize(PageSize.A6);
		PdfDoc.addNewPage();
		
		Document Doc = new Document(PdfDoc);
		Doc.close();
		System.out.println("PDF CREATED");

	}

}

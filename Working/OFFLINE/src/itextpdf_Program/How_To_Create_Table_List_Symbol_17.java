package itextpdf_Program;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Text;

public class How_To_Create_Table_List_Symbol_17 {

	public static void main(String[] args) throws FileNotFoundException {
		List lsit_ = new List();
		String Path = "Seventeen.pdf";
		PdfWriter  Write = new PdfWriter(Path);
		PdfDocument PdfDoc = new PdfDocument(Write);
		PdfDoc.addNewPage();
		lsit_.setListSymbol(new Text ("\u00B0"));
		lsit_.add("HELLO");
		lsit_.add("World");
		lsit_.add("HI");
		lsit_.add("BY");
		Document Doc = new Document(PdfDoc);
		Doc.add(lsit_);
		Doc.close();
		System.out.println("PDF CREATED");

	}

}

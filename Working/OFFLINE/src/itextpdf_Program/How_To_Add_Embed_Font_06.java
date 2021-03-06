package itextpdf_Program;


import java.io.IOException;

import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;

public class How_To_Add_Embed_Font_06 {

	public static void main(String[] args) throws IOException {
		String Path = "SIX.pdf",
				Font2= "Font\\Freedom.ttf",
				Font3= "Font\\ChrustyRock.ttf";
		
		PdfWriter  Write = new PdfWriter(Path);
		PdfDocument PdfDoc = new PdfDocument(Write);
		PdfDoc.addNewPage();
		PdfFont Freedom = PdfFontFactory.createFont(Font2,true);
		PdfFont ChrustyRock = PdfFontFactory.createFont(Font3,true);
		Document Doc = new Document(PdfDoc);
		
		Text Text_1 = new Text("HELLO").setFont(Freedom);
		Text Text_2 = new Text("WORLD.").setFont(ChrustyRock);
		Paragraph paragraph  = new Paragraph().add(Text_1).add(Text_2);
		Doc.add(paragraph);
		
		Doc.close();

	}

}

package itextpdf_Program;

import java.io.IOException;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;

public class How_To_Add_Bold_Italic_Underline_Color_Font_07 {

	public static void main(String[] args) throws IOException {
		String Path = "Seven.pdf";
		PdfWriter Write = new PdfWriter(Path);
		PdfDocument PdfDoc = new PdfDocument(Write);
		PdfDoc.addNewPage();
		Document Doc = new Document(PdfDoc);

		PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
		Paragraph paragraph  =new Paragraph();
		Text Txt1 = new Text("Normal\n").setFont(font);
		Text Txt2 = new Text("BOLD\n").setFont(font).setBold();
		Text Txt3 = new Text("Italic\n").setFont(font).setItalic();
		Text Txt4 = new Text("Underline\n").setFont(font).setUnderline();
		Text Txt5 = new Text("Underline BOLD Italic\n").setFont(font).setUnderline().setItalic().setBold();
		Text Txt6 = new Text("Set Color\n").setFont(font).setFontColor(Color.MAGENTA);
		Text Txt7 = new Text("Stroke\n").setFont(font).setBold().setStrokeColor(Color.ORANGE);
		paragraph.add(Txt1).add(Txt2).add(Txt3).add(Txt4).add(Txt5).add(Txt6).add(Txt7) ;
		
		Doc.add(paragraph);
		Doc.close();
		System.out.println("PDF CREATED");

	}

}

package itextpdf_Program;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

public class How_To_Create_Color_11 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		String Path = "Eleven.pdf";
		PdfWriter  Write = new PdfWriter(Path);
		PdfDocument PdfDoc = new PdfDocument(Write);
		PdfDoc.addNewPage();
		Document Doc = new Document(PdfDoc);
		String [] Headers = {"H1","H2","H3"};
		String [][] DATA = {
				{"D1","D2","D3"},
				{"D4","D5","D6"},
				{"D7","D8","D9"},
				{"D10","D11","D12"},
				{"D13","D14","D15"},
				};
		float[] Coloum = {200f,50f,150f};
		Table table = new Table(Coloum);
		table.addCell(new Cell().add(Headers[0]));
		table.addCell(new Cell().add(Headers[1]));
		table.addCell(new Cell().add(Headers[2]));
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				if ((i%2) == 0) 
				{
					table.addCell(new Cell().add(DATA[i][j]).setBackgroundColor(Color.DARK_GRAY).setTextAlignment(TextAlignment.CENTER).setBold().setFontColor(Color.WHITE));
				} else 
				{
					table.addCell(new Cell().add(DATA[i][j]).setBackgroundColor(Color.LIGHT_GRAY).setTextAlignment(TextAlignment.CENTER).setBold().setFontColor(Color.WHITE));
				}
				
			}
		}
		Doc.add(table);
		Doc.close();
		System.out.println("PDF CREATED");
	}

}

package itextpdf_Program;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Table;

public class How_To_Create_Table_Add_List_15 {

	public static void main(String[] args) throws FileNotFoundException {
		String Path = "Fifteen.pdf";
		PdfWriter  Write = new PdfWriter(Path);
		PdfDocument PdfDoc = new PdfDocument(Write);
		PdfDoc.addNewPage();
		Document Doc = new Document(PdfDoc);
		
		float[] Coloum = {200f,50f,150f};
		Table table = new Table(Coloum);
		
		List list = new List();
		list.add("1").add("2").add("3");
		Cell cell_01 = new Cell();
		cell_01.add("D1");
		table.addCell(cell_01);
		table.addCell(new Cell().add(list));
		table.addCell(new Cell().add("D3"));
		
		table.addCell(new Cell().add("D1"));
		table.addCell(new Cell().add("D2"));
		table.addCell(new Cell().add("D3"));
		
		table.addCell(new Cell().add("D1"));
		table.addCell(new Cell().add("D2"));
		table.addCell(new Cell().add("D3"));
		
		table.addCell(new Cell().add("D1"));
		table.addCell(new Cell().add("D2"));
		table.addCell(new Cell().add("D3"));
		
		
		Doc.add(table);
		Doc.close();
		System.out.println("PDF CREATED");

	}

}

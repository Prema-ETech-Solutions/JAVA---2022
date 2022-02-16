package itextpdf_Program;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;

public class How_To_Create_Table_RowSpan_ColumnSpan_16 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		
		String Path = "Sixteen.pdf";
		PdfWriter  Write = new PdfWriter(Path);
		PdfDocument PdfDoc = new PdfDocument(Write);
		PdfDoc.addNewPage();
		Document Doc = new Document(PdfDoc);
		
		float[] Coloum = {200f,50f,150f};
		Table table = new Table(Coloum);
		
		Cell cell_01 = new Cell();
		cell_01.add("D1");
		table.addCell(cell_01);
		table.addCell(new Cell().add("D2"));
		table.addCell(new Cell().add("D3"));
		
		table.addCell(new Cell().add("D1"));
		table.addCell(new Cell(2,0).add("D2"));
		table.addCell(new Cell().add("D3"));
		
		table.addCell(new Cell().add("D1"));
//		table.addCell(new Cell().add("D2"));
		table.addCell(new Cell().add("D3"));
		
		table.addCell(new Cell().add("D1"));
		table.addCell(new Cell(0,2).add("D2"));
		
		
		
		Doc.add(table);
		Doc.close();
		System.out.println("PDF CREATED");
		

	}

}

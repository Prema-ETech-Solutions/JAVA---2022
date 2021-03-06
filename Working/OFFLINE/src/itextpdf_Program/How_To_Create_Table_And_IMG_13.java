package itextpdf_Program;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Table;

public class How_To_Create_Table_And_IMG_13 {

	public static void main(String[] args) throws FileNotFoundException, MalformedURLException 
	{
		String Path = "Thirteen.pdf";
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
		
		table.addCell(new Cell().add(new Image(ImageDataFactory.create("IMG\\nature.jpg")).setHeight(150).setWidth(140)));
		table.addCell(new Cell().add(new Image(ImageDataFactory.create("IMG\\nature.jpg")).setHeight(150).setWidth(140)));
		table.addCell(new Cell().add(new Image(ImageDataFactory.create("IMG\\nature.jpg")).setHeight(150).setWidth(140)));

		
		
		Doc.add(table);
		Doc.close();
		System.out.println("PDF CREATED");
	}
}

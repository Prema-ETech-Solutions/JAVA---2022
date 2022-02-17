package itextpdf_Program;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;

public class How_To_Add_Water_mark_20 {

	public static void main(String[] args) throws FileNotFoundException, MalformedURLException 
	{
		String Path = "Twenty.pdf";
		PdfWriter  Write = new PdfWriter(Path);
		PdfDocument PdfDoc = new PdfDocument(Write);
		ImageData data = ImageDataFactory.create("IMG\\nature.jpg"); 
		Image Img = new Image(data);
		Img.setHeight(200);
		Img.setWidth(200);
		Img.setFixedPosition(PdfDoc.getDefaultPageSize().getWidth()/2-100,PdfDoc.getDefaultPageSize().getWidth()/2-100);
		Img.setOpacity(0.3f);
		
		PdfDoc.addNewPage();
		Document Doc = new Document(PdfDoc);
		Doc.add(Img);
		Doc.close();
		System.out.println("PDF CREATED");
	}

}

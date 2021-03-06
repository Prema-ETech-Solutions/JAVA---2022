package itextpdf_Program;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;

public class How_To_Add_Image_03 {

	public static void main(String[] args) throws FileNotFoundException, MalformedURLException 
	{
		String Path = "Third.pdf",
				imgPath ="IMG\\nature.jpg";
		ImageData data = ImageDataFactory.create(imgPath); 
		Image Img = new Image(data);
		PdfWriter  Write = new PdfWriter(Path);
		PdfDocument PdfDoc = new PdfDocument(Write);
		PdfDoc.addNewPage();
		Document Doc = new Document(PdfDoc);
		Img.setHeight(50);
		Img.setWidth(50);
		Doc.add(Img.setHorizontalAlignment(HorizontalAlignment.RIGHT)); 
		Doc.close();
		System.out.println("PDF CREATED");

	}

}

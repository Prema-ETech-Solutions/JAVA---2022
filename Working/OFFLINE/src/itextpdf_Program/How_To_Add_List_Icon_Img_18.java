package itextpdf_Program;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;

public class How_To_Add_List_Icon_Img_18 {

	public static void main(String[] args) throws FileNotFoundException, MalformedURLException
	{
		List lsit_ = new List();
		String Path = "Eighteen.pdf";
		PdfWriter  Write = new PdfWriter(Path);
		PdfDocument PdfDoc = new PdfDocument(Write);
		PdfDoc.addNewPage();
		ImageData data = ImageDataFactory.create("IMG\\40045.jpg"); 
		Image Img = new Image(data);
		Img.setHeight(20f);
		Img.setWidth(20f);
		lsit_.setListSymbol(Img);
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

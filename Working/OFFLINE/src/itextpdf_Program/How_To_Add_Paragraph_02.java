package itextpdf_Program;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class How_To_Add_Paragraph_02 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		String Path = "Second.pdf";
		String Para = "Java is a high-level, "
				+ "class-based, "
				+ "object-oriented programming language that is "
				+ "designed to have as few implementation "
				+ "dependencies as possible. "
				+ "It is a general-purpose programming language "
				+ "intended to let programmers write once, "
				+ "run anywhere (WORA),meaning that compiled Java "
				+ "code can run on all platforms that support Java "
				+ "without the need to recompile.[18] Java applications "
				+ "are typically compiled to bytecode that can run on any "
				+ "Java virtual machine (JVM) regardless of the "
				+ "underlying computer architecture. The syntax of "
				+ "Java is similar to C and C++, but has fewer "
				+ "low-level facilities than either of them. "
				+ "The Java runtime provides dynamic capabilities "
				+ "(such as reflection and runtime code modification) "
				+ "that are typically not available in traditional "
				+ "compiled languages. As of 2019, Java was one of "
				+ "the most popular programming languages in use "
				+ "according to GitHub, particularly for client–server "
				+ "web applications, with a reported 9 million developers.";
		PdfWriter  Write = new PdfWriter(Path);
		Paragraph pra = new Paragraph(Para);
		PdfDocument PdfDoc = new PdfDocument(Write);
		PdfDoc.addNewPage();
		Document Doc = new Document(PdfDoc);
		Doc.add(pra);
		Doc.close();
		System.out.println("PDF CREATED");
		System.out.println("Paragraph Created");
	}

}
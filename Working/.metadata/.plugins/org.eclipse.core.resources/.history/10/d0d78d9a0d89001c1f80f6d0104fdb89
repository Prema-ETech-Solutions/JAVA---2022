package extra;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;

import java.io.FileNotFoundException;

public class Bill_Base {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "AK.pdf";
		PdfWriter pdfWriter;

		pdfWriter = new PdfWriter(path);
		PdfDocument pdfDocument = new PdfDocument(pdfWriter);
		Document document = new Document(pdfDocument);
		pdfDocument.setDefaultPageSize(PageSize.A4);
		float col = 280f;
		float columnWidth[] = { col, col };
		Table table = new Table(columnWidth);
		table.addCell(new Cell().add("INVOICE").setTextAlignment(TextAlignment.CENTER)
				.setVerticalAlignment(VerticalAlignment.MIDDLE).setMarginTop(30f).setMarginBottom(30f).setFontSize(30f)
				.setBorder(Border.NO_BORDER));
		table.addCell(new Cell().add("Sparkztech\n0000000000\n\n\n").setTextAlignment(TextAlignment.RIGHT)
				.setMarginTop(30f).setMarginBottom(30f).setMargin(10f).setBorder(Border.NO_BORDER));
		table.setBackgroundColor(new DeviceRgb(63, 169, 219)).setFontColor(Color.WHITE);
		float colWidth[] = { 80, 300, 100, 80 };
		Table ctable = new Table(colWidth);
		ctable.addCell(new Cell(0, 4).add("C table").setBold());
		ctable.addCell(new Cell().add("NAME").setBorder(Border.NO_BORDER));
		ctable.addCell(new Cell().add("RAJ").setBorder(Border.NO_BORDER));
		ctable.addCell(new Cell().add("INVOICE No. ").setBorder(Border.NO_BORDER));
		ctable.addCell(new Cell().add("123").setBorder(Border.NO_BORDER));
		ctable.addCell(new Cell().add("Mo.No").setBorder(Border.NO_BORDER));
		ctable.addCell(new Cell().add("7056464634").setBorder(Border.NO_BORDER));
		ctable.addCell(new Cell().add("Date").setBorder(Border.NO_BORDER));
		ctable.addCell(new Cell().add("05-03-2021").setBorder(Border.NO_BORDER));

		float item[] = { 140, 140, 140, 140 };
		Table itable = new Table(item);
		itable.addCell(new Cell().add("Service").setBackgroundColor(new DeviceRgb(63, 169, 219))
				.setFontColor(Color.BLACK).setTextAlignment(TextAlignment.LEFT));
		itable.addCell(new Cell().add("Hrs.").setBackgroundColor(new DeviceRgb(63, 169, 219)).setFontColor(Color.BLACK)
				.setTextAlignment(TextAlignment.LEFT));
		itable.addCell(new Cell().add("Unit Price (INR)").setBackgroundColor(new DeviceRgb(63, 169, 219))
				.setFontColor(Color.BLACK).setTextAlignment(TextAlignment.LEFT));
		itable.addCell(new Cell().add("Amount").setBackgroundColor(new DeviceRgb(63, 169, 219))
				.setFontColor(Color.BLACK).setTextAlignment(TextAlignment.LEFT));

		itable.addCell(new Cell().add("App").setTextAlignment(TextAlignment.LEFT));
		itable.addCell(new Cell().add("20").setTextAlignment(TextAlignment.LEFT));
		itable.addCell(new Cell().add("200").setTextAlignment(TextAlignment.RIGHT));
		itable.addCell(new Cell().add("" + 20 * 200).setTextAlignment(TextAlignment.RIGHT));

		itable.addCell(new Cell().add("App").setTextAlignment(TextAlignment.LEFT));
		itable.addCell(new Cell().add("20").setTextAlignment(TextAlignment.LEFT));
		itable.addCell(new Cell().add("200").setTextAlignment(TextAlignment.RIGHT));
		itable.addCell(new Cell().add("" + 20 * 200).setTextAlignment(TextAlignment.RIGHT));

		itable.addCell(new Cell().add("").setBackgroundColor(new DeviceRgb(63, 169, 219)).setFontColor(Color.WHITE)
				.setTextAlignment(TextAlignment.RIGHT).setBorder(Border.NO_BORDER));
		itable.addCell(new Cell().add("").setBackgroundColor(new DeviceRgb(63, 169, 219)).setFontColor(Color.WHITE)
				.setTextAlignment(TextAlignment.RIGHT).setBorder(Border.NO_BORDER));
		itable.addCell(new Cell().add("Total").setBackgroundColor(new DeviceRgb(63, 169, 219)).setFontColor(Color.BLACK)
				.setTextAlignment(TextAlignment.RIGHT).setBorder(Border.NO_BORDER));
		itable.addCell(new Cell().add("" + ((20 * 200) + (20 * 200))).setBackgroundColor(new DeviceRgb(63, 169, 219))
				.setFontColor(Color.BLACK).setTextAlignment(TextAlignment.RIGHT));

		document.add(table);
		document.add(new Paragraph("\n"));
		document.add(ctable);
		document.add(new Paragraph("\n"));
		document.add(itable);
		document.add(new Paragraph("\nSgin").setTextAlignment(TextAlignment.RIGHT));
		document.close();

	}

}

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class _09_GeneratePDFByExternalLibrary {

	public static void main(String[] args) throws IOException {
		/* Write a program to generate a PDF document called
		 * Deck-of-Cards.pdf and print in it a standard deck of 52 
		 * cards, following one after another. Each card should be
		 *  a rectangle holding its face and suit
		 */

		Document document = new Document();
		String[] cardFaces = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K", "A"};
		String[] cardSuits = {"\u2665", "\u2666", "\u2663", "\u2660"};
	
		try {
			PdfWriter.getInstance(document,
	                new FileOutputStream("Deck-of-52-Cards.pdf"));
			document.open();
			PdfPTable table = new PdfPTable(4);
			table.setWidthPercentage(100);
			table.getDefaultCell().setFixedHeight(180);
		    
			for (int i = 0; i < cardFaces.length; i++) {
				for (int j = 0; j < cardSuits.length; j++) {
					if (cardSuits[j].equals("\u2663") ||
							cardSuits[j].equals("\u2660")) {
						BaseFont bfArial = BaseFont.createFont("arial.ttf",
								BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
						Font font = new Font(bfArial, 56, Font.NORMAL, 
								BaseColor.BLACK);
						table.addCell(new Paragraph((cardFaces[i] 
			            		+ cardSuits[j]), font));
					} else {
						BaseFont bfArial = BaseFont.createFont("arial.ttf",
								BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
						Font font = new Font(bfArial, 56, Font.NORMAL, 
								BaseColor.RED);
						table.addCell(new Paragraph((cardFaces[i] 
			            		+ cardSuits[j]), font));
					}
				}
			}
			document.add(table);
			document.close();
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
}

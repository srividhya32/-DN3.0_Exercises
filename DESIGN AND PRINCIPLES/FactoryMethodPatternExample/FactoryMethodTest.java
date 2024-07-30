package FactoryMethodPatternExample;

public class FactoryMethodTest {
 public static void main(String[] args) {
     // Create factories
     DocumentFactory wordFactory = new WordDocumentFactory();
     DocumentFactory pdfFactory = new PdfDocumentFactory();
     DocumentFactory excelFactory = new ExcelDocumentFactory();

     // Create documents
     Document wordDoc = wordFactory.createDocument();
     Document pdfDoc = pdfFactory.createDocument();
     Document excelDoc = excelFactory.createDocument();

     // Use documents
     wordDoc.open();
     wordDoc.save();
     wordDoc.close();
     System.out.println("*************************************");
     pdfDoc.open();
     pdfDoc.save();
     pdfDoc.close();
     System.out.println("*************************************");
     excelDoc.open();
     excelDoc.save();
     excelDoc.close();
     System.out.println("*************************************");
 }
}

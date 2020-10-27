package xml;

import com.itextpdf.text.*;

import com.itextpdf.text.pdf.*;


import java.io.*;
import java.util.Scanner;


public class pdf{
    //Step 1—Create a Document.  
    private String fileName = "";
    private String cotent;
    private static String USER_PASS = "Hello123";
    private static String OWNER_PASS = "Owner123";
    

    public String set_content(String a){
        this.cotent = a;
        return this.cotent;


    }
    
    private String setFileName(){
        this.fileName = "FirstPdf.pdf";
        return fileName;
    }
 //Step 2—Get a PdfWriter instance.

    
    public Document createNewPdf() {
        String file_name = setFileName();
        
        Rectangle rect = new Rectangle(PageSize.A4);
        
        rect.setBackgroundColor(BaseColor.ORANGE);

        Document document = new Document(rect);
        try {
            
           PdfWriter.getInstance(document, new FileOutputStream(file_name));
            
            return document;
        } catch (Exception e) {
            return null;
            //TODO: handle exception
        }
    }


	
	public  void StringtoPdf(Document document, String content){

        
        try {
            
            
             document.open();
             //Step 4—Add content.
             document.add(new Paragraph(content));
             //Step 5—Close the Document.
             document.close();
        }
        catch (DocumentException e) {
             e.printStackTrace();
         } finally {
             // step 5
             
              document.close();
       
    }
    
    }
}

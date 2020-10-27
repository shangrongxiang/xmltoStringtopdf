package xml;
import java.io.File;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class xml {
  

	private String cotent = "";
	private String filename = "";

	private void stefilename() {
		this.filename = "Students.xml";
		
	}

   public Document xmlcreate(){
		try {
			
		stefilename();
	
		   File  xmlFile = new File(filename);
		   
		   DocumentBuilderFactory  builderFactory =  DocumentBuilderFactory.newInstance();
		   
		   DocumentBuilder   builder = builderFactory.newDocumentBuilder();
		   
		   Document  doc = builder.parse(xmlFile);
		   
		   doc.getDocumentElement().normalize();
		   return doc;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
		
		
		
   }

	

	public String xmltostring(Document doc){

		cotent = cotent + ("\n----------------------------ByShangRongxiang  nepturn is B27SW1");

		cotent = cotent + ("\nRoot  element: "+doc.getDocumentElement().getNodeName()+"\n");
		
		NodeList  nList = doc.getElementsByTagName("book");
		
		for(int  i = 0 ; i<nList.getLength();i++){
			
				Node  node = nList.item(i);
				cotent = cotent + ("\n\nNode name: "+ node.getNodeName()+"\n");
				Element  ele = (Element)node;
				
				
				if(node.getNodeType() == Element.ELEMENT_NODE){
					
					//System.out.println("book category: "+ ele.getAttribute("category"));
					
					cotent = cotent + ("\ntitle name: "+ ele.getElementsByTagName("name").item(0).getTextContent());
					
					cotent = cotent + ("\nauthor name: "+ele.getElementsByTagName("author").item(0).getTextContent());
					
					//System.out.println("year :"+ele.getElementsByTagName("year").item(0).getTextContent());
					
					//System.out.println("price : "+ele.getElementsByTagName("price").item(0).getTextContent());
					
					cotent = cotent + ("-------------------------\nThanks for your reading");
					
					
	
				
				}		
			}
			String a = cotent;
			return a;
	}
			

}
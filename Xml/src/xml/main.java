package xml;
public class main {
    public static void main(String[] args) {
        xml newXml = new xml();
        String  a  = newXml.xmltostring(newXml.xmlcreate());
        System.out.println(a);
        pdf newPdf = new pdf();
        newPdf.StringtoPdf(newPdf.createNewPdf(),newPdf.set_content(a));
    }
    
}

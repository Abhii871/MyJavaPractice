package com.nttdata.Xmlbasics;


import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class XmlReadOperation {
	
	public static Document readFile(String string) throws Exception {
		Document doc;
		
	try {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db=dbf.newDocumentBuilder();
		doc =db.parse(string);
		return doc;
	} 
	catch (SAXParseException ex)
	{
				throw(ex);
			
	}
	catch (SAXException ex)
	{
		Exception x =ex.getException();
		throw ((x==null)? ex:x);
	}
	}
		
	public static int getElementCount(Node node){
		 if (null==node) return 0;
		 int sum=0;
		 boolean isElement = (node.getNodeType()==Node.ELEMENT_NODE);
		 if (isElement) sum=1;
		 NodeList children=node.getChildNodes();
		 if (null==children) return sum;
			 for (int i = 0; i < children.getLength(); i++) {
				 sum+=getElementCount(children.item(i));
				 			
			}
			 return sum;	 
			 
		}
public static void main (String[] arg) throws Exception{
	Node node= readFile("SampleXML.xml");
	System.out.println( "elementCount:"+getElementCount(node));
	
	
}
}

package com.hackathon.restapi.restservices.parser;

import java.io.ByteArrayInputStream;
import org.xml.sax.InputSource;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.io.StringReader;


public class SaxXMLParser extends DefaultHandler {
	//List<Book> bookL;
	String XmlData;
	String tmpValue;
	//Book bookTmp;
	SimpleDateFormat sdf= new SimpleDateFormat("yy-MM-dd");

	public SaxXMLParser(String xmlData) {

		this.XmlData = xmlData;

		//bookL = new ArrayList<Book>();

		parseDocument();

		printDatas();

	}

	private void parseDocument() {

		// parse

		SAXParserFactory factory = SAXParserFactory.newInstance();

		try {

			SAXParser parser = factory.newSAXParser();
			
			
//			parser.parse(XmlData, this);
			ByteArrayInputStream in = new ByteArrayInputStream(XmlData.toString().getBytes());
			InputSource is = new InputSource();
			is.setByteStream(in);

			// start parsing
			//parser.parse(in, this);
			parser.parse(new InputSource(new StringReader(XmlData)), this);

		} catch (ParserConfigurationException e) {

			System.out.println("ParserConfig error");

		} catch (SAXException e) {

			System.out.println("SAXException : xml not well formed");

		} catch (IOException e) {

			System.out.println("IO error" + e.toString());

		}

	}

	private void printDatas() {

		// System.out.println(bookL.size());
		/*   for (Book tmpB : bookL) {

            System.out.println(tmpB.toString());

        }*/

	}

	@Override

	public void startElement(String s, String s1, String elementName, Attributes attributes) throws SAXException {

		// if current element is book , create new book

		// clear tmpValue on start of element



		if (elementName.equalsIgnoreCase("result")) {

			//bookTmp = new Book();

			//bookTmp.setId(attributes.getValue("id"));

			//bookTmp.setLang(attributes.getValue("lang"));

		}

		// if current element is publisher

		if (elementName.equalsIgnoreCase("short_description")) {

			// bookTmp.setPublisher(attributes.getValue("country"));

		}

	}

	@Override

	public void endElement(String s, String s1, String element) throws SAXException {

		// if end of book element add to list

		if (element.equals("result")) {

			//bookL.add(bookTmp);

		}

		if (element.equalsIgnoreCase("short_description")) {

			//bookTmp.setIsbn(tmpValue);
			System.out.println(element + " : "+tmpValue);
		}

		if (element.equalsIgnoreCase("sys_id")) {

			//bookTmp.setTitle(tmpValue);
			System.out.println(element + " : "+tmpValue);
		}

		/*  if(element.equalsIgnoreCase("author")){

           bookTmp.getAuthors().add(tmpValue);

        }

        if(element.equalsIgnoreCase("price")){

            bookTmp.setPrice(Integer.parseInt(tmpValue));

        }

        if(element.equalsIgnoreCase("regDate")){

            try {

                bookTmp.setRegDate(sdf.parse(tmpValue));

            } catch (ParseException e) {

                System.out.println("date parsing error");

            }

        }*/

	}

	@Override

	public void characters(char[] ac, int i, int j) throws SAXException {

		tmpValue = new String(ac, i, j);
		if(tmpValue.length() == 0) return;
		/* if("short_description".equals(currentElement())){

        }*/

	}

	/*   public static void main(String[] args) {

        new SaxXMLParser("catalog.xml");

    }*/

}

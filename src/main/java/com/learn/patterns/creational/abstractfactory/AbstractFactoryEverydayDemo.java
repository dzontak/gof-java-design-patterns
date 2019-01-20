package com.learn.patterns.creational.abstractfactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class AbstractFactoryEverydayDemo {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        final String xml = "<document><body><stock>TESLA</stock></body></document>";
        final ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());
        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder factory = abstractFactory.newDocumentBuilder();
        Document document = factory.parse(bais);
        document.getDocumentElement().normalize();

        System.out.println("Root element : " + document.getDocumentElement().getNodeName());
        System.out.println(abstractFactory.getClass());
        System.out.println(factory.getClass());
        System.out.println(document.getClass());

    }

}

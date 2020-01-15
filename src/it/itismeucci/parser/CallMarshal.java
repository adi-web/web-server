/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.itismeucci.parser;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author informatica
 */
public class CallMarshal {

    public CallMarshal() throws JAXBException {
        jaxbObjectToXML();

    }

    private static void jaxbObjectToXML() throws JAXBException {
        Marshall m = new Marshall();
        JAXBContext jc = JAXBContext.newInstance(Marshall.class);

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        File file = new File("tetsXml.xml");
        marshaller.marshal(m, file);

    }

}

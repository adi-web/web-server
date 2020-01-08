/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.itismeucci.parser;

import java.net.URISyntaxException;
import javax.xml.bind.JAXBException;

/**
 *
 * @author informatica
 */
public class ReadXml {
    
    App config;
    
    
       public ReadXml() throws URISyntaxException, JAXBException{
           AppConfigParser configParser = new AppConfigParser();
       
            config = configParser.parse("it/itismeucci/parser/app.xml");
         
       }

    public App getConfig() {
        return config;
    }

    public void setConfig(App config) {
        this.config = config;
    }
       
       
    
}

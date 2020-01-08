/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.itismeucci.parser;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class Marshall {
    
    /**
     *
     */
    @XmlElement
    public String port;

    public String getPorta() {
        return port;
    }

    public void setPorta(String porta) {
        this.port = porta;
    }
    
    public Marshall(String porta )
    {
        this.port=porta;
    }
    public Marshall () {
	    super();
	}
	
    
}

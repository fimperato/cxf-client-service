
package demo.spring.service;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import javax.xml.ws.WebServiceRef;

/**
 * This class was generated by Apache CXF 3.1.0
 * 2015-05-17T09:15:27.501+02:00
 * Generated source version: 3.1.0
 * 
 */
public final class HelloWorld_HelloWorldImplPort_ClientRef {

	@WebServiceRef
	static HelloWorldImplService service;

    private HelloWorld_HelloWorldImplPort_ClientRef() {
    }

    public static void main(String args[]) throws java.lang.Exception {
       
      
        service = new HelloWorldImplService();
        HelloWorld port = service.getHelloWorldImplPort();  
        
        {
        System.out.println("Invoking sayHi (2)...");
        java.lang.String _sayHi_arg0 = "";
        java.lang.String _sayHi__return = port.sayHi(_sayHi_arg0);
        System.out.println("sayHi.result=" + _sayHi__return);


        }

        System.exit(0);
    }

}

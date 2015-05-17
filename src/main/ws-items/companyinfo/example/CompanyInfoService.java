package companyinfo.example;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2015-05-17T20:40:35.268+02:00
 * Generated source version: 2.7.0
 * 
 */
@WebServiceClient(name = "CompanyInfoService", 
                  wsdlLocation = "classpath:wsdl/CompanyInfo.wsdl",
                  targetNamespace = "http://example.companyInfo") 
public class CompanyInfoService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://example.companyInfo", "CompanyInfoService");
    public final static QName SOAPPort = new QName("http://example.companyInfo", "SOAPPort");
    static {
        URL url = CompanyInfoService.class.getClassLoader().getResource("wsdl/CompanyInfo.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(CompanyInfoService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/CompanyInfo.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public CompanyInfoService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CompanyInfoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CompanyInfoService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CompanyInfoService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CompanyInfoService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CompanyInfoService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns CompanyInfo
     */
    @WebEndpoint(name = "SOAPPort")
    public CompanyInfo getSOAPPort() {
        return super.getPort(SOAPPort, CompanyInfo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CompanyInfo
     */
    @WebEndpoint(name = "SOAPPort")
    public CompanyInfo getSOAPPort(WebServiceFeature... features) {
        return super.getPort(SOAPPort, CompanyInfo.class, features);
    }

}
package fiap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2018-07-11T22:25:37.694-03:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "employeePort", 
                  wsdlLocation = "file:/C:/Users/Daniel/AnypointStudio/workspace1/integration-challenge/src/main/resources/Schemas/EmployeeWS.wsdl",
                  targetNamespace = "http://xmlns.oracle.com/Application6/Project1/EmployeeWS") 
public class EmployeePort_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://xmlns.oracle.com/Application6/Project1/EmployeeWS", "employeePort");
    public final static QName EmployeePortPort = new QName("http://xmlns.oracle.com/Application6/Project1/EmployeeWS", "employeePortPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Daniel/AnypointStudio/workspace1/integration-challenge/src/main/resources/Schemas/EmployeeWS.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(EmployeePort_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Daniel/AnypointStudio/workspace1/integration-challenge/src/main/resources/Schemas/EmployeeWS.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EmployeePort_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EmployeePort_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmployeePort_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EmployeePort_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EmployeePort_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EmployeePort_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns EmployeePort
     */
    @WebEndpoint(name = "employeePortPort")
    public EmployeePort getEmployeePortPort() {
        return super.getPort(EmployeePortPort, EmployeePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmployeePort
     */
    @WebEndpoint(name = "employeePortPort")
    public EmployeePort getEmployeePortPort(WebServiceFeature... features) {
        return super.getPort(EmployeePortPort, EmployeePort.class, features);
    }

}

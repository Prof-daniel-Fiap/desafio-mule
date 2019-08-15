
package fiap;

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
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2018-07-11T22:25:37.557-03:00
 * Generated source version: 2.5.1
 * 
 */
public final class EmployeePort_EmployeePortPort_Client {

    private static final QName SERVICE_NAME = new QName("http://xmlns.oracle.com/Application6/Project1/EmployeeWS", "employeePort");

    private EmployeePort_EmployeePortPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = EmployeePort_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        EmployeePort_Service ss = new EmployeePort_Service(wsdlURL, SERVICE_NAME);
        EmployeePort port = ss.getEmployeePortPort();  
        
        {
        System.out.println("Invoking calculateEmployeeBonus...");
        fiap.Employee _calculateEmployeeBonus_part = null;
        java.math.BigDecimal _calculateEmployeeBonus__return = port.calculateEmployeeBonus(_calculateEmployeeBonus_part);
        System.out.println("calculateEmployeeBonus.result=" + _calculateEmployeeBonus__return);


        }
        {
        System.out.println("Invoking getAvarageSalary...");
        java.math.BigDecimal _getAvarageSalary__return = port.getAvarageSalary();
        System.out.println("getAvarageSalary.result=" + _getAvarageSalary__return);


        }

        System.exit(0);
    }

}
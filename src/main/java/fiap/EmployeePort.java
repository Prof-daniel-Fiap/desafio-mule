package fiap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2018-07-11T22:25:37.684-03:00
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://xmlns.oracle.com/Application6/Project1/EmployeeWS", name = "employeePort")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface EmployeePort {

    @WebMethod(action = "http://xmlns.oracle.com/Application6/Project1/EmployeeWS/calculateEmployeeBonus")
    @WebResult(name = "decimal", targetNamespace = "http://xmlns.oracle.com/Application6/Project1/EmployeeWS", partName = "Bonus")
    public java.math.BigDecimal calculateEmployeeBonus(
        @WebParam(partName = "part", name = "part", targetNamespace = "")
        Employee part
    );

    @WebMethod(action = "http://xmlns.oracle.com/Application6/Project1/EmployeeWS/getAvarageSalary")
    @WebResult(name = "decimal", targetNamespace = "http://xmlns.oracle.com/Application6/Project1/EmployeeWS", partName = "avarageSalary")
    public java.math.BigDecimal getAvarageSalary();
}

# Avenue Code Integration Challenge

This challenge consists of creating two web services, using SOAP and REST.
Both have to be created in the same project using Anypoint Studio, the IDE for Mule ESB (www.mulesoft.org). You can download it from https://www.mulesoft.com/mule-esb-enterprise-30-day-trial. Make sure you use the 3.6 version of Mule ESB.

We believe that without any previous experience with Mule you will still be able to use it because of its intuitive IDE. If you have any difficulties, check their documentation (https://developer.mulesoft.com/docs/display/current/Home) and further resources as YouTube videos.

This source contains the basic template for your implementation.
Mule 3.6 and Anypoint Studio are compatible only with JDK 1.7.

## SOAP Web Service

### 1 - Create a WSDL containing the following operations and a flow using Anypoint Studio to implement their logic:

* Get the average employees salary
	* Empty request and returns a decimal
* Calculate an employee bonus
	* Receives employee id and returns the bonus as a decimal
	* Use the already created class com.avenuecode.challenge.integration.EmployeeBonusTransformer
	* Put a "Java Transformer" processor in the flow associated with EmployeeBonusTransformer class
	* The bonus must be a random percentage from the employee salary, but not higher than 50%
	* Make sure the resulting number has a scale of 2

Use any tool of your choice to create the WSDL and copy it to a folder of your project.


### 2 - Create a flow using Anypoint Studio to implement the logic for the WSDL created on item 1:

Create a flow for this service using the HTTP and CXF components.

The database configuration is already created as a Global Element and can be referenced by the Database processor.

To implement the employee bonus logic:

* Use the already created class com.avenuecode.challenge.integration.EmployeeBonusTransformer
* Put a "Java Transformer" processor in the flow associated with EmployeeBonusTransformer class
* The bonus must be a random percentage from the employee salary, but not higher than 50%
* Make sure the resulting number has a scale of 2
   
## REST Web Service

### 3 - Create another flow exposing a REST service where the consumer will be able to:
* Insert an employee
	* Receives an Employee and returns a success message
* List all employees
	* Empty request and returns a list of employees

Your service should use JSON as its representation format for objects.

You can define the resources names and HTTP verbs used.

## Tips
* The database used is H2 (http://www.h2database.com). It is automatically created in-memory and its DDL and initial data are on src/main/resources/create.sql.
* You can check the different SOAP requests based on its SOAPAction HTTP header using the expression #[message.inboundProperties.soapaction contains 'xxx'].
* You can check the HTTP verb using the expression #[message.inboundProperties.'http.method' == 'XXX'].
* Use the already created type Employee.xsd.
* Debug your application in order to check the payload format on each step (processor) of the flows.

## Delivery Instructions

1. You must provide his BitBucket username. A free BitBucket account can be created at http://bitbucket.org
1. The recruiter will give you read permission to a repository named **integration-challenge**, at https://bitbucket.org/ac-recruitment/integration-challenge
1. You must fork this repository into a private repository on your own account and push your code in there.
1. Once finished, you must give the user **ac-recruitment** read permission on your repository so that you can be evaluated. Then, please contact back your recruiter and he will get an engineer to evaluate your test.
1. After you are evaluated, the recruiter will remove your read permission from the original repository.

## Format

* This assessment must be delivered within 2 days.
* If you wish, you can provide a README.txt (plain text) or a README.md (Markdown) file at the root of your repository, explaining:
    * Any comments regarding your implementation.
    * Mention anything that was asked but not delivered and why.
* Any questions, please send an email to **recruitment.engineering@avenuecode.com**

Thank you,

The AvenueCode Recruiting Team
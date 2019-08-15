/**
 * 
 */
package fiap;

import java.math.BigDecimal;


/**
 * @author Daniel
 *
 */
public class EmployeePortImpl implements EmployeePort {

	/* (non-Javadoc)
	 * @see avenue.EmployeePort#calculateEmployeeBonus(avenue.Employee)
	 */
	@Override
	public BigDecimal calculateEmployeeBonus(Employee part) {
	
		//sends salary to the next step and transformer calculates the bonus with random value.
		return new BigDecimal(part.salary.doubleValue());
	}

	/* (non-Javadoc)
	 * @see avenue.EmployeePort#getAvarageSalary()
	 */
	@Override
	public BigDecimal getAvarageSalary() {
			
		return new BigDecimal(-1);
	}

}

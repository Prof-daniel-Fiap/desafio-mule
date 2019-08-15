package com.fiap.desafio.mule;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class EmployeeBonusTransformer extends AbstractTransformer {

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {

		double random = Math.random();
		double halfSalary =  new Double(src.toString())*0.5;
		BigDecimal bonus = new BigDecimal(halfSalary*random);
				
			
		return bonus;
	}

}

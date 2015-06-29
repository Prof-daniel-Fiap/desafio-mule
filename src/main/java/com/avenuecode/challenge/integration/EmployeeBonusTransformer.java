package com.avenuecode.challenge.integration;

import java.math.BigDecimal;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class EmployeeBonusTransformer extends AbstractTransformer {

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {

		BigDecimal bonus = null;
		
		// TODO Insert the bonus implementation here!
		
		return bonus;
	}

}

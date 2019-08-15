package com.fiap.desafio.mule;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;
import org.python.icu.math.BigDecimal;

public class AvgSalaryTransformer extends AbstractMessageTransformer{
    public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException{
            	        
        return message.getInvocationProperty("var_avg");
    }
}
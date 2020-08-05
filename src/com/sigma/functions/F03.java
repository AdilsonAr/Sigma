package com.sigma.functions;
/*
 * author: Adilson Arbuez
 * date: 04/08/2020
 */
public class F03 implements Function{

	@Override
	public double eval(double x) {
		// TODO Auto-generated method stub
		return (Math.log(x)/Math.sqrt(x))+Math.exp(x/3);
	}

}

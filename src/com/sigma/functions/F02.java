package com.sigma.functions;
/*
 * author: Adilson Arbuez
 * date: 04/08/2020
 */
public class F02 implements Function{

	@Override
	public double eval(double x) {
		// TODO Auto-generated method stub
		return Math.sin(x)+Math.pow(x,2);
	}

}

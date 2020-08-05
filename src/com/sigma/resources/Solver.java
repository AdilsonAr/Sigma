package com.sigma.resources;

import com.sigma.functions.Function;
import com.sigma.functions.Sigma;

/*
 * author: Adilson Arbuez
 * date: 04/08/2020
 */
public class Solver {
	
	//it works for summation, but always have a error
	public double solve(Sigma sigma,double nearLast) {
		double result =0;
		//the interval b-a plus delta of the Riemann summation... (b-a)/n
		double d=sigma.getB()-sigma.getA()+ (sigma.getB()-sigma.getA())/sigma.getN();
		//need a number which by dividing d, gives as result a small number which approaches nearLast
		int divide=(int)(Math.rint(d/nearLast));
		for(int i=1;i<=divide;i++) {
			result+=sigma.getF().eval(sigma.getA()+d/Math.pow(2, i));
		}
		//calculate with error the missing dy in a interval to complete summation
		result+=(d/divide)*sigma.getF().eval(sigma.getA())/Math.pow(2, divide);
		
		return result;
	}
	//it solve summations exactly, through the strategy of summations but changes the last interval
	public double solve(Sigma sigma) {
		double result =0;
		//the interval b-a plus delta of the Riemann summation... (b-a)/n
		double d=sigma.getB()-sigma.getA()+ (sigma.getB()-sigma.getA())/sigma.getN();
		
		return result;
	}
	
	private boolean validateSummation(Sigma sigma) {
		boolean r=true;
		if(sigma.getA()%1!=0 || sigma.getB()%1!=0) {
			r=false;
		}
		return r;
	}
}

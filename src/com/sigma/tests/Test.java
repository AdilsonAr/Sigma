package com.sigma.tests;

import com.sigma.functions.F01;
import com.sigma.functions.Function;
import com.sigma.functions.Sigma;
import com.sigma.resources.Solver;

/*
 * author: Adilson Arbuez
 * date: 04/08/2020
 */
public class Test {

	public static void main(String [] args) {
		Function f=new F01();
		Sigma s=new Sigma(f,100,0,2);
		Solver solver=new Solver();
		System.out.println(solver.solve(s, 0.1));
		System.out.println(solver.commonSum(s));
	}
}

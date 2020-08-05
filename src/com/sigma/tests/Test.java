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
		Sigma s=new Sigma(f,100,1,2);
		Solver solver=new Solver();
		System.out.print(solver.solve(s, 0.1));
	}
}

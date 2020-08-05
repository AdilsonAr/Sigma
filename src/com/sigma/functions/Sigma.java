package com.sigma.functions;
/*
 * author: Adilson Arbuez
 * date: 04/08/2020
 */

//contains details about a summation like Riemann integral
public class Sigma {
	//function which is going to be used in the summation
	private Function f;
	//indicate the 'delta x' of the summation, if becomes zero, it is a integral..(b-a)/n
	//it never become zero because it make n tend to infinity
	private int n;
	//interval of sum a,b
	private double a;
	private double b;
	
	
	public Sigma(Function f, int n, double a, double b) {
		super();
		this.f = f;
		this.n = n;
		this.a = a;
		this.b = b;
	}
	public Sigma() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public Function getF() {
		return f;
	}
	public void setF(Function f) {
		this.f = f;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
}

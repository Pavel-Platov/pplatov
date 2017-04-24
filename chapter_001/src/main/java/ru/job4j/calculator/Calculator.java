package ru.job4j.calculator

/**
Class calculate.

@author Pavel Platov (platov_p@mail.ru)
@version $ld$
@since 0.1
*/

public class Calculator {
	private double result

	public void add(double first, double second) {
		this.result = first + second;
	}

	public void substruct(double first, double second) {
		this.result = first - second;
	}

	public void div(double first, double second) {
		this.result = first / second;
	} 

	public void multiple(double first, double second) {
		this.result = first * second;
	} 

	public double getResult() {
		return thes.result;
	}
}
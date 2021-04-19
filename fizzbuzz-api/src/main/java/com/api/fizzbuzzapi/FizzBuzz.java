package com.api.fizzbuzzapi;

public class FizzBuzz {
	private String fizzBuzz;	
	private String fizz;
	private String buzz;
	
	public FizzBuzz(String fizzVar, String buzzVar, String fizzbuzzVar) {
		this.fizz = fizzVar;
		this.buzz = buzzVar;
		this.fizzBuzz = fizzbuzzVar;
	}
	
	public String getFizzBuzz() {
		return fizzBuzz;
	}

	public void setFizzBuzz(String fizzbuzz) {
		fizzbuzz = fizzBuzz;
	}

	public String getFizz() {
		return fizz;
	}

	public void setFizz(String setFizz) {
		setFizz = fizz;
	}

	public String getBuzz() {
		return buzz;
	}

	public void setBuzz(String setBuzz) {
		setBuzz = buzz;
	}

	@Override
	public String toString() {
		return "FizzBuzz [FizzBuzz=" + fizzBuzz + ", Fizz=" + fizz + ", Buzz=" + buzz + "]";
	}

}

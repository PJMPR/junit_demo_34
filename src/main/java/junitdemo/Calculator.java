package junitdemo;

public class Calculator {

	public int add(int i, int j) {
		return i+j;
	}

	public int power(int i, int j) throws NegativeNumberException {
		if(j<0)
			throw new NegativeNumberException();
		if(j==0)return 1;
		return power(i,--j)*i;
	}

}

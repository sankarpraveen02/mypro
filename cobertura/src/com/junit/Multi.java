package com.junit;

public class Multi {
int a,b;

public Multi(int a, int b) {
	super();
	this.a = a;
	this.b = b;
	
}

public int multiplication(){   //multiply
	return a*b;
}
public int divide(){
	return a/b;
}
	public static void main(String[] args) {
		Multi obj = new Multi(2,3);
		Multi obj1 = new Multi(3,2);
		System.out.println(obj.multiplication());
		System.out.println(obj1.divide());
		System.out.println("End");
	}

}

package com.ze.main;

public class Arith  {
	int a,b,c;

	public Arith(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	public int sum(){              //addition
		return a+b+c;
	}
	public int multiplication(){    //multiply
		return a*b*c;
	}
	public int divide(){           //divide
	    return (a+b+c)/10;
    }
		public static void main(String[] args) {
			Arith obj = new Arith(4,5,6);
			Arith obj1 = new Arith(2,3,4);
			Arith obj2 = new Arith(4,5,6);
			System.out.println(obj.sum());
			System.out.println(obj1.multiplication());
			System.out.println(obj2.divide());
			System.out.println("End");
		}

	

}

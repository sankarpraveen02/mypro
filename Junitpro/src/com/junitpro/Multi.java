
		package com.junitpro;

		public class Multi {
		int a,b,c;

		public Multi(int a, int b, int c) {
			super();
			this.a = a;
			this.b = b;
			this.c = c;
			
		}
		public int sum(){
			return a+b+c;
		}
		public int multiplication(){
			return a*b*c;
		}
		public int divide(){
		    return (a+b+c)/10;
	    }
			public static void main(String[] args) {
				Multi obj = new Multi(4,5,6);
				Multi obj1 = new Multi(2,3,4);
				Multi obj2 = new Multi(4,5,6);
				System.out.println(obj.sum());
				System.out.println(obj1.multiplication());
				System.out.println(obj2.divide());
				System.out.println("End");
			}

		

	}



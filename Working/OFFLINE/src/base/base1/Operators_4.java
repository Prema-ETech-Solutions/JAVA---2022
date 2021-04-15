package base.base1;


public class Operators_4 {


	public static void main(String[] args) {
		/*
		 * Java divides the operators into the following groups:
		 * Arithmetic operators
		 * Assignment operators
		 * Comparison operators  
		 * Logical operators
		 * Bitwise operators
		 */
		System.out.println("Arithmetic Operators");
		int a=1,b=9,c;
		c=a+b;
		System.out.println("A+B = "+(a+b));
		System.out.println("C = "+c);
		c=a-b;
		System.out.println("A-B = "+ (a-b));
		System.out.println("C = "+c);
		c=a/b;
		System.out.println("A/B = "+ (a/b));
		System.out.println("C = "+c);
		c=a*b;
		System.out.println("A*B = "+ (a*b));
		System.out.println("C = "+c);
		c=a%b;
		System.out.println("A%B = "+ (a%b));
		System.out.println("C = "+c);
		System.out.println("a++ = "+ a++);
		System.out.println("b-- = "+b--);
		
		
		
		System.out.println("Assignment Operators");
		a=10;
		b=10;
		System.out.println("a=a+b or a+=b "+ (a+=b));
		System.out.println("a=a-b or a-=b "+ (a-=b));
		System.out.println("a=a/b or a/=b "+ (a/=b));
		System.out.println("a=a*b or a*=b "+ (a*=b));
		System.out.println("a=a%b or a%=b "+ (a%=b));
		System.out.println("a=a&b or a&=b "+ (a&=b));
		System.out.println("a=a|b or a|=b "+ (a|=b));
		System.out.println("a=a^b or a^=b "+ (a^=b));
		System.out.println("a=a>>b or a>>=b "+ (a>>=b));
		System.out.println("a=a<<b or a<<=b "+ (a<<=b));
		
		
		System.out.println("Comparison Operators");
		a=10;
		b=20;
		System.out.println("Equal to "+(a==b));
		System.out.println("Not Equal "+(a!=b));
		System.out.println("Greater Than "+(a>b));
		System.out.println("Less Then "+(a<b));
		System.out.println("Greater than or equal to "+(a<=b));		
		System.out.println("Less Than or equal To "+(a>=b));
		
		System.out.println("Logical Operators");
		a=10;
		b=10;
		System.out.println("AND "+(a>20 && b>30));
		System.out.println("OR "+(a<20 || b>30));
		System.out.println("NOT "+ !(a>10&&b<20));
		
		System.out.println("Bitwise Operators");
		System.out.println("AND IN BITS "+(a&b));
		System.out.println("OR IN BITS "+(a|b));
		System.out.println("NOT IN BITS "+~a);
		System.out.println("XOR IN BITS "+(a^b));
		System.out.println("LEFT SHIFT "+(a<<b));
		
		

	}

}

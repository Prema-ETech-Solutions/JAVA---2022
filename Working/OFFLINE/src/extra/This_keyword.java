package extra;

public class This_keyword {

//	this keyword in Java
//	There can be a lot of usage of Java this keyword. In Java, this is a reference variable that refers to the current object.
//	 this: to refer current class instance variable
//	 The this keyword can be used to refer current class instance variable. 
//	If there is ambiguity between the instance variables and parameters, 
//	this keyword resolves the problem of ambiguity.
	int ID;  
	String name;  
	float Sal;  

//	This_keyword(int ID, String name, float Sal) {
//		ID = ID;
//		name = name;
//		Sal = Sal;
//	}
//	In the above example, parameters (formal arguments) and instance variables are same. 
//	So, we are using this keyword to distinguish local variable and instance variable.
	This_keyword(int ID, String name, float Sal) {
		this.ID = ID;
		this.name = name;
		this.Sal = Sal;
	}

	void display()
	{
		System.out.println(ID+" "+name+" "+Sal);  
	}  
	public static void main(String[] args) 
	{
		This_keyword s1=new This_keyword(1,"ankit",5000f);  
		This_keyword s2=new This_keyword(1,"DD",5000f);    
		s1.display();  
		s2.display();  
		
	}

}
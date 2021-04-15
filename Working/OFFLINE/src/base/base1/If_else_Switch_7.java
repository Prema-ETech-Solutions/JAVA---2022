package base.base1;

public class If_else_Switch_7 
{
	public static void main(String[] args)
	{
		
		
		
		/*
		 * Java has the following conditional statements:
		 * Use "if" to specify a block of code to be executed, if a specified condition is true
		 * Use "else" to specify a block of code to be executed, if the same condition is false
		 * Use "else if" to specify a new condition to test, if the first condition is false
		 * Use "switch" to specify many alternative blocks of code to be executed
		 * 
		 * SYNTAX
		 * "IF"
		 * if (Condition)
		 * {
		 * }
		 * --------------------------------------
		 * "IF" AND "ELSE"
		 * if(Condition)
		 * {
		 * }
		 * else
		 * {
		 * }
		 * ---------------------------------------
		 * "IF" AND "ELSE IF" AND "ELSE"
		 * if(Condition)
		 * {
		 * }
		 * else if (Condition)
		 * {
		 * }
		 * else
		 * {
		 * }
		 * ----------------------------------------
		 * Short Hand If...Else (Ternary Operator)
		 * variable = (condition) ? expressionTrue :  expressionFalse;
		 * -------------------------------------------------------------
		 * "SWITCH"
		 * switch(Condition)
		 * {
		 * case 1:
		 * {
		 * this is case 1 block
		 * 
		 * break;
		 * }
		 * case 2 :
		 * {this is case 2 block
		 * 
		 * break;
		 * }
		 * default:
		 * {
		 * this is default block
		 * }
		 * } 
		 * ------------------------------------------------------------------------------------
		 * This is how it works:
		 * The switch expression is evaluated once.
		 * The value of the expression is compared with the values of each case.
		 * If there is a match, the associated block of code is executed.
		 * The break and default keywords are optional, and will be described later in this chapter
		 * --------------------------------------------------------------------------------------
		 * The break Keyword
		 * When Java reaches a break keyword, it breaks out of the switch block.
		 * This will stop the execution of more code and case testing inside the block.
		 * When a match is found, and the job is done, it's time for a break. There is no need for more testing.
		 * ----------------------------------------------------------------------------------------- 
		 * 
		 * 
		 */
		int age=2;
		System.out.println("ONLY IF");
		if(age>=18)//In this case age is greater or equals to 18 then if body will run
		{//BODY OF IF
			// block of code to be executed if the condition is true
			System.out.println("VOTING");
		}//END BODY IF
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("IF AND ELSE");
		if (age > 18) //In this case age is greater then the body will executed or the else part will be executed
		{
			System.out.println("VOTING");
		}
		else 
		{
			System.out.println("NOT VOTING");
		}
			
		System.out.println("------------------------------");
		System.out.println("IF , ELSEIF AND ELSE");
		if (age>18)//in this case the age is greater then 18
		{
			System.out.println(" AGE IS GREATER THEN  18 ");
		}
		else if (age==18) // in this case the age is equal to 18
		{
			System.out.println(" AGE IS EQUAL TO  18 ");
		}
		else // in this case age is less then 18
		{
			System.out.println("AGE IS LESS THEN 18");
		}
		System.out.println("---------------------------------------");
		System.out.println("Short Hand If...Else (Ternary Operator)");
		System.out.println(((age>18)?"18+":"18-"));
		System.out.println("----------------------------------------");
		
		
		
		
		
		System.out.println("SWITCH AND ITS CASE");
		age = 2;
		switch (age)
		{//Start of switch body 
		case 1:
		{
			System.out.println("THIS IS CASE 1");
			break;
		}
		case 2:
		{System.out.println("THIS IS CASE 2");
			break;
		}
		case 3:
		{
			System.out.println("THIS IS CASE 3");
			break;
		}
		case 4 :
		{
			System.out.println("THIS IS CASE 4");
			break;
		}
		}//End of the body
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("The default Keyword");
		System.out.println("The default keyword specifies some code to run if there is no case match:");
		switch(age)
		{
		case 5:
		{
			System.out.println("THIS IS CASE 5");
			break;
		}
		case 6:
		{
			System.out.println("THIS IS CASE 6 ");
			break;
		}
		case 7:
		{
			System.out.println("THIS IS CASE 7");
			break;
		}
		case 8: 
		{
			System.out.println("THIS IS CASE 8");
			break;
		}
		default :
		{
			System.out.println("THIS IS DEFAULT");
		}
		
		}
		
		
		
	}
}

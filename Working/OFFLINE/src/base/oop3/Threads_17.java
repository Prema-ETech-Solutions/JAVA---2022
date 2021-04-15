package base.oop3;

class My extends Thread
{
	/*
	 * Threads allows a program to operate more efficiently by doing multiple things at the same time.
	 * Threads can be used to perform complicated tasks in the background without interrupting the main program. 
	 */
	//It can be created by extending the Thread class and overriding its run() method:
	public void run() 
	{
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(Thread.currentThread().getId()+" THREAD = "+i);
		}
		try 
		{
			Thread.sleep(100);
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}

class My_Run implements Runnable
{

	@Override
	public void run()
	{
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(Thread.currentThread().getId()+" THREAD = "+i);
		}
		try 
		{
			Thread.sleep(200);
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}


public class Threads_17 
{
	static int v1 = 0;
	
	public static synchronized void S1() {
		v1++;
	}
	public static void main(String[] args) 
	{
		My T1 = new My();
		My T2 = new My();
		T2.start();
		T1.start();
		Thread R1 = new Thread(new My_Run());
		Thread R2 = new Thread(new My_Run());
		R1.start();
		R2.start();
		
		
//		Thread T_1 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 0; i < 10000; i++)
//				{
//					S1();
//					//v1++;
//					
//					
//				}
//				
//			}
//		});
//		
//		Thread T_2 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				for (int i = 0; i < 10000; i++)
//				{
//					S1();
//					//v1++;
//					
//					
//				}
//				
//			}
//		});
//		
//		
//		
//		T_1.start();
//		T_2.start();
//		try {
//			T_1.join();
//			T_2.join();
//			
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		System.out.println(v1);
//		
//		
	}

}

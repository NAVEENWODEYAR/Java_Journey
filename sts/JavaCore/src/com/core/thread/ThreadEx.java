package com.core.thread;

public class ThreadEx extends Thread
{
	@Override
	public void run()
	{
		Thread t1 = new Thread();
				for(int i=0; i<10; i++)
				{
					System.out.println(i);
					
					try 
					{
						Thread.sleep(2000);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
	}
	public static void main(String[] args) 
	{
		ThreadEx ob = new ThreadEx();
				ob.run();
	}

}

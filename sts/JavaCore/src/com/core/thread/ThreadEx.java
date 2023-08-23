package com.core.thread;

public class ThreadEx extends Thread
{
	public void run()
	{
		Thread t1 = new Thread();
				for(int i=0; i<10; i++)
				{
					t1.start();
				}
	}
	public static void main(String[] args) 
	{
		ThreadEx ob = new ThreadEx();
				ob.run();
	}

}

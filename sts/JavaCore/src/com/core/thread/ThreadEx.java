package com.core.thread;

public class ThreadEx extends Thread
{
	@Override
	public void run()
	{
				for(int i=0; i<10; i++)
				{
					System.out.println(i);
					
					try 
					{
						Thread.sleep(500);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
	}
	public static void main(String[] args) throws InterruptedException 
	{
		ThreadEx t1 = new ThreadEx();
		ThreadEx t2 = new ThreadEx();
				t2.start();
				t2.join();
				t1.start();
	}

}

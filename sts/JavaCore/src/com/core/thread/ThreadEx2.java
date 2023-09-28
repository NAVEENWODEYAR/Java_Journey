package com.core.thread;

public class ThreadEx2 implements Runnable
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
		ThreadEx2 t1 = new ThreadEx2();
		ThreadEx2 t2 = new ThreadEx2();
				t1.run();
				t2.run();
			
	}

}

class mythread extends Thread
{
	public void run()
	{
		for(int i=0;i<=2;i++)
		{
			System.out.println("child Thread");
			//Thread.yield();
			try
			{
				
			Thread.sleep(2000);
			}
					catch(InterruptedException e)
				    {
				     }
		}
	}


}
		
	/*public void run()
	{
		System.out.println("the curreent thread executed by child class"+Thread.currentThread().getName());
	}*/

	class sipun
	{
		public static void main(String[] args)throws InterruptedException
		{
			
			mythread t=new mythread();
			//System.out.println(t.getPriority());
			//t.setPriority(8);
			t.start();
			t.join(1000);
			for(int i=0;i<2;i++)
			{
				System.out.println("main Thread");
			}
		}
	}
		
			

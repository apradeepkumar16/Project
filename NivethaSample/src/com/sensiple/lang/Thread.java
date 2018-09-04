package com.sensiple.lang;

public class Thread 
{
	private static final String MAX_PRIORITY = null;
	private static final String MIN_PRIORITY = null;

	public static void main(String[]args) {
		Thread t = Thread.currentThread();
        
        
        System.out.println("Current thread: " + t.getName());
         
        
        t.setName("Geeks");
        System.out.println("After name change: " + t.getName());
         
        
        System.out.println("Main thread priority: "+ t.getPriority());
         
        
        t.setPriority(MAX_PRIORITY);
         
        System.out.println("Main thread new priority: "+ t.getPriority());
         
         
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Main thread");
        }
         
       
        ChildThread ct = new ChildThread();
         
       
        System.out.println("Child thread priority: "+ ct.getPriority());
         
        
        ct.setPriority(MIN_PRIORITY);
         
        System.out.println("Child thread new priority: "+ ct.getPriority());
         
        
        ct.start();
    }

	public void run( )
	{
		
		
	}

	protected void setPriority( String maxPriority )
	{
		// TODO Auto-generated method stub
		
	}

	private void setName( String string )
	{
		// TODO Auto-generated method stub
		
	}

	protected String getPriority( )
	{
		// TODO Auto-generated method stub
		return null;
	}

	private String getName( )
	{
		// TODO Auto-generated method stub
		return null;
	}

	private static Thread currentThread( )
	{
		// TODO Auto-generated method stub
		return null;
	}
}
 

class ChildThread extends Thread
{
    @Override
    public void run() 
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Child thread");
        }
    }

	public void start( )
	{
		// TODO Auto-generated method stub
		
	}

	}
	


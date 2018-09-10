package samples;

import java.util.*;

public class Employee
{
	int empid;
	String name;
	String dept;
	int salary;
	
	Employee( int empid, String name, String dept, int salary )
	{
		this.empid = empid;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		
	}
	
	public static void main( String[] args )
	{
		
        Employee s1 = new Employee( 101, "Anu", "test", 10000 );
		Employee s2 = new Employee( 102, "priya", "BA", 20000 );
		Employee s3 = new Employee( 103, "vinu", "BA", 30000 );
		Employee s4 = new Employee( 104, "Jack", "dev", 35000 );
		Employee s5 = new Employee( 105, "Raja", "test", 40000 );
		Employee s6 = new Employee( 106, "vijay", "BA", 45000 );
		Employee s7 = new Employee( 107, "Ajay", "BA", 50000 );
		Employee s8 = new Employee( 108, "arthi", "dev", 60000 );
		Employee s9 = new Employee( 109, "Vishnu", "test", 65000 );
		Employee s10 = new Employee( 110, "Mano", "QA", 66000);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add( s1 );
		al.add( s2 );
		al.add( s3 );
		al.add( s4 );
		al.add( s5 );
		al.add( s6 );
		al.add( s7 );
		al.add( s8 );
		al.add( s9 );
		al.add( s10 );
		
		Iterator<Employee> itr = al.iterator();
		while (itr.hasNext())
		{
			Employee st = (Employee) itr.next();
			System.out.println( st.empid + " " + st.name + " " + st.dept + " " + st.salary );
		}
		System.out.println( "\n" );
		
		System.out.println( "Name of Employee :" );
		Iterator<Employee> itr1 = al.iterator();
		while (itr1.hasNext())
		{
			Employee st1 = (Employee) itr1.next();
			System.out.println( st1.name );
		}
		System.out.println( "\n" );
		
		System.out.println( "Testing Departmet:" );
		
		for (Employee s : al) 
			if ( s.getDept().contains( "test" ) )
			{
				System.out.println( s.getName() );
				
			}
		System.out.println( "\n" );
		
		System.out.println( "Number Of Department:" );
		
		for (Employee s : al)
		{
			System.out.println( s.getDept() );
			
		}
		System.out.println( "\n" );
		
		System.out.println( "Index of 5 :" + al.get( 4 ).getName() );
		
		System.out.println( "\n" );
		
		System.out.println( "Persons Getting salary more than 50000:" );
		for (Employee s : al)
		{
			if ( s.getSalary() > 50000 )
			{
				System.out.println( s.getName() );
			}
			
		}
		}
		
	
	
	public int getEmpid( )
	{
		return empid;
	}
	
	public void setEmpid( int empid )
	{
		
		this.empid = empid;
	}
	
	public String getName( )
	{
		return name;
	}
	
	public void setName( String name )
	{
		this.name = name;
	}
	
	public String getDept( )
	{
		return dept;
	}
	
	public void setDept( String dept )
	{
		this.dept = dept;
	}
	
	public int getSalary( )
	{
		return salary;
	}
	
	public void setSalary( int salary )
	{
		this.salary = salary;
	}
}

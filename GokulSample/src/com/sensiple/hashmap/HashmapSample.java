package com.sensiple.hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HashmapSample
{
	
	public static void main( String[] args )
	{
		
		HashmapSample h = new HashmapSample();
		Map<Integer, Model> m = new HashMap<Integer, Model>();
		Map<Integer, Model> m1 = new HashMap<Integer, Model>();
		
		m.put( 0, new Model( 1, "John", "CM", 10000, "Male" ) );
		m.put( 1, new Model( 2, "Jack", "CM", 15000, "Male" ) );
		m.put( 2, new Model( 3, "Nive", "CM", 14000, "Female" ) );
		m.put( 3, new Model( 4, "Birundha", "CM", 11000, "Female" ) );
		m.put( 4, new Model( 5, "Ajay", "CM", 9000, "Male" ) );
		m.put( 5, new Model( 6, "Gokul", "CM", 18000, "Female" ) );
		m.put( 6, new Model( 7, "Jaya", "CM", 19000, "Female" ) );
		m.put( 7, new Model( 8, "Geetha", "CM", 17000, "Female" ) );
		m.put( 8, new Model( 9, "Vijay", "CM", 16000, "Male" ) );
		m.put( 9, new Model( 10, "Harry", "CM", 6000, "Male" ) );
		
		System.out.println( "Name of Employees " );
		
		for (int i = 0; i < m.size(); i++)
		{
			System.out.println( m.get( i ).getEmpName() );
		}
		
		System.out.println( "Male employees" );
		for (int i = 0; i < m.size(); i++)
		{
			if ( m.get( i ).Gender == "Male" )
				
				System.out.println( m.get( i ).getEmpName() );
		}
		
		System.out.println( "Element at fifth index " + m.get( 5 ) );
		System.out.println( "Male employees with salary greater than 10000 " );
		for (int i = 0; i < m.size(); i++)
		{
			if ( m.get( i ).Gender == "Male" && m.get( i ).Salary > 10000 )
				
				System.out.println( m.get( i ).getEmpName() );
		}
		System.out.println( "Female employees" );
		
		for (Map.Entry<Integer, Model> entry : m.entrySet())
		{
			if ( entry.getValue().Gender.equals( "Female" ) )
			{
				m1.put( entry.getKey(), entry.getValue() );
				
			}
			
		}
		System.out.println( m1 );
		
		Scanner in = new Scanner( System.in );
		String empname = in.nextLine();
		
		for (Map.Entry<Integer, Model> entry : m.entrySet())
		{
			if ( entry.getValue().EmpName.equals( empname ) )
			{
				System.out.println( "found" );
			}
		}
		
		Collection<Model> students = m.values();
		
		List<Model> list = new ArrayList<>( students );
		Collections.sort( list, new MyComparator() );
		
		System.out.println( "Employee name in descending order based on salary" + list );
		System.out.println( "Male Employee name in descending order based on salary" + list );
		
		for (int i = 0; i < m.size(); i++)
		{
			if ( m.get( i ).Gender.equals( "Male" )  )
			{
				System.out.println( m.get( i ).getEmpName() );
			}
		}
		
	}
	
}

class MyComparator implements Comparator<Model>
{
	
	@Override
	public int compare( Model s1, Model s2 )
	{
		return s2.Salary - s1.Salary;
	}
	
}

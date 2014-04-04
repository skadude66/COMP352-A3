// *******************************************************************
// Stack.java By: Dich-Ky Tran & Nicholas Francoeur (C)Winter 2014
// This program will implement the use of the Binary ADT with an array
// list.
// Key Point: 
// 1) Dynamic switch from Min Heap to Max Heap
// *******************************************************************

public class ArrayList {
	private Object[] A;
	private int size;
	
	public ArrayList()
	{
		A = new Object[10];
		size = 0;
	}
	
	public void add(Object x)
	{
		if(size == A.length-2)
			expandArray();
		
		A[size] = x;
		size++;
	}
	
	public void add(int i, Object x)
	{
		int z = size;
		
		if(size == A.length-2)
			expandArray();
		
		if(A[i] == null && i == z++)
		{
			A[i] = x;
			size++;
		}
		else if(A[i] != null && i <= z)
		{
			for(int n=size+1; n>i; n--)
			{
				A[n] = A[n-1];
			}
			A[i] = x;
			size++;
		}
		else
		{
			System.out.println("Invalid command!");
			return;
		}
	}
	
	public Object remove(int i)
	{
		if(A[i] != null)
		{
			Object a= A[i];
		
			for(int n=i; n<size-1; n++)
			{
				A[n] = A[n+1]; 
			}
		
			A[size] = null;
			size--;
			
			return a;
		}
		System.out.println("Invalid command!");
		return null;
	}
	
	public Object set(int i, Object x)
	{
		Object a = A[i];
		
		A[i] = x;
		
		return a;
	}
	
	public int length()
	{
		return A.length;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		if(size != 0)
			return false;
	
		return true;
	}
	
	public Object get(int i)
	{
		return A[i];
	}
	
	private void expandArray()
	{
		Object[] B = new Object[A.length];
		
		for(int i=0; i<A.length; i++)
		{
			B[i] = A[i];
		}
		
		A = new Object[A.length*2];
		
		for(int i=0; i<B.length; i++)
		{
			A[i] = B[i];
		}
	}
}

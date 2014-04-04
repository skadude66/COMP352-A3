import java.util.Iterator;

// *******************************************************************
// Stack.java By: Dich-Ky Tran & Nicholas Francoeur (C)Winter 2014
// This program will implement the use of the Binary ADT with an array
// list.
// Key Point: 
// 1) Dynamic switch from Min Heap to Max Heap
// *******************************************************************

public class BinaryTree{
	private ArrayList A;
	
	private BinaryTree()
	{
		this.A = new ArrayList();
	}
	
	public int size()
	{
		return this.A.size();
	}
	
	public boolean isEmpty()
	{
		return this.A.isEmpty();
	}
	
	/*public Iterator<E> iterator()
	{
		return new Iterator<E>;
	}*/
	
	public Iterable positions()
	{
		return null;
		
	}
	
	public void replace()
	{
		
	}
	
	public Object root()
	{
		return this.A.get(1);
	}
	
	public Object parent(int i)
	{
		if (i==1) //root
			return null;
		else if ((i % 2)==0) //even number
		{
			return this.A.get(i/2);
		}
		else //odd number
		{
			return this.A.get((i-1)/2);
		}
	}
	
	public Object left(int i) //even
	{
		if (this.A.get(i*2) != null)
			return this.A.get(i*2) != null;
		else
			return null;
		
	}
	
	public Object right(int i) //odd
	{
		if ((this.A.get((i*2)+1)) != null)
			return this.A.get((i*2)+1);
		else
			return null;
	}
	
	public Iterable children()
	{
		return null;
	}
	
	public boolean hasLeft(int i)
	{
		if (this.A.get(i*2) != null)
			return true;
		else
			return false;
	}
	
	public boolean hasRight(int i)
	{
		if (this.A.get((i*2) + 1) != null)
				return true;
		else
			return false;
	}
	
	public boolean isInternal(int i)
	{
		return true;
	}
	
	public boolean isExternal(int i)
	{
		return true;
	}
	
	public boolean isRoot(int i)
	{
		return true;
	}
	
	public Object replace(int i, Object x)
	{
		return this.A.set(i, x);
	}
}

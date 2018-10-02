package co.edureka.packone;

// public
public class One {

	private void pvtShow(){
		System.out.println("This is private show of One");
	}
	
	void defShow(){
		System.out.println("This is default show of One");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of One");
	}
	
	public void pubShow(){
		System.out.println("This is public show of One");
	}
	
}

// default
class Two {
	
	private void pvtShow(){
		System.out.println("This is private show of Two");
	}
	
	void defShow(){
		System.out.println("This is default show of Two");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of Two");
	}
	
	public void pubShow(){
		System.out.println("This is public show of Two");
	}
	
}

// we cannot create private or protected classes
/*
private class Three{
	
}

protected class Four{
	
}
*/

// error: In a Source File we can have only 1 public class
// Rule: if a class is public source file name should be same as that of class name !!
/*public class Five{
	
}*/

class Six{
	
}
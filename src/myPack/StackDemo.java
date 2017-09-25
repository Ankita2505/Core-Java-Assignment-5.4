package myPack;
/*
 * Stack Implementation
 */
public class StackDemo
{

	public static void main(String[] args)// Start of Main Class
	{
		// TODO Auto-generated method stub
		FixedStack fs=new FixedStack(3);//Creating object of FixedStack
		VariableStack vs=new VariableStack(7);//Creating object of VariableStack
		Stack myStack;//Reference of Stack interface
		for(int i=0;i<3;i++)
			fs.push(i);//Add Item to Fixed Stack
		System.out.println("Fixed length Stack Contents are.");
		for(int i=0;i<3;i++)
			System.out.println(fs.pop());//Delete Item from Fixed Stack
		for(int i=0;i<7;i++)
			vs.push(i);//Add Item to Variable Stack
		System.out.println("Variable length Stack Contents are");
		for(int i=0;i<7;i++)
			System.out.println(vs.pop());//Delete Item from Variable Stack
		myStack=fs;//Assign Fixed Stack object to Stack interface Reference
		for(int i=0;i<3;i++)
			myStack.push(i);//Add Item to Fixed Stack using Stack reference
		System.out.println("Fixed length Stack Contents using interface reference");
		for(int i=0;i<3;i++)
			System.out.println(myStack.pop());//Delete Item from Fixed Stack using Stack Reference
		myStack=vs;//Assign Variable Stack object to Stack interface Reference
		for(int i=0;i<7;i++)
			myStack.push(i);//Add Item to Variable Stack using Stack reference
		System.out.println("Variable length Stack Contents using interface reference");
		for(int i=0;i<7;i++)
			System.out.println(myStack.pop());//Delete Item from Variable Stack using Stack Reference
	}//Close of Main Class
}



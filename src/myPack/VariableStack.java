package myPack;
/*
 * class VariableStack that can accept numbers more than its size. 
 * The size of the Stack will be specified in the constructor. 
 * If the number of integers exceeds the size, the stack should automatically grow to accommodate the new element.
 */
public class VariableStack implements Stack
{
	 private int stk[ ];
     private int tos;//tos =top of stack
     VariableStack(int size)// Specifying Size of variable stack in VariableStack Constructor
     {
             stk=new int[size];
             tos=-1;
     }
     public void push(int item)//Adding Item to the top of  Variable Stack
     {
             if(tos==stk.length-1)
             {
                     System.out.println("Stack Overflows.");
                     int t[ ]=new int[stk.length * 2];
                     for(int i=0;i<stk.length;i++)
                             t[i]=stk[i];
                     stk=t;
                     stk[++tos]=item;
             }
             else
                     stk[++tos]=item;
     }
     public int pop()// Deleting Item from the top of Variable Stack
     {
             if(tos<0)
             {
                     System.out.println("Stack Underflows.");
                     return 0;
             }
             else
                     return stk[tos--];
     }
}

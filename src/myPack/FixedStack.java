package myPack;
/*
 * class FixedStack that can accept a fixed numbers of integers. 
 * The size of the Stack will be specified in the constructor. 
 * If the number of integers exceeds the size, “Stack overflow” message should be displayed.
 */
public class FixedStack implements Stack
{
	 private int stk[ ];
     private int tos;//tos =top of stack
     FixedStack(int size)// Specifying Size of  FixedStack in FixedStack Constructor
     {
             stk=new int[size];
             tos=-1;
     }
     public void push(int item)//Adding Item to the top of Fixed Stack
     {
             if(tos==stk.length-1)
             {
                     System.out.println("Stack Overflows");
                     int t[ ]=new int[stk.length * 2];
                     for(int i=0;i<stk.length;i++)
                             t[i]=stk[i];
                     stk=t;
                     stk[++tos]=item;
             }
             else
                     stk[++tos]=item;
     }
     public int pop()// Deleting Item from the top of Stack
     {
             if(tos<0)
             {
                     System.out.println("Stack Underflows");
                     return 0;
             }
             else
                     return stk[tos--];
     }
}

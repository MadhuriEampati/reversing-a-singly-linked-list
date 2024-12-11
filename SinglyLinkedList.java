/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class Node
{
	int data;
	Node next;
	Node(int num)
	{
		this.data=num;
		this.next=null;
	}
}
class SinglyLinkedList
{
	Node head = null;
	Node temp = null;
	Node prev=null;
	public void insertNode(int num)
	{
		Node newNode = new Node(num);
		if (head == null)
		{
			head = temp = newNode;
		}
		else
		{
			temp.next = newNode;
			temp = newNode;
		}
	}
	public void revPrint(Node node)
	{
	    if(node==null)
	    {
	        return;
	    }
	    revPrint(node.next);
	    System.out.println(node.data);
	}
	public void display()
	{
		temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.print(temp.data+"\n");
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		{
			SinglyLinkedList list = new SinglyLinkedList();
			int num;
			System.out.println("list: ");
			while (true)
			{
				num = s.nextInt();
				if (num == -1)
				{
					break;
				}
				list.insertNode(num);
			}
			System.out.println("Reversed list: ");
            list.revPrint(list.head);
		}
	}
}
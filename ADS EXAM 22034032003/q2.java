import java.util.*;
class q2{
	
	node head;
	
	static class node{
		node next;
		int data;
		
		node (int d){
			data=d;
			next=null;
		}
	}
	void insert (int newdata){
		node newnode = new node (newdata);
		if (head==null){
			head=newnode;
			return;
		}
		newnode.next=null;
		node n=head;
		while (n.next!= null){
			n=n.next;
		}
		n.next=newnode;
		return;	
	}
	void display(){
		node n = head;
		while (n!= null){
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	void reverse(){
		
	}



public static void main (String args[]){
	
	q2 l1 = new q2();
	l1.insert(1);
	l1.insert(2);
	l1.insert(3);
	l1.insert(4);
	l1.insert(5);
	l1.display();
	



}



}
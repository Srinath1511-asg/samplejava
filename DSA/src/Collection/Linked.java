package Collection;

public class Linked {
	Node head;
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data=data;
			this.next=null;
		}
	}
	public void addFirst(String data) {
		Node newnode=new Node(data);
		if(head==null) {
		head=newnode;
		return;
		}
		newnode.next=head;
		head=newnode;
	}
	public void addLast(String data) {
		Node newnode=new Node(data);
		if(head==null) {
		head=newnode;
		return;
		}
		Node currnode=head;
		while(currnode.next!=null) {
			currnode=currnode.next;
		}
		currnode.next=newnode;
		
	}
	public void deletefirst() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		head=head.next;
	}
	public void deletelast() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		if(head.next==null) {
			head=null;
			return;
		}
		Node secondlast=head;
		Node lastnode=head.next;
		
		while(lastnode.next!=null) {
			lastnode=lastnode.next;
			secondlast=secondlast.next;
		}
		secondlast.next=null;
	}
	public void printlist() {
		if(head==null) {
			System.out.println("list is null");
			return;
		}
		
		Node currnode=head;
		while(currnode!=null) {
			System.out.println(currnode.data+"->");
			currnode=currnode.next;
		}
		System.out.println("null");
	}
public static void main(String[] args) {
	Linked list=new Linked();
	list.addFirst("a");
	list.addFirst("is");

list.addLast("class");
//list.printlist();
list.addFirst("this");
list.printlist();
list.deletefirst();
list.printlist();
}
}

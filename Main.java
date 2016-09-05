import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Node a=new Node(9);
		Node b=new Node(5,a);
		Node c=new Node(2,b);
		Node d=new Node(8,c);
		Node e=new Node(3,d);
		a.next=e;
		Node x=findLoopBeginning(e);
		System.out.println(x.data);


	}
	
	//Given a circular linked list, returns the node at the beginning of the loop
	//check if there is a loop, p1 move 1 step, p2 move 2 steps every time
	//when they collide, still two pointers, one starts from the head, the other from the collision point
	//they will meet at the beginning of the loop, which is the Node we want to return
	
	
	public static Node findLoopBeginning(Node head){
		Node p1=head; 
		Node p2=head;
		while(p2!=null && p2.next!=null){//&&
			p1=p1.next;
			p2=p2.next.next;//p2.next, p2.next.next so we need to check if p2 is null and p2.next is null
			if(p1==p2)break;
		}
		if(p2==null || p2.next==null)return null;//Error check if no meeting point
		//From here, there is for sure a loop exist, no more error check
		//if tail point back to head, already p1==p2==head
		p1=head;
		while(p1!=p2){
			p1=p1.next;
			p2=p2.next;
		}
		return p1;
	}
}

public class ListReversal {
	 static class Node{
		int val; Node next;
		Node(int i){
			val = i;
			next = null;
		}
	}
	
	 static Node reverse(Node x) {
		Node t, y=x, r=null;
		while(y!=null) {
			t = y.next; y.next = r; r = y; y = t;
		}
		return r;
	}
	
	public static void main(String[] args) {
		Node N = new Node(1);
		Node t = N;
		for(int i=2; i<6; i++) {
			t = (t.next = new Node(i));			
		}
		t=N;
		
		for(int i=1; i<6; i++) {
			System.out.print(t.val+", ");
			t = t.next;
		}
		t=N;
		System.out.println("");
		
		Node R = reverse(t);
		
		for(int i=1; i<6; i++) {
			System.out.print(R.val + ", ");
			R=R.next;
		}
		
		
		
	}
}

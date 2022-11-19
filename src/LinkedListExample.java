
public class LinkedListExample {
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    
    public Node head = null;
    public Node tail = null;
    
    public void add(int data){
        
        Node newNode = new Node(data);
        
        if(head == null) {
             
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {
            
            tail.next = newNode;
           
            tail = newNode;
           
            tail.next = head;
        }
    }
    
    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Nodes of the circular linked list: ");
             do{
                
                System.out.print(" "+ current.data);
                current = current.next;
            }while(current != head);
            System.out.println();
        }
    }
     public int operation(int a, int b) {
    	Node temp = head;
    	Node temp1 = head;
    	 if(head == null)
    	 {
    		 System.out.println("List is empty");
    	 }
    	 else
    	 {
    		 while(temp.data !=a)
    		 {
    			 temp =temp.next;
    		 }
    		 while(temp1.data !=b)
    		 {
    			 temp1 =temp1.next;
    		 }
    		
    		
    		 while(temp.data != temp1.data)
        	 {
        		 temp =temp.next;
        		 temp =temp.next;
        		 temp1 =temp1.next;
        		 
        	 }
    	 }
    	 return temp.data;
    	
     }
    public static void main(String[] args) {
        LinkedListExample c1 = new LinkedListExample();
        
        for(int i=1;i<=12;i++) {
        	c1.add(i);
        	
    }
       
        c1.display();
        int v;
        v = c1.operation(1,6);
        System.out.println("final output="+v);
    }
}




class LinkedList{
    
    Node head;
    
    class Node{
        int data;
        Node next;
        
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    
    public void push(int new_data){
        Node new_node = new Node(new_data);
        
        new_node.next = head;
        head = new_node;
        return;
    }
    
    public void insertAfter(Node prev_node, int new_data){
        Node new_node = new Node(new_data);
        
        if(prev_node == null){
            System.out.println("No such node exists.");
            return;
        }
        
        new_node.next = prev_node.next;
        prev_node.next = new_node;
        return;
    }
    
    public void insertAtPosition(int pos, int new_data){
        Node new_node = new Node(new_data);
        Node current, previous;
        
        int counter = 1;
        
        if(pos == 1){
            
            if(head != null){
                new_node.next = head.next;
            }
            head = new_node;
            return;
        }
        
        current = head;
        previous = null;
        while(current.next != null && counter != pos){
            previous = current;
            current = current.next;
            counter++;
        }
        
        if(current.next == null && counter > pos - 1){
            System.out.println("Position out of range.");
            return;
        }
        new_node.next = current;
        previous.next = new_node;
        return;
        
    }
    
    public void append(int new_data){
        Node new_node = new Node(new_data);
        
        if(head == null){
            head = new_node;
            return;
        }
        
        Node last;
        last = head;
        while(last.next != null){
            last = last.next;
        }
        
        last.next = new_node;
        return;
    }
    
    public void deleteData(int data){
        Node previous, current;
        current = head;
        previous = null;
        
        
        if(current != null && current.data == data){
            head = current.next;
            return;
        }
        
        while(current != null && current.data != data){
            previous = current;
            current = current.next;
        }
        
        if(current == null){
            System.out.println("Data to be deleted not present.");
            return;
        }
        previous.next = current.next;
    }
    
    public void printList(){
        Node current;
        current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String arg[]){
        LinkedList ll1 = new LinkedList();
        
        ll1.append(501);
        ll1.push(101);
        ll1.push(102);
        ll1.insertAfter(ll1.head.next, 201);
        ll1.insertAfter(ll1.head.next, 301);
        ll1.insertAfter(ll1.head.next.next, 401);
        ll1.append(601);
        ll1.printList();
        ll1.deleteData(102);
        ll1.deleteData(433);
        ll1.printList();
        ll1.insertAtPosition(7, 544);
        ll1.printList();
        
    }
}
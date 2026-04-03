class Node {
    int val;
    Node next;
    Node prev;

    public Node(int val){
        this.val = val;
    }
    
}

class Deque {
    Node head;
    Node tail;
    int size = 0;

    public Deque() {
        
    }

    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        return false;
    }

    public void append(int value) {
       Node curr = tail;
       Node node = new Node(value);
       if(curr == null){
        head = node;
        tail = node;
        size ++;
        return;
       }
       curr.next = node;
       node.prev = curr;
       node.next = null;
       tail = node;
       size++; 

    }

    public void appendleft(int value) {
        Node curr = head;
        Node node = new Node(value);
        if(curr == null){
            head = node;
            tail = node;
            size ++;
            return;
        }
        curr.prev = node;
        node.next = curr;
        node.prev = null;
        head = node;
        size ++;
        
    }

    public int pop() {
        if(tail == null){
            return -1;
        }
        int val = tail.val;
        if(head == tail){
            head = null;
            tail = null;
            size --;
            return val;
        }
        if(tail != null){
            tail = tail.prev;
            tail.next = null;
            size --;
        }
        return val;
        
    }

    public int popleft() {
        if(head == null){
            return -1;
        }
        int val = head.val;
        if(head == tail){
            head = null;
            tail = null;
            size --;
            return val;
        }
        if(head != null ){
            head = head.next;
            head.prev = null;
            size --;
        }
        return val;
            
    }
}

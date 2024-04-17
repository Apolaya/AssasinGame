// ListNode is a class for storing a single node of a linked
// list.  This node class is for a list of integer values.

public class AssassinNode {
    public String data;//data stored in this node
    public AssassinNode front;//points to head node
    public AssassinNode next;  // link to next node in the list

    // post: constructs a node with data 0 and null link
    public AssassinNode() {
        this.data = "name";
        this.next = null;
    }

    // post: constructs a node with given data and null link
    public AssassinNode(String data) {
        this.data = data;
        this.next = null;
    }

    // post: constructs a node with given data and given link
    public AssassinNode(String data, AssassinNode next) {
        this.data = data;
        this.next = next;
    }
        public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            AssassinNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // post: appends the given value to the end of the list
    public void add(String value) {
        if (front == null) {
            front = new AssassinNode(value);
        } else {
            AssassinNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new AssassinNode(value);
        }
    }
     // post : returns the position of the first occurrence of the given
    //        value (-1 if not found)   
    public void remove(String given) {
        if (given.equalsIgnoreCase(data)) {
            front = front.next;
        } else {
            AssassinNode current = nodeAt(getStringIndex(given) - 1);
            current.next = current.next.next;
        }
        

    }
    public int getStringIndex(String given){
        int i = 0 ;
        AssassinNode current = front;
        while(current != null){
            if(given.equalsIgnoreCase(current.getData())){
            return i ;
            }
            i++;
            current = current.next;
            
        }
        return -1;
    }
    public String getData(){
        return data;
    }
     // pre : 0 <= i < size()
    // post: returns a reference to the node at the given index
    public AssassinNode nodeAt(int index) {
        AssassinNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    public String getStringAt(int index) {
        AssassinNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.getData();
    }
    public String stringString(){
        return data + "";
    }
    public int getSize(){
        int i = 0 ; 
        AssassinNode current = front;
        while(current != null){
            current = current.next;
            i++;

        }
        return i; 
    }
}

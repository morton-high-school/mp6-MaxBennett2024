public class Node {
    private int data;
    private Node next;

    //Constructor that takes an int value to be stored as its data
    public Node(int data){
        this.data = data;
        this.next = null;
    }

    //returns the data element of the node
    public int getData(){
        return this.data;
    }

    //returns the next linked node or null otherwise
    public Node getNext(){
        if(this.next==null){
            return null;
        }
        return this.next;
    }

    //sets the next linked node
    public void setNext(Node thing){
        Node newNode = thing;
        this.next = newNode;
    }
}

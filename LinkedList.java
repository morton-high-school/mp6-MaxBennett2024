public class LinkedList {


    private Node thing;

    //default constructor
    public LinkedList(){
        this.thing = new Node(0);
    }

    //returns the head of the linked list
    public Node getFront(){
        return thing;
    }

    //adds a node to the end of the linked list
    public void append(Node node){
        Node temp = this.thing;
        while(thing.getNext()!=null){
            temp = thing.getNext();
        }
        temp.setNext(node);
    }
    
    //inserts a node at the given index or appends to the end if the index is out of bounds
    public void insert(Node node, int index){
        int i = index;
        while(i<=index){
            thing.getNext();
        }
        thing.setNext(node);
        node.setNext(thing);
    }

    //removes and then returns the node at a given index, null if index out of bounds
    public Node remove(int index){
        return null;
    }
    
    //returns information about the linked list
    public String toString(){
        String result = "";
        return result;
    }
}
public class LinkedList {


    private Node thing;

    //default constructor
    public LinkedList(){
        this.thing = null;
    }

    //returns the head of the linked list
    public Node getFront(){
        return thing;
    }

    //adds a node to the end of the linked list
    public void append(Node node){
        if(thing==null){
            thing = node;
            thing.setNext(null);
        }
        Node temp = thing;
        while(temp.getNext()!=null){
            temp = temp.getNext();
        }
        temp.setNext(node);
        node.setNext(null);
    }
    
    //inserts a node at the given index or appends to the end if the index is out of bounds
    public void insert(Node node, int index){
        Node temp = thing;
        for(int i =0;i<index&&temp.getNext()!=null;i++){
            temp = temp.getNext();
        }
        Node temp2 = temp.getNext();
        temp.setNext(node);
        node.setNext(temp2);
    }

    //removes and then returns the node at a given index, null if index out of bounds
    public Node remove(int index){
        int i = index;
        Node temp = thing;
        if(temp!=null){
            while(i<=index&&temp.getNext().getNext()!=null){
                temp = temp.getNext();
           }
           Node balls = temp.getNext();
           temp.setNext(temp.getNext().getNext());
           return balls;
        }
        return null;
    }
    
    //returns information about the linked list
    public String toString(){
        String result = "";
        int count = 0;
        Node temp = thing;
        if(thing!=null){
            while(temp.getNext()!=null){
                result += "Index: " + count + " Value: " + temp.getData() + "\n";
                count++;
                temp = temp.getNext();
            }
        }else{
            result = "There are no items in this list.";
        }
        
        return result;
    }
}
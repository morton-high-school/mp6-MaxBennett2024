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
        }else{
            Node temp = thing;
        while(temp.getNext()!=null){
            temp = temp.getNext();
        }
        temp.setNext(node);
        }
    }
    
    //inserts a node at the given index or appends to the end if the index is out of bounds
    public void insert(Node node, int index){
        if(index<=0 || thing == null) {
            node.setNext(thing);
            thing = node;
            return;
        }
        Node temp = thing;
        int count = 0;

        while(temp.getNext()!=null &&count < index-1){
            temp = temp.getNext();
            count++;
        }
        node.setNext(temp.getNext());
        temp.setNext(node);
    }

    //removes and then returns the node at a given index, null if index out of bounds
    public Node remove(int index){
        if(thing==null||index<0){
            return null;
        }

        if(index == 0){
            Node removed = thing;
            thing = thing.getNext();
            removed.setNext(null);
            return removed;
        }
        Node temp = thing;
        int count = 0;
        while(temp.getNext()!=null&&count<index-1){
            temp = temp.getNext();
            count++;
        }
        if(temp.getNext()==null){
            return null;
        }
        Node temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
        temp2.setNext(null);
        return temp2;
    }
    
    //returns information about the linked list
    public String toString(){
        if(thing==null){
            return "There are no items in this list.";
        }
        Node temp = thing;
        String result = "";
        int count = 0;
        while(temp!=null){
            result += "Index: " + count + " Data: " + temp.getData() + "\n";
            count++;
            temp = temp.getNext();
        }
        return result;
    }
}
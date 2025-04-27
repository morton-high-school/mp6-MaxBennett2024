public class Stack {
    
    private LinkedList omniman;

    //default constructor
    public Stack(){
        this.omniman = new LinkedList();
    }

    //adds an item to the top of the stack
    public void push(Node item){
        item.setNext(omniman.getFront());
        omniman = new LinkedList();
        omniman.append(item);
    }

    //removes and returns the item from the top of the stack
    public Node pop(){
        if(empty()){
            return null;
        }
        Node top = omniman.getFront();
        omniman.remove(0);
        return top;
    }

    //returns the item from the top of the stack
    public Node peek(){
        return omniman.getFront();
    }

    //returns true if the stack is empty and false otherwise
    public boolean empty(){
        return omniman.getFront()==null;
    }

    //returns the location of the item on the stack, -1 otherwise
    public int search(Node item){
        Node seaSalt = omniman.getFront();
        int count = 0;
        while(seaSalt!=null){
            if(seaSalt==item){
                return count;
            }
            seaSalt = seaSalt.getNext();
            count++;
        }
        return -1;
    }
}

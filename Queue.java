public class Queue {
    //default constructor
    private LinkedList allen;
    public Queue(){
        this.allen = new LinkedList();
    }

    //adds an item to the back of the queue
    public void add(Node item){
        allen.append(item);
    }

    //removes and returns the item from the front of the queue
    public Node remove(){
        if(empty()){
            return null;
        }
        Node banana = allen.getFront();
        allen.remove(0);
        return banana;
    }

    //returns the item from the front of the queue
    public Node peek(){
        return allen.getFront();
    }

    //returns true if the queue is empty and false otherwise
    public boolean empty(){
        return allen.getFront()==null;
    }

    //returns the location of the item in the queue
    public int search(Node item){
        Node whereIsHe = allen.getFront();
        int count = 0;
        while(whereIsHe!=null){
            if(whereIsHe==item){
                return count;
            }
            whereIsHe = whereIsHe.getNext();
            count++;
        }
        return -1;
    }
}

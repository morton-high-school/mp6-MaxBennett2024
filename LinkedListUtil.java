public class LinkedListUtil {
    
    //returns the length of the linked list
    public static int length(LinkedList value){
        int count = 0;
        Node nuts = value.getFront();
        while(nuts.getNext()!=null){
            nuts=nuts.getNext();
            count++;
        }
        return count;
    }

    //returns the index of the first node with given data value, -1 otherwise
    public static int search(LinkedList value, int data){
        int index =0;
        Node nuts = value.getFront();
        while(nuts.getNext()!=null){
            if(nuts.getData()==data){
                return index;
            }
            nuts=nuts.getNext();
            index++;
        }
        return -1;
    }

    //returns the node at a given index, null if index out of bounds
    public static Node getNode(LinkedList value, int index){
        Node nuts = value.getFront();
        int i =0;
        while(i<index&&nuts.getNext()!=null){
            nuts=nuts.getNext();
            i++;
            if(index-i ==1){
                return nuts;
            }
        }
        return null;
    }

    //returns the number of times data occurs in the linked list
    public static int count(LinkedList value, int data){
        int count =0;
        Node nuts = value.getFront();
        while(nuts.getNext()!=null){
            if(nuts.getData()==data){
                count++;
            }
            nuts=nuts.getNext();
        }
        return count;
    }

    //determines if two lists contain the same data values
    public static boolean compare(LinkedList value1, LinkedList value2){
        return true;
    }

    //returns a reversed version of the linked list without changing the original
    public static LinkedList reverse(LinkedList value){
        return null;
    }

}

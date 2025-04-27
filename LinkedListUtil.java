public class LinkedListUtil {
    
    //returns the length of the linked list
    public static int length(LinkedList value){
        int count = 0;
        Node nuts = value.getFront();
        if(nuts!= null){
            count ++;
            nuts = nuts.getNext();
        }
        return count;
    }

    //returns the index of the first node with given data value, -1 otherwise
    public static int search(LinkedList value, int data){
        int index =0;
        Node nuts = value.getFront();
        while(nuts!=null){
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
        if(index<0){
            return null;
        }
        Node balls = value.getFront();
        int count = 0;
        while(balls!=null){
            if(count==index){
                return balls;
            }
            balls = balls.getNext();
            count++;
        }
        return null;

    }

    //returns the number of times data occurs in the linked list
    public static int count(LinkedList value, int data){
        int count =0;
        Node nuts = value.getFront();
        while(nuts!=null){
            if(nuts.getData()==data){
                count++;
            }
            nuts=nuts.getNext();
        }
        return count;
    }

    //determines if two lists contain the same data values
    public static boolean compare(LinkedList value1, LinkedList value2){
        Node temp1 = value1.getFront();
        Node temp2 = value2.getFront();
        while(temp1!=null&&temp2!=null){
            if(temp1.getData()!=temp2.getData()){
                return false;
            }
            temp1 = temp1.getNext();
            temp2 = temp2.getNext();
        }
        return true;
    }

    //returns a reversed version of the linked list without changing the original
    public static LinkedList reverse(LinkedList value){
        LinkedList reverse = new LinkedList();
        Node temp = value.getFront();
        while(temp!=null){
            Node temp2 = new Node(temp.getData());
            if(reverse.getFront()==null){
                reverse.append(temp2);
            }else{
                temp2.setNext(reverse.getFront());
                reverse = new LinkedList();
                reverse.append(temp2);
            }
        }
        return reverse;
    }
}

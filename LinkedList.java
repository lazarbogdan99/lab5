import java.util.NoSuchElementException;

public class LinkedList<T> {

    private Link<T> head; // the first element of the linked list
    private Link<T> tail; // the last element of the linked list

    /**
     * Constructor that sets the empty linked list
     * */

    public LinkedList(){
        head=null;
        tail=null;
    }

    /**
     * Method to test the linked list is empty or not
     * */
    public boolean isEmpty(){
        if(head==null && tail==null){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Method that returns the element in position i in the linked list
     * @param i is the position in which we find the element that we want to output
     * */
    public T elementAt(int i) throws NoSuchElementException {
        if(i<0) {
            throw new NoSuchElementException();
        }
        Link<T> curItem = head;
        for(int j=0;j<i;j++){
            if(curItem.getNext()==null){
                throw new NoSuchElementException();
            }
            else{
                curItem = curItem.getNext();
            }
        }
        return curItem.getElement();
    }


    /**
     * Method that inserts an element in position i in the linked list
     * */
    public void insertAt(int i,T e) throws NoSuchElementException{
        if(i<0) {
            throw new NoSuchElementException();
        }
        Link<T> newNode=new Link(e,null);
        if(isEmpty()){
            head=newNode;
            head.setNext(tail);
        }
        else{
            if(i==0){
                newNode.setNext(head);
                head=newNode;
            }
            else{
                Link<T> curItem = head;
                for (int j = 0; j < i-1; j++) {
                    if(curItem.getNext()==null){
                        throw new NoSuchElementException();
                    }
                    else{
                        curItem = curItem.getNext();
                    }
                }
                newNode.setNext(curItem.getNext());
                curItem.setNext(newNode);
            }
        }
    }

    /**
     * this method removes the element hold by i
     * @param i
     */
    public void removeAt(int i){
        if(i==0 && isEmpty()){
            throw new NoSuchElementException();
        }
        else{
            if(i==0){
                head=head.getNext();
            }
            else{
                Link<T> curItem=head;
                Link<T> prevItem=head;
                for(int j=0;j<i;j++){
                    if(curItem.getNext()==null){
                        throw new NoSuchElementException();
                    }
                    else{
                        prevItem=curItem;
                        curItem=curItem.getNext();
                    }
                }
                prevItem.setNext(curItem.getNext());
                curItem.setNext(null);
            }
        }
    }

}
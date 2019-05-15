import java.util.*;
public class Main {
    public static void main(String[] args){
        LinkedList < String > strs = new LinkedList < String > ();
        LinkedList < Integer > ints = new LinkedList < Integer > ();

        try{

            strs.insertAt (0 , " Hi there .");
            strs.insertAt(1, "aaaa");
            strs.insertAt(2, "bbbbbb");
            strs.insertAt(3, "wer");

        }
        catch(NoSuchElementException e){
            System.out.println("Error");
            e.printStackTrace();
        }

        try{

            System.out.println(strs.elementAt(0));
            System.out.println(strs.elementAt(1));
            System.out.println(strs.elementAt(2));
            System.out.println(strs.elementAt(3));

        }
        catch (NoSuchElementException e){
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}

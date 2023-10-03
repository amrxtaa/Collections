
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.RandomAccess;

public class ArrayLists {
    public static void main(String[] args)
    {
        //constructors:No data type is specified.
        /*1
        ArrayList ll=new ArrayList();
        ll.add(10);
        ll.add("githubamr");
        ll.add("A");
        ll.add(12.5);
        ll.add(null);
        System.out.println(ll);
        ll.remove(2);
        System.out.println(ll);
        ll.add(2,"MM");
        ll.add("NN");
        System.out.println(ll);
        // 2
        ArrayList ll1= new ArrayList(20); initial capacity of the object is 20.
        // 3
        ArrayList ll2=new ArrayList(ll); creating an eq. arraylist object for the guven collection of Arraylist ll
        System.out.println(ll2);
            */

        // String arraylist
        /*ArrayList<String > l=new ArrayList<String>();
        l.add("Amrita");
        l.add("Muskan");
        System.out.println(l);
        l.set(1, "Khushi");
        System.out.println(l);
        */
        // Double Arraylist   ArrayList<Double> l2=new ArrayList<Double>();


        // Integer arraylist
       /*
       ArrayList<Integer> l1=new ArrayList<Integer>();
       for (int i=0;i<10;i++) {
            l1.add(i);
        }
        System.out.println(l1);
        System.out.println(l1.get(5));
        l1.add(1,89);
        System.out.println(l1);
        l1.set(0,90);
        System.out.println(l1);
        l1.remove(0);
        System.out.println(l1.size());
        Collections.sort(l1);
        System.out.println(l1);
           */
// multi d array lists can be printed.
        ArrayList l5=new ArrayList();
        Scanner s-new Scanner(System.in);
        for(int i=0;i< 10;i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(s.nextInt());
            }
        }
            System.out.println(l5);

        // seraialzable and clonable concept
        /*ArrayList l3=new ArrayList();
        LinkedList l4= new LinkedList();
        System.out.println(l3 instanceof Serializable);// true
        System.out.println(l3 instanceof Serializable);// true
        System.out.println(l3 instanceof RandomAccess);// true
        System.out.println(l4 instanceof RandomAccess);// false
    */
    }
}

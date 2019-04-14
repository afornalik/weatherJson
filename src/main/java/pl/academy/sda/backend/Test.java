package pl.academy.sda.backend;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test {

    public static void main(String[] args) {
        //launch();

   /*     Integer[] someArray = new Integer[5];

        someArray[0] = 3;
        someArray[1] = 6;
        someArray[2] = 2;
        someArray[3] = 45;
        someArray[4] = 9;

        Iterator arrIter = someArray.*/

        List<String> frog = new LinkedList<String>();

        frog.add("small");
        frog.add("big");
        frog.add("average");
        frog.add("small");
        frog.add("big");

        Iterator<String> it =  frog.iterator();
        ListIterator<String> lit = frog.listIterator();

        lit.forEachRemaining(x -> {
            x = x + " and is nice";
            if ( ((String) x).substring(0,5).equals("small")) {
                System.out.print("caution ! ");
            }
            System.out.println(x);
        });

        while(lit.hasPrevious()){
            System.out.println("---- " + lit.previous());
        }

        System.out.println("\n\n");
        while(it.hasNext()) {
            if(it.next().equals("average")){
                it.remove();
            }else {
                System.out.println(it.next());
            }
        }

/*

        do{
            System.out.println(it.next());
        }while ((it.hasNext()));

        System.out.println("\n\n");
        it = frog.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        it = ((LinkedList<String>) frog).descendingIterator();

        it.forEachRemaining(x -> System.out.println(x));
*/


    }
}





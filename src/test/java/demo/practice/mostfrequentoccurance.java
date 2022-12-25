package demo.practice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;



public class mostfrequentoccurance {

    public static void main(String[] args) {


        int arr[] = {4,5,8,7,4,7,6,7};

        HashMap<Integer, Integer> hmap= new HashMap<Integer, Integer>();

        for (int i : arr) {

            if(hmap.containsKey(i)) {
                hmap.put(i,hmap.get(i)+1);
            }else {
                hmap.put(i,1);
            }

        }

        int frequent=1;

        int elements=0;

        Set<Entry<Integer,Integer>> eset= hmap.entrySet();

        System.out.println(eset);

        for (Entry<Integer, Integer> entry : eset) {

            if (entry.getValue()>frequent) {

                elements=entry.getKey();
                frequent=entry.getValue();
            }
        }

        if(frequent>1) {

            System.out.println(" most frequent :"+elements);
        }else {
            System.out.println(" all are unqie");
        }

    }

}

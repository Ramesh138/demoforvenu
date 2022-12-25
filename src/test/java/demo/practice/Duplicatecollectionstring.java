package demo.practice;

import java.util.HashSet;

public class Duplicatecollectionstring {

    public static void main(String[] args) {


        String prgs[] = { "java", "phython", "dotnet", "java", "oracle" };

        HashSet<String>  hs= new HashSet<String>();



        /*
         * for (int i = 0; i < prgs.length; i++) { hs.add(prgs[i]);
         *
         * }
         */

        //System.out.println(hs);
        for (String arraylist : prgs) {

            if(!hs.add(arraylist)) {
                System.out.println(" print the element  : "+arraylist);
            }

        }



    }

}

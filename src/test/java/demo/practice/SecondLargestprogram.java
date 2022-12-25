package demo.practice;

public class SecondLargestprogram {
    public static void main(String[] args) {

        int arr[] = { 12, 52, 56, 85, 69, 124, 30 };

        int firstlargestnumber, secondlargestnumber;

        if (arr[0] > arr[1]) {
            firstlargestnumber = arr[0];
            secondlargestnumber = arr[1];
        } else {
            firstlargestnumber = arr[1];
            secondlargestnumber = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {

            if (arr[i] > firstlargestnumber) {
                secondlargestnumber = firstlargestnumber;
                firstlargestnumber = arr[i];
            } else if (arr[i] < firstlargestnumber && arr[i] > secondlargestnumber) {

                secondlargestnumber = arr[i];

            }

        }

        System.out.println(secondlargestnumber);

    }


}

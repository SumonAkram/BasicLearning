#01

public class Class3 {
    public static void main(String[] args) {
        double[] arr = {19, 12.89, 16.5, 200, 13.7};
        double total = 0;

        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }

        double average = total / arr.length;

        System.out.format("The average is: %.3f", average);
    }

}




#02

public class ArrayOutput {
    public static void main(String[] args) {
        //int Array
        int[] arr1 = { 100, 150, 120, 130 };
        int[] arr2 = {arr1.length};
        
        for (int arrayIndex = 0; arrayIndex < arr2.length; arrayIndex++) {
            System.out.println(arr2[
arrayIndex]);
        }
    }
}

#03


import java.util.ArrayList;
import java.util.Scanner;
public class Class3 {
        public static void main(String[] args) {

            // Create new ArrayList.
            ArrayList<String> elements = new ArrayList<>();

            Scanner a=new Scanner(System.in);
           
            // Loop through elements.
            for (int i = 0; i <=5; i++) {
                String name=a.nextLine();
                elements.add(name);
            }
            System.out.println("Element: " + elements);
        }
        
    }

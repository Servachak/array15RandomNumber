/**
 * Created by adavi on 22.07.2017.
 */
public class Main {
    public static void main(String [] args){

        int [] arr = new int [15];
        SortArray sortArray = new SortArray();

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random()*10);
            System.out.print(arr[i] +" ");




        }
        System.out.println(" ");
        sortArray.sort(arr);
    }
}

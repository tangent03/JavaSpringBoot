import java.util.Arrays;

public class LoopsDemo {
    public static void main(String[] args) {
        System.out.println("Hello");

        int[] arr=new int[5]; //array 5 size
        int []arr1 ={3,4,5,5,6,7,7};
        //for each
        for(int data:arr1)
        {
            System.out.println(data);
        }
        print(arr1);
    }

    public static void print(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
}

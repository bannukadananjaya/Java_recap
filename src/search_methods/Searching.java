package search_methods;
import java.util.Scanner;

public class Searching {
    //Binery Search


    public static int binary_search(int lo, int hi)
    {
        Scanner sc = new Scanner(System.in);

        if (hi-lo == 1){
            return lo;
        }
        //find the number in [lo,hi]
        int mid = (lo+hi)/2;
        System.out.println("Is less than "+mid+" :");


        if(sc.nextBoolean()){
            return binary_search(lo,mid);
        }else{
            return binary_search(mid,hi);
        }

    }

    public static int factorial(int n){
        if (n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args){

//        int n = Integer.parseInt(args[0]);
//        int N = (int)Math.pow(2,n);
//        System.out.println("Enter the number between 0 and "+(N-1)+" :");
        //int num = binary_search(0,20);
        //System.out.println("Your number is "+num);
        System.out.println(factorial(5));
    }

}

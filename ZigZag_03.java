import java.util.Arrays;
import java.util.Scanner;

public class ZigZag_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
            String [] arr1=new String[n];
            String [] arr2=new String[n];
            for (int i = 0; i <n ; i++) {
                String [] input=scanner.nextLine().split(" ");
                String first=input[0];
                String second=input[1];
                if((i+1)%2==0){
                    arr2[i]=first;
                    arr1[i]=second;
                }else{
                    arr1[i]=first;
                    arr2[i]=second;
                }
        }
        System.out.println(String.join(" ",arr1));
        System.out.println(String.join(" ",arr2));
    }
}

import java.util.Scanner;
import java.util.Arrays;
public class Binarysearch {
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
         System.out.println("enter the "+i+"number");
         a[i]=sc.nextInt();
        }
        int start=0,end=a.length-1;
        
        int target;
        System.out.println("enter the number to be search");
        target=sc.nextInt();
       while(start<=end)
       {
        int mid=(start+end)/2;
        if(a[mid]==target)
        {
            System.out.println("the element found at "+mid);
            break;
        }
        else if (a[mid]>target)
        {
            end=mid+1;
        }
        else
        {
            start=mid-1;
        
        }
       }
    }
}

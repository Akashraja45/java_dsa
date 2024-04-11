import java.util.Scanner;
import java.util.Arrays;
public class Bubble_sort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
         System.out.println("enter the "+i+"number");
         a[i]=sc.nextInt();
        }
        for(int i1=0;i1<n;i1++)
        {
            for(int j=0;j<n-i1-1;j++)//then inner loop for the each iteration is 5-0-1=4,then 5-1-1=3 
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i2=0;i2<n;i2++)
        {
         System.out.println(a[i2]);
        }

    }
}

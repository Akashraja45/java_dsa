
import java.util.Scanner;
import java.util.Arrays;
public class selection_sort {
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
        int min_index=-1;

        for (int i=0;i<n;i++)
        {
            min_index=i;
            for(int j=i+1;j<n;j++)
            {
             if(a[min_index]>a[j])
             {
                min_index=j;
             }
            }
                int temp=a[min_index];
                a[min_index]=a[i];
                a[i]=temp;
            
        }
        for(int i2=0;i2<n;i2++)
        {
         System.out.println(a[i2]);
        }


    }
}

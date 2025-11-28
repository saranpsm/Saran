import java.util.*;
class Sample {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
     System.out.println("Enter the iteration:");
     int n=sc.nextInt();
      int j=1;
       
        for (int i=1;i<=n;i++)
        {  
            System.out.print(j+",");
            j+=2;
        }
        sc.close();
    }
}

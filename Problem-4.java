import java.util.*;
class Sample {
    public static void main(String args[])
    {
int arr[]={1,2,3,4,5,6,7,8,9};
    int inp[]={1,2,8,9,12,46,76,82,15,20,30};
    int mul[]=new int[9];
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<inp.length;j++)
        {
        if(inp[j]%arr[i]==0)
        {
            mul[i]++;
        }
    }
    }
    System.out.print("{");
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+":"+mul[i]+",");
    }
    System.out.print("}");

    }   
}

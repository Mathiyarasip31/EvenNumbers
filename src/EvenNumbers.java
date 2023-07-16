import java.util.Scanner;

public class EvenNumbers {
    static int[] range(int arr[], int arr2[][], int val){
        int result[]=new int[val];
        int count=0;
        for(int i=0;i<val;i++)
        {
            int index1=arr2[i][0];
            int index2=arr2[i][1];
            for(int j=index1;j<=index2;j++)
            {
                if(arr[j] % 2 == 0)
                {
                    count++;

                }
            }
            result[i]=count;
            count=0;
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int val=scanner.nextInt();
        int arr2[][]=new int[val][2];
        for (int i=0;i<val;i++)
        {
            for (int j=0;j<2;j++)
            {
                arr2[i][j]=scanner.nextInt();
            }
        }

        int result[]=range(arr,arr2,val);
        for (int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}
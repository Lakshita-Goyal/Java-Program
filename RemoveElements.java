import java.util.Arrays;

public class RemoveElements 
{
    public static int[] remove(int[] a,int k)
    {
        int index=0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i] !=k)
            {
                a[index++]=a[i];
            }
            return Arrays.copyOf(a,index);


        }

    } 
        public static void main(String[] args)
        {
            int a[]={3,9,8,5,3,4,4,5,6,3,2,2};
            int k=3;
            a= remove(a,k);
            System.out.println(Arrays.toString(a));
        }
    
}

import java.util.Arrays;

public class MergeArray 
{
    public static void main(String[] args)
    {
        int a[]={2,3,4,7};
        int b[]={90,80,70,60,50};

        int a1=a.length;
        int b1=b.length;

        int c1=a1+b1;
        int c[]=new int[c1];

        System.arraycopy(a,0,c,0,a1);
        System.arraycopy(b,0,c,a1,b1);

        System.out.println(""+Arrays.toString(c));

    }
    
}

import java.util.Arrays;

public class ArrayEqualorNot 
{
    public static void main(String[] args)
    {
        int a[]={20,30,80,90};
        int b[]={90,60,50,40};

        boolean r=Arrays.equals(a,b);
        if(r)
        {
            System.out.println("equals");
        }
        else{
            System.out.println("not equals");
        }

    }
    
}

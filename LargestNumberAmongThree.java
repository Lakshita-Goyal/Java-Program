public class LargestNumberAmongThree 
{
    public static void main(String[] args)
    {
        int a=5, b=10,c=15;

        if(a>b && a>c)
        {
            System.out.println(a);
        }
        
        else if(b>a && b>c)
        {
            System.out.print(b);
        }

        else
        {
            System.out.println(c);
        }
        
    }
    
}

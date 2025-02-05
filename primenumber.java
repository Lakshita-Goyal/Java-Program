public class primenumber 
{
    public static void main(String[] args)
       {
        System.out.println(isPrime(34));
        System.out.println(isPrime(90));
        }

       public static boolean isPrime(int n)
       {
        if(n==0 || n==1)
        {
            return false;
        }

        if(n==2)
        {
            return true;
        }

        for(int i=2; i<=n/2; i++)
        {
            if(n%1==0)
            {
                return false;

            }
            
        }  
        return true;
    }
}

// public static void main(String[] args)
    // {
    //     System.out.println(isPrime(21));
    //     System.out.println(isPrime(34));
    // }

    // public static boolean isPrime(int n)
    // {
    //     if(n==0|| n==1)
    //     {
    //         return false;
    //     }

    //     if(n==2)
    //     {
    //         return true;
    //     }

    //     for(int i=2;i<=n/2;i++)
    //     {
    //         if(n%1==0)
    //         {
    //             return false;
    //         }
    //     }
        
    //     return true;
    // } 
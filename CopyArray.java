public class CopyArray {
    public static void main(String[] args)
    {
        int a[]={2,5,7};
        int b[]= new int[a.length];

        b=a;

        b[0]++;
        System.out.println("Content of a[]:");

        for(int i=0; i< a.length; i++)
        
            System.out.print(a[i]+" ");
        
            System.out.println("\n\n Content of b[]:");
            for(int i=0; i< b.length; i++)
            
                System.out.print(b[i]+" ");
            
    }
}

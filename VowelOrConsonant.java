public class VowelOrConsonant 
{
    static void vowel_Or_Consonant(char y)
    {
        if(y=='a'|| y=='e'|| y=='i'|| y=='o'||y=='u')
        {
            System.out.println("It is a vowel");
        }
        else{
            System.out.println("it is a consonant");
        }
    }

    public static void main(String[] args)
    {
        vowel_Or_Consonant('d');
        vowel_Or_Consonant('c');
    }
    
}

import.java.util.array;
class main
{
    public static void main(String[] args)
    {
        String s1="listen";
        String s2="silent";
        s1=s1.tolowecase();
        s2=s2.tolowecase();
        char[]a1=s1.toCharArray();
        char[]a2=s2.toCharArray();
        if(Array.equals(a1,a2))
        {
            System.out.println("its a anagram");

        }
        else
            {
                System.out.println("not a anagram");
            }

    }
}

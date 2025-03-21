package Pattern;

public class PrintPattern {
    public static void main(String[] args) {
        // for(int line=1; line<=4; line++)
        // {
        //     for(int star=1; star<=line; star++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n = 4;
        // for(int i=1; i<=4; i++)
        // {
        //     for(int s=1; s<=n-i+1; s++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n = 4;
        // for(int i=1; i<=4; i++)
        // {
        //     for(int number=1; number<=i; number++)
        //     {
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }

        int n = 4;
        char ch = 'A';
        
        for(int line=1; line<=n; line++)
        {
            for(int chars=1; chars<=line; chars++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}

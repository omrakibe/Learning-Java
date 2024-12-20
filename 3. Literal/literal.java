class literal
{
    public static void main (String a[])
    {
        //literals
        int num1 = 0b101; //binary
        System.out.println(num1);

        int num2 = 0x4d; //hexadecimal
        System.out.println(num2);

        int num3 = 1_00_00_000;
        System.out.println(num3);

        //double
        double num4 = 12e10;
        System.out.println(num4);

        //char
        char c = 'a';
        c++;
        c++;
        System.out.println(c);
    }
}
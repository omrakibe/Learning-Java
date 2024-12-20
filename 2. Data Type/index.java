class Om {
    public static void main (String a[]) {

        //Integer
        System.out.println("Integer");

        long num6 = 4534565645646554356l; // 8 bytes
        System.out.println(num6);

        int num3 = 2004940000; // 4 bytes
        System.out.println(num3);

        short num5 = 10000; // 2 bytes
        System.out.println(num5);

        byte num4 = 127; // 1 byte. Range -> -128 to 127 
        System.out.println(num4);

        System.out.println("");

        //Float
        System.out.println("Float");

        double num1 = 5.6f; // 8 bytes
        System.out.println(num1);

        double num2 = 5.6;
        System.out.println(num2);

        float num7 = 4.7f; // 4 bytes
        System.out.println(num7);

        System.out.println("");

        //Char
        System.out.println("Char");

        char c = 'k'; // 2 bytes
        System.out.println(c);

        System.out.println("");

        //boolean
        System.out.println("boolean");

        boolean value = true; // 1 byte
        System.out.println(value);
        System.out.println(!value);

    }
}
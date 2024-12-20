class Conversion {
    public static void main (String args []) {

        byte b = 127;
        int a = b;
        byte k = (byte)a;
        System.out.println(k);

        int num1 = 360; //number is out of range so it is performing modules operation
        byte num2 = (byte)num1;
        System.out.println(num2); //360 % 256 = 104

        double f = 3.8;
        int i = (int)f;
        System.out.println(i); // output = 3

        int num4 = 278;
        double num5 = num4;
        System.out.println(num5); // output = 278.0

        //type promoting
        byte num6 = 10;
        byte num7 = 30;
        int result = num6 * num7; //byte is promoted into int by java
        System.out.println(result); // 300
    }
}
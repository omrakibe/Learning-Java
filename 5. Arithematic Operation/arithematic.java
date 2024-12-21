class arithematic {
    public static void main (String args[]) {

        int num1 = 7;
        int num2 = 5;
        double result = num1 / num2;
        System.out.println(result); 

        num1 *= 2;
        System.out.println(num1);

        // int inc = ++num2;
        // System.out.println(inc);

        int inc1 = num2++;
        System.out.println(inc1);

        System.out.println("");

        //Relational Operators
        System.out.println("Realtional Operators: ");
         int x = 2;
         int y = 2;
         boolean res = x != y;
         System.out.println(res);

        System.out.println("");
        
        //Logical operators
        System.out.println("Logical Operators: ");

        int a = 20;
        int b = 10;
        int c = 25;
        int d = 30;
        boolean res1 = a > b && c > d;
        boolean res2 = a > b || c > d;
        System.out.println(res1);
        System.out.println(res2);

        boolean res3 = !res2; //Not operator
        System.out.println(res3);

    }
}
class ternary {
    public static void main (String [] args) {

        int x = 0;
        int result = 0;

        // if (x % 2 == 0)
        // {   
        //     result = x;
        //     System.out.println("num is even");
        // }
        // else {
        //     result = 20;
        //     System.out.println("num is odd");
        // }
        // System.out.println(result);

        result = x % 2 == 0 ? x : 20;
        if(result == x) 
            System.out.println("Num is even");
        else
            System.out.println("Num is Odd");

        System.out.println(result);
        

    }
}
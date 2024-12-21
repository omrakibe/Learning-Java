class condition 
{
    public static void main(String[] args)
    {
        System.out.println("To check the num is even or odd: ");
        int x = 3; 
        if (x % 2 == 0) {
            System.out.println("x is Even Number");
        } else {
            System.out.println("x is Odd Number");
        }

        System.out.println("");

        System.out.println("checking grater num: ");
        int a = 5;
        int b = 6;
        int c = 6;
        if (a > b && a > c) 
        {
            System.out.println("a is Greater");
            System.out.println("Thank you");
        }
        else if (b > c){
            System.out.println("b is greater");
        }
        else {
            System.out.println("c is greater");
        }
            
    }
}
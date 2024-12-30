class Calc {
    public int add(int num1, int num2) {
        System.out.println("class calc");
        int result = num1 + num2;
        System.out.println(result);
        return 0;
    }
}

class Index {
    public static void main (String [] args) {

        int num1 = 3;
        int num2 = 4;
        System.out.println("Main Class");

        Calc obj = new Calc();
        int res = obj.add(num1, num2);
        System.out.println(res);
    }
}
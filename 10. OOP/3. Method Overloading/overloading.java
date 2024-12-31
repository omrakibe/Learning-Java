class Calculator {
    public int add(int n1, int n2, int n3 ) {
        return n1 + n2 + n3;
    }
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public float add(float n1, int n2) {
        return n1 + n2;
    }
}

class overloading {
    public static void main (String [] args) {

        Calculator obj = new Calculator();
        float res = obj.add(2.43f, 3);
        System.out.println(res);
    }
}
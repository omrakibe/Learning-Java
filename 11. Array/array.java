class array {
    public static void main (String [] args) {


        int num[] = {1, 2, 4};
        // System.out.println(num[2]);

        int num1[] = new int[4];
        num1[3] = 60;
        num1[2] = 2;
        num1[1] = 35;
        num1[0] = 4;

        for (int i=0; i<4; i++) {
            System.out.println(num1[i]);
        }
        
        

    }
}
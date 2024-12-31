class array {
    public static void main(String[] args) {

        int num[] = {1, 2, 4};
        System.out.println(num[2]);

        int num1[] = new int[4];
        // num1[3] = 60;
        // num1[2] = 2;
        // num1[1] = 35;
        // num1[0] = 4;

        for (int i=0; i<4; i++) {
        System.out.println(num1[i]);
        }

        // Multi-Dimension array

        int arr[][] = { { 1, 3, 4 }, { 2, 4, 22 }, { 2, 3, 4 } };
        System.out.println(arr[1]);

        System.out.println();
        System.out.println("Multi Dimensional Array");

        int arr1[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {
                arr1[i][j] = (int) (Math.random() * 10); // for random numbers
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int n[] : arr1) {

            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
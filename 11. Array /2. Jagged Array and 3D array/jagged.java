class jagged {
    public static void main(String[] args) {

        int arr[][] = new int[3][]; // jagged array

        arr[0] = new int[2];
        arr[1] = new int[1];
        arr[2] = new int[4];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }

        // Advance Loop
        for (int n[] : arr) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("3d array");

        int arr_3d[][][] = new int[2][2][4]; // 3D Array
        System.out.println(arr_3d[1][1][1]);
    }
}
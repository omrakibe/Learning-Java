class Student {
    public void student() {
        String arr[] = {"Om", "Rakibe", "Hello World", "Pune"};

        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // int rollno;
    // String name;
    // String subject;

}

class index {
    public static void main(String[] args) {

        int arr[] = new int[6];

        arr[0] = 3;
        arr[1] = 34;
        arr[2] = 2;
        arr[5] = 9;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    //     String arr1 [] = {"Om", "Rakibe", "Hello World"};
    //     for (int i=0  ;i<arr1.length; i++ ) {
    //         System.out.println(arr1[i]);
    //     }

        Student obj = new Student(); //obj is refernce vairable.
        obj.student();
    }
}
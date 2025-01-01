class Text {
    public void student() {
        String arr[] = { "Om", "Rakibe", "Hello World", "Pune" };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}

class Student {

    int rollno;
    String name;
    String subject;

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

        // String arr1 [] = {"Om", "Rakibe", "Hello World"};
        // for (int i=0 ;i<arr1.length; i++ ) {
        // System.out.println(arr1[i]);
        // }

        Text obj = new Text(); // obj is refernce vairable.
        obj.student();

        Student s1 = new Student();
        s1.rollno = 65;
        s1.name = "Om";
        s1.subject = "Maths";

        Student s2 = new Student();
        s2.rollno = 71;
        s2.name = "Sejal";
        s2.subject = "CG";

        Student s3 = new Student();
        s3.rollno = 68;
        s3.name = "Rudra";
        s3.subject = "OOP";

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i=0; i<students.length; i++) {
            
            System.out.println(students[i].name + " - " + students[i].subject );
            
        }

    }
}
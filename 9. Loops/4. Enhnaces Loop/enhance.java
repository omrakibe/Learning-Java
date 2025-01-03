class Student {
    int rollno;
    String name;
    float marks;
}

class enhance {
    public static void main(String[] args) {

        int arr[] = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            // System.out.println(arr[i]);
        }

        // Enhanced loop
        for (int n : arr) {
            System.out.print(n + " ");
        }

        System.out.println();

        Student s1 = new Student();
        s1.rollno = 65;
        s1.name = "Om";
        s1.marks = 9.36f;

        Student s2 = new Student();
        s2.rollno = 71;
        s2.name = "Sejal";
        s2.marks = 8.7f;

        Student s3 = new Student();
        s3.rollno = 68;
        s3.name = "Rudra";
        s3.marks = 8.3f;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


        //Enhanced Loop:
        for(Student n : students) {
            System.out.println(n.rollno + " " + n.name + " : " + n.marks);
        }

        
    }
}
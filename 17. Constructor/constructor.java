class Human {
    private int age;
    private String name;

    public Human() {  //Constructor

        age = 32;
        name = "Pushpa 2";
        System.out.println("In Constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class constructor{
    public static void main(String[] args) {

        Human obj = new Human();
        // Human obj1 = new Human();
        System.out.println(obj.getName() + ": " + obj.getAge());
    }
}
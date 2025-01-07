class Human {
    private int age;
    private String name;

    public Human() {  //Constructor

        age = 32;
        name = "Pushpa";
        System.out.println("In Constructor");
    }

    public Human(int age, String name) {  //methodOverloading take place here

        this.age = age;
        this.name = name;
        System.out.println("In Constructor having arguments");
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
        Human obj1 = new Human(19, "Om");
        // Human obj1 = new Human();
        System.out.println(obj.getName() + ": " + obj.getAge());
        System.out.println(obj1.getName() + ": " + obj1.getAge());
    }
}
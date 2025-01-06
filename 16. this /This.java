class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;             //this keyword use to call its own class object
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}

class This{
    public static void main (String[] args) {

        Human obj = new Human();
        obj.setAge(19);
        obj.setName("Om");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
class Human {
    private int age ; //encapsulation takes place here
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String b){
        name = b;
    }
    public String getName() {
        return name;
    }
}

class encapsulation {
    public static void main(String[] args) {

        Human obj = new Human();
        obj.setAge(19);
        obj.setName("Om Rakibe");
        System.out.println(obj.getAge() + " : " + obj.getName());
        // obj.age = 19;
        // obj.name = "Om Rakibe";
        
        
    }
}
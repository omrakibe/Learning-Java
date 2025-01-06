class Animals {
    int legs;
    String name;
    static String type;

    public Animals() {
        legs = 2;
        name = "Tiger";
        System.out.println("In Constructor");
        System.out.println(type);
    }

    static { //static block is always printed first then any other method
        type = "Omniverse";
        System.out.println("In Static Block");
    }
}

class blocks {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Animals");

        // Animals animal1 = new Animals();
        // animal1.legs = 4;
        // animal1.name = "Lion";
        // // Animals.type = "lol";

        // // System.out.println(Animals.type);

        // Animals animal2 = new Animals();

    }
}
class mobile {
    String name;
    int price;
    static String type;

    public void show() {
        System.out.println(name + " - " + price + ", " + type);
    }
}

class java {
    public static void main(String[] args) {

        mobile obj1 = new mobile();
        obj1.name = "OnePlus";
        obj1.price = 30000;
        mobile.type = "SmartPhone";

        mobile obj2 = new mobile();
        obj2.name = "Apple";
        obj2.price = 55000;
        mobile.type = "SmartPhone";

        mobile obj3 = new mobile();
        obj3.name = "Samsung";
        obj3.price = 50000;
        mobile.type = "SmartPhone";

        mobile.type = "Phone"; //by using static all type becomes same

        obj1.show();
        obj2.show();
        obj3.show();

    }
}
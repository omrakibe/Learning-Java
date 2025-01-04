class string {
    public static void main (String [] args) {

        String name = new String("Om");
        name = name + " Rakibe";

        System.out.println("Hello " + name); 
        System.out.println(name.charAt(1)); //finding character in string
        System.out.println(name.concat(", Good Morning")); //Concat

        String s1 = "Math";
        String s2 = "Math"; // here only one object is created and same address is use for all same string.
        System.out.println(s1 == s2);
        
    }
}
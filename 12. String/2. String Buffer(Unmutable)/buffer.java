class buffer {
    public static void main(String[] args) {

        StringBuffer name = new StringBuffer("Om");
        System.out.println(name.capacity() + " line-5");


        name.append(" Rakibe"); //works like concat in stringBuffer because concat not works in stringBuffer.
        System.out.println(name + " line-9");

        String str = name.toString(); //to convert StringBuffer datatype to string
        System.out.println(str + " line-12");
        // str.concat(str);

        name.deleteCharAt(2); //use delete character with the help of index
        System.out.println(name + " line-16");

        name.insert(0, "Java ");
        System.out.println(name + " line-19"); 

        StringBuilder name1 = new StringBuilder("OM");
        System.out.println(name1.capacity() + " line-22");

        //difference between stringbuffer and stringbuilder is StringBuffer is thread safe and another one is not i.e. StringBuilder
    }

}
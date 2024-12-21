class Switch {
    public static void main (String [] args) {
         
        int i = 9;
        String res = "";
        switch(i) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: 
                System.out.println("Enter num between 1 to 7");
        }

        System.out.println("");

        // Another way
        res = switch(i) {
            case 1 : yield "Monday";
            case 2 : yield "Tuesday";
            case 3 : yield "wednesday";
            default : yield "Sunday";
        };
        System.out.println(res);

        System.out.println("");

        //update style of Switch Statement

        String day = "Monday" ;
        String result = "";

        switch(day) {
            case "Saturday", "Sunday" -> result = "5.30 am";
            case "Monday" -> result = "6 am";
            default -> result = "5 am";
        }
        System.out.println(result);
         
        System.out.println("");

        //Another way 
        day = "Sunday";

        result = switch(day) {
            case "Monday" -> "6 am";
            case "Saturday", "Sunday" -> "5.30am";
            default -> "5 am";
        };

        System.out.println(result);
    }
}
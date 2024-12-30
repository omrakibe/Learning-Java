class For {
    public static void main (String [] args) {

        // for (int i=0; i<4; i++) {
        //     System.out.println("HEllo World " + i);
        // }

        for (int i=1; i<=7; i++) {
            System.out.println("Day: " + i);
            
            for (int j=1; j<=9; j++) {
                System.out.println( "Hrs " + (j+8) );
            }
            System.out.println("");
        }
    }
}
class Computer {
    public void playMusic() {
        System.out.println("Music started playing..");
    }
    public String startGame(int cost) {
        if (cost >= 10) 
            return "Game has Started, enjoy it. Cost is $" + cost;
        
        return "Cost is not enough to start the game.";
    }
}

class method {
    public static void main (String [] args) {

        Computer obj = new Computer();
        obj.playMusic();
        String game = obj.startGame(2);
        System.out.println(game);
    }
}
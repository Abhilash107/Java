package OutputQNS.oops;

class Game{
    private int num = 20;

    public void alter(){
        num += (int)(Math.random() * (5 - 1 + 1)) + 1;
    }

    public void show(){
        System.out.println(num);
    }
}
public class q10 {

    public static void main(String[] args) {
        Game myGame = new Game();

        myGame.show();
        myGame.alter();
        myGame.show();

        Game myNewGame = new Game();
        myNewGame.show();
    }
}

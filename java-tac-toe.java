import java.util.*;

public class Main
{
    //Global vars
    static Scanner sc = new Scanner(System.in);
    
    static void gameBoard(){
        String[][] theGame = {
            {"_","_","_"},
            {"_","_","_"},
            {"_","_","_"}
        };
        
        for (int i = 0; i < theGame.length; ++i) {
          for(int j = 0; j < theGame[i].length; ++j) {
              System.out.print(theGame[i][j]);
          }
          System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        System.out.println(" -- TICK TAC TOE --");
        System.out.println("Player 1, GO! (You are X)\n Press a single number between 1-9.");
        gameBoard();
        int p1Choice = sc.nextInt();
        
        
    }
}

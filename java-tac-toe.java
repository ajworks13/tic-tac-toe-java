import java.util.*;

public class Main
{
    //Global vars
    static Scanner sc = new Scanner(System.in);
    static boolean gameOver = false;
    
    static void gameBoard(String p1, String p2, String decision){
        
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
        
        do{
            System.out.println("Player 1, GO! (You are X)\n Press a single number between 1-9.");
            gameBoard();
            int p1Choice = sc.nextInt();
            
            if(p1Choice < 1 || p1Choice > 9){
                System.out.println("Can NOT exceed a number grader than 9 or less than 1.\nTry again..");
            }
            if(p1Choice == 1){
                gameBoard(p1Choice,p2Choice,theDecision);
            }
            
            
        }while(gameOver != true);
        
        
    }
}

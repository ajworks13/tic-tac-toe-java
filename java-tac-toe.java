import java.util.*;

public class Main {
	//Global vars
	static Scanner sc = new Scanner(System.in);
	static boolean gameOver = false;
	


	public static void main(String[] args) {
		ArrayList<Integer> numbersUsed = new ArrayList<Integer>();
		
		System.out.println(" -- TICK TAC TOE --");

		String[][] theGame = {
			{"_", "_", "_"},
			{"_", "_", "_"},
			{"_", "_", "_"}
		};

		do {
			System.out.println("Player 1, GO! (You are X)\n Press a single number between 1-9.");
			int p1Choice = sc.nextInt();
            
            //----------------------------------- MAKE SURE NO OTHER NUMBER IS BEING ENTERED --------------------------------
			if (p1Choice < 1 || p1Choice > 9) {
				
			    do{
			         System.out.println("\nCan NOT exceed a number grader than 9 or less than 1.\nTry again..");
			         p1Choice = sc.nextInt();
			         if(p1Choice < 1 || p1Choice > 9){
			             System.out.println("Try again..");    
			         }else if(p1Choice >= 1 || p1Choice <= 9){
			             break;    
			         }   
			    }while(true);
			}
            //-------------------------------------------------------------------------------------------------------------------------------------------------------------------
            
			if (p1Choice == 1) {
				theGame[0][0] = "X";
				numbersUsed.add(1);
				
				for(int x: numbersUsed){
				    System.out.print(" [" + x + " ]");    
				}
				System.out.println("\n");
				
			}else if(p1Choice == 2){
			     theGame[0][1] = "X";   
			     numbersUsed.add(2);
			     
			     for(int x: numbersUsed){
			          System.out.print(" [" + x + " ]");   
			     }
			     System.out.println("\n");
			}
			
			
            
            //Prints the board game.
			for (int i = 0; i < theGame.length; ++i) {
				for (int j = 0; j < theGame[i].length; ++j) {
					System.out.print(theGame[i][j]);
				}
				System.out.println("");
			}
			
			
			//----------- PLAYER 2 GOES NOW ---------------------------------------------------------------------------------------------------------------------------------------------
			System.out.println("Player 2, GO! (You are O)\nPress a single number between 1-9.");
			int p2Choice = sc.nextInt();
			
			
			//----------------------------------- MAKE SURE NO OTHER NUMBER IS BEING ENTERED --------------------------------
			if (p2Choice < 1 || p2Choice > 9) {
				
			    do{
			         System.out.println("\nCan NOT exceed a number grader than 9 or less than 1.\nTry again..");
			         p2Choice = sc.nextInt();
			         if(p2Choice < 1 || p2Choice > 9){
			             System.out.println("Try again..");    
			         }else if(p2Choice >= 1 || p2Choice <= 9){
			             break;    
			         }   
			    }while(true);
			}
			//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
			
			
			//-------------------Check if p1 already selected it--------------
			
			if(numbersUsed.contains(1) || numbersUsed.contains(2) || numbersUsed.contains(3) || numbersUsed.contains(4) || numbersUsed.contains(5) || numbersUsed.contains(6) || numbersUsed.contains(7) || numbersUsed.contains(8) || numbersUsed.contains(9)){
			     while(true){
			         System.out.println("That number is already being used.\nTry another number..");
			         p2Choice = sc.nextInt();   
			         if(p2Choice != p1Choice){
			              break;   
			         }
			     }
			     
			}
			
			
			
			
			
			/*
			if(theGame[0][0] == "X" && p2Choice == 1){
			        
			     while(p2Choice == 1){
			             System.out.println("\nPlayer 1 already selected that. Try another number..\n");
			             p2Choice = sc.nextInt();
			             
			             for (int i = 0; i < theGame.length; ++i) {
                				for (int j = 0; j < theGame[i].length; ++j) {
                					System.out.print(theGame[i][j]);
                				}
                				System.out.println("");
                		  }
                		  
			             if(p2Choice != 1){
			                  break;   
			             }
			     }// while
			}
			*/
			
			
			//--------------------------------------------------------------------------------------
			
			if (p2Choice == 1) {
				theGame[0][0] = "O";
			}else if(p2Choice == 2){
			     theGame[0][1] = "O";   
			}
			
			for (int i = 0; i < theGame.length; ++i) {
    				for (int j = 0; j < theGame[i].length; ++j) {
    					System.out.print(theGame[i][j]);
    				}
    				System.out.println("");
    		 }
        
		} while (gameOver != true);


	}
}

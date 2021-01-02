// import project01.*;

/**
 * class TortoiseAndHareRace
 * 
 * This class represents the Tortoise and Hare race. Each animal has a set of moves they can make and a probability associated with it. 
 * The race trail will be shown in the console. If the tortoise and the Hare land in the same position, the tortoise will bite the Hare
 * causing it to move back. First one to travel 50 units wins the race.
 * 
 * @author Rodrigo Rogel-Perez
 *
**/

class TortoiseAndHareRace {
   public static void main(String[] args) {
      // declare and initialize variables
      Hare hare = new Hare(); // instance of 'Hare' class
      Tortoise tortoise = new Tortoise(); // instance of 'Tortoise class'
      int maxPosition; // to hold greater of the two objects' positions
      String msg; // to hold string showing positions

      System.out.print( "\n\n" );
      System.out.print( "AND THEY ARE OFF!" ); // display at the beginning of the race

      do {
         hare.makeMove(); // determines the type of move made by the hare and updates its position
         tortoise.makeMove(); // determines the type of move made by the tortoise and updates its position
         
         System.out.print( "\n" );
         // display message if both the turtle and the hare reach position 50 on the same turn
         if ( hare.getPosition() >= 50 & tortoise.getPosition() >= 50 ) {
            System.out.print( "IT'S A TIE!" );
         }
         // display message if the tortoise and the hare are at the same position
         else if ( hare.getPosition() == tortoise.getPosition() ) {
            for ( int i = 1; i < hare.getPosition(); i++ ) {
               System.out.print( " " ); // generate whitespace equal to the value of the hare's position
            }
            System.out.print( "OUCH!" );
         }
         // display message if hare wins race
         else if ( hare.getPosition() >= 50 ) {
            System.out.print( "HARE WINS!!" );
         }
         // display message if tortoise wins race
         else if ( tortoise.getPosition() >= 50 ) {
            System.out.print( "TORTOISE WINS!" );
         }
         else { // display the hare's and tortoise's current position in the console
            maxPosition = Math.max( hare.getPosition(), tortoise.getPosition() );
            for ( int currentPos = 1; currentPos <= maxPosition; currentPos++ ) {
               // amount of whitespace equals the value of the position
               msg = currentPos == hare.getPosition() ? "H" : currentPos == tortoise.getPosition() ? "T" : " ";
               System.out.print( msg );
            }   
         }

      } while ( hare.getPosition() < 50 && tortoise.getPosition() < 50 ); // repeat loop until there is a winner
   } // end of main()
} // end of TortoiseAndRace
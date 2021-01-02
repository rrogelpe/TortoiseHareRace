// package project01;

/**
 * public class Hare
 * 
 * This class represents the hare which is defined by its position along a horizontal path
 *
 * @author Rodrigo Rogel-Perez
 *
**/

public class Hare {

   /**
    *
    * Default constructor
    *
   **/
   public Hare () {
      position = 1; // statrting position is 1
   } // end of Hare()

   /**
    * method makeMove
    *
    * This method calls the generateRandomNumber method and adds the result 
    * to the current position to determine the new position. Note that the 
    * position value can not be less than 1.
    *
   **/
   public void makeMove() {
      int randNumber;
      int result;

      randNumber = generateRandomNumber();
      /* if randNumber is less than 3, then assign 9 (20% chance)
       * if randNumber is between the closed interval of 3 & 5, then assign 1 (30% chance)
       * if randNumber is equal to 6, then assign -12 (10%)
       * if randNumber is 7 or 8, then assign -2 (20% chance)
      */ if randNumber is 9 or 10, then assign 0 (20% chance)
      result = randNumber <= 2 ? 9 : randNumber <= 5 ? 1 : randNumber <= 6 ? (-12) : randNumber <= 8 ? (-2) : 0;
      position = position + result < 1 ? 1 : position + result;
      //System.out.print(this.position + ", ");
   } // end of makeMove()
   
   /**
    * method getPosition
    *
    * This method returns the position value of the instance variable
    *
    * @return an integer
    *
   **/
   public int getPosition() {
      return position;
   } // end of getPosition()

   /**
    * method generateRandomNumber
    *
    * This method returns a random number between the closed interval 1 and 10
    *
    * @return an integer
    *
   **/
   private int generateRandomNumber() {
      return (int) (10 * Math.random()) + 1; // generate random # between 1 and 10
   } // end of generateRandomNumber()

   // declare instance variables
   private int position; // to hold position of Hare; value can't be less than 1
} // end of Hare
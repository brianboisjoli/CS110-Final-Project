// Brian Boisjoli
// CS110
// Final Homework: Card Class

/**
* Representation of a single playing card (from a standard 52 card deck).
* A card consists of a suit value and a rank value. Once instantiated,
* the Card object cannot change.
*
* @Jackie Horton
*/
public class Card
{
   // Constants
   // suits
   public final static int SPADES = 0, HEARTS = 1, DIAMONDS = 2, CLUBS = 3;
   
   // ranks
   // Cards 2 through 9 have face value
   public final static int ACE = 1, JACK = 11, QUEEN = 12, KING = 13;
   
   private int suit; // The suit of this card, one of the constants
                     // SPADES, HEARTS, DIAMONDS, CLUBS.

   private int rank; // The rank of this card, from 1 to 13.
   
   private String imageName; // For the images of the cards

   /**
   * Creates a new playing card.
   * @param suit the suit value of this card.
   * @param rank the rank rank of this card.
   */
   public Card(int rank, int suit)
   {
      this.rank = rank;
      this.suit = suit;
   }
   /**
    * Returns the suit of the card.
    * @return a Suit constant representing the suit value of the card.
    */

   public int getSuit()
   {
      return suit;
   }
 
   /**
   * Returns the rank of the card.
   * @return a Rank constant representing the rank value of the card.
   */
   public int getRank()
   {
      // Return the int that codes for this card's rank.
      return rank;
   }
   
   /**
   * Returns a description of the suit of this card.
   * @return the suit value of the card as a string.
   */
   
   public String getSuitAsString()
   {
      // Return a String representing the card's suit.
      // (If the card's suit is invalid, "??" is returned.)
      switch ( suit ) {
         case SPADES: return "Spades";
         case HEARTS: return "Hearts";
         case DIAMONDS: return "Diamonds";
         case CLUBS: return "Clubs";
         default: return "Invalid";
      }
   }
   /**
   * Returns a description of the rank of this card.
   * @return the rank value of the card as a string.
   */
   public String getRankAsString()
   {
      switch ( rank ) {
         case 1: return "Ace";
         case 2: return "2";
         case 3: return "3";
         case 4: return "4";
         case 5: return "5";
         case 6: return "6";
         case 7: return "7";
         case 8: return "8";
         case 9: return "9";
         case 10: return "10";
         case 11: return "Jack";
         case 12: return "Queen";
         case 13: return "King";
         default: return "??";
      } 
   }
   /**
   * Returns a description of this card.
   * @return the name of the card.
   */
   public String toString()
   {
      return getRankAsString() + " of " + getSuitAsString();
   }

   /**
   * Compares two cards to determine if they have the same value.
   * @param card the other card
   * @return true if the two cards have the same rank and suitvalues,
   * falseotherwise.
   */
   
   public boolean equals(Card otherCard )
   {
      if ( ( rank != otherCard.rank ) || ( suit != otherCard.suit ) )
         return false;
      else
         return true;
   }
   
   public void setImage(int s, int r)
   {
      if (s == Card.SPADES)
      {
         if (r == Card.ACE)
         {
            this.imageName = "aces.jpg";
         }
         if (r == 2)
         {
            this.imageName = "2s.jpg";
         }
         if (r == 3)
         {
            this.imageName = "3s.jpg";
         }
         if (r == 4)
         {
            this.imageName = "4s.jpg";
         }
         if (r == 5)
         {
            this.imageName = "5s.jpg";
         }
         if (r == 6)
         {
            this.imageName = "6s.jpg";
         }
         if (r == 7)
         {
            this.imageName = "7s.jpg";
         }
         if (r == 8)
         {
            this.imageName = "8s.jpg";
         }
         if (r == 9)
         {
            this.imageName = "9s.jpg";
         }
         if (r == 10)
         {
            this.imageName = "10s.jpg";
         }
         if (r == JACK)
         {
            this.imageName = "jacks.jpg";
         }
         if (r == QUEEN)
         {
            this.imageName = "queens.jpg";
         }
         if (r == KING)
         {
            this.imageName = "kings.jpg";
         } 
      }
      if (s == Card.CLUBS)
      {
         if (r == Card.ACE)
         {
            this.imageName = "acec.jpg";
         }
         if (r == 2)
         {
            this.imageName = "2c.jpg";
         }
         if (r == 3)
         {
            this.imageName = "3c.jpg";
         }
         if (r == 4)
         {
            this.imageName = "4c.jpg";
         }
         if (r == 5)
         {
            this.imageName = "5c.jpg";
         }
         if (r == 6)
         {
            this.imageName = "6c.jpg";
         }
         if (r == 7)
         {
            this.imageName = "7c.jpg";
         }
         if (r == 8)
         {
            this.imageName = "8c.jpg";
         }
         if (r == 9)
         {
            this.imageName = "9c.jpg";
         }
         if (r == 10)
         {
            this.imageName = "10c.jpg";
         }
         if (r == JACK)
         {
            this.imageName = "jackc.jpg";
         }
         if (r == QUEEN)
         {
            this.imageName = "queenc.jpg";
         }
         if (r == KING)
         {
            this.imageName = "kingc.jpg";
         }  
      }
      if (s == Card.HEARTS)
      {
         if (r == Card.ACE)
         {
            this.imageName = "aceh.jpg";
         }
         if (r == 2)
         {
            this.imageName = "2h.jpg";
         }
         if (r == 3)
         {
            this.imageName = "3h.jpg";
         }
         if (r == 4)
         {
            this.imageName = "4h.jpg";
         }
         if (r == 5)
         {
            this.imageName = "5h.jpg";
         }
         if (r == 6)
         {
            this.imageName = "6h.jpg";
         }
         if (r == 7)
         {
            this.imageName = "7h.jpg";
         }
         if (r == 8)
         {
            this.imageName = "8h.jpg";
         }
         if (r == 9)
         {
            this.imageName = "9h.jpg";
         }
         if (r == 10)
         {
            this.imageName = "10h.jpg";
         }
         if (r == JACK)
         {
            this.imageName = "jackh.jpg";
         }
         if (r == QUEEN)
         {
            this.imageName = "queenh.jpg";
         }
         if (r == KING)
         {
            this.imageName = "kingh.jpg";
         }
      }
      if (s == Card.CLUBS)
      {
         if (r == Card.ACE)
         {
            this.imageName = "acec.jpg";
         }
         if (r == 2)
         {
            this.imageName = "2c.jpg";
         }
         if (r == 3)
         {
            this.imageName = "3c.jpg";
         }
         if (r == 4)
         {
            this.imageName = "4c.jpg";
         }
         if (r == 5)
         {
            this.imageName = "5c.jpg";
         }
         if (r == 6)
         {
            this.imageName = "6c.jpg";
         }
         if (r == 7)
         {
            this.imageName = "7c.jpg";
         }
         if (r == 8)
         {
            this.imageName = "8c.jpg";
         }
         if (r == 9)
         {
            this.imageName = "9c.jpg";
         }
         if (r == 10)
         {
            this.imageName = "10c.jpg";
         }
         if (r == JACK)
         {
            this.imageName = "jackc.jpg";
         }
         if (r == QUEEN)
         {
            this.imageName = "queenc.jpg";
         }
         if (r == KING)
         {
            this.imageName = "kingc.jpg";
         }
      }
   }
}
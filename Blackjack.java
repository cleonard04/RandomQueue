package RandomQueue;

public class Blackjack<Hands> {

    static RandomQueue<Cards> Hand1 = new RandomQueue<Cards>();

    static RandomQueue<Cards> Hand2 = new RandomQueue<Cards>();

    static RandomQueue<Cards> Hand3 = new RandomQueue<Cards>();

    public static void main(String[] args){

        RandomQueue<Cards> CardDeck =  new RandomQueue<Cards>();
        for (int i = 0; i < 6; i++) {
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    CardDeck.enqueue(new Cards(suit, rank));
                }
            }
        }

        // Initial Cards in Deck
        System.out.println("\nTo begin, there are " + CardDeck.ItemCount + " cards in the deck.");



        // Hand1
        System.out.println("\n-------------------------\nHand1");
        for (int i = 0; i < 10; i++) {
            Hand1.enqueue(CardDeck.dequeue());
        }

        System.out.println("\n" + Hand1.ItemCount + " cards in Hand1\n");
        int tempVar = Hand1.ItemCount;
        for (int i = 0; i < tempVar; i++) {
            System.out.println(Hand1.dequeue());
        }



        // Hand2
        System.out.println("\n-------------------------\nHand2");
        for (int i = 0; i < 10; i++) {
            Hand2.enqueue(CardDeck.dequeue());
        }

        System.out.println("\n" + Hand2.ItemCount + " cards in Hand2\n");
        int tempVar2 = Hand2.ItemCount;
        for (int i = 0; i < tempVar2; i++) {
            System.out.println(Hand2.dequeue());
        }



        // Hand3
        System.out.println("\n-------------------------\nHand3");
        for (int i = 0; i < 10; i++) {
            Hand3.enqueue(CardDeck.dequeue());
        }

        System.out.println("\n" + Hand3.ItemCount + " cards in Hand3\n");
        int tempVar3 = Hand3.ItemCount;
        for (int i = 0; i < tempVar3; i++) {
            System.out.println(Hand3.dequeue());
        }



        // Final Total Cards in Deck
        System.out.println("\n-------------------------\nThe final total of cards in the deck is " + CardDeck.ItemCount + " cards.");
    }
}

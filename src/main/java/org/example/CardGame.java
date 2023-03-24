package org.example;

/*
Alice and Bob are playing a game. There are n(1≤n≤10^18) cards on the table. The aim of the game is to collect the most cards. The rules:

if the number of cards is even, the players can either take half of the cards from the stack, or only 1 card -- as they choose;
if the number of cards is odd, the players must take 1 card.
Alice starts the game.

Return the maximum number of cards Alice can collect, if Bob plays optimally (tries to get as many cards as possible for himself).
 */
public class CardGame {
    static long cards;

    public static long cardGame(long n) {
        CardPlayer alice = new CardPlayer();
        CardPlayer bob = new CardPlayer();
        cards = n;
        while (cards > 0) {
            if (cards % 2 == 0) {
                if (alice.isActiveTurn()) {
                    turnPlayerEven(alice, bob);
                } else if (bob.isActiveTurn()) {
                    turnPlayerEven(bob, alice);
                }
            } else {
                if (alice.isActiveTurn()) {
                    turnPlayerOdd(alice, bob);
                } else {
                    turnPlayerOdd(bob, alice);
                }
            }
        }
        return alice.getCardsAmount();
    }

    public static void turnPlayerEven(CardPlayer player, CardPlayer player2) {
        if (cards / 2 > 1) {
            player.addCards(cards / 2);
            cards = cards / 2;
        } else {
            player.addCards(1);
            cards -= 1;
        }
        player.setActiveTurn(false);
        player2.setActiveTurn(true);

    }

    public static void turnPlayerOdd(CardPlayer player1, CardPlayer player2) {
        player1.addCards(1);
        player1.setActiveTurn(false);
        player2.setActiveTurn(true);
        cards -=1;
    }


    static class CardPlayer {
        private long cardsAmount = 0;
        private boolean activeTurn = true;


        public long getCardsAmount() {
            return cardsAmount;
        }

        public void addCards(long cardsAmount) {
            this.cardsAmount += cardsAmount;
        }

        public boolean isActiveTurn() {
            return activeTurn;
        }

        public void setActiveTurn(boolean activeTurn) {
            this.activeTurn = activeTurn;
        }
    }
}

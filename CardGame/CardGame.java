public class CardGame {
    //https://www.codewars.com/kata/60576b180aef19001bce494d
    public String winner(String[] deckSteve, String[] deckJosh) {
        int lengthOfDecks = deckJosh.length;
        int scoreSteve = 0, scoreJosh = 0;
        for (int i = 0; i < lengthOfDecks; ++i) {
            int cardSteve = getCardValue(deckSteve[i]);
            int cardJosh = getCardValue(deckJosh[i]);
            if (cardSteve > cardJosh) {
                scoreSteve++;
            } else if (cardSteve < cardJosh) {
                scoreJosh++;
            }
        }
        if (scoreSteve == scoreJosh) {
            return "Tie";
        } else if (scoreSteve > scoreJosh) {
            return "Steve wins " + scoreSteve + " to " + scoreJosh;
        } else {
            return "Josh wins " + scoreJosh + " to " + scoreSteve;
        }
    }

    private int getCardValue(String card) {
        switch (card) {
            case "T":
                return 10;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            default:
                return Integer.parseInt(card);
        }
    }
}
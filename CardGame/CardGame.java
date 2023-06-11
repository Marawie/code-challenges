public class CardGame {
    //https://www.codewars.com/kata/60576b180aef19001bce494d
    public String winner(String[] deckSteve, String[] deckJosh) {
        int stevePoints = 0;
        int joshPoints = 0;
        int lengthOfDecks = deckJosh.length;
        for (int i = 0; i < lengthOfDecks; i++) {
            deckSteve[i] = deckSteve[i].replace("A", "14");
            deckSteve[i] = deckSteve[i].replace("K", "13");
            deckSteve[i] = deckSteve[i].replace("Q", "12");
            deckSteve[i] = deckSteve[i].replace("J", "11");
            deckSteve[i] = deckSteve[i].replace("T", "10");
            deckJosh[i] = deckJosh[i].replace("A", "14");
            deckJosh[i] = deckJosh[i].replace("K", "13");
            deckJosh[i] = deckJosh[i].replace("Q", "12");
            deckJosh[i] = deckJosh[i].replace("J", "11");
            deckJosh[i] = deckJosh[i].replace("T", "10");
        }
        for (int i = 0; i < lengthOfDecks; i++) {
            if (Integer.parseInt(deckJosh[i]) > Integer.parseInt(deckSteve[i])) {
                joshPoints++;
            } else if (Integer.parseInt(deckJosh[i]) < Integer.parseInt(deckSteve[i])) {
                stevePoints++;
            }
        }

        if (joshPoints > stevePoints) {
            return "Josh wins " + joshPoints + " to " + stevePoints;
        } else if (stevePoints > joshPoints) {
            return "Steve wins " + stevePoints + " to " + joshPoints;
        }
        return "Tie";
    }
}
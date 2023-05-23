public class WhoLikesIt {
    //https://www.codewars.com/kata/5266876b8f4bf2da9b000362/

    public String whoLikesIt(String... names) {
        String firstPerson = names[0];
        String secondPerson = names[1];
        switch (names.length) {

            case 0:
                return "no one likes this";
            case 1:
                return firstPerson + " likes this";
            case 2:
                return firstPerson + " and " + secondPerson + " like this";
            case 3:
                return firstPerson + ", " + secondPerson + " and " + names[2] + " like this";
            default:
                return firstPerson + ", " + secondPerson + " and " + (names.length - 2) + " others like this";
        }
    }
}
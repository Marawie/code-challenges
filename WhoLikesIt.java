public class WhoLikesIt {
    //https://www.codewars.com/kata/5266876b8f4bf2da9b000362/

    public String whoLikesIt(String... names) {
        String nameOfFirstPerson = names[0];
        String nameOfSecondPerson = names[1];

        switch (names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return nameOfFirstPerson + " likes this";
            case 2:
                return nameOfFirstPerson + " and " + nameOfSecondPerson + " like this";
            case 3:
                return nameOfFirstPerson + ", " + nameOfSecondPerson + " and " + names[2] + " like this";
            default:
                return nameOfFirstPerson + ", " + nameOfSecondPerson + " and " + (names.length - 2) + " others like this";
        }
    }
}
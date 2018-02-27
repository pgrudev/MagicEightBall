package magicEightBall;

public enum Answers {
    ONE("It is certain"),
    TWO("It is decidedly so"),
    THREE("Without a doubt"),
    FOUR("Yes, definitely"),
    FIVE("You may rely on it"),
    SIX("As I see it, yes"),
    SEVEN("Most likely"),
    EIGHT("Outlook good"),
    NINE("Yes"),
    TEN("Signs point to yes"),
    ELEVEN("Reply hazy try again"),
    TWELVE("Ask again later"),
    THIRTEEN("Better not tell you now"),
    FOURTEEN("Cannot predict now"),
    FIVETEEN("Concentrate and ask again"),
    SIXTEEN("Don't count on it"),
    SEVENTEEN("My reply is no"),
    EIGHTEEN("My sources say no"),
    NINETEEN("Outlook not so good"),
    TWENTY("Very doubtful");
    private final String message;

    private Answers(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

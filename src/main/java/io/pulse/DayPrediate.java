package src.main.java.io.pulse;

public class DayPrediate {

    private DayPrediate() {

    }

    public static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}

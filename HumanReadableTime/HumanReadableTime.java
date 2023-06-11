public class HumanReadableTime {
    //https://www.codewars.com/kata/52685f7382004e774f0001f7/
    public String makeReadable(int seconds) {
        String format = new String("00:00:00");
        if (seconds == 0) {
            return format;
        }
        int hours = 0, mins = 0;
        while (seconds >= 60) {
            if (seconds >= 3600) {
                hours += 1;
                seconds -= 3600;
            } else {
                mins += 1;
                seconds -= 60;
            }
        }
        format = String.format("%02d:%02d:%02d", hours, mins, seconds);
        return format;
    }
}
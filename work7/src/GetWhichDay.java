public class GetWhichDay {
    public static int whichDay(int year, int month, int day) {
        if (month == 1) {
            return day;
        } else if (month == 2) {
            return (day + 31);
        }
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        days[(month - 1)] = day;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) days[1] = 29;
        int i = 0, sums = 0;
        while (i < month) {
            sums = sums + days[i];
            i++;
        }
        return sums;
    }
}

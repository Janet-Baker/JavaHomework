public class Main {
    public static void main(String[] args) {
        Integer[] dateGiven = GetInputAsInteger.inputAsArray();
        int year = dateGiven[0];
        int month = dateGiven[1];
        int day = dateGiven[2];
        System.out.println(GetWhichDay.whichDay(year, month, day));
    }
}
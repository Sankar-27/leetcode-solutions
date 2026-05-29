// Last updated: 29/05/2026, 11:54:45
class Solution {
    public int dayOfYear(String date) {
        int months[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String days[] = date.split("-");

        if (isLeapYear(Integer.parseInt(days[0]))) {
            months[1]++;
        }

        int day = 0;
        for (int i = 0; i < Integer.parseInt(days[1]) - 1; i++) {
            day += months[i];
        }
        day += Integer.parseInt(days[2]);
        return day;
    }

    private boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
public class leapyear {

    // Validating Leap Years
    // Difficulty: Easy
    // Topics: Basic Programming, Date Handling
    // Description: Write a program to check if a given year is a leap year.
    // Example:
    // Input: year = 2020
    // Output: Leap Year
    // Explanation: 2020 is divisible by 4 but not by 100, or it is divisible by
    // 400, so it is a leap year.
    public static void isLeapYear(int year) {

        boolean is_leap_year = false;

        if (year % 4 == 0) {
            is_leap_year = true;

            if (year % 100 == 0) {

                if (year % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        } else

            is_leap_year = false;

        if (!is_leap_year)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");
    }

    public static void main(String[] args) {
        isLeapYear(2000);
    }
}

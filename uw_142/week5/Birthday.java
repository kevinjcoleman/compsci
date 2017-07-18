import java.util.*;

public class Birthday {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    intro();
    int currentDayOfYear = dayMonthInput(console, "Please enter today's date:");
    int birthdayDayOfYear = dayMonthInput(console, "Please enter your birthday:");
    birthdayMessage(currentDayOfYear, birthdayDayOfYear);
    System.out.print("August 16th was the day that Sports Illustrated was published for the first time.");
  }

  public static void intro() {
    System.out.println("This program tells you how many days");
    System.out.println("it will be until your next birthday.");
    System.out.println();
  }

  public static void birthdayMessage(int currentDay, int birthdayDay) {
    if (currentDay == birthdayDay) {
      System.out.println("Happy birthday!");
    } else if ( birthdayDay - currentDay == 1 ) {
      System.out.println("Wow, your birthday is tomorrow!");
    } else {
      System.out.println("Your next birthday is in " + daysUntilBirthday(currentDay, birthdayDay) + " days.");
    }
    System.out.println();
  }

  public static int daysUntilBirthday(int currentDay, int birthdayDay) {
    // If the birthday is this year subtract currentDay from birthday.
    if (currentDay < birthdayDay) {
      return birthdayDay - currentDay;
    } else { // otherwise find out how many days are left this year and add it to the days in a year until bday.
      return (365 - currentDay) + birthdayDay;
    }
  }

  public static int dayMonthInput(Scanner console, String greeting) {
    //Print greeting and then grab month/day.
    System.out.println(greeting);
    int month = getUserIntInput(console, "What is the month (1-12)? ");
    int day = getUserIntInput(console,   "What is the day   (1-31)? ");
    // get day of year. If month is 1 daysInPreviousMonths returns 0 so this works.
    int dayOfYear = day + daysInPreviousMonths(month);
    System.out.println(month + "/" + day + " is day #" + dayOfYear + " of 365.");
    System.out.println();
    return dayOfYear;
  }

  public static int getUserIntInput(Scanner console, String prompt) {
    // Pass in a string as a prompt and return an int.
    System.out.print(prompt);
    return console.nextInt();
  }

  public static int daysInPreviousMonths(int month) {
    // Count the days in the previous months, if month == 1 return 0.
    int totalDays = 0;
    for (int i=1; i < month; i++) {
      totalDays += daysOfMonth(i);
    }
    return totalDays;
  }

  public static int daysOfMonth(int month) {
    // Months less than 8 that are even are 30 days except 2
    // Months that are even from 8 onward are 31.
    if (month < 8) {
      if (month % 2 == 0) {
        if (month == 2) {
          return 28;
        } else {
          return 30;
        }
      } else {
        return 31;
      }
    } else if (month % 2 == 0) {
      return 31;
    } else {
      return 30;
    }
  }
}

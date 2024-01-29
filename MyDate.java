import java.util.Calendar;
import java.util.GregorianCalendar;

import sun.net.www.content.text.plain;

public class MyDate {
    private int year;
    private int month;
    private int day;

    // no-arg constructor for current date
    public MyDate() {
        setDate(System.currentTimeMillis());
    }

  // Constructior with specified elapsed time
    public MyDate(long elapsedTime) {
      setDate(elapsedTime);
    }

  // constructor with specified year, month, day
    public MyDate(int year, int month, int day) {
      this.year = year;
      this.month = month;
      this.day = day;
    }

  // getter methods
    public int getYear() {
      return year;
    }

    public int getMonth() {
      return month;
    }
    public int getDay() {
      return day;
    }

  // method to set new date using elapsed time
    public void setDate(long elapsedTime) {
      Calendar calendar = new GregorianCalendar();
      calendar.setTimeInMillis(elapsedTime);

      this.year = calendar.get(Calendar.YEAR);
      this.month = calendar.get(Calendar.MONTH);
      this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }
  public static void main(String[] args) {
    MyDate date1 = new MyDate();
    MyDate date2 = new MyDate(1234567898765L);

    System.out.println("Date 1: " + date1.getYear() + "-" + (date1.getMonth() + 1) + "-" + date1.getDay());
    System.out.println("Date 2: " + date2.getYear() + "-" + (date2.getMonth() + 1) + "-" + date2.getDay());
  }
}

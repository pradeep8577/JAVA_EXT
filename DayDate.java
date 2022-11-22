class DayDate {

  public static void main(String[] args) {
    int d = Integer.parseInt(args[0]);
    int m = Integer.parseInt(args[1]);
    int y = Integer.parseInt(args[2]);
    String[] days = {
      "Sunday",
      "Monday",
      "Tuesday",
      "Wednesday",
      "Thursday",
      "Friday",
      "Saturday",
    };
    int[] mon = { 11, 12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    if (m <= 2) {
      y--;
    }
    int D = y % 100;
    int C = y / 100;
    int f = Math.abs(
      d + (((13 * mon[m - 1]) - 1) / 5) + D + (C / 4) + (D / 4) - (2 * C)
    );
    int k = f % 7;
    System.out.println(days[k]);
  }
}

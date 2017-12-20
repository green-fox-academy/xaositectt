// An average Green Fox attendee codes 6 hours daily
// The semester is 17 weeks long
// Print how many hours is spent with coding in a semester by an attendee,
// if the attendee only codes on workdays.
// Print the percentage of the coding hours in the semester if the average
// work hours weekly is 52
public class CodingHours {
  public static void main(String[] args) {
    int codeHours = 17*5*6;
    int workHours = 17*52;
    double ratio = (double) codeHours / workHours;
    System.out.println("Coding hours are: " + codeHours);
    System.out.println("Coding hours percentage is: " + ratio*100 + " %");
  }
}

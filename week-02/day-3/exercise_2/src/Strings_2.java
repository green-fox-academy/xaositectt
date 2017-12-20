public class Strings_2 {

  public static void main(String[] args) {

    String url = "https//www.reddit.com/r/nevertellmethebots";

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crutial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!
    //url = url.replace("bots", "odds");
    //url = url.replace("https", "https:");

    String url1 = "https:";
    String url2 = "odds";

    url = url.substring(5, 38);

    url = url1.concat(url);
    url = url.concat(url2);

    System.out.println(url);
  }
}

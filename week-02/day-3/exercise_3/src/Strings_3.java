public class Strings_3 {
    public static void main(String[] args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        //String quote1 =quote.substring(0, 21);
        //String quote2 =quote.substring(21, quote.length());
        //String quoteMid ="always takes longer than";

        //quote= quote1 + " " + quoteMid + " " +quote2;

        String quote1 =quote.substring(0, 21);
        String quote2 =quote.substring(21, quote.length());
        String quoteMid ="always takes longer than";


        quote = new StringBuilder(quote1 +" "+ quoteMid + " " + quote2).toString();

        System.out.println(quote);
    }


}

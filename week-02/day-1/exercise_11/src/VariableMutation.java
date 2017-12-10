
import java.util.Collections;

public class VariableMutation {
  public static void main(String[] args) {
    int a = 3;
    // make it bigger by 10
    a += 10;
    System.out.println(a);
    int b = 100;
    // make it smaller by 7
    b -= 7;
    System.out.println(b);
    int c = 44;
    // please double c's value
    c *= 2;
    System.out.println(c);
    int d = 125;
    // please divide by 5 d's value
    d /= 5;
    System.out.println(d);
    int e = 8;
    // please cube of e's value
    e = e * e * e;
    System.out.println(e);
    int f1 = 123;
    int f2 = 345;
    boolean isitf = f1 > f2;
    // tell if f1 is bigger than f2 (print as a boolean)
    System.out.println(isitf);
    int g1 = 350;
    int g2 = 200;
    boolean isitg = g2 > g1;
    // tell if the double of g2 is bigger than g1 (print as a boolean)
    System.out.println(isitg);
    int h = 135798745;
    boolean isith = (h % 11 == 0);
    // tell if it has 11 as a divisor (print as a boolean)
    System.out.println(isith);
    int i1 = 10;
    int i2 = 3;
    boolean isiti = ((i1 > i2 * i2) && (i1 < i2 * i2 * i2));
    // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
    System.out.println(isiti);
    int j = 1521;
    boolean isitj = ((j % 3 == 0) || (j % 5 == 0));
    // tell if j is dividable by 3 or 5 (print as a boolean)
    System.out.println(isitj);
    String k = "Apple";
    k = String.join("", Collections.nCopies(4, k));
    //fill the k variable with its cotnent 4 times
    System.out.println(k);
  }
}

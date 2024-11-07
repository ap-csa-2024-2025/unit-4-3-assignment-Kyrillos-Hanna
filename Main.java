import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    all25Nums();
    allNums17to73();
  }

  public static void all25Nums() {
    for (int i = 1; i <= 25; i++) {
      if (i % 2 == 1) {
        System.out.println(i);
      }
    }
  }

  public static void allNums17to73() {
    for (int i = 17; i <= 73; i++) {
      System.out.print(i + " ");
      if (i % 10 == 6) {
        System.out.println(" ");
      }
    }
  }
}

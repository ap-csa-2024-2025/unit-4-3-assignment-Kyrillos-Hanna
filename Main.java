import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    all25Nums();
    allNums17to73();

    System.out.println("\nEnter a number: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    input0and50(num);

    System.out.println("\nEnter another number: ");
    int num2 = sc.nextInt();
    inputGreater0(num2);
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

  public static void input0and50(int num) {
    if (num < 0 || num > 50){
      System.out.println("error");
    } else {
      for (int i = num; i <= 50; i++) {
        if (i % 5 == (num % 10 + 4) || i % 5 == (num % 10 - 1)) {
          System.out.println(i);
        } else {
          System.out.print(i + " ");
        }
      }
    }
  }

  public static void inputGreater0(int num) {
    if (num < 0) {
      System.out.println("error");
    } else {
      num = num - (num % 3);
      for (int i = num; i >= 0; i-=3) {
        System.out.print(i + " ");
      }
    }
  }
}

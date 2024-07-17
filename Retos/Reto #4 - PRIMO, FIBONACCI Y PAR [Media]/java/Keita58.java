import java.util.Scanner;

public class Keita58 {

  public static boolean fibonacci(int n) {
    int fib1 = 0;
    int fib2 = 1;
    do {
      int saveFib1 = fib1;
      fib1 = fib2;
      fib2 = saveFib1 + fib2;
    }
    while (fib2 < n);

    if (fib2 == n)
      return true;
    else
      return false;
  }
  
  public static void main(String[] args) {
    Scanner ohowo = new Scanner(System.in);

    System.out.println("Escriu el número que vols comprovar: ");
    int num = ohowo.nextInt();

    boolean parell, primer, fibonacci;
    parell = fibonacci = false;
    primer = true;

    if(num %2 == 0)
      parell = true;
    
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        primer = false;
        break;
      }
    }

    fibonacci = fibonacci(num);

    System.out.print(num + " ");
    if(parell)
      System.out.print("és parell, ");
    else
      System.out.print("és imparell, ");

    if(fibonacci)
      System.out.print("és fibonacci i ");
    else
      System.out.print("no és fibonacci i ");
    
    if(primer) 
      System.out.println("és primer.");
    else
      System.out.println("no és primer.");
  }
}

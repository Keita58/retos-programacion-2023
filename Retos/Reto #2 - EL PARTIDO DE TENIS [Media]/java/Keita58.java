import java.util.Scanner;

public class Keita58 {

  public static void main(String[] args) {
    Scanner ohowo = new Scanner(System.in);
    int p1 = 0;
    int p2 = 0;
    boolean end = false;
    
    while(!end) {
      System.out.println("Entra els punts dels jugadors.");
      String punt = ohowo.nextLine().toLowerCase();

      if(punt.equals("p1")) {
        p1++;
      }
      else if(punt.equals("p2")){
        p2++;
      }

      switch(p1) {
        case 0:
          System.out.print("Love - ");
          break;
        case 1: 
          System.out.print("15 - ");
          break;
        case 2:
          System.out.print("30 - ");
          break;
        case 3:
          if(p2 < 3)
            System.out.print("40 - ");
          else
            System.out.println("Deuce");
          break;
        default:
          if(p1 == p2)
            System.out.println("Deuce");
          else if(p1 - 1 == p2)
            System.out.println("Avantatge P1");
          else if(p1 - 1 > p2) {
            System.out.println("Ha guanyat P1");
            end = true;
          }
          break;
      }

      if(!end) {
        switch(p2) {
          case 0:
            System.out.println("Love");
            break;
          case 1: 
            System.out.println("15");
            break;
          case 2:
            System.out.println("30");
            break;
          case 3:
            if(p1 < 3)
              System.out.println("40");
            break;
          default:
            if(p2 - 1 == p1)
              System.out.println("Avantatge P2");
            else if (p2 - 1 > p1) {
              System.out.println("Ha guanyat P2");
              end = true;
            }
            break;
        }
      }
    }
  }
}

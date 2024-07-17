import java.util.Random;
import java.util.Scanner;

public class Keita58 {

  public static void main(String[] args) {
    Scanner ohowo = new Scanner(System.in);
    int longitud = 0;
    boolean maj, num, sim;
    maj = num = sim = false;
    Random rand = new Random();

    System.out.println("Escriu la dimensió de la teva contrasenya (8-16): ");
    longitud = ohowo.nextInt();
    ohowo.nextLine();
    int[] lletres = new int[longitud];

    System.out.println("Vols que la contrasenya tingui majúscules? (s/n)");
    if(ohowo.nextLine().toLowerCase().equals("s"))
      maj = true;

    System.out.println("Vols que la contrasenya tingui números? (s/n)");
    if(ohowo.nextLine().toLowerCase().equals("s"))
      num = true;

    System.out.println("Vols que la contrasenya tingui símbols? (s/n)");
    if(ohowo.nextLine().toLowerCase().equals("s"))
      sim = true;

    if(maj && !num && !sim) {
      
      for(int i = 0; i < longitud; i++) {
        if(rand.nextInt(2) == 1)
          lletres[i] = rand.nextInt(65, 91);
        else
          lletres[i] = rand.nextInt(97, 123);
      }
    }
    else if(maj && num && !sim) {
      
      for(int i = 0; i < longitud; i++) {
        switch(rand.nextInt(3)) {
          case 0:
            lletres[i] = rand.nextInt(65, 91);
            break;
          case 1:
            lletres[i] = rand.nextInt(97, 123);
            break;
          case 2:
            lletres[i] = rand.nextInt(48, 58);
            break;
        }
      }
    }
    else if(maj && num && sim) {
      
      for(int i = 0; i < longitud; i++) {
        switch(rand.nextInt(4)) {
          case 0:
            lletres[i] = rand.nextInt(65, 91);
            break;
          case 1:
            lletres[i] = rand.nextInt(97, 123);
            break;
          case 2:
            lletres[i] = rand.nextInt(48, 58);
            break;
          case 3:
            lletres[i] = rand.nextInt(33, 48);
            break;
        }
      }
    }
    else if(!maj && num && sim) {
      
      for(int i = 0; i < longitud; i++) {
        switch(rand.nextInt(3)) {
          case 0:
            lletres[i] = rand.nextInt(97, 123);
            break;
          case 1:
            lletres[i] = rand.nextInt(48, 58);
            break;
          case 2:
            lletres[i] = rand.nextInt(33, 48);
            break;
        }
      }
    }
    else if(maj && !num && sim) {
      
      for(int i = 0; i < longitud; i++) {
        switch(rand.nextInt(3)) {
          case 0:
            lletres[i] = rand.nextInt(65, 91);
            break;
          case 1:
            lletres[i] = rand.nextInt(97, 123);
            break;
          case 2:
            lletres[i] = rand.nextInt(33, 48);
            break;
        }
      }
    }
    else if(!maj && !num && sim) {
      
      for(int i = 0; i < longitud; i++) {
        switch(rand.nextInt(2)) {
          case 0:
            lletres[i] = rand.nextInt(97, 123);
            break;
          case 1:
            lletres[i] = rand.nextInt(33, 48);
            break;
        }
      }
    }
    else if(!maj && num && !sim) {
      
      for(int i = 0; i < longitud; i++) {
        switch(rand.nextInt(2)) {
          case 0:
            lletres[i] = rand.nextInt(97, 123);
            break;
          case 1:
            lletres[i] = rand.nextInt(48, 58);
            break;
        }
      }
    }
    else {
      
      for(int i = 0; i < longitud; i++) {
        lletres[i] = rand.nextInt(97, 123);
      }
    }

    System.out.print("La teva contrasenya és: ");
    for(int i = 0; i < longitud; i++) {
      System.out.print((char) lletres[i]);
    }
    System.out.println();
  }
}

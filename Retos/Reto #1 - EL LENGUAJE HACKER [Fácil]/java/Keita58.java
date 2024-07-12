import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Keita58 {

  public static void main(String[] args) {
    Map<String, String> diccionari = new HashMap<String, String>();

    diccionari.put("a", "4");
    diccionari.put("b", "I3");
    diccionari.put("c", "[");
    diccionari.put("d", ")");
    diccionari.put("e", "3");
    diccionari.put("f", "|=");
    diccionari.put("g", "&");
    diccionari.put("h", "#");
    diccionari.put("i", "1");
    diccionari.put("j", ",_|");
    diccionari.put("k", ">|");
    diccionari.put("l", "£");
    diccionari.put("m", "/\\/\\");
    diccionari.put("n", "^/");
    diccionari.put("o", "0");
    diccionari.put("p", "|*");
    diccionari.put("q", "(_,)");
    diccionari.put("r", "I2");
    diccionari.put("s", "5");
    diccionari.put("t", "7");
    diccionari.put("u", "(_)");
    diccionari.put("v", "\\/");
    diccionari.put("w", "\\/\\/");
    diccionari.put("x", "><");
    diccionari.put("y", "j");
    diccionari.put("z", "2");
    
    Scanner ohowo = new Scanner(System.in);
    String paraula = ohowo.nextLine().toLowerCase();

    String[] paraulaFragmentada = paraula.split("");
    ArrayList<String> text = new ArrayList<String>();
    boolean trobat = false;

    for (String lletra : paraulaFragmentada) {
      for (Map.Entry<String, String> lletraDic : diccionari.entrySet()) {
        if(lletra.equals(lletraDic.getKey())) {
          text.add(lletraDic.getValue());
          trobat = true;
          break;
        }
      }
      if(!trobat) {
        text.add(lletra);
      }
      trobat = false;
    }

    for (String lletra : text) {
      System.out.print(lletra);
    }
    System.out.println();
  }
}

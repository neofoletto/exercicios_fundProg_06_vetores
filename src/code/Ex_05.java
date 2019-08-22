/*******************************************************************************
 *                     GNU GENERAL PUBLIC LICENSE
 *                        Version 3, 29 June 2007
 *
 *  Copyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>
 *  Everyone is permitted to copy and distribute verbatim copies
 *  of this license document, but changing it is not allowed.
 *
 *                             Preamble
 *
 *   The GNU General Public License is a free, copyleft license for
 * software and other kinds of works.
 ******************************************************************************/

package code;

import java.util.Scanner;

/**
 * @author neo
 * @create 21/08/2019
 */
public class Ex_05 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final int TAM      = 10;
    final char[] VOGAL = {'a', 'e', 'i', 'o', 'u'};

    char[] letra  = new char[TAM];
    boolean vogal = false;
    int cont      = 0;

    System.out.println("\nConsoantes");
    for (int i = 0; i < TAM; i++) {
      System.out.print("Informe letra: ");
      letra[i] = imput.next().toLowerCase().charAt(0);
    }

    System.out.println("\nResultado");
    for (char a : letra) {
      for (char b : VOGAL)
        if (a == b) {
          vogal = !vogal;
          break;
        }
      if (!vogal) {
        System.out.printf("%s ", a);
        cont++;
      } else
        vogal = false;
    }
    System.out.printf("\nConsoantes: %d", cont);
  }
}

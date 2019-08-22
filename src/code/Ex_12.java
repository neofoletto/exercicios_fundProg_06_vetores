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
public class Ex_12 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    String[] palavra;
    String text = "";

    System.out.println("\nSeparando palavras por ;");
    System.out.print("Informe texto: ");
    text = imput.nextLine();

    palavra = text.split(";");

    System.out.println("\nResultado");
    System.out.printf("Palavras: \n");
    for (String s : palavra)
      System.out.printf("\n%s ", s);
  }
}

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
public class Ex_10 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    char[] caracter;
    String texto;

    System.out.println("\nTexto convertido");
    System.out.print("Informe texto: ");
    texto = imput.nextLine();

    caracter = new char[texto.length()];

    for (int i = 0; i < caracter.length; i++)
      caracter[i] = texto.charAt(i);

    System.out.println("\nResultado");
    System.out.printf("Texto : ", texto);
    System.out.print("\n\nTexto convertido em caracteres: \n");
    for (char a : caracter)
      System.out.printf("%s ", a);
  }
}

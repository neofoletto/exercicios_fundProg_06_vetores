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
public class Ex_11 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    String[] data;
    String text = "";

    System.out.println("\nConvertendo DATA (dd/mm/aaaa)");
    System.out.print("Informe data (dd/mm/aaaa): ");
    text = imput.nextLine();

    data = text.split("/");

    System.out.println("\nResultado");
    System.out.printf("Dia: %s", data[0]);
    System.out.printf("\nMês: %s", data[1]);
    System.out.printf("\nAno: %s", data[2]);
  }
}

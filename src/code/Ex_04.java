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
public class Ex_04 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final int TAM = 4;

    float[] nota = new float[TAM];
    float media  = 0;

    System.out.println("\nMédia de notas");
    for (int i = 0; i < TAM; i++) {
      System.out.printf("Informe nota %d: ", (i + 1));
      nota[i] = imput.nextFloat();
      media += nota[i];
    }

    media /= TAM;

    System.out.println("\nResultado");
    System.out.print("Notas: \n");
    for (float n : nota)
      System.out.printf("%.1f  ", n);
    System.out.printf("\nMédia: %.1f", media);
  }
}

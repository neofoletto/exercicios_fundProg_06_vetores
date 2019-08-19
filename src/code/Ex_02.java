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
 * @create 18/08/2019
 */
public class Ex_02 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final int TAM = 10;

    double[] vet = new double[TAM];

    System.out.println("\nVetor de reais invertidos");
    for (int i = 0; i < TAM; i++) {
      System.out.print("Informe número: ");
      vet[i] = imput.nextDouble();
    }

    for (int i = TAM - 1; i >= 0; i--)
      System.out.printf("%.1f ", vet[i]);
  }
}

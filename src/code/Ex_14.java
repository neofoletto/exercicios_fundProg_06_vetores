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
public class Ex_14 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final int TAM = 5;

    double[] vet1 = new double[TAM];
    double[] vet2 = new double[TAM];
    double[] vet3 = new double[TAM * 2];

    System.out.println("\nIntercalando vetores");
    System.out.println("Vetor 01");
    for (int i = 0; i < TAM; i++) {
      System.out.print("Informe valores:");
      vet1[i] = imput.nextDouble();
    }
    System.out.println("Vetor 02");
    for (int i = 0; i < TAM; i++) {
      System.out.print("Informe valores:");
      vet2[i] = imput.nextDouble();
    }

    for (int i = 0; i < vet3.length; i++) {
      if (i % 2 == 0)
        vet3[i] = vet1[i / 2];
      else
        vet3[i] = vet1[i/ 3];
    }

    System.out.println("\nResultado");
    System.out.print("Vetor 01: ");
    for (double d : vet1)
      System.out.printf("%.2f ", d);
    System.out.print("\nVetor 02: ");
    for (double d : vet2)
      System.out.printf("%.2f ", d);
    System.out.print("\nVetor intercalado: ");
    for (double d : vet3)
      System.out.printf("%.2f ", d);
  }
}

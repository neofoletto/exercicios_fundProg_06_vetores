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
public class Ex_07 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final int TAM  = 2;
    final int NOTA = 4;

    float[] media = new float[TAM];
    int cont      = 0;

    System.out.println("\nMédia dos alunos");
    for (int i = 0; i < TAM; i++) {
      System.out.printf("\nAluno %d\n", (i + 1));
      for (int j = 0; j < NOTA; j++) {
        System.out.printf("Informe nota %d: ", (j + 1));
        media[i] += imput.nextFloat();
      }
      media[i] /= NOTA;
    }

    System.out.println("\nResultado");
    System.out.print("Médias: ");
    for (float m : media) {
      System.out.printf("%.1f ", m);
      if (m >= 7)
        cont++;
    }
    System.out.printf("\nAlunos acima da média; %d", cont);
  }
}

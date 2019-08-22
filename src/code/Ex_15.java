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
public class Ex_15 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final int TAM = 3;

    float[] altura = new float[TAM];
    int[] idade    = new int[TAM];
    float media    = 0;
    int cont       = 0;

    System.out.println("\nAltura média");
    for (int i = 0; i < TAM; i++) {
      System.out.print("Informe idade: ");
      idade[i] = (int)imput.nextDouble();
      System.out.print("Informe altura: ");
      altura[i] = (float)imput.nextDouble();
      media += altura[i];
    }
    media /= TAM;

    for (int i = 0; i < TAM; i++)
      if (idade[i] >= 13 && altura[i] <= media)
        cont++;

    System.out.println("\nResultado");
    System.out.printf("Alunos com 13 anos abaixo da média de altura da turma %d", cont);

  }
}

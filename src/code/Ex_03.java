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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author neo
 * @create 18/08/2019
 */
public class Ex_03 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int acimaMedia  = 0;
    int abaixoMedia = 0;
    int numero   = 0;
    int par      = 0;
    int impar    = 0;
    int soma     = 0;
    int menor    = 0;
    int maior    = 0;
    double media = 0;

    System.out.print("\nInforme número inteiro: ");
    numero = (int)imput.nextDouble();
    for (int i = 0; i <= numero; i++) {
      if (i % 2 == 0)
        par++;
      else
        impar++;

      soma += i;
      menor = 0;
      maior = numero;
    }
    media = soma / numero;

    for (int i = 0; i <= numero; i++) {
      if (i < media)
        acimaMedia++;
      else
        abaixoMedia++;
    }

    System.out.print("\nResultado\n");
    System.out.printf("Soma: %d", soma);
    System.out.printf("\nSoma: %.02f", media);
    System.out.printf("\nMaior: %d", maior);
    System.out.printf("\nMenor: %d", menor);
    System.out.printf("\nPar: %d", par);
    System.out.printf("\nÍmpar: %d", impar);
    System.out.printf("\nAcima da média: %d", acimaMedia);
    System.out.printf("\nAbaixo da média: %d", abaixoMedia);
  }
}

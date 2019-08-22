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
 * @create 21/08/2019
 */
public class Ex_06 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final int TAM = 20;

    List<Integer> numero = new ArrayList<>();
    List<Integer> par    = new ArrayList<>();
    List<Integer> impar  = new ArrayList<>();

    System.out.println("\nNúmeros pares e ímpares");
    while (numero.size() < TAM) {
      System.out.printf("Informe número inteiro: ");
      numero.add((int)imput.nextDouble());
    }

    for (int n : numero) {
      if (n % 2 == 0)
        par.add(n);
      else
        impar.add(n);
    }

    System.out.println("\nResutlados");
    System.out.print("Números: ");
    for (int n : numero)
      System.out.printf("%d ", n);
    System.out.print("\nPares: ");
    for (int n : par)
      System.out.printf("%d ", n);
    System.out.print("\nÍmpares: ");
    for (int n : impar)
      System.out.printf("%d ", n);
  }
}

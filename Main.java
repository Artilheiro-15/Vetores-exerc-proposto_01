import java.util.Locale;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    // FAÇA UM PROGRAMA QUE LEIA UM NUMERO INTEIRO N (MAXIMO = 10)
    // E DEPOIS N NUMEROS INTEIROS E ARMAZENE-OS EM UM VETOR. EM SEGUIDA
    // MOSTRE NA TELA OS DADOS E OS NUMEROS NEGATIVOS LIDOS.

    System.out.print("Quantos Numeros Voce Vai Digitar? ");
    int N = sc.nextInt();

    int[] vect = new int[N];

    for (int i = 0; i < N; i++) {
      System.out.print("Digite Um Numero: ");
      vect[i] = sc.nextInt();
    }
    System.out.println("NUMEROS NEGATIVOS");
    for (int i = 0; i < N; i++) {
      if (vect[i] < 0) {
        System.out.println(vect[i]);
      }
    }

    sc.close();
  }
}
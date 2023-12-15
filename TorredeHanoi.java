import java.util.Scanner;

public class TorredeHanoi {
    private int movimentos = 0;

    public void hanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mova o disco 1 de " + origem + " para " + destino);
            movimentos++;
            return;
        }

        hanoi(n - 1, origem, auxiliar, destino);
        System.out.println("Mova o disco " + n + " de " + origem + " para " + destino);
        movimentos++;
        hanoi(n - 1, auxiliar, destino, origem);
    }

    public int getMovimentos() {
        return movimentos;
    }

    public static void main(String[] args) {
        TorreHanoi torreHanoi = new TorreHanoi();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de discos: ");
        int numeroDiscos = scanner.nextInt();

        torreHanoi.hanoi(numeroDiscos, 'A', 'C', 'B');

        System.out.println("\nQuantidade total de movimentos: " + torreHanoi.getMovimentos());
    }
}

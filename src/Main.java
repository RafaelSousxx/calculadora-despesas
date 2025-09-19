import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Despesas> despesas = new ArrayList<>();

        System.out.println("Digite o seu salário R$: ");
        double salario = sc.nextDouble();
        sc.nextLine();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite o nome da despesa ");
            String nome = sc.nextLine();

            System.out.println("Digite a categoria da despesa");
            String categoria = sc.nextLine();

            System.out.println("Digite o valor da despesa R$:");
            double valor = sc.nextDouble();
            sc.nextLine();

            despesas.add(new Despesas(nome, categoria, valor));

            System.out.println("Deseja adcionar outra valor? (s/n)");
            String resposta = sc.nextLine();

            if(resposta.equals("n")) {
                continuar = false;
            }
        }

            //Calcular total

            double total = 0;
            System.out.println("\n -- Lista de despesas --");
            for (Despesas d : despesas){
                System.out.println(d);
                total += d.getValor();

            }
            double saldo = salario - total;

        System.out.println("\nTotal de despesas: R$" + String.format("%.2f", total));
        System.out.println("Salário: R$" + String.format("%.2f", salario));
        System.out.println("Saldo restante: R$" + String.format("%.2f", saldo));

        sc.close();



    }
}
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Ver tarefas");
            System.out.println("3. Sair");
            System.out.println("Digite sua escolha:");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Digite a tarefa:");
                    String task = sc.nextLine();
                    tasks.add(task);
                    break;
                case 2:
                    if (tasks.size() == 0) {
                        System.out.println("Não há tarefas para mostrar.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Escolha inválida, tente novamente.");
                    break;
            }
        }
    }
}

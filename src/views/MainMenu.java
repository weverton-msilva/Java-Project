package src.views;

import java.util.Arrays;
import java.util.Scanner;

public class MainMenu {
    public static int showMenu(Scanner scanner) {
        for (String s : Arrays.asList("\n--- Programa de Registros de Contas", "1. Criar Nova Conta", "2. Buscar Conta Existente", "3.Excluir Conta", "4. Sair do Porgrama")) {
            System.out.println(s);
        }

        System.out.print("Opção Selecionada: ");
        return scanner.nextInt();
    }
}

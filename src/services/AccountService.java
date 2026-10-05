package src.services;

import java.util.Scanner;

public class AccountService {
    public static void registerAccount(Scanner scanner) {
        System.out.print("Nome Completo: ");
        String name = scanner.nextLine();

        System.out.print("E-mail Válido: ");
        String email = scanner.nextLine();

        System.out.print("Senha: ");
        String password = scanner.nextLine();
    }
}

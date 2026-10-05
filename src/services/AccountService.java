package src.services;

import src.models.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountService {
    public static Account registerAccount(Scanner scanner) {
        while (true) {
            System.out.print("Nome Completo: ");
            String name = scanner.nextLine().toUpperCase().trim();

            System.out.print("E-mail Válido: ");
            String email = scanner.nextLine().toLowerCase().trim();

            System.out.print("Senha: ");
            String password = scanner.nextLine();

            if (name.trim().length() < 3 || name.trim().length() > 254) {
                System.out.println("Nome não está dentro dos padrões, tente novamente.");
                continue;
            }

            if (email.length() < 5 || !email.contains("@") || !email.substring(email.indexOf("@")).contains(".")) {
                System.out.println("E-mail inválido, tente novamente.");
                continue;
            }

            if (password.trim().length() < 8 || password.trim().length() > 32) {
                System.out.println("Senha não está dentro dos padrões, tente novamente.");
                continue;
            }

            System.out.println("Usuário " + name + " cadastrado!");
            return new Account(name, email, password);
        }
    }

    public static void listerAccounts(ArrayList<Account> accounts) {
        System.out.println("\n--- Contas registradas no programa ---");

        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}

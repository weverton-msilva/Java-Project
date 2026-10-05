package src;

import src.models.Account;
import src.services.AccountService;
import src.views.MainMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        Account account;
        Scanner scanner = new Scanner(System.in);

        // Loop para executação do programa principal
        boolean codeRunned = true;
        while (codeRunned) {
            int choice = MainMenu.showMenu(scanner);

            switch (choice) {
                case 1 -> {
                    account = AccountService.registerAccount(scanner);
                    accounts.add(account);
                }

                case 2 -> AccountService.listerAccounts(accounts);

                case 4 -> {
                    System.out.println("Saíndo do programa.");
                    codeRunned = false;
                }
                default -> System.out.println("Opção inválida, tente novamente!");
            }
        }
    }
}

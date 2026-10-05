package src;

import src.models.Account;
import src.services.AccountService;
import src.views.MainMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean codeRunned = true;

        while (codeRunned) {
            int choice = MainMenu.showMenu(scanner);

            switch (choice) {
                case 1 -> AccountService.registerAccount(scanner);

                case 4 -> {
                    System.out.println("Saíndo do programa.");
                    codeRunned = false;
                }
                default -> System.out.println("Opção inválida, tente novamente!");
            }
        }
    }
}

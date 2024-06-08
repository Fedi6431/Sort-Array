import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Scrivi l'username
        System.out.print("Type your username: ");
        String Username = scanner.nextLine();

        //Aggiunge i numeri e verifica che non ne vengano scritti uguali
        int[] Numbers = new int[10];
        int count = 0;

        while (count < 10) {
            int Casual_Number = random.nextInt(1,11);
            if (!Contain_Number(Numbers, count, Casual_Number)) {
                Numbers[count] = Casual_Number;
                count++;
            }
        }

        //Stampa la lunghezza dell'array
        System.out.println("\nL'array è lungo " + Numbers.length + " caratteri");
        //Stampa l'array senza avere riordinato il contenuto
        System.out.printf("\n%d %d %d %d %d %d %d %d %d %d\ni caratteri stampati non sono riordinati\n", Numbers[0], Numbers[1], Numbers[2], Numbers[3], Numbers[4], Numbers[5], Numbers[6], Numbers[7], Numbers[8], Numbers[9]);

        //Chiede se l'utente vuole riordinarli
        System.out.println("\nVuoi riordinarli? Y/N\n");
        System.out.print("SortNumber@" + Username + "$ ");
        String User_input = scanner.nextLine();

        if (User_input.equalsIgnoreCase("y")) {
            Arrays.sort(Numbers);
            for (int number : Numbers) {
                System.out.print(number + " ");
            }

            System.out.println();
        } else {
            System.out.println();
        }


    }

    public static boolean Contain_Number(int[] array, int count, int number) {
        for (int i = 0; i < count; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}


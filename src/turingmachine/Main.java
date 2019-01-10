package turingmachine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n==============================\n"
                + "||     TURING MACHINE       ||\n"
                + "==============================\n"
                + "|| 1. Addition              ||\n"
                + "|| 2. Substraction          ||\n"
                + "|| 3. Multiplication        ||\n"
                + "|| 4. Division              ||\n"
                + "|| 5. Factorial             ||\n"
                + "|| 6. Exit                  ||\n"
                + "==============================");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1: {
                System.out.println("Masukkan angka (contoh 00100) : ");
                String inputan = input.next();
                TuringMachine TM = setTuringMachine.addition();
                TM.execute(inputan + "BBBBBBBBBB");
                break;
            }

            case 2: {
                System.out.println("Masukkan angka (contoh 00100) : ");
                String inputan = input.next();
                TuringMachine TM = setTuringMachine.subtraction();
                TM.execute(inputan + "BBBBBBBBBB");
                break;
            }

            case 3: {
                System.out.println("Masukkan angka (contoh 001001) : ");
                String inputan = input.next();
                TuringMachine TM = setTuringMachine.multi();
                TM.execute(inputan + "BBBBBBBBBB");
                break;
            }

            case 4: {
                System.out.println("Masukkan angka (contoh 00100) : ");
                String inputan = input.next();
                TuringMachine TM = setTuringMachine.div();
                TM.execute(inputan + "BBBBBBBBBB");
                break;
            }

            case 5: {
                System.out.println("Masukkan angka (contoh 00100) : ");
                String inputan = input.next();
                TuringMachine TM = setTuringMachine.factorial();
                TM.execute(inputan + "BBBBBBBBBB");
                break;
            }

            default: {
                System.out.print("===== Program Selesai =====");
                System.exit(0);
                break;
            }
        }
    }
}

package turingmachine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TuringProccess TM1;
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
//                TM1 = setTuringMachine.addition();
//                boolean done = TM1.Run(inputan + "BBBBBBBBBB", false);
//                if (done == true) {
//                    System.out.println("The input was accepted.");
//                } else {
//                    System.out.println("The input was rejected.");
//                }
                TuringMachine TM = setTuringMachine.addition();
                TM.execute(inputan + "BBBBBBBBBB");
                break;
            }

            case 2: {
                System.out.println("Masukkan angka (contoh 00100) : ");
                String inputan = input.next();
                TM1 = setTuringMachine.subtraction();
                boolean done = TM1.Run(inputan + "BBBBBBBBBB", false);
                if (done == true) {
                    System.out.println("The input was accepted.");
                } else {
                    System.out.println("The input was rejected.");
                }
                break;
            }

            case 3: {
                System.out.println("Masukkan angka (contoh 001001) : ");
                String inputan = input.next();
                TM1 = setTuringMachine.multi();
                boolean done = TM1.Run(inputan + "BBBBBBBBBB", false);
                if (done == true) {
                    System.out.println("The input was accepted.");
                } else {
                    System.out.println("The input was rejected.");
                }
                break;
            }

            case 4: {
                System.out.println("Masukkan angka (contoh 00100) : ");
                String inputan = input.next();
                TM1 = setTuringMachine.div();
                boolean done = TM1.Run(inputan + "BBBBBBBBBB", false);
                if (done == true) {
                    System.out.println("The input was accepted.");
                } else {
                    System.out.println("The input was rejected.");
                }
                break;
            }

            case 5: {
                System.out.println("Masukkan angka (contoh 00100) : ");
                String inputan = input.next();
                TM1 = setTuringMachine.factorial();
                boolean done = TM1.Run(inputan + "BBBBBBBBBB", false);
                if (done == true) {
                    System.out.println("The input was accepted.");
                } else {
                    System.out.println("The input was rejected.");
                }
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

import java.util.Scanner;

public class Bokningssystem {

    public static void main(String[] args) {
        int[] platser = new int[20]; // Array för att hålla reda på bokade platser
        double vuxenPris = 299.90; // Pris för vuxna
        double barnPris = 149.90; // Pris för barn

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Välkommen till bokningssystemet!");
            System.out.println("1. Boka Plats");
            System.out.println("2. Se Lediga Platser");
            System.out.println("3. Se vinst");
            System.out.println("4. Avsluta Bokningssystemet");
            System.out.print("Välj ett alternativ: ");

            int val = scanner.nextInt();

            switch (val) {
                case 1:
                    bokaPlats(platser, scanner, vuxenPris, barnPris);
                    break;
                case 2:
                    seLedigaPlatser(platser);
                    break;
                case 3:
                    seVinst(platser, vuxenPris, barnPris);
                    break;
                case 4:
                    System.out.println("Tack för att du använt bokningssystemet!");
                    return;
                default:
                    System.out.println("Ogiltigt val. Försök igen.");
            }
        }
    }

    private static void bokaPlats(int[] platser, Scanner scanner, double vuxenPris, double barnPris) {
        System.out.println("Ange personnummer(ååååmmdd):");
        String personnummer = scanner.next();

        int år = Integer.parseInt(personnummer.substring(0, 4));
        int månad = Integer.parseInt(personnummer.substring(4, 6));
        int dag = Integer.parseInt(personnummer.substring(6, 8));

        double pris = (år < 2006) ? barnPris : vuxenPris;

        int platsIndex = hittaLedigPlats(platser);
        if (platsIndex != -1) {
            platser[platsIndex] = Integer.parseInt(personnummer);
            System.out.println("Plats bokad för person med personnummer " + personnummer + " på plats "
                    + (platsIndex + 1) + " för " + pris + " kr.");
        } else {
            System.out.println("Tyvärr finns det inga lediga platser.");
        }
    }

    private static void seLedigaPlatser(int[] platser) {
        int ledigaPlatser = 0;
        for (int plats : platser) {
            if (plats == 0) {
                ledigaPlatser++;
            }
        }
        System.out.println("Antal lediga platser: " + ledigaPlatser);
    }

    private static void seVinst(int[] platser, double vuxenPris, double barnPris) {
        int antalVuxna = 0;
        int antalBarn = 0;
        for (int plats : platser) {
            if (plats != 0) {
                String personnummer = String.valueOf(plats);
                int år = Integer.parseInt(personnummer.substring(0, 4));
                if (år < 2006) {
                    antalBarn++;
                } else {
                    antalVuxna++;
                }
            }
        }
        double vinstVuxna = antalVuxna * vuxenPris;
        double vinstBarn = antalBarn * barnPris;
        double totalVinst = vinstVuxna + vinstBarn;
        System.out.println("Vinsten av antalet sålda biljetter: " + totalVinst + " kr");
    }

    private static int hittaLedigPlats(int[] platser) {
        for (int i = 0; i < platser.length; i++) {
            if (platser[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
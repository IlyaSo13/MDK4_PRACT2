package MDK4_PRACT2;

import MDK4_PRACT2.Intefaces.Printable;

public class Main {
    public static void main(String[] args) {
        Book kolobok = new Book("Колобок");
        Magazine GQ = new Magazine("GQ");
        Book sherlock = new Book("Шерлок Холмс");
        Magazine Shounen = new Magazine("Shounen Jump");

        Printable[] printable;
        printable = new Printable[] {
                kolobok, GQ, sherlock, Shounen
        };

        for (Printable print : printable){
            print.print();
        }

        System.out.println();
        Magazine.printMagazines(printable);

        System.out.println();
        Book.printBooks(printable);
    }
}
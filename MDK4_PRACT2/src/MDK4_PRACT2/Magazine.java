package MDK4_PRACT2;

import MDK4_PRACT2.Intefaces.Printable;

public class Magazine implements Printable {

    String name;

    public Magazine(String name){
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println(name);
    }

    public static void printMagazines(Printable[] printable){
        System.out.println("Журналы: ");
        for (Printable print : printable){
            if (print instanceof Magazine){
                print.print();
            }
        }
    }

}
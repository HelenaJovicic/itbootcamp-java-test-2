package OOP;
/*
Potrebno je napraviti program gde ce se studentima citati koje ispite su polozili,
sa kojom ocenom i kojim prosekom. Studenti koji imaju prosek preko 8.55 i nemaju nijednu
sesticu (6) ocenu mogu da imaju stipendiju
----------
Klasa Ispit ima 2 atributa: naziv ispita i ocena
Oba atributa imaju samo getere i pun konstruktor
----------
Klasa Student ima private atribute: ime, broj indexa, prosek i listu ispita.
U konstruktoru proslediti parametre imena i indexa.
U klasi je potrebno napraviti metode za racunanje proseka i metodu za stampu
----------
Klasa Stipendija nasledjuje klasu Student i ima metodu za racunanje stipendije i stampe
 */

public class Main {
    public static void main(String[] args) {

        Stipendija stipendija1 = new Stipendija("Marko", "375");
        stipendija1.stampanje();
        System.out.println("--------------");

        Stipendija stipendija2 = new Stipendija("Pera", "1236");
        stipendija2.polozioIspit(new Ispit("Matematika", 10));
        stipendija2.polozioIspit(new Ispit("Biologija", 9));
        stipendija2.stampanje(); // ovde treba da ima stipendiju- sa ove dve ocene, prosek 9.5
        System.out.println("-------");
        stipendija2.polozioIspit(new Ispit("Ekonomija", 6)); // ako gledam sve tri  ocene onda nema, prosek je 8.33
        stipendija2.stampanje();
        System.out.println("----------");

        Stipendija stipendija3 = new Stipendija("Boris", "17");
        stipendija3.polozioIspit(new Ispit("Pravo", 10));
        stipendija3.stampanje();
        System.out.println("---------");
        stipendija3.polozioIspit(new Ispit("Istorija", 7));
        stipendija3.stampanje();
        System.out.println("--------");
        stipendija3.polozioIspit(new Ispit("Bezbednost", 9));
        stipendija3.stampanje();


    }
}

package OOP;

//Klasa Student ima private atribute: ime, broj indexa, prosek i listu ispita.
// U konstruktoru proslediti parametre imena i indexa.
// U klasi je potrebno napraviti metode za racunanje proseka i metodu za stampu

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String ime;
    private String brojIndexa;
    private double prosek;
    private ArrayList<Ispit> listaIspita;

    public Student(String ime, String brojIndexa) {
        this.ime = ime;
        this.brojIndexa = brojIndexa;
        this.listaIspita = new ArrayList<>(); //ubacujem praznu listu ispita
    }

    public double izracunajProsek() {
        double sumaOcena = 0;
        for (int i = 0; i < listaIspita.size(); i++) {
            Ispit ispitIzListe = listaIspita.get(i);
            sumaOcena = sumaOcena + ispitIzListe.getOcena();
        }//moram uslov da uvedem
        if (listaIspita.size() > 0) {
            int brojIspita = listaIspita.size();
            return sumaOcena / brojIspita;
        } else {
            return 0;
        }
    }

    public double getProsek() {
        return prosek;
    }

    public ArrayList<Ispit> getListaIspita() {
        return listaIspita;
    }

    public void polozioIspit(Ispit ispit) {
        //moram da dodam ispit u listu
        listaIspita.add(ispit);
        //treba mi nov prosek i setujem polje prosek
        double noviProsek = izracunajProsek();
        prosek = noviProsek;

    }

    public void stampanje() {
        System.out.println("Student " + ime + " sa brojem indeksa: " + brojIndexa);
        System.out.println("Ima " + listaIspita.size() + " polozena ispita sa prosekom " + prosek);
        //petlja za stampu da provrti kroz listu
        for (int i = 0; i < listaIspita.size(); i++) {
            Ispit ispitIzliste = listaIspita.get(i);
            System.out.println("Polozen ispit: " + ispitIzliste.getNazivIspita());
        }

    }

    public String getIme() {
        return ime;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }
}

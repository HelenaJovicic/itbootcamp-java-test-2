package OOP;
//Klasa Stipendija nasledjuje klasu Student i ima metodu za racunanje stipendije i stampe

public class Stipendija extends Student {
    public Stipendija(String ime, String brojIndexa) {
        super(ime, brojIndexa);
    }

    //treba da vidim ima li 6 u listi
    //treba mi klasa student da bih imala pristup svima ispitima -lista-zato koristim getter iz student
    public boolean imaStipendiju() {
        boolean imaSesticu = false;
        for (int i = 0; i < getListaIspita().size(); i++) {
            Ispit ispitIzListe = getListaIspita().get(i);
            if (ispitIzListe.getOcena() == 6) {
                //pronasla sam da ima 6, izadji iz petlje
                imaSesticu = true;
                break;
            }
        }
        //ako nema 6 i ako je prosek veci od 8.55, ima stipendiju
        if (!imaSesticu && getProsek() > 8.55) {
            return true;

        } else {
            return false;
        }

    }
    //stampa

    public void stampanje() {
        //trebaju mi sve info iz klase student za stampu
        super.stampanje();
        //ima li stipendiju ili nema? imam metodu za stipend, treba mi ima-nema string
        String imaIliNemaStipendiju;
        if (imaStipendiju()) {
            imaIliNemaStipendiju = "ima";
        } else {
            imaIliNemaStipendiju = "nema";
        }
        System.out.println("Student " + getIme() + " indeks: " + getBrojIndexa() + ", " + imaIliNemaStipendiju + " pravo na stipendiju");
    }

}

package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Kreiramo semestar koji prosljedjujemo prilikom kreiranja studenta; U semestru dodajemo predmete.
	U atributima studenta postoji atribut Plan studija, kojemu prosljedjujemo trenutni semsetar, a koji onda u svom konstruktoru
	poziva odgovarajuce funkcije iz semestra i upisuje studente na predmet i cuva podatke o predmetima koje student trenutno slusa
	U studentu postoji i opcija da se upise na novi semestar
	U semestru se nalaze obavezni i izborni predmet i pri tome se vodi racuna da broj ects ne smije biti ispod 30
	 */
        Semestar prvi=new Semestar(1);
        System.out.println("Unesite broj predmeta u semestru");
        Scanner ulaz=new Scanner(System.in);
        int br_predmeta=ulaz.nextInt();
        for(int i=0;i<br_predmeta;i++){
        prvi.dodajPredmet();}
        Student s=new Student("David","Gilmour",1234,prvi, new Date(118,8,18));

        //Ako hocemo da saznamo koje sve predmete slusa student, tome pristupamo preko plana studija
        ArrayList<Predmet> pohadja= s.getTekuci().getPredmeti_koje_pohadja();
        System.out.println("Student "+s.getIme()+" "+s.getPrezime()+" slusa: ");
        for(int i=0;i<pohadja.size();i++){
         pohadja.get(i).ispisiPredmet();
         }

       /* A mozemo i preko studenta saznati koji su ostali studenti na predmetima koje slusa,
       a preko semestra imamo pristup svim predmetima u semestru, a samim tim i studentima
        */

       // preko studenta

        for(int i=0;i<pohadja.size();i++){
            System.out.println("Studenti na predmetu sa nazzivom: "+pohadja.get(i).getNazivPredmeta());
            pohadja.get(i).ispisiStudente();
        }
      // a preko semestra; npr sve studente sa predmeta ciji id unesemo

        System.out.println("Unesite Id_predmeta cije studente zelite da ispisite");
        int id_predmeta=ulaz.nextInt();
        prvi.dajSvePredmete().get(id_predmeta).ispisiStudente();
    }
}

package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Semestar {

    private int ID_semestra;
    private int broj_izbornih;
    private int broj_obaveznih;



    private ArrayList<Predmet> izborni;
    private ArrayList<Predmet> obavezni;

    private int BrojECTS;

    public ArrayList<Predmet> getIzborni() {
        return izborni;
    }

    public ArrayList<Predmet> getObavezni() {
        return obavezni;
    }
   public void DodajIzborni(){}
    public void DodajObavezni(){}

    public void UpisiStudentaNaIzborne(Student s){}
    public void UpisiStudentaNaObavezne(Student s){}
}

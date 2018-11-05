package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Odsjek {



    private String naziv;
    private int id_odsjeka;
    private int broj_semestara;
    private ArrayList<Semestar> semestri;

    public String getNaziv() {
        return naziv;
    }

    public int getId_odsjeka() {
        return id_odsjeka;
    }

    public Semestar DajSemestar(int broj) throws ArrayIndexOutOfBoundsException{
        if(broj<broj_semestara)
        return semestri.get(broj);

        else throw new ArrayIndexOutOfBoundsException();
    }
}

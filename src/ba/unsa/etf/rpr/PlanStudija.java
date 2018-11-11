package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Date;

public class PlanStudija {
    private Date datum_upisa;
    private Date datum_ovjere;
    private Semestar semestar;
    private Student s;

    private ArrayList<Predmet> predmeti_koje_pohadja;

    public PlanStudija(Semestar id, Date datum_upisa, Student s) {
        this.datum_upisa = datum_upisa;
        this.semestar =id;
        this.s=s;


        predmeti_koje_pohadja= semestar.UpisiStudentaNaObavezne(s);
        predmeti_koje_pohadja.addAll(semestar.UpisiStudentaNaIzborne(s));

    }

    public ArrayList<Predmet> getPredmeti_koje_pohadja() {
        return predmeti_koje_pohadja;
    }






}

package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Date;

public class Podaci_o_semestru {
    private Date datum_upisa;
    private Date datum_ovjere;
    private Semestar id;

    private ArrayList<Predmet> predmeti_koje_pohadja;

    public Podaci_o_semestru(Semestar id,Date datum_upisa, int broj_semestra) {
        this.datum_upisa = datum_upisa;
        this.id =id;
    }

    public ArrayList<Predmet> getPredmeti_koje_pohadja() {
        return predmeti_koje_pohadja;
    }




}

package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Date;

public class Podaci_o_semestru {
    private Date datum_upisa;
    private Date datum_ovjere;
    private int broj_semestra;



    private int id_odsjeka;



    private ArrayList<Predmet> predmeti_koje_pohadja;

    public Podaci_o_semestru(Date datum_upisa, int broj_semestra) {
        this.datum_upisa = datum_upisa;
        this.broj_semestra = broj_semestra;
    }

    public ArrayList<Predmet> getPredmeti_koje_pohadja() {
        return predmeti_koje_pohadja;
    }

    public int getId_odsjeka() {
        return id_odsjeka;
    }

    public void setId_odsjeka(int id_odsjeka) {
        this.id_odsjeka = id_odsjeka;
    }


}

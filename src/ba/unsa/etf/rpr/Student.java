package ba.unsa.etf.rpr;

import java.util.Date;

public class Student {
    private String ime, prezime;
    private int brojIndeksa;

    public PlanStudija getTekuci() {
        return tekuci;
    }

    private PlanStudija tekuci;
     public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }


    public Student(String ime, String prezime, int brojIndeksa, Semestar broj_semestra, Date datum_upisa){
        this.ime=ime; this.prezime=prezime; this.brojIndeksa=brojIndeksa;
        tekuci=new PlanStudija(broj_semestra,datum_upisa,this);
    }
    @Override
    public String toString(){ return prezime +" "+ ime + " ("+brojIndeksa+")";}
    public void upisiNaNoviSemestar(Semestar novi, Date datum_upisa){
         tekuci=new PlanStudija(novi,datum_upisa,this);   }
}

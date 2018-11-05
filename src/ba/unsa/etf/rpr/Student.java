package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Student {
    private String ime, prezime;
    private int brojIndeksa;
    private ArrayList<Podaci_o_semestru> arhiva;
    private Podaci_o_semestru tekuci;
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


    public Student(String ime, String prezime, int brojIndeksa){
        this.ime=ime; this.prezime=prezime; this.brojIndeksa=brojIndeksa;
    }
    @Override
    public String toString(){ return prezime +" "+ ime + " ("+brojIndeksa+")";}
}

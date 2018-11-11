package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Predmet {

    private String nazivPredmeta;
    private int sifraPredmeta;
    int id_profesor;
    int ECTS;
    private ArrayList<Student>  upisani_na_predmetu=new ArrayList<>();
    public Predmet(String nazivPredmeta, int sifraPredmeta, int ECTS){
        this.nazivPredmeta=nazivPredmeta;
        this.sifraPredmeta=sifraPredmeta;
        this.ECTS=ECTS;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public int getECTS() {
        return ECTS;
    }

    public ArrayList<Student> getUpisani_na_predmetu() {
        return upisani_na_predmetu;
    }
    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getSifraPredmeta() {
        return sifraPredmeta;
    }

    public void setSifraPredmeta(int sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }

    public void dodajStudenta(Student s){

        upisani_na_predmetu.add(s);

    }
    public void  ispisiStudentaSaPredmeta(Student s){

        upisani_na_predmetu.remove(s);

    }
    public void ispisiStudente(){
        for(int i=0;i<upisani_na_predmetu.size();i++){
            System.out.println(i+1+". "+ upisani_na_predmetu.get(i));
        }
    }
    public void ispisiPredmet(){
        System.out.println(sifraPredmeta+" "+nazivPredmeta+" ECTS: "+ECTS);
    }

}

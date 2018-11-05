package ba.unsa.etf.rpr;

public class Predmet {

    private String nazivPredmeta;
    private int sifraPredmeta;
    private int velicina;
    final int maxBrojStudenata;
    int id_profesor;
    int ECTS;
    private Student [] upisani_na_predmetu;
    public Predmet(String nazivPredmeta, int sifraPredmeta, int maxBrojStudenata,int profesor,int ECTS){
        this.nazivPredmeta=nazivPredmeta;
        this.velicina=0;
        this.sifraPredmeta=sifraPredmeta;
        this.maxBrojStudenata=maxBrojStudenata;
        this.id_profesor=profesor;
        this.ECTS=ECTS;
        upisani_na_predmetu= new Student[maxBrojStudenata];

    }

    public int getId_profesor() {
        return id_profesor;
    }

    public int getECTS() {
        return ECTS;
    }

    public Student[] getUpisani_na_predmetu() {
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

    public Predmet dodajStudenta(Student s){
        if(velicina>=maxBrojStudenata) throw new RuntimeException("Popunjen kapacitet");
        else {
            upisani_na_predmetu[velicina++]=s;

        }
        return this;

    }
    public Predmet ispisiStudenta(Student s){

        for(int i=0;i<velicina;i++){
            if(s.equals(upisani_na_predmetu[i])){
                for(int j=i;j<velicina;j++){
                    upisani_na_predmetu[j]=upisani_na_predmetu[j+1];
                }
                i=velicina;
                velicina--;
            }
        }
        return this;

    }
    public void ispisi(){
        for(int i=0;i<velicina;i++){
            System.out.println(i+1+". "+ upisani_na_predmetu[i]);
        }
    }

}

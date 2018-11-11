package ba.unsa.etf.rpr;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Semestar {

    private int ID_semestra;


    protected HashMap<Integer,Predmet> izborni=new HashMap<>();
    protected HashMap<Integer,Predmet> obavezni=new HashMap<>();
private int ECTS;
   public Semestar(int ID_semestra){
       this.ID_semestra=ID_semestra;
   }

    public HashMap<Integer,Predmet> getIzborni() {
        return izborni;
    }

    public HashMap<Integer,Predmet> getObavezni() {
        return obavezni;
    }
    public HashMap<Integer,Predmet> dajSvePredmete(){
       HashMap<Integer,Predmet> svi=new HashMap<Integer,Predmet>();
       svi.putAll(obavezni);
       svi.putAll(obavezni);
       return svi;

    }
   public void dodajPredmet(){
       System.out.println("Unesite  naziv predmeta,id i broj ects, i obligatnost");
       Scanner ulaz=new Scanner(System.in);

       String naziv=ulaz.nextLine();
       int ID_predmeta=ulaz.nextInt();
       int brojEcts=ulaz.nextInt();
       boolean obavezan=ulaz.nextBoolean();
       if(obavezan) {obavezni.put(ID_predmeta,new Predmet(naziv,ID_predmeta,brojEcts)); ECTS+=brojEcts;}
       else izborni.put(ID_predmeta,new Predmet(naziv,ID_predmeta,brojEcts));


   }

    public ArrayList<Predmet> UpisiStudentaNaIzborne(Student s) {
        ArrayList<Predmet> izbor=new ArrayList<>();
        Scanner ulaz = new Scanner(System.in);
        int bodovi=ECTS;
        do {
            System.out.println("Unesite ID izbornog predmeta: ");
            int id = ulaz.nextInt();
            izborni.get(id).dodajStudenta(s);
            bodovi+= izborni.get(id).getECTS();
            izbor.add(izborni.get(id));

        } while (bodovi < 30);
        return izbor;
    }
    public ArrayList<Predmet> UpisiStudentaNaObavezne(Student s){
        ArrayList<Predmet> izbor=new ArrayList<>();
        for(Map.Entry<Integer,Predmet> a: obavezni.entrySet()){
            izbor.add(a.getValue());
        }
       for(int i=0;i<obavezni.size();i++)  {
           izbor.get(i).dodajStudenta(s);
           //izbor.add(obavezni.get(i));
       }
return izbor;
    }
}

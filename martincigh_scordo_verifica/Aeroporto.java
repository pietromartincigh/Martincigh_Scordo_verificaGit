package martincigh_scordo_verifica;

public class Aeroporto{

    private String citta;
    private int superficie;
    private Aereo aerei[];


    public Aeroporto(){

        this.aerei= new Aereo[3];

        for(int i=0; i<3; i++)
        this.aerei[i]= new Aereo();
    }

    public Aeroporto(String citta, int superficie, Aereo aerei[]){

        this.aerei= new Aereo[3];

        this.citta=citta;
        this.superficie=superficie;

        for(int i=0; i< 3; i++){
        this.aerei[i]=new Aereo();
        this.aerei[i]=aerei[i];
        }
    }


    public void setCitta(String citta){

        this.citta=citta;
    }

    public String getCitta(){

        return citta;
    }


    public void setSuperficie(int superficie){

        this.superficie=superficie;
    }

    public int getSuperficie(){

        return superficie;
    }



    public void setAerei(Aereo aerei[]){

        for(int i=0; i< 3; i++)
        this.aerei[i]=aerei[i];
    }

    public Aereo[] getAerei(){

        return aerei;
    }


}
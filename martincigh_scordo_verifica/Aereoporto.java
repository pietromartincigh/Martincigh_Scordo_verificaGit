package martincigh_scordo_verifica;

public class Aereoporto{

    private String citta;
    private int superficie;
    private Aereo aerei[];


    public Aereoporto(){

    }

    public Aereoporto(String citta, int superficie, Aereo aerei[]){

        this.citta=citta;
        this.superficie=superficie;

        for(int i=0; i< aerei.length; i++)
        this.aerei[i]=aerei[i];
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

        for(int i=0; i< aerei.length; i++)
        this.aerei[i]=aerei[i];
    }

    public Aereo[] getAerei(){

        return aerei;
    }


}
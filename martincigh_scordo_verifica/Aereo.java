package martincigh_scordo_verifica;

public class Aereo{

String codice;
int nPosti;
String marca;
String modello;

public Aereo(){}

public Aereo(String codice, int nPosti, String marca, String modello){
    this.codice=codice;
    this.nPosti=nPosti;
    this.marca=marca;
    this.modello=modello;
}

public void setCodice(String codice){
    this.codice=codice;
}

public void setNPosti(int nPosti){
    this.nPosti=nPosti;
}

public void setMarca(String marca){
    this.marca=marca;
}

public void setModello(String modello){
    this.modello=modello;
}

public String getCodice(){
    return codice;
}

public int getNposti(){
    return nPosti;
}

public String getMarca(){
    return marca;
}

public String getModello(){
    return modello;
}

@Override 

public String toString() {
    return ("Codice: " + codice + "\nNumeroPosti: " + nPosti + "\nMarca: " + marca + "\nModello: " + modello);
}

}
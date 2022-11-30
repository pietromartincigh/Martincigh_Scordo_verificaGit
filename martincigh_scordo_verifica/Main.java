package martincigh_scordo_verifica;

public class Main {

    public static void main (String args[]){

        Aereo aerei[] = new Aereo[3];

        aerei[0]= new Aereo("0Q2E45S", 124, "Toyota", "Boeing 737");
        aerei[1]= new Aereo("XCTY674O", 31, "Peugeot", "Schifo con le ali");
        aerei[2]= new Aereo("EW8213HBL0", 5783, "Subaru", "Stuka");

        Aereoporto aereoporto = new Aereoporto("Mogadiscio", 57, aerei);

    }
    
}

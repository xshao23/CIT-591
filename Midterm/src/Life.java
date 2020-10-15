
public class Life {

    public static void main(String[] args) {
	// construct the human and the mosquito  
	Human ronald = new Human("Ronald");
	Mosquito femaleAnopheles = new Mosquito("Anopheles", "female"); 
	
	// bite, swat, and perform experiment 
	femaleAnopheles.bite(ronald);
	ronald.swat(femaleAnopheles);
	ronald.experiment("life cycle of the parasite");

    }

}

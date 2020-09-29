package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf smurfhandy = new Smurf("Handy");
	smurfhandy.eat();
	System.out.println(smurfhandy.getName());
	Smurf papasmurf = new Smurf("Papa");
	System.out.println(papasmurf.getName());
	System.out.println(papasmurf.getHatColor());
	System.out.println(papasmurf.isGirlOrBoy());
	Smurf smurfette = new Smurf("Smurfette");
	System.out.println(smurfette.getName());
	System.out.println(smurfette.getHatColor());
	System.out.println(smurfette.isGirlOrBoy());
}
}

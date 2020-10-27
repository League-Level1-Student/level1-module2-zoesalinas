package _04_tea_maker;

public class TeaMakerRunner {
public static void main(String[] args) {

	TeaBag teabag = new TeaBag("Mint");
	Cup cup = new Cup();
	Kettle kettle = new Kettle();
	kettle.boil();
	cup.makeTea(teabag, kettle.getWater());
}
}

package fcu.iecs.oop.pokemon;

public class GYM {

	public static void fight(Pokemon P1,Pokemon P2){
		int a = (int)(Math.random()*2+1);
		
		if(a==1){
			System.out.println("Winner is " + P1.getname() + ".");
			P1.setcp(P1.getcp()+500);
		}
		
		else if(a==2){
			System.out.println("Winner is "+ P2.getname() + ".");
			P2.setcp(P2.getcp()+500);
		}
	}
}

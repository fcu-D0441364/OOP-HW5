package fcu.iecs.oop.pokemon;

public class Pokemon {
	private final String name;
	private int cp;
	
	public Pokemon(String name, int cp){
		this.name = name;
		this.cp = cp;
	}
	
	public String getname(){
		return name;
	}
	
	public void setcp(int i){
		cp = i;
	}
	
	public int getcp(){
		return cp;
	}


}

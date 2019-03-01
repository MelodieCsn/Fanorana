
public class Pion {
	private int x;
	private int y;
	private Couleur couleur;
	private boolean danger;
	
	
	
	public int getX (){
		return x;
	}
	public void setX(int x){
		this.x = x;
	}
	public int getY (){
		return y;
	}
	public void setY(int y){
		this.y = y;
	}
	public Couleur getCouleur (){
		return couleur;
	}
	public void setCouleur(Couleur c){
		couleur = c;
	}
	public boolean getDanger(){
		return danger;
	}
	public void setDanger(boolean d){
		danger = d;
	}
	
	public Pion(){
		x=0;
		y=0;
		couleur=Couleur.white;
		danger=false;
		
	}	
}

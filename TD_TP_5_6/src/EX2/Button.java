package EX2;

public class Button extends Rectangle {
	private String text;
	public Button() {
		super();
		this.text="";
	}
	public Button(int x,int y,double largeur,double hauteur,String text) {
		super(x,y,largeur,hauteur);
		this.text=text;
	}
	public Button(Button b) {
		super(b);
		this.text=b.text;
	}
	public void setText(String text) {
		this.text=text;
	}
	public String getText() {
		return this.text;
	}
	public void affiche() {
		super.affiche();
		System.out.println(text);
	}
}

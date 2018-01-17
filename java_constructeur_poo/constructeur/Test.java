package constructeur;

public class Test {
	public static void main(String[] args) {
		Produit sony =new Produit();
	sony.libelle="sony vaio";
	sony.cout=8000;
		Produit dell;
		dell=new Produit("dell saltelite",4000, 5000);
		Produit hp=new Produit("hp dv6", 3000);
			hp.afficher();
			double	gain=hp.calculGain();
			System.out.println("le gain de vente de hp est "+gain+" dhs");
	//
	}
}

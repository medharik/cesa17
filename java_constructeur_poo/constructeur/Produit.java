package constructeur;

public class Produit {
 protected String libelle;
 double cout,prix;// portée => default = package
//constructeur par défaut

public Produit() {
}
//constructeur permet d'initialiser les attributs
public Produit(String libelle, double cout, double prix) {
	
	this.libelle = libelle;
	this.cout = cout;
	this.prix = prix;
}



public Produit(String libelle) {

	this.libelle = libelle;
}

public Produit(String libelle, double cout){
	this.libelle=libelle;
	this.cout=cout;
}
 public double calculGain() {
	double gain= prix-cout;
	return gain;
}
 void afficher() {
	System.out.println("libellé "+libelle);
	System.out.println("cout d'achat "+cout+" dhs");
	System.out.println("le prix de vente est "+prix+" dhs");
	
}	
}

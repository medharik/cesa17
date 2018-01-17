package constructeur;

public class ProduitAlimentaire extends Produit {
String dateExpiration;

public ProduitAlimentaire(String libelle, double cout, double prix, String dateExpiration) {
	super(libelle, cout, prix);
	this.dateExpiration = dateExpiration;
	this.libelle=libelle;
}

}

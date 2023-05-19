package donnees;

import java.util.ArrayList;
import java.util.List;

/**
 * la classe CD contient toute l'information associee a un CD.</p>
 * 
 * elle est caracterisee par
 * <ul>
 * <li>le nom de l'artiste du CD
 * <li>le titre du D
 * <li>l'ensemble des pistes du CD
 * </ul>
 * 
 * Cette classe est utilisee par le magasin qui rassemble une liste de CDs.
 * 
 */
public class CD {

	/**
	 * constante pour definir comment afficher une separation entre les elements
	 * dans toString
	 */
	private static final String SEPARATOR = "--------------------------------------\n";

	/**
	 * les attributs du CD
	 */
	private String nomArtiste;
	private String nomCD;

	/**
	 * les pistes du CD
	 */
	private List<InfoPiste> pistes;

	/**
	 * constructeur simple, cree un CD sans aucune piste
	 * 
	 * @param artiste
	 *            nom de l'artiste qui a fait le C
	 * @param nomCDParam
	 *            titre du CD
	 */
	public CD(String artiste, String nomCDParam) {
		this.nomArtiste = artiste;
		this.nomCD = nomCDParam;

		this.pistes = new ArrayList<InfoPiste>();
	}

	/**
	 * ajoute une piste en fin de CD
	 * 
	 * @param infoPiste
	 *            les informations concernant la piste (duree et titre)
	 */
	public void ajouterPiste(InfoPiste infoPiste) {
		pistes.add(infoPiste);
	}

	@Override
	/**
	 * retourne le descriptif d'un CD
	 * <ul>
	 * <li> affiche les informations du CD
	 * <li> puis les informations des pistes du CD
	 * </ul>
	 */
	public String toString() {
		String r = SEPARATOR;
		r += this.nomArtiste + " - " + this.nomCD + " (" + pistes.size()
				+ " pistes)\n";
		// ajoute les pistes
		for (int i = 0; i < this.pistes.size(); i++) {
			InfoPiste piste = pistes.get(i);
			r += "   ." + numeroPiste(i) + ". " + piste + "\n";
		}
		r += SEPARATOR;
		return (r);
	}

	/**
	 * retourne une chaine correspondant au numero de piste (sur deux char) pour
	 * pouvoir afficher les pistes sans decalage
	 * 
	 * @param i
	 *            le numero
	 * @return la chaine sous deux caracteres
	 */
	private String numeroPiste(int i) {
		int numPiste = i + 1;
		String resultat = "" + numPiste;
		if (numPiste < 10)
			resultat = "0" + resultat;
		return (resultat);
	}

	// TODO
	/*
	Méthode qui compare deux CD et retourne 1
	si celui qui appelle la méthode est + grand que celui en paramètres
	-1 si celui qui appelle la méthode est + petit que celui en paramètres
	0 si ils sont égaux.
	 */
	public int compareCD(CD c2){
		// Si le nom du CD qui appelle la méthode est égal à celui en paramètres
		if(this.nomCD.compareTo(c2.nomCD) == 0 ){
			// Si Condition ci dessus + la même chose pour le nom de l'artiste
			if(this.nomArtiste.compareTo(c2.nomArtiste) == 0){
				return 0;
			}else if(this.nomArtiste.compareTo(c2.nomArtiste) < 0){
				return -1;
			}else{
				return 1;
			}
		}else if(this.nomCD.compareTo(c2.nomCD) < 0){
			return -1;
		}else{
			return 1;
		}
	}
}

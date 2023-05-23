package donnees;

import java.util.ArrayList;

/**
 * La classe Magasin represente un magasin qui vend des CDs.</p>
 * 
 * cette classe est caracterisee par un ensemble de CDs correspondant aux CDS
 * vendus dans ce magasin.
 * 
 */
public class Magasin {

	/**
	 * la liste des CDs disponibles en magasin
	 */
	private ArrayList<CD> listeCds;

	/**
	 * construit un magasin par defaut qui ne contient pas de CD
	 */
	public Magasin() {
		listeCds = new ArrayList<CD>();
	}

	/**
	 * ajoute un cd au magasin
	 * 
	 * @param cdAAjouter
	 *            le cd a ajouter
	 */
	public void ajouteCd(CD cdAAjouter) {
		listeCds.add(cdAAjouter);
	}

	@Override
	/**
	 * affiche le contenu du magasin
	 */
	public String toString() {
		String chaineResultat = "";
		//parcours des Cds
		for (int i = 0; i < listeCds.size(); i++) {
			chaineResultat += listeCds.get(i);
		}
		chaineResultat += "nb Cds: " + listeCds.size();
		return (chaineResultat);

	}

	/**
	 * @return le nombre de Cds du magasin
	 */
	public int getNombreCds() {
		return listeCds.size();
	}
	
	/**
	 * permet d'acceder � un CD
	 * 
	 * @return le cd a l'indice i ou null si indice est non valide
	 */
	public CD getCd(int i)
	{
		CD res=null;
		if ((i>=0)&&(i<this.listeCds.size()))
			res=this.listeCds.get(i);
		return(res);
	}

	// TODO  ajouter une methode de tri
	/*
	public void trierCDs(){
		for(int i = 0; i < this.listeCds.size() - 1; i++){
			int indice = i;
			CD min = this.listeCds.get(i);
			for(int j = i; j < this.listeCds.size() - 1; j++){
				if(min.compareNomCD(this.listeCds.get(j+1))){
					indice = j + 1;
				}
			}
			// Minimum qu'on obtient grace au parcours de la boucle
			CD minimum = this.listeCds.get(indice);
			this.listeCds.set(indice, this.listeCds.get(i));
			this.listeCds.set(i, minimum);

		}
	}
*/



	public void trierArtiste(){
		int nbCDs = this.listeCds.size();
		for(int i=0;i<nbCDs;i++){
			CD cdSelectionne = this.listeCds.get(i);

			// Selectionne le plus petit
			int indiceSelection = i;
			for (int j=i+1;j<nbCDs;j++){
				CD cdTemp = listeCds.get(j);
				if(cdTemp.compareArtisteCD(cdSelectionne)){
					indiceSelection = j;
					cdSelectionne = cdTemp;
				}
			}
			listeCds.set(indiceSelection, listeCds.get(i));
			listeCds.set(i,cdSelectionne);
		}
	}

	public void trierAlbum(){
		int nbCDs = this.listeCds.size();
		for(int i=0;i<nbCDs;i++){
			CD cdSelectionne = this.listeCds.get(i);

			// Selectionne le plus petit
			int indiceSelection = i;
			for (int j=i+1;j<nbCDs;j++){
				CD cdTemp = listeCds.get(j);
				if(cdTemp.compareNomCD(cdSelectionne)){
					indiceSelection = j;
					cdSelectionne = cdTemp;
				}
			}
			listeCds.set(indiceSelection, listeCds.get(i));
			listeCds.set(i,cdSelectionne);
		}
	}
}

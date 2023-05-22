TROHA Stanislas
LOPPINET Stephane
Groupe E


Remarques : 

1 - Dans la classe CD, les méthodes pour comparer les titres et les artistes sont différentes. Il faut créer une méthode de comparaison pour titre et une autre pour artiste. 

2 - Terminer les méthodes de tri dans la classe Magasin, voici un exemple: 
```
public void trierAlbum() {
		// tri par selection
		int nbCDs = this.listeCds.size();
		for (int i = 0; i < nbCDs; i++) {
			CD cdSelectionne = this.listeCds.get(i);
			
			//selectionne plus petit 
			int indiceSelection = i;
			for (int j = i + 1; j < nbCDs; j++) {
				CD cdTemp = listeCds.get(j);
				if (cdTemp.etreAvantAlbum(cdSelectionne)) {
					indiceSelection = j;
					cdSelectionne = cdTemp;
				}
			}
			listeCds.set(indiceSelection, listeCds.get(i));
			listeCds.set(i, cdSelectionne);
		}
	}
  ```

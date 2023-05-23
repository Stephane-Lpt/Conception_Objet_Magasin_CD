package donnees;

public class ComparateurArtiste implements ComparateurCd {

    @Override
    public boolean etreAvant(CD cd1, CD cd2) {
        return c1.getNomArtiste().compareTo(cd2.getNomArtiste()) < 0;
    }
}

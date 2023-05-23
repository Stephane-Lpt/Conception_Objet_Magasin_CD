package donnees;

public interface ComparateurCd {

    /**
     * comparer deux CD entre eux
     * @param cd1 le premier CD à comparer au deuxième CD
     * @param cd2 le second CD
     * @return true, si cd1 est avant, false sinon
     */
    public boolean etreAvant(CD cd1, CD cd2);
}

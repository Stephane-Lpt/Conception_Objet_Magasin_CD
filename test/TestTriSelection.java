import donnees.CD;
import donnees.ComparateurArtiste;
import donnees.Magasin;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTriSelection {
    @Test
    public void testTri(){
        // Préparation des éléments
        Magasin m = new Magasin();
        CD cd1 = new CD("RamStein", "MK");
        CD cd2 = new CD("Stanline", "NKPD");
        CD cd3 = new CD("Jawad", "H de thés");
       m.ajouteCd(cd1);
       m.ajouteCd(cd2);
       m.ajouteCd(cd3);
       ComparateurArtiste c = new ComparateurArtiste();

       // Méthode pour trier les CDs
        m.trier(c);

        assertEquals(m.getCd(0), cd3);
    }
}

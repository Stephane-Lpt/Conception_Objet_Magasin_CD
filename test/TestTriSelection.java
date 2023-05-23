import donnees.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
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

       // Méthode pour trier les CDs
        m.trierCDs();

        assertEquals(m.getCd(0), cd3);
    }
}

package SamostatneSkusanie.domacaKniznica;

import java.sql.SQLException;

public interface IFunkcionalita {

    void vypisMenu();
    void vlozKnihu() throws SQLException;
    void vyberKnihu() throws SQLException;
    void aktualizujKnihu();
    void odstranKnihu();
    void ulozDoSql(Kniha kniha) throws SQLException;

}

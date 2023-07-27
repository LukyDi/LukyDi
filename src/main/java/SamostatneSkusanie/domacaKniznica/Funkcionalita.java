package SamostatneSkusanie.domacaKniznica;

import java.sql.*;
import java.util.Scanner;

public class Funkcionalita implements IFunkcionalita {
    private Connection conn;

    public Funkcionalita() {
        // do Strigov ukladam adresu databazy , prihlasovacie meno a heslo -> to zalezi od vytvorenej databazy
        String url = "jdbc:mysql//localhost:3306/kniznica_db";
        String name = "root";
        String password = "password";
        System.out.println("Connecting to databaze");
        try {
            conn = DriverManager.getConnection(url, name, password);
            System.out.println("Databaze connescet");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect to the databaze", e);
        }
    }

    @Override
    public void vypisMenu() {

    }

    @Override
    public void vlozKnihu() throws SQLException {
        Scanner scn = new Scanner(System.in);

        System.out.print("Zadaj nazov knihy: ");
        String nazov = scn.nextLine();
        System.out.println();

        System.out.print("Zadaj autora: ");
        String autor = scn.nextLine();
        System.out.println();

        System.out.println("Zadaj rok vydania knihy");
        int rok = scn.nextInt();
        System.out.println();
        Kniha kniha = new Kniha(nazov, autor, rok);
        ulozDoSql(kniha);

    }

    @Override
    public void vyberKnihu() throws SQLException {
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj ID knihy , ktorú chceš vypísať");
        int vyber = scn.nextInt();

        String sql = "SELECT * FROM kniha WHERE ID = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, vyber);
        ResultSet result = statement.executeQuery();
        System.out.println( (Kniha)result);
    }

    @Override
    public void aktualizujKnihu() {

    }

    @Override
    public void odstranKnihu() {

    }


    @Override
    public void ulozDoSql(Kniha kniha) throws SQLException {
        String sql = "INSERT into kniha (nazov,, autor, rok_vydania) values (?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, kniha.nazovKnihy);
        statement.setString(2, kniha.autorKnihy);
        statement.setInt(3, kniha.rok_vydania);
        statement.executeUpdate(); // uskutocnime dany statement , cize sql (sql query)

    }
}
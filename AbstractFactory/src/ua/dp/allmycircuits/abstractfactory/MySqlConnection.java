package ua.dp.allmycircuits.abstractfactory;

/**
 * Реализация класса для соединения с mySQL
 * @author winkiller
 */
public class MySqlConnection extends Connection{

    @Override
    public void connect() {
        System.out.println("MySqlConnection.connect");
    }

}

package ua.dp.allmycircuits.abstractfactory;

/**
 * Реализация класса для соединения с Oracle
 * @author winkiller
 */
public class OracleConnection extends Connection{

    @Override
    public void connect() {
        System.out.println("OracleConnection.connect");
    }

}

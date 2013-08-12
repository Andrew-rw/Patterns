package ua.dp.allmycircuits.abstractfactory;

/**
 * Реализация фабрики для Oracle
 * @author winkiller
 */
public class OracleFactory extends DbFactory{

    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }

    @Override
    public Command createCommand() {
        return new OracleCommand();
    }
    
}
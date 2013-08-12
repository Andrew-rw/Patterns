package ua.dp.allmycircuits.abstractfactory;

/**
 * Реализация фабрики для mySQL
 * @author winkiller
 */
public class MySqlFactory extends DbFactory{

    @Override
    public Connection createConnection() {
        return new MySqlConnection();
    }

    @Override
    public Command createCommand() {
        return new MySqlCommand();
    }
    
}

package ua.dp.allmycircuits.abstractfactory;

/**
 * Реализация Command для mySQL
 * @author winkiller
 */
public class MySqlCommand extends Command{

    @Override
    public ResultSet execute() {
        System.out.println("MySqlCommand.execute");
        return new MySqlResultSet();
    }
    
}

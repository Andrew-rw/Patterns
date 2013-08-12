package ua.dp.allmycircuits.abstractfactory;

/**
 * Реализация Command для Oracle
 * @author winkiller
 */
public class OracleCommand extends Command{

    @Override
    public ResultSet execute() {
        System.out.println("OracleCommand.execute");
        return new OracleResultSet();
    }
    
}

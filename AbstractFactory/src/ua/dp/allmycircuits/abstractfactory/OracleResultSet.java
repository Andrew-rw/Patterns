package ua.dp.allmycircuits.abstractfactory;

/**
 * Реализация класса для результата Oracle
 * @author winkiller
 */
public class OracleResultSet extends ResultSet{

    @Override
    public void hasNext() {
        System.out.println("OracleResultSet.hasNext");
    }
    
}

package ua.dp.allmycircuits.abstractfactory;

/**
 * Реализация класса для результата mySQL
 * @author winkiller
 */
public class MySqlResultSet extends ResultSet{

    @Override
    public void hasNext() {
        System.out.println("MySqlResultSet.hasNext");
    }
    
}

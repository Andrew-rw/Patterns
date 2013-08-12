package ua.dp.allmycircuits.abstractfactory;

/**
 * Проверка абстрактной фабрики
 * @author winkiller
 */
public class AbstractFactory {

    public static void main(String[] args) {
        transact(new MySqlFactory());
        transact(new OracleFactory());
    }
    
    private static void transact(DbFactory db){
        Connection con = db.createConnection();
        con.connect();
        Command cmd = db.createCommand();
        ResultSet set = cmd.execute();
        set.hasNext();
    }
}

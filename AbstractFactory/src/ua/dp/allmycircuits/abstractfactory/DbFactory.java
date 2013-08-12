package ua.dp.allmycircuits.abstractfactory;

/**
 * Абстрактный класс фабрики
 * @author winkiller
 */
public abstract class DbFactory {
    public abstract Connection createConnection();
    public abstract Command createCommand();
}

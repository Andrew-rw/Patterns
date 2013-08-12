package ua.dp.allmycircuits.abstractfactory;

/**
 * Абстрактный класс для SQL команд
 * @author winkiller
 */
public abstract class Command {
    public abstract ResultSet execute();
}

package ru.maksimov.service.handler;

/**
 * Обработчик команд
 */
public interface ICommandHandler {

    /**
     * Метод обрабатывает команду и перелает ее на выполнение
     *
     * @param command команда управления
     * @return возвращает true  в случае успешного выполнения
     */
    boolean process(String command);
}

package ru.maksimov.service;

import ru.maksimov.domen.Project;

/**
 * Сервис управления проектами
 */
public interface IManagerService {

    /**
     * Создание проекта
     *
     * @param name
     */
    Project create(String name);

    /**
     * Просмотр проекта
     *
     * @param name
     */
    Project read(String name);

    /**
     * Обновление проекта
     *
     * @param name
     */
    Project update(String name);

    /**
     * Удаление проекта
     *
     * @param name
     */
    boolean delete(String name);

}

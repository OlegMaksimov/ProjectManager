package ru.maksimov.service;


import ru.maksimov.domen.Project;

import java.util.Map;

public class ManagerServiceImpl implements IManagerService {

    private Map<String, Project> projectMap;

    public ManagerServiceImpl(Map<String, Project> projectMap) {
        this.projectMap = projectMap;
    }

    /**
     * Создание проекта
     *
     * @param name
     */
    public Project create(String name) {
        Project project = new Project(name);
        projectMap.put(name, project);
        return project;
    }

    /**
     * Просмотр проекта
     *
     * @param name
     */
    public Project read(String name) {
        return projectMap.get(name);
    }

    /**
     * Обновление проекта
     *
     * @param name
     */
    public Project update(String name) {
        return null;
    }

    /**
     * Удаление проекта
     *
     * @param name
     */
    public boolean delete(String name) {
        projectMap.remove(name);
        return projectMap.get(name) == null ? true : false;
    }
}

package ru.maksimov.domen;

/**
 * Проект
 */
public class Project {

    /* Наименование */
    private String name;

    public Project(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                '}';
    }
}

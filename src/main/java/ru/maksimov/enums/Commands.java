package ru.maksimov.enums;

/**
 * Список команд для управлением проектами
 */
public enum Commands {
    /* Создать проект */
    CREATE("c"),

    /* Создать проект */
    READ("r"),

    /* Создать проект */
    UPDATE("u"),

    /* Создать проект */
    DELETE("d"),

    /* Создать проект */
    HELP("h"),

    /* Выход */
    EXIT("e");

    private String value;

    Commands(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

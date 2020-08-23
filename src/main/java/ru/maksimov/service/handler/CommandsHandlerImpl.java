package ru.maksimov.service.handler;

import ru.maksimov.domen.Project;
import ru.maksimov.enums.Commands;
import ru.maksimov.service.IManagerService;

import java.util.Scanner;

public class CommandsHandlerImpl implements ICommandHandler {
    private IManagerService managerService;
    private Scanner scanner;

    public CommandsHandlerImpl(IManagerService managerService, Scanner scanner) {
        this.managerService = managerService;
        this.scanner = scanner; // todo вынести в интерфейс
    }

    public boolean process(String command) {
        boolean result;
        switch (command) {
            case "c":
                crud();
                result = true;
                break;
            case "r":
                read();
                result = true;
                break;
            case "u":
                update();
                result = true;
                break;
            case "d":
                delete();
                result = true;
                break;
            case "h": {
                Commands[] commands = help();
                for (Commands com : commands) {
                    System.out.println(com.getValue());
                }
                result = true;
                break;
            }
            case "e":
                System.out.println("Завершение приложения");
                result = true;
                break;
            default:
                System.out.println(" Нет такой команды");
                result = false;
        }
        return result;
    }

    private Project crud() {
        System.out.println("Создание проекта");
        System.out.println("Введите название проекта");
        String projectName = scanner.nextLine();

        Project project = managerService.create(projectName);
        System.out.println(project);
        return project;
    }

    private Project read() {
        System.out.println("Поиск проекта");
        System.out.println("Введите название проекта");
        String projectName = scanner.nextLine();

        Project project = managerService.read(projectName);
        System.out.println(project);
        return project;
    }

    private void update() {
        System.out.println(" Пока не реализована");
    }

    private boolean delete() {
        System.out.println("Удаление проекта");
        System.out.println("Введите название проекта");
        String projectName = scanner.nextLine();

        boolean result = managerService.delete(projectName);
        if (result) {
            System.out.println("Проект " + projectName + " был удален");
        }
        return result;
    }

    private Commands[] help() {
        return Commands.values();
    }
}

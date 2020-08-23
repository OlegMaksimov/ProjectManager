package ru.maksimov;

import ru.maksimov.domen.Project;
import ru.maksimov.service.IManagerService;
import ru.maksimov.service.ManagerServiceImpl;
import ru.maksimov.service.handler.CommandsHandlerImpl;
import ru.maksimov.service.handler.ICommandHandler;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<String, Project> map = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        IManagerService managerService = new ManagerServiceImpl(map);

        ICommandHandler handler = new CommandsHandlerImpl(managerService, scanner);
        System.out.println("********** Добро пожаловать в систему управлением проектом. **********");
        String comand = null;
        do {
            System.out.println(" Введите команду ");
            comand = scanner.nextLine();
            handler.process(comand);
        } while (!"e".equals(comand));

        System.out.println("********** Завершение программы. **********");
    }
}

package ru.maksimov.service;

import ru.maksimov.domen.Project;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class ManagerServiceImplTest {
    private IManagerService managerService;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Map<String, Project> map = new TreeMap<>();
        managerService = new ManagerServiceImpl(map);
    }

    @org.junit.jupiter.api.Test
    void create() {
        String name = "Test Project";
        Project project = createProject(name);

        assertNotNull(project);
    }


    @org.junit.jupiter.api.Test
    void read() {
        String name = "Test Project";
        Project project = createProject(name);

        Project project1 = managerService.read(name);

        assertEquals(project.getName(), project1.getName());
    }

    @org.junit.jupiter.api.Test
    void update() {
    }

    @org.junit.jupiter.api.Test
    void delete() {
        String name = "Test Project";
        createProject(name);

        boolean result = managerService.delete(name);

        assertTrue(result);
    }

    private Project createProject(String name) {
        return managerService.create(name);
    }
}
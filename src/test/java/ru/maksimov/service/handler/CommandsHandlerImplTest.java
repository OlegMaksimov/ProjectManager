package ru.maksimov.service.handler;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import ru.maksimov.service.IManagerService;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CommandsHandlerImplTest {

    @Mock
    IManagerService managerService;
    Scanner mockScanner;
    private ICommandHandler handler;

    @BeforeEach
    void setUp() {
        mockScanner = mock(Scanner.class);
        handler = new CommandsHandlerImpl(managerService, mockScanner);
    }

    @Test
    void processOnCreate() {
        String projectName = "projectName";
        when(mockScanner.nextLine()).thenReturn(projectName);

        boolean isSuccses = handler.process("c");

        assertTrue(isSuccses);
    }

    @Test
    void processOnRead() {
        boolean isSuccses = handler.process("r");

        assertTrue(isSuccses);
    }

    @Test
    @Ignore
    void processOnUpdate() {
        boolean isSuccses = handler.process("u");

        assertTrue(isSuccses);
    }

    @Test
    void processOnDelete() {
        boolean isSuccses = handler.process("d");

        assertTrue(isSuccses);
    }

    @Test
    void processOnHelp() {
        boolean isSuccses = handler.process("h");

        assertTrue(isSuccses);
    }

    @Test
    void processOnFail() {
        boolean isSuccses = handler.process("j");

        assertFalse(isSuccses);
    }
}
package ua.training.Controller;

import ua.training.Model.RecordBook;
import ua.training.View.View;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Класс контроллер, который выполняет основные действия
 * @author benjamin
 */
public class Controller {
    private RecordBook recordBook;
    private View view;

    private BufferedReader reader;

    public Controller(RecordBook recordBook, View view) {
        this.recordBook = recordBook;
        this.view = view;
    }

    /**
     * Метод, в котором описан порядок действий
     */
    public void startAction() {
        reader = new BufferedReader(new InputStreamReader(System.in));

        recordBook.confirmRecord(new InputRecord(view,reader).getRecord());

    }
}

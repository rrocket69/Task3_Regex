package ua.training.controller;

import ua.training.model.entity.Record;
import ua.training.model.entity.RecordBook;
import ua.training.view.View;

/**
 * Класс контроллер, который выполняет основные действия
 * @author benjamin
 */
public class Controller {
    private RecordBook recordBook;
    private View view;

    public Controller(RecordBook recordBook, View view) {
        this.recordBook = recordBook;
        this.view = view;
    }

    /**
     * Метод, в котором описан порядок действий
     */
    public void startAction() {
        recordBook.confirmRecord(new Record("admin"));
        recordBook.confirmRecord(new Record("username1"));
        recordBook.confirmRecord(new Record("username2"));

        recordBook.confirmRecord(new InputRecord(view).insertRecordInto(recordBook.clone()));
    }
}

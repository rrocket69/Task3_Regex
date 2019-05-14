package ua.training;

import ua.training.controller.Controller;
import ua.training.model.entity.RecordBook;
import ua.training.view.View;

/**
 * Главный класс
 * @author benjamin
 */
public class Main {

    public static void main(String[] args) {

        new Controller(new RecordBook(),new View()).startAction();

    }

}

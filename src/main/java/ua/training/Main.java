package ua.training;

import ua.training.Controller.Controller;
import ua.training.Model.RecordBook;
import ua.training.View.View;

/**
 * Главный класс
 * @author benjamin
 */
public class Main {

    public static void main(String[] args) {

        new Controller(new RecordBook(),new View()).startAction();

    }

}

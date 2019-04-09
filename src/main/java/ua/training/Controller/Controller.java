package ua.training.Controller;

import ua.training.Constants;
import ua.training.Group;
import ua.training.Model.RecordBook;
import ua.training.View.View;

import java.io.BufferedReader;
import java.io.IOException;
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

        recordBook.getDraft().setFamilyName(checkRegex(Constants.UA_FAMILY,
                Constants.UA_REGEX));
        recordBook.getDraft().setFamilyName(checkRegex(Constants.UA_FIRST,
                Constants.UA_REGEX));

        recordBook.getDraft().setFamilyName(checkRegex(Constants.FAMILY_NAME,
                Constants.FAMILY_REGEX));
        recordBook.getDraft().setFirstName(checkRegex(Constants.FIRST_NAME,
                Constants.FIRST_REGEX));
        recordBook.getDraft().setMobileNum(checkRegex(Constants.MOB_PHONE,
                Constants.MOB_REGEX));
        recordBook.getDraft().setEmail(checkRegex(Constants.EMAIL,
                Constants.EMAIL_REGEX));
        recordBook.getDraft().setAddress(checkRegex(Constants.ADDRESS,
                Constants.ADDRESS_REGEX));
        recordBook.getDraft().setGroup(checkRegex(Constants.GROUP,
                Group.getGroupRegex()));

//TODO: добавить запросов

        recordBook.confirmRecord();

    }

    /**
     * Ввод данных и проверка регулярным выражением
     * @param output
     * @param regex
     * @return
     */
    public String checkRegex(String output, String regex) {
        String input;
        while (true) {
            try {
                view.printMessage(output);
                input = reader.readLine();
                if (input.matches(regex))
                    return input;
                else {
                    view.printMessage(Constants.INPUTERROR);
                }
            } catch (IOException e) {
                view.printMessage(Constants.INPUTERROR);
            }
        }
    }


}

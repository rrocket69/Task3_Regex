package ua.training.Controller;

import ua.training.Constants;
import ua.training.Model.NotUniqueLoginException;
import ua.training.Model.RecordBook;
import ua.training.View.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */
class UtilityController {
    private BufferedReader reader;
    private View view;
    private RecordBook recordBook;

    UtilityController(View view, RecordBook recordBook){
        reader = new BufferedReader(new InputStreamReader(System.in));
        this.view = view;
        this.recordBook = recordBook;
    }

    /**
     * Ввод данных и проверка регулярным выражением
     * @param output
     * @param regex
     * @return
     */
    String checkRegex(String output, String regex) {
        String res;
        while (true) {
            try {
                view.printMessage(output);
                res = reader.readLine();
                if(output.equals(Constants.LOGIN)){
                    recordBook.checkUniqueLogin(res);
                }
                if (res.matches(regex)) {
                    return res;
                }
                else {
                    view.printMessage(Constants.INPUTERROR);
                }
            } catch (NotUniqueLoginException ex){
                view.printMessage(Constants.LOGIN_INPUTERROR);
                view.printString(ex.getReason());
            } catch (IOException e) {
                view.printMessage(Constants.INPUTERROR);
            }
        }
    }
}

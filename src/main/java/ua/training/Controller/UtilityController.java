package ua.training.Controller;

import ua.training.Constants;
import ua.training.View.View;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 */
class UtilityController {
    private BufferedReader reader;
    private View view;
    UtilityController(View view,BufferedReader reader){
        this.reader = reader;
        this.view = view;
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
                if (res.matches(regex))
                    return res;
                else {
                    view.printMessage(Constants.INPUTERROR);
                }
            } catch (IOException e) {
                view.printMessage(Constants.INPUTERROR);
            }
        }
    }
}

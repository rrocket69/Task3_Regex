package ua.training.Controller;

import ua.training.Constants;
import ua.training.Model.Record;
import ua.training.View.View;

import java.io.BufferedReader;

/**
 *
 */
 class InputRecord {
    private View view;
    private BufferedReader reader;
    private Record record;

    InputRecord(View view,BufferedReader reader){
        this.reader = reader;
        this.view = view;
        record = new Record();
    }

     Record getRecord() {
        UtilityController utilityController =
                new UtilityController(view,reader);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? Constants.UA_REGEX : Constants.EN_REGEX;


        record.setFamilyName(utilityController.checkRegex(Constants.FAMILY_NAME,
                str));
        record.setFirstName(utilityController.checkRegex(Constants.FIRST_NAME,
                str));
        record.setMobileNum(utilityController.checkRegex(Constants.MOB_PHONE,
                Constants.MOB_REGEX));
        record.setEmail(utilityController.checkRegex(Constants.EMAIL,
                Constants.EMAIL_REGEX));
        record.setGroup(utilityController.checkRegex(Constants.GROUP,
                Group.getGroupRegex()));
        record.setEmail(utilityController.checkRegex(Constants.LOGIN,
                Constants.LOGIN_REGEX));

        return record;
    }
}

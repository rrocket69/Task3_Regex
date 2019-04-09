package ua.training;

/**
 * Класс сообщений вывода и регулярных выражений
 *
 * @author benjamin
 */
public interface Constants {
    String INPUTERROR = "Input error";

    String UA_FAMILY = "Введіть прізвище: ";
    String UA_FIRST = "Введіть ім'я: ";
    String UA_REGEX = "[[А-ЯІЇЄҐ]&&[^ЫЭЪЁ]][[а-яіїєґ']&&[^ыэъё]]{1,18}[[а-яіїєґ]&&[^ыэъё]]";

    String FAMILY_NAME = "Please input Family Name: ";
    String FIRST_NAME = "Please input First Name: ";
    String MOB_PHONE = "Please input Mobile Phone Number: ";
    String EMAIL = "Please input Email: ";
    String GROUP = "Please input Group: ";
    String ADDRESS = "Please input Address in such format:\n PostCode City YourStreet HouseNum AptNum:";

    String FAMILY_REGEX = "[A-Z][a-z]{1,24}";
    String FIRST_REGEX = "[A-Z][a-z]{1,24}";
    String MOB_REGEX = "[+]?[0-9]{10,13}";
    String EMAIL_REGEX = ".+@.+";
    String ADDRESS_REGEX = "[0-9]{5} [A-Z][a-z]{1,24} [A-Za-z]+ [0-9]{1,10}[a-z]{0,2} [0-9]{1,10}[a-z]{0,2}.?[0-9]";
}

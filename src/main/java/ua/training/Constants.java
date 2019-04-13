package ua.training;

/**
 * Класс сообщений вывода и регулярных выражений
 *
 * @author benjamin
 */
public interface Constants {
    String INPUTERROR = "input.error";

    String FAMILY_NAME = "input.family.name.data";
    String FIRST_NAME = "input.first.name.data";
    String MOB_PHONE = "input.mobile.data";
    String EMAIL = "input.email.data";
    String GROUP = "input.group.data";
    String LOGIN = "input.login.data";

    String UA_REGEX = "[[А-ЯІЇЄҐ]&&[^ЫЭЪЁ]][[а-яіїєґ']&&[^ыэъё]]{1,24}[[а-яіїєґ]&&[^ыэъё]]";
    String EN_REGEX = "[A-Z][a-z]{1,24}";
    String MOB_REGEX = "[+]?[0-9]{10,13}";
    String EMAIL_REGEX = ".+@.+";
    String LOGIN_REGEX = "[A-Za-z0-9]{5,20}";
}

package ua.training.controller;

/**
 * Класс проверки группы
 * @author benjamin
 */
public enum Group {
    KN21,
    KB23,
    CB32,
    NT12,
    SH41;

    public static String getGroupRegex() {
        StringBuilder result = new StringBuilder();
        for (Group i : Group.values()) {
            result.append(i.toString() + "|");
        }
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
}

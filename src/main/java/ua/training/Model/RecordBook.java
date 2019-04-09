package ua.training.Model;

import java.util.ArrayList;

/**
 * Класс записной книжки
 * @author benjamin
 */
public class RecordBook {
    /**
     * Здесь хранятся записи
     */
    private ArrayList<Record> records;

    private Record draft;

    public RecordBook(){
        records = new ArrayList<Record>();
        draft = new Record();
    }

    /**
     * Сохраняет запись в книжке
     */
    public void confirmRecord(){
        records.add(draft);
        draft = new Record();
    }

    public Record getDraft() {
        return draft;
    }
}

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

    public RecordBook(){
        records = new ArrayList<Record>();
    }

    /**
     * Сохраняет запись в книжке
     */
    public void confirmRecord(Record record){
        records.add(record);
    }
}

package ua.training.Model;

import java.util.ArrayList;

/**
 * Класс записной книжки
 *
 * @author benjamin
 */
public class RecordBook implements Cloneable {
    /**
     * Здесь хранятся записи
     */
    private ArrayList<Record> records;

    public RecordBook() {
        records = new ArrayList<Record>();
    }

    /**
     * Сохраняет запись в книжке
     */
    public void confirmRecord(Record record) {
        records.add(record);
    }

    public boolean checkUniqueLogin(String mbLogin) throws NotUniqueLoginException {
        for (Record i : records) {
            if (i.getLogin().equals(mbLogin)) {
                throw new NotUniqueLoginException(mbLogin);
            }
        }
        return true;
    }

    @Override
    public RecordBook clone() {
        try {
            RecordBook temp = (RecordBook) super.clone();
            temp.records = new ArrayList<Record>();
            for (Record i : this.records) {
                temp.records.add(i.clone());
            }
            return temp;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

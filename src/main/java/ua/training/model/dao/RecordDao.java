package ua.training.model.dao;

import ua.training.model.entity.Record;
import ua.training.model.entity.RecordBook;

import java.util.List;

public interface RecordDao extends AutoCloseable{
    void create(Record record);
    Record findById(int id);
    List<Record> findAll();
    void update(Record entity);
    void delete(int id);

}

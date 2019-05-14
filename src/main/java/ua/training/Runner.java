package ua.training;

import ua.training.model.dao.DaoFactory;
import ua.training.model.dao.RecordDao;
import ua.training.model.entity.Record;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        DaoFactory factory = DaoFactory.getInstance();
        RecordDao dao = factory.createRecordDao();

//        System.out.println(dao.findById(1));
//        System.out.println(dao.findAll());

//        dao.create(new Record("Taras2", "taras12345"));
//        dao.create(new Record("sanya1", "tif21"));
//        dao.create(new Record("yarik3", "ogo21"));
//        dao.create(new Record("vladik6", "santa2421"));
//        dao.create(new Record("vadya9", "angel424"));
//        dao.create(new Record("oneMore", "random343"));

        List<Record> recordBookList = dao.findAll();
        int maxId = Integer.MIN_VALUE;
        int currentId;
        for (Record currentRecord : recordBookList) {
            if ((currentId = currentRecord.getId()) > maxId) {
                maxId = currentId;
            }
        }
        System.out.println(dao.findById(maxId));

        dao.update((new Record(maxId, "Nik2", "nik12345")));
        System.out.println(dao.findById(maxId));

        dao.delete(maxId);
    }


}

package dao;

import java.util.List;

public interface BaseDao<T> {

    List<T> findAll();
    T findById(int id);
    T saveToDatabase(T object);
    void deleteFromDatabase(int id);
    void updateOnDatabase(T object);

}

package lk.ijse.pos_backend.dao;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDao<T,Type>extends SuperDao {
    ArrayList<T> GetAll() throws SQLException, ClassNotFoundException;
    Boolean Save(T t);
    T Get(Type type);
    Boolean Update(T t);
    void Delete(T t);
}

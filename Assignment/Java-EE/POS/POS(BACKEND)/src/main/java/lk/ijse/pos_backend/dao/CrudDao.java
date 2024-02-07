package lk.ijse.pos_backend.dao;

public interface CrudDao<T,Type>extends SuperDao {
    Boolean Save(T t);
    T Get(Type type);
    void Update(T t);
    void Delete(T t);
}

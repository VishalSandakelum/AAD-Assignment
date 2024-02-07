package lk.ijse.pos_backend.dao.custom.impl;

import lk.ijse.pos_backend.dao.custom.CustomerDao;
import lk.ijse.pos_backend.dao.custom.impl.Util.SqlUtil;
import lk.ijse.pos_backend.entity.CustomerEntity;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.hibernate.Session;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/

@NoArgsConstructor
public class CustomerDaoImpl implements CustomerDao {
    private Session session;

    @SneakyThrows
    @Override
    public Boolean Save(CustomerEntity customerEntity) {
        return SqlUtil.execute("INSERT INTO customer(id, address, name, salary) VALUES(?, ?, ?, ?)",
                customerEntity.getId(),customerEntity.getAddress(),customerEntity.getName(),customerEntity.getSalary());
    }

    @Override
    public CustomerEntity Get(String id) {
        return session.get(CustomerEntity.class,id);
    }

    @Override
    public void Update(CustomerEntity customerEntity) {
        session.update(customerEntity);
    }

    @Override
    public void Delete(CustomerEntity customerEntity) {
        session.delete(customerEntity);
    }

    @Override
    public void SetSession(Session session) {
        this.session = session;
    }
}

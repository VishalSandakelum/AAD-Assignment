package lk.ijse.pos_backend.dao.custom.impl;

import lk.ijse.pos_backend.dao.custom.CustomerDao;
import lk.ijse.pos_backend.entity.CustomerEntity;
import org.hibernate.Session;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public String Save(CustomerEntity customerEntity) {
        return null;
    }

    @Override
    public CustomerEntity Get(String s) {
        return null;
    }

    @Override
    public void Update(CustomerEntity customerEntity) {

    }

    @Override
    public void Delete(CustomerEntity customerEntity) {

    }

    @Override
    public void SetSession(Session session) {

    }
}

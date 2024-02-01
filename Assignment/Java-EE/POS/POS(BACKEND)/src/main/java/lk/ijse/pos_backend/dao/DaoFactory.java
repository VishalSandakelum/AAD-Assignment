package lk.ijse.pos_backend.dao;

import lk.ijse.pos_backend.dao.custom.impl.*;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/
public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory() {}

    private static DaoFactory getDaoFactory(){return (daoFactory==null) ? daoFactory = new DaoFactory() : daoFactory;}

    public enum DaoType {
        CUSTOMER,ITEM,ORDER,ORDERDETAILS
    }

    public <SuperDao> SuperDao getDao(DaoType type){
        switch (type) {
            case CUSTOMER:
                return (SuperDao) new CustomerDaoImpl();
            case ITEM:
                return (SuperDao) new ItemDaoImpl();
            case ORDER:
                return (SuperDao) new OrderDaoImpl();
            case ORDERDETAILS:
                return (SuperDao) new OrderDetailsDaoImpl();
            default:
                return null;
        }
    }
}

package lk.ijse.pos_backend.bo;

import lk.ijse.pos_backend.bo.custom.impl.*;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/
public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {}

    private static BOFactory getBoFactory(){return (boFactory==null) ? boFactory = new BOFactory() : boFactory;}

    public enum BOtype {
        CUSTOMER,ITEM,ORDER,ORDERDETAILS
    }

    public <SuperBO> SuperBO getBo(BOtype type){
        switch (type){
            case CUSTOMER:
                return (SuperBO) new CustomerBOIMPL();
            case ITEM:
                return (SuperBO) new ItemBOIMPL();
            case ORDER:
                return (SuperBO) new OrderBOIMPL();
            case ORDERDETAILS:
                return (SuperBO) new OrderDetailsBOIMPL();
            default:
                return null;
        }
    }
}

package lk.ijse.pos_backend.dao.custom.impl;

import lk.ijse.pos_backend.dao.custom.OrderDao;
import lk.ijse.pos_backend.dao.custom.impl.Util.SqlUtil;
import lk.ijse.pos_backend.entity.OrderEntity;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.hibernate.Session;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/

@NoArgsConstructor
public class OrderDaoImpl implements OrderDao {
    private Session session;

    @SneakyThrows
    @Override
    public ArrayList<OrderEntity> GetAll() throws SQLException, ClassNotFoundException {
        try (ResultSet rst = SqlUtil.execute("SELECT * FROM orders")) {
            ArrayList<OrderEntity> data = new ArrayList<>();
            while (rst.next()) {
                data.add(new OrderEntity(
                                rst.getString(1),
                                rst.getDate(2),
                                rst.getString(3)
                        )
                );
            }
            SqlUtil.CloseConnection();
            return data;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @SneakyThrows
    @Override
    public Boolean Save(OrderEntity orderEntity) {
        return SqlUtil.execute("INSERT INTO orders(order_id, date, customer_id) VALUES(?, ?, ?)",
                orderEntity.getOrder_id(),orderEntity.getDate(),orderEntity.getCustomerId()
        );
    }

    @SneakyThrows
    @Override
    public OrderEntity Search(String id) {
        ResultSet rst = SqlUtil.execute("SELECT * FROM orders WHERE order_id = ?",id);
        return rst.next() ? new OrderEntity(
                rst.getString(1),
                rst.getDate(2),
                rst.getString(3)
        ):null;
    }

    @SneakyThrows
    @Override
    public Boolean Update(OrderEntity orderEntity) {
        return SqlUtil.execute("UPDATE orders SET date = ?, customer_id = ? WHERE order_id  = ?",
                orderEntity.getDate(),orderEntity.getCustomerId(),orderEntity.getOrder_id()
        );
    }

    @SneakyThrows
    @Override
    public Boolean Delete(String orderid) {
        return SqlUtil.execute("DELETE FROM orders WHERE  code = ?",orderid);
    }

    @Override
    public void SetSession(Session session) {
        this.session = session;
    }
}

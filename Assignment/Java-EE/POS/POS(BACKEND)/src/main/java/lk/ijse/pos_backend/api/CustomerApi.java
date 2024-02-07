package lk.ijse.pos_backend.api;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import lk.ijse.pos_backend.bo.BOFactory;
import lk.ijse.pos_backend.bo.custom.CustomerBO;
import lk.ijse.pos_backend.dto.CustomerDTO;
import lk.ijse.pos_backend.model.Customer;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/

@WebServlet(name = "Customer",urlPatterns = "/customer")
public class CustomerApi extends HttpServlet {

    CustomerBO customerBO = BOFactory.getBoFactory().getBo(BOFactory.BOtype.CUSTOMER);

    public static Connection getConnection() throws NamingException, SQLException {
        Context initialContext = new InitialContext();
        DataSource dataSource = (DataSource) initialContext.lookup("java:comp/env/DBCP");

        return dataSource.getConnection();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Connection connection = null;
        try {
            connection = CustomerApi.getConnection();
        } catch (SQLException | NamingException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        System.out.println("Get Method is Invoked");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Jsonb jsonb = JsonbBuilder.create();
        Customer customer = jsonb.fromJson(req.getReader(), Customer.class);

        try {
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setId(customer.getId());
            customerDTO.setName(customer.getName());
            customerDTO.setAddress(customer.getAddress());
            customerDTO.setSalary(customer.getSalary());

            Boolean bool = customerBO.SaveCustomer(customerDTO);
            if(bool){
                resp.setStatus(200);
            }else {
                resp.setStatus(500);
            }
        }catch (Exception e){
            e.printStackTrace();
            resp.setStatus(500);
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}

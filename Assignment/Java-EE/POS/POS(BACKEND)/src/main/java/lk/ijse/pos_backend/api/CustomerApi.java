package lk.ijse.pos_backend.api;

import lk.ijse.pos_backend.config.SessionFactoryConfig;
import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/
public class CustomerApi extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println();
    }
}

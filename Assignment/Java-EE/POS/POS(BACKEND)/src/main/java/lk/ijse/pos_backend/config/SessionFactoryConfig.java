package lk.ijse.pos_backend.config;

import lk.ijse.pos_backend.entity.CustomerEntity;
import lk.ijse.pos_backend.entity.ItemEntity;
import lk.ijse.pos_backend.entity.OrderEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/
public class SessionFactoryConfig {
    private static SessionFactoryConfig sessionFactoryConfig;
    private final SessionFactory sessionFactory;

    public SessionFactoryConfig() {
        Properties properties = new Properties();
        try {
            properties.load(ClassLoader.getSystemClassLoader().getResourceAsStream("hibernate.properties"));
        }catch (Exception e) {}

        sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(CustomerEntity.class)
                .addAnnotatedClass(ItemEntity.class)
                .addAnnotatedClass(OrderEntity.class)
                .buildSessionFactory();
    }

    public static SessionFactoryConfig getInstance() {
        return (sessionFactoryConfig==null)?sessionFactoryConfig = new SessionFactoryConfig() : sessionFactoryConfig;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}

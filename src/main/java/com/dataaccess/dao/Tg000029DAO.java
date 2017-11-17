package com.dataaccess.dao;

import com.dataaccess.api.JpaDaoImpl;

import com.proyecto.Tg000029;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * A data access object (DAO) providing persistence and search support for
 * Tg000029 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tg000029
 */
@Scope("singleton")
@Repository("Tg000029DAO")
public class Tg000029DAO extends JpaDaoImpl<Tg000029, String>
    implements ITg000029DAO {
    private static final Logger log = LoggerFactory.getLogger(Tg000029DAO.class);
    @PersistenceContext
    private EntityManager entityManager;

    public static ITg000029DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITg000029DAO) ctx.getBean("Tg000029DAO");
    }
}

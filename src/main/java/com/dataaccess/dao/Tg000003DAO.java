package com.dataaccess.dao;

import com.dataaccess.api.JpaDaoImpl;

import com.proyecto.Tg000003;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * A data access object (DAO) providing persistence and search support for
 * Tg000003 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tg000003
 */
@Scope("singleton")
@Repository("Tg000003DAO")
public class Tg000003DAO extends JpaDaoImpl<Tg000003, String>
    implements ITg000003DAO {
    private static final Logger log = LoggerFactory.getLogger(Tg000003DAO.class);
    @PersistenceContext
    private EntityManager entityManager;

    public static ITg000003DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITg000003DAO) ctx.getBean("Tg000003DAO");
    }
}

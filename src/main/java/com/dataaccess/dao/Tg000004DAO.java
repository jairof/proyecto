package com.dataaccess.dao;

import com.dataaccess.api.JpaDaoImpl;

import com.proyecto.Tg000004;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * A data access object (DAO) providing persistence and search support for
 * Tg000004 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tg000004
 */
@Scope("singleton")
@Repository("Tg000004DAO")
public class Tg000004DAO extends JpaDaoImpl<Tg000004, String>
    implements ITg000004DAO {
    private static final Logger log = LoggerFactory.getLogger(Tg000004DAO.class);
    @PersistenceContext
    private EntityManager entityManager;

    public static ITg000004DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITg000004DAO) ctx.getBean("Tg000004DAO");
    }
}

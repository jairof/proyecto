package com.dataaccess.dao;

import com.dataaccess.api.JpaDaoImpl;

import com.proyecto.Tg000026;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * A data access object (DAO) providing persistence and search support for
 * Tg000026 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tg000026
 */
@Scope("singleton")
@Repository("Tg000026DAO")
public class Tg000026DAO extends JpaDaoImpl<Tg000026, String>
    implements ITg000026DAO {
    private static final Logger log = LoggerFactory.getLogger(Tg000026DAO.class);
    @PersistenceContext
    private EntityManager entityManager;

    public static ITg000026DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITg000026DAO) ctx.getBean("Tg000026DAO");
    }
}

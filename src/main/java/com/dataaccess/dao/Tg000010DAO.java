package com.dataaccess.dao;

import com.dataaccess.api.JpaDaoImpl;

import com.proyecto.Tg000010;
import com.proyecto.Tg000010Id;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * A data access object (DAO) providing persistence and search support for
 * Tg000010 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tg000010
 */
@Scope("singleton")
@Repository("Tg000010DAO")
public class Tg000010DAO extends JpaDaoImpl<Tg000010, Tg000010Id>
    implements ITg000010DAO {
    private static final Logger log = LoggerFactory.getLogger(Tg000010DAO.class);
    @PersistenceContext
    private EntityManager entityManager;

    public static ITg000010DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITg000010DAO) ctx.getBean("Tg000010DAO");
    }
}

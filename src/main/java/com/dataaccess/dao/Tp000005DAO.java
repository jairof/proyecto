package com.dataaccess.dao;

import com.dataaccess.api.JpaDaoImpl;

import com.proyecto.Tp000005;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * A data access object (DAO) providing persistence and search support for
 * Tp000005 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tp000005
 */
@Scope("singleton")
@Repository("Tp000005DAO")
public class Tp000005DAO extends JpaDaoImpl<Tp000005, String>
    implements ITp000005DAO {
    private static final Logger log = LoggerFactory.getLogger(Tp000005DAO.class);
    @PersistenceContext
    private EntityManager entityManager;

    public static ITp000005DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITp000005DAO) ctx.getBean("Tp000005DAO");
    }
}

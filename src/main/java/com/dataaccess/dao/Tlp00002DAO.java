package com.dataaccess.dao;

import com.dataaccess.api.JpaDaoImpl;

import com.proyecto.Tlp00002;
import com.proyecto.Tlp00002Id;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * A data access object (DAO) providing persistence and search support for
 * Tlp00002 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tlp00002
 */
@Scope("singleton")
@Repository("Tlp00002DAO")
public class Tlp00002DAO extends JpaDaoImpl<Tlp00002, Tlp00002Id>
    implements ITlp00002DAO {
    private static final Logger log = LoggerFactory.getLogger(Tlp00002DAO.class);
    @PersistenceContext
    private EntityManager entityManager;

    public static ITlp00002DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITlp00002DAO) ctx.getBean("Tlp00002DAO");
    }
}

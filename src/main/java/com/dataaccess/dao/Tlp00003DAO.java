package com.dataaccess.dao;

import com.dataaccess.api.JpaDaoImpl;

import com.proyecto.Tlp00003;
import com.proyecto.Tlp00003Id;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * A data access object (DAO) providing persistence and search support for
 * Tlp00003 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tlp00003
 */
@Scope("singleton")
@Repository("Tlp00003DAO")
public class Tlp00003DAO extends JpaDaoImpl<Tlp00003, Tlp00003Id>
    implements ITlp00003DAO {
    private static final Logger log = LoggerFactory.getLogger(Tlp00003DAO.class);
    @PersistenceContext
    private EntityManager entityManager;

    public static ITlp00003DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITlp00003DAO) ctx.getBean("Tlp00003DAO");
    }
}

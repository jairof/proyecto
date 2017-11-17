package com.dataaccess.dao;

import com.dataaccess.api.JpaDaoImpl;

import com.proyecto.Tlp00001;
import com.proyecto.Tlp00001Id;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * A data access object (DAO) providing persistence and search support for
 * Tlp00001 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tlp00001
 */
@Scope("singleton")
@Repository("Tlp00001DAO")
public class Tlp00001DAO extends JpaDaoImpl<Tlp00001, Tlp00001Id>
    implements ITlp00001DAO {
    private static final Logger log = LoggerFactory.getLogger(Tlp00001DAO.class);
    @PersistenceContext
    private EntityManager entityManager;

    public static ITlp00001DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITlp00001DAO) ctx.getBean("Tlp00001DAO");
    }
}

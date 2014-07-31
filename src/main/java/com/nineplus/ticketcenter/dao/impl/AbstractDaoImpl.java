package com.nineplus.ticketcenter.dao.impl;

import com.nineplus.ticketcenter.dao.AbstractDao;
import java.io.Serializable;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Zuui
 */
public abstract class AbstractDaoImpl<E, I extends Serializable> implements AbstractDao<E, Serializable> {

        private final Class<E> entityClass;

    protected AbstractDaoImpl(Class<E> entityClass) {
        this.entityClass = entityClass;
    }

    @Autowired
    private SessionFactory sessionFactory;
    
    
}

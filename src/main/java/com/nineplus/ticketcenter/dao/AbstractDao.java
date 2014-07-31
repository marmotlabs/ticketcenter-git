package com.nineplus.ticketcenter.dao;

import java.io.Serializable;

/**
 *
 * @author Zuui
 * @param <E>
 * @param <I>
 */
public interface AbstractDao<E, I extends Serializable> {

    E findById(I id);

    void saveOrUpdate(E e);

    void delete(E e);

}

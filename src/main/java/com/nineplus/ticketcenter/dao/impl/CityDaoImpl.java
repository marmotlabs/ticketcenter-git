package com.nineplus.ticketcenter.dao.impl;

import com.nineplus.ticketcenter.dao.CityDao;
import com.nineplus.ticketcenter.domain.City;
import java.util.List;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Zuui
 */
@Repository
public class CityDaoImpl extends AbstractDaoImpl<City, Long> implements CityDao {

    public CityDaoImpl() {
        super(City.class);
    }

    @Override
    public List<City> findCities() {
        Query query = getCurrentSession().createQuery("from City");
        return (List<City>) query.list();
    }
}

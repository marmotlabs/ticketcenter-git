package com.nineplus.ticketcenter.dao;

import com.nineplus.ticketcenter.domain.City;
import java.util.List;

/**
 *
 * @author Zuui
 */
public interface CityDao extends AbstractDao<City, Long> {

    List<City> findCities();

}

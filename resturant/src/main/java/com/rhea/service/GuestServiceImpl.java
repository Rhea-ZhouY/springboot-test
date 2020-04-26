package com.rhea.service;

import com.rhea.dao.GuestDao;
import com.rhea.domain.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class GuestServiceImpl implements IGuestService{
    @Autowired
    private GuestDao dao;
    @Override
    public List<Guest> selectAll() {
        return dao.selectAll();
    }

    @Override
    public void add(Guest guest) {
        dao.add(guest);
    }

    @Override
    public void toUpdate(Guest guest) {
        dao.toUpdate(guest);
    }

    @Override
    public Guest selectOne(String name) {
        return dao.selectOne(name);
    }

    @Override
    public void delete(String name) {
        dao.delete(name);
    }
}

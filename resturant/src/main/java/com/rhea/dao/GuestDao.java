package com.rhea.dao;

import com.rhea.domain.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
@Repository
public class GuestDao {
    private  List<Guest> guestList = new ArrayList<>();
    {
        guestList.add(new Guest("黄晓明","总裁"));
        guestList.add(new Guest("秦海璐","财务"));
        guestList.add(new Guest("林述威","总厨"));
        guestList.add(new Guest("王俊凯","经理"));
        guestList.add(new Guest("杨紫","前台"));
    }
    public List<Guest> selectAll() {
        return guestList;
    }

    public void add(Guest guest) {
        if (guest.getName()!=null&& !"".equals(guest.getName())) {
            guestList.add(guest);
        }
    }

    public void toUpdate(Guest newGuest) {
        Guest oldGuest = selectOne(newGuest.getName());
        oldGuest.setRole(newGuest.getRole());
    }

    public Guest selectOne(String name) {
        for (Guest g:guestList){
            if (g.getName().equals(name)){
                return g;
            }
        }
        return new Guest("","");
    }

    public void delete(String name) {
        Guest oldGuest = selectOne(name);
        guestList.remove(oldGuest);
    }
}

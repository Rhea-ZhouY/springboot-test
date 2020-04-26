package com.rhea.controller;

import com.rhea.domain.Guest;
import com.rhea.service.IGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Administrator
 */
@Controller
public class GuestController {
    @Autowired
    private IGuestService guestService;
    @RequestMapping("/guest")
    public String showGuest(Model model){
        List<Guest> guestList = guestService.selectAll();
        model.addAttribute("guestList",guestList);
        return "index";
    }
    @RequestMapping("guest/add")
    public String add(){
        return "add";
    }
    @RequestMapping("guest/toAdd")
    public String toAdd(Guest guest){
        guestService.add(guest);
        return "redirect:/guest";
    }
    @RequestMapping("guest/update")
    public String update(String name,Model model){
        Guest g = guestService.selectOne(name);
        model.addAttribute("guest",g);
        return "update";
    }
    @RequestMapping("guest/toUpdate")
    public String toUpdate(Guest guest){
        guestService.toUpdate(guest);
        return "redirect:/guest";
    }

    @RequestMapping("guest/delete")
    public String delete(String name){
        guestService.delete(name);
        return "redirect:/guest";
    }
}

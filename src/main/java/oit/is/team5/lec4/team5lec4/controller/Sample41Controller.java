package oit.is.team5.lec4.team5lec4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import oit.is.team5.lec4.team5lec4.model.ChamberMapper;

@Controller
public class Sample41Controller {
  @Autowired
  ChamberMapper chamberMapper;

  @GetMapping("/sample4/step1")
  public String sample41() {
    return "sample41.html";
  }

  @GetMapping("/sample4/step2/{id}")
  public String sample42(@PathVariable Integer id, ModelMap model) {
    var chamber = chamberMapper.selectById(id);
    model.addAttribute("chamber", chamber);

    return "sample41.html";
  }
}

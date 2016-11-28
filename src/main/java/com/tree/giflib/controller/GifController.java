package com.tree.giflib.controller;

import com.tree.giflib.data.GifRepository;
import com.tree.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping(value = "/")
    public String home(ModelMap modelMap){

        List<Gif> gifs = gifRepository.getRepository();
        modelMap.put("gifs",gifs);

        return "home";
    }

    @RequestMapping(value = "/gif/{name}")
    public String details(@PathVariable String name, ModelMap modelMap){

        Gif gif = gifRepository.findByName(name);
        modelMap.put("gif",gif);

        return "gif-details";
    }
}


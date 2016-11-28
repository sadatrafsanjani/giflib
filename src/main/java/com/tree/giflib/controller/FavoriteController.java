package com.tree.giflib.controller;

import com.tree.giflib.data.GifRepository;
import com.tree.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class FavoriteController {

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping(value = "/favorites")
    public String home(ModelMap modelMap){

        List<Gif> gifs = gifRepository.getFavorite();
        modelMap.put("gifs",gifs);

        return "favorites";
    }
}

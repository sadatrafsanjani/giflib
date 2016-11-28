package com.tree.giflib.data;

import com.tree.giflib.model.Gif;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {

    private static final List<Gif> repository = Arrays.asList(
            new Gif("android-explosion", 1, LocalDate.of(1994,8,7),"Mathew", false),
            new Gif("ben-and-mike", 2, LocalDate.of(1994,8,7),"John", true),
            new Gif("book-dominos", 2, LocalDate.of(1994,8,7),"Serge", true),
            new Gif("compiler-bot", 3, LocalDate.of(1994,8,7),"Mathew", true),
            new Gif("cowboy-coder", 3, LocalDate.of(1994,8,7),"Bradok", true),
            new Gif("infinite-andrew", 1, LocalDate.of(1994,8,7),"Lisa", false)
    );

    public Gif findByName(String name){

        for(Gif gif : repository){
            if(gif.getName().equals(name)){
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getRepository(){
        return repository;
    }

    public List<Gif> findByCategoryId(int id){

        List<Gif> gifs = new ArrayList<>();
        for(Gif gif : repository){
            if(gif.getCategoryId() == id){
                gifs.add(gif);
            }
        }

        return gifs;
    }

    public List<Gif> getFavorite(){

        List<Gif> gifs = new ArrayList<>();

        for(Gif gif : repository){
            if(gif.isFavorite()){
                gifs.add(gif);
            }
        }

        return gifs;
    }
}

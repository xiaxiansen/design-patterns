package com.atguigu.design.structural.adapter.clazz;

import com.atguigu.design.structural.adapter.MoviePlayer;
import com.atguigu.design.structural.adapter.Player;

public class MainTest {

    public static void main(String[] args) {

        Player player = new MoviePlayer();
        JPMoviePlayerAdapter adapter = new JPMoviePlayerAdapter(player);


        adapter.play();
//        player.play();

    }
}

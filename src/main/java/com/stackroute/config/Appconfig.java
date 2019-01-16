package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.stackroute")
public class Appconfig {

    @Bean("actor1")
    public Actor getActorBean1() {
        Actor actor = new Actor("hima","female",22);
        return actor;
    }

    @Bean("actor2")
    public Actor getActorBean2() {
        Actor actor = new Actor("meghana", "female", 22);
        return actor;
    }

    @Bean("actor3")
    public Actor getActorBean3() {
        Actor actor = new Actor("varun", "male", 22);
        return actor;
    }

    @Bean("movieA")
    public Movie getMovieBean1()
    {
        return new Movie(getActorBean1());
    }
    @Bean("movieB")
    public Movie getMovieBean2()
    {
        return new Movie(getActorBean2());
    }
    @Bean("movieC")
    public Movie getMovieBean3()
    {
        return new Movie(getActorBean3());
    }
}

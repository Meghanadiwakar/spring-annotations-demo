package com.stackroute;

import com.stackroute.config.Appconfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
        context.register(Appconfig.class);
        //context.refresh();

        Movie movie=(Movie) context.getBean("movie");
        System.out.println(movie.getActor());
    }

}

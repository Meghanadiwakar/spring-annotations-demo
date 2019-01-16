package com.stackroute;

import com.stackroute.config.Appconfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
        //context.register(Appconfig.class);
        //context.refresh();

    Movie movie1=(Movie) context.getBean("movieA");
       System.out.println(movie1.getActor());
    Movie movie2=(Movie) context.getBean("movieB");
       System.out.println(movie2.getActor());
    Movie movie3=(Movie) context.getBean("movieC");
       System.out.println(movie3.getActor());
}
}

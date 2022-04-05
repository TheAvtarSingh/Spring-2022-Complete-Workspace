package org.practice.simpleDependencyInjectiom;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        hollywoodSeries seriesfirst = context.getBean("extraction",hollywoodSeries.class);
        
        System.out.println("-------------------------------------------------");
        System.out.println("First Series Using Constructor Arguement ");
        System.out.println("Series Name is : "+seriesfirst.seriesName());
        System.out.println("Series Details are : "+seriesfirst.giveSeriesDetails());
        System.out.println("-------------------------------------------------");
        hollywoodSeries seriestwo = context.getBean("redNotice",hollywoodSeries.class);
        System.out.println("-------------------------------------------------");
        System.out.println("Second Series Using Setter Arguement ");
        System.out.println("Series Name is : "+seriestwo.seriesName());
        System.out.println("Series Details are : "+seriestwo.giveSeriesDetails());
        System.out.println("-------------------------------------------------");
        hollywoodSeries seriesthree = context.getBean("sixUnderground",hollywoodSeries.class);

        seriesThree sThree2 = context.getBean("sixUnderground",seriesThree.class);
        System.out.println("-------------------------------------------------");
        System.out.println("Third Series Using Field Arguement ");
        System.out.println("Series Name is : "+seriesthree.seriesName());
        System.out.println("Series Details are : "+seriesthree.giveSeriesDetails());
        System.out.println("Movie Ratings : "  +sThree2.getMovierating());
        System.out.println("Movie Cast : "+sThree2.getMoviecast());
        System.out.println("-------------------------------------------------");
        context.close();
    }
}

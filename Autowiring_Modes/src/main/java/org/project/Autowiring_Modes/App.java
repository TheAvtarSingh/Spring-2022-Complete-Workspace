package org.project.Autowiring_Modes;



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
		/*
		 * hollywoodSeries seriesfirst =
		 * context.getBean("sixUnderground",hollywoodSeries.class);
		 * 
		 * System.out.println("-------------------------------------------------");
		 * 
		 * System.out.println("Series Name is : "+seriesfirst.seriesName());
		 * System.out.println("Series Details are : "+seriesfirst.giveSeriesDetails());
		 * 
		 * 
		 * System.out.println("-------------------------------------------------");
		 */
        System.out.println("-------------------------------------------------");
        seriesThreeDetails s2 = context.getBean("dd",seriesThreeDetails.class);
       System.out.println( s2);
        
		/*
		 * seriesThree s3 = context.getBean("dd",seriesThree.class);
		 * System.out.println("Casting of Movie is done by : "+s3.getMoviecast());
		 * System.out.println("Current Rating of Movie is : "+s3.getMovierating());
		 * 
		 */  System.out.println("-------------------------------------------------");

        context.close();
    }
}

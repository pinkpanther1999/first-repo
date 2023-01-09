package org.fi.spring.firstspringapp;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-cart.xml");)
        
        {
        	Cart objCart = (Cart)context.getBean("objCart");
        	objCart .addToCart();
        	objCart.listCart();
        	System.out.println();
        }catch (BeansException e) {
        	e.printStackTrace();
        }
    }
}

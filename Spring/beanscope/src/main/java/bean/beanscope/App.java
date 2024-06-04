package bean.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
		@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("beanScope.xml");
Employee em=(Employee) context.getBean("emp");
System.out.println(em);

//Address ad=(Address) context.getBean("address");
//System.out.println(ad);
        
    }
}

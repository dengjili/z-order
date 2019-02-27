package org.z.order.provider;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author it
 */
public class StartApp2 
{
	private static final Logger logger = LoggerFactory.getLogger(StartApp2.class);
    public static void main( String[] args ) throws IOException
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		logger.debug("{}", "order-provider启动。。。");
		System.in.read();
    }
}

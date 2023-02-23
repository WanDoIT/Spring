package ex06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("autowired-context.xml");
		
		Controller con = ctx.getBean("controller",Controller.class);
		ServiceImpl service = ctx.getBean("service",ServiceImpl.class);
		
		System.out.println(con.getService().hello());
		con.hello();
		
		System.out.println(service.getDao().hello());
		
	}
}

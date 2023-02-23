package ex07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex02.MemberDAO;

public class MainClass {
	public static void main(String[] args) {
		
		//java설정으로 만들어진 bean파일은
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		System.out.println(ctx.getBeanDefinitionCount());
		
		System.out.println(ctx.getBean("dao",MemberDAO.class).getDatabaseDev().getUid());
	}
}

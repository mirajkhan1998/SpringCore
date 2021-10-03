package compe.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pe.bean.UserAccount;

@SuppressWarnings("deprecation")
public class PETest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/pe/common/application-context.xml"));
		UserAccount userAccount = beanFactory.getBean("userAccount", UserAccount.class);
		System.out.println(userAccount);

	}

}

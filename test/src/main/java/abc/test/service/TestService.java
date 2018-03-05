package abc.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	private JavaMailSender javaMailSender;
	
	@Autowired
	public TestService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
	
	public void sendTest() throws MailException{
		//sendEmail
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo("hoffmannfraenz@gmail.com");
		mail.setFrom("my1gamingaddress@gmail.com");
		mail.setSubject("Jeff ist ein Huso");
		mail.setText("jeff ist ein richteger Huso");
		
		javaMailSender.send(mail);
	}
	
}

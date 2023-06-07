package gmail;

import java.util.Properties;

import javax.mail.Session;
import javax.servlet.jsp.tagext.TryCatchFinally;

import org.eclipse.jdt.internal.compiler.ast.TryStatement;

public class Confm {

	public boolean sendMail(String email) {
		
		String host="smtp.office365.com";
		final String user="shruchatter79136@gmail.com";
		final String password = "shru123";
		String to=email;
		
		Properties prop=new Properties();
		prop.put("mail.smtp.host", host);
		prop.put("mail.smtp.port", 587);
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.debug", "true");
		prop.put("mail.transport.protocol", "smtp");
		
		

	
		return true;
		
	}

	
}

package kodlamaioLayered.core.logging;

public class MailLogger implements Logger{
	
	@Override
	public void log(String data) {
		
		System.out.println("Maile loglandı. " + data);
	}

}

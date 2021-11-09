package dependency.injection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FrameWorkFactory {
	public static void main(String args[]) throws IOException {
		ServiceFactory serviceFactory = new ServiceFactory();
		System.out.println("Enter the name of plan for which the bill will be generated: ");
		String serviceName = br.readLine();
		Service service = service Factory.getService(serviceName);
		Service serviceb = service;
				//Airtelservice();
		//ServiceB();
		Client client = new ClientA(serviceb);//Constuctor injection
		client.dosomething();
		}

}

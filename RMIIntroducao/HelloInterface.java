import java.rmi.Remote;


public interface HelloInterface extends Remote {

	public String helloName(String name);
}

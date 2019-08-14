package structural.proxy;

public class Program {

	public static void main(String[] args) throws Exception {
		CommandExecutor command = new CommandExecutorProxy("admin", "password");
		command.runCommand("ls");
		command.runCommand("rm");

	}

}

package behaviour.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

	private List<Command> history = new ArrayList<Command>();

	public void invoke(Command command) {
		history.add(command);
		command.execute();
	}

	public void undo() {
		int len = history.size() - 1;
		Command command = history.get(len);
		history.remove(len);
		System.out.println("undo");
		command.execute();
	}

}

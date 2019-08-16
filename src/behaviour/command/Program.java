package behaviour.command;

public class Program {

	public static void main(String[] args) {
		Invoker invoker = new Invoker();

		Command copy = new CopyCommand();
		invoker.invoke(copy);
		
		Command paste = new PasteCommand();
		invoker.invoke(paste);

		invoker.undo();
		invoker.undo();

	}

}

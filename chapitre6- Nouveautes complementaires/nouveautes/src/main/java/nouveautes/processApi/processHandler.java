package nouveautes.processApi;

public class processHandler {
	public static void main(String[] args) {
		for (ProcessHandle p : ProcessHandle.allProcesses().toList()) {
			System.out.println(p.pid());
		}

	}

}

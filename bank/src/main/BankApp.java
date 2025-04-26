package main;

import service.BankService;
import utils.BankUtils;

public class BankApp {
	public static void main(String[] args) {
//		BankService service = BankService.getInstance();
		while(true) {
			System.out.println("=======================================================");
			System.out.println(""
					+ "██████╗      ██╗    ██████╗  █████╗ ███╗   ██╗██╗  ██╗\r\n"
					+ "██╔══██╗     ██║    ██╔══██╗██╔══██╗████╗  ██║██║ ██╔╝\r\n"
					+ "██║  ██║     ██║    ██████╔╝███████║██╔██╗ ██║█████╔╝ \r\n"
					+ "██║  ██║██   ██║    ██╔══██╗██╔══██║██║╚██╗██║██╔═██╗ \r\n"
					+ "██████╔╝╚█████╔╝    ██████╔╝██║  ██║██║ ╚████║██║  ██╗\r\n"
					+ "╚═════╝  ╚════╝     ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝");
			System.out.println("=======================================================");
			System.out.println("==============Brought to you by DanGitUser=============");
			System.out.println("=======================================================");
			BankService.getInstance().menu();
		}
	}
}

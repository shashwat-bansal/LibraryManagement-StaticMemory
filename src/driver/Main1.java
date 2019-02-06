package driver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import operation.Crud;
public class Main1 {

	public static void main(String[] args) {
		 try {
			 BufferedReader in =new BufferedReader(new InputStreamReader(System.in));  
		
		String choice = "0";
		Crud c = new Crud();
		
		while(true) {
			System.out.println("Please enter a choice: \n 1.Enter new book details \n "
					+ "2.Update book details \n 3.Delete book details \n"
					+ " 4.View all entries \n 5.Exit");
			
			choice = in.readLine();
			
			switch (choice) {
			
			case "1" :
				c.create();
				continue;
				
			case "2" :
				c.view();
				System.out.println("Which Book id do you want to Update?");
				
				int i =Integer.parseInt(in.readLine());
				c.update(i);
				
				continue;
				
			case "3" :
				c.view();
				
				System.out.println("Which Book id do you want to Delete?");
				int j =Integer.parseInt(in.readLine());
				c.delete(j);				
				continue;
				
			case "4" :
				c.view();
				continue;
				
			case "5" :
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid Choice. Please try again.");
			
			}
		}
		 }catch(Exception e) {}

	}

}

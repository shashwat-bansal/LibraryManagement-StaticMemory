package management;

import java.io  .BufferedReader;
import java.io.InputStreamReader;

import data.Book;

public class Manage {
	public Book create() {
		Book book = new Book();
		try {
			BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Enter Book id");
			
			int i =Integer.parseInt(in.readLine());
			book.setId(i);
			
			System.out.println("Enter Book name");
			String j= in.readLine();
			
			book.setName(j);
			System.out.println("Enter name of the Author");
			j=in.readLine();
			book.setAuthor(j);
			System.out.println("Enter number of copies in stock");
			i=Integer.parseInt(in.readLine());
			book.setStock(i);
			System.out.println("Enter number of copies lent");
			i=Integer.parseInt(in.readLine());
			book.setLent(i);
			System.out.println("Book updated in Inventory");
			
		}
		catch(Exception e) {}
		return book;
	}
	
	
	public Book update(Book temp){
		try {
			BufferedReader in =new BufferedReader(new InputStreamReader(System.in)); 
			System.out.println("What attribute do you want to update? \n "
					+ "1.Stock Quantity \n 2.Lent Quantity ");
			String choice = in.readLine();
			System.out.println("Enter new Quantity");
			int newQuantity= Integer.parseInt(in.readLine());
			switch(choice) {
			case "1":
				temp.setStock(newQuantity);
				System.out.println("Stock quantity updated");
				break;
			case "2":
				temp.setLent(newQuantity);
				System.out.println("Lent quantity updated");
				break;
			default:
				System.out.println("Invalid Choice 2");	
			}
		}catch(Exception e) {}
		return temp;

	}
	
	
	public void display(Book temp) {
		System.out.println(temp.getId()+"\t"+temp.getName()+"\t"+temp.getAuthor()
		+"\t"+temp.getStock()+"\t"+temp.getLent());
					
	}
}


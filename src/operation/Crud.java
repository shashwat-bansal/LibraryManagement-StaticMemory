package operation;

import java.util.*;
import data.Book;
import management.Manage;

public class Crud {
	private  List<Book> list=new ArrayList<>();
	Book temp = new Book();
	Manage book = new Manage();
	
	public void create() {
		list.add(book.create());	
	}
	
	public void update(int id) {
		for(int i=0;i<list.size();i++) {
			temp=list.get(i);
			if(temp.getId()==id){
				temp=book.update(temp);
				list.set(i,temp);
				break;
			}
		}
	}
	
	public void view() {
		for(int i=0;i<list.size();i++) {
			book.display(list.get(i));
		}
			
	}
	
	public void delete(int id) {
		
		for(int i=0;i<list.size();i++) {
			temp=list.get(i);
			if(temp.getId()==id){
				list.remove(i);
				System.out.println("Entry Deleted");
				
			}
		}
	}
	
}

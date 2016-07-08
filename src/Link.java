

public class Link{
	
	public int i;
	public String str;
	
	public Link next;
	
	public Link(int i, String str){
		this.i = i;
		this.str = str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkList list = new LinkList();
	
		list.add("John");
		list.add("Bob");
		list.add("Dick");
		list.addAt(0, "Van");
		
		list.remove(2);
		
		list.clear();
		
		list.add("Pondo");
		
		list.print();
		
	}
	
}



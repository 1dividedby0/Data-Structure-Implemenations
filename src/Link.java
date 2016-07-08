

public class Link<Element>{
	
	public int i;
	public Element e;
	
	public Link<Element> next;
	
	public Link(int i, Element e){
		this.i = i;
		this.e = e;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkList<String> list = new LinkList<String>();
	
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



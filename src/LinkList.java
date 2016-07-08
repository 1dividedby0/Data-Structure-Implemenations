
public class LinkList<Element> {
	
	int iteration = 0;
	Link<Element> start;
	
	public void add(Element e){
		
		Link<Element> newLink = new Link<Element>(iteration, e);
		
		iteration++;
		
		newLink.next = start;
		start = newLink;
	}
	
	public void clear(){
		// clears list
		start = null;
		iteration = 0;
	}
	
	public void addAt(int i, Element e){
		
		// if the user is trying to add at the beginning
		if(i == start.i){
			add(e);
			return;
		}
		
		Link<Element> current = start;
		// iterate over list
		while(current != null){
			// MATCH FOUND
			if(current.i == i) break;
			else if(current.next == null) return;

			current = current.next;
		}
		
		Link<Element> newLink = new Link<Element>(i, e);
		
		Link<Element> temp = current.next;
		
		// place the element in between
		current.next = newLink;
		newLink.next = temp;
		
		// increment the next element for the while loop
		current.i = i+1;
		
		Link<Element> cycler = start;
		
		while(cycler.i != i && cycler.next.i != i){
			cycler.i = cycler.i + 1;
			cycler = cycler.next;
		}
	}
	
	public void remove(int i){
		Link<Element> current = start;
		Link<Element> prev = start;
		
		while(current != null){
			if(current.i == i){
				break;
			}else if(current.next == null){
				return;
			}
			prev = current;
			current = current.next;
		}
		
		prev.next = current.next;
	}
	
	public void print(){
		Link<Element> current = start;
		while(current != null){
			System.out.println(current.e + " has a " + current.i + " card.");
			
			current = current.next;
			
			System.out.println();
		}
	}
	
}

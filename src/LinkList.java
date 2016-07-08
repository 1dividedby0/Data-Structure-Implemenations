
public class LinkList {
	
	int iteration = 0;
	Link start;
	
	public void add(String str){
		
		Link newLink = new Link(iteration, str);
		
		iteration++;
		
		newLink.next = start;
		start = newLink;
	}
	
	public void clear(){
		// clears list
		start = null;
		iteration = 0;
	}
	
	public void addAt(int i, String str){
		
		// if the user is trying to add at the beginning
		if(i == start.i){
			add(str);
			return;
		}
		
		Link current = start;
		// iterate over list
		while(current != null){
			// MATCH FOUND
			if(current.i == i) break;
			else if(current.next == null) return;

			current = current.next;
		}
		
		Link newLink = new Link(i, str);
		
		Link temp = current.next;
		
		// place the element in between
		current.next = newLink;
		newLink.next = temp;
		
		// increment the next element for the while loop
		current.i = i+1;
		
		Link cycler = start;
		
		while(cycler.i != i && cycler.next.i != i){
			cycler.i = cycler.i + 1;
			cycler = cycler.next;
		}
	}
	
	public void remove(int i){
		Link current = start;
		Link prev = start;
		
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
		Link current = start;
		while(current != null){
			System.out.println(current.str + " has a " + current.i + " card.");
			
			current = current.next;
			
			System.out.println();
		}
	}
	
}

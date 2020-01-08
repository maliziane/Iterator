package fr.gtm.iterator;

public class Tableau implements List{
	
	 List<Integer> tab = new Tableau();
	 int nombreElement;
	 int[] tab = new tab[];
	 
	 public Iterator<Integer> iterator() {
		 return new TableauIterator(this);
	 }
	 
	 }
	

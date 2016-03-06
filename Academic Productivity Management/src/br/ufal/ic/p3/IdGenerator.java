package br.ufal.ic.p3;

import java.util.ArrayList;
import java.util.List;

public class IdGenerator {

		private static int ID = 0;
		private List<Integer> ids = new ArrayList<Integer>();
		
		public static int getNextId(){
			return ID++;
			
		}
		
//		public static void addId(int id)
//		{
//			ids.add(id);
//		}
		
		
		
		

		/* ASSIM FICA O SETID pra tds classes q precisarem de ID
		 * 
		 public void setId() {		
			this.id = IdGenerator.getNextId();		
		} */
}

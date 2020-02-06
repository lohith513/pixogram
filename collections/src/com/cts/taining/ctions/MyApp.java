package com.cts.taining.ctions;
import java.util.Set;
import java.util.TreeSet;

import com.cts.training.coll.Comparision;

	public class MyApp {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Set<Comparision> comparision = new TreeSet<Comparision>();
			comparision.add(new Comparision(1, "First", "first@mail.com"));
			comparision.add(new Comparision(4, "Second", "second@mail.com"));
			comparision.add(new Comparision(1, "Third", "third@mail.com"));
			comparision.add(new Comparision(3, "Fourth", "fourth@mail.com"));
			comparision.add(new Comparision(2, "Fifth", "fifth@mail.com"));
			comparision.add(new Comparision(5, "Sixth", "sixth@mail.com"));
			
			System.out.println(comparision);
		}

	}
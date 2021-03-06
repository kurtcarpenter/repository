package edu.gatech.oad.antlab.person;

import java.util.Random;
import java.lang.StringBuilder;
/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string
 *
 * @author Kurt Carpenter
 * @version 1.2
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
    StringBuilder oldString = new StringBuilder(input);
    StringBuilder newString = new StringBuilder();
    Random rnd = new Random();
    int index;
    while (oldString.length() > 0) {
      index = rnd.nextInt(oldString.length());
      newString.append(oldString.charAt(index));
      oldString.deleteCharAt(index);
    }
    return newString.toString();
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}

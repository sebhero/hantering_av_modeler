package uppgift1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

import com.google.common.base.Strings;

public class Skrivare {

	public static BufferedReader _lineReader = new BufferedReader(
			new InputStreamReader(System.in));

	/**
	 * Prints out a question to user and check if user provides a not null or
	 * empty answer.
	 * 
	 * @param question
	 *            text of the question
	 * @return users answer.
	 */
	public static String ask(String question) {
		System.out.println(question);
		try {
			String svar = _lineReader.readLine();

			// anv�nder mig utav googles Guave f�r att de har en snygg l�sning
			// p� String null/"" test
			if (Strings.isNullOrEmpty(svar) == false) {
				return svar;
			} else {
				Skrivare.skrivUt("ogiltigt svar");
				return ask(question);
			}

		} catch (IOException e) {
			// st�ll fr�gan igen.
			return ask(question);
		}
	}

	/**
	 * Simplifies the writing System.out.println
	 * 
	 * @param text
	 *            text you want to display to the user.
	 */
	public static void skrivUt(String text) {
		System.out.println(text);
	}

	/**
	 * Simplifies the writing Jpan popup With out qualifiers.
	 * 
	 * @param question
	 *            question you want to ask the user.
	 */
	public static String popup(String question) {
		return JOptionPane.showInputDialog(question);
	}
}

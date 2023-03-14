/*
 *  Class: CMSC203 CRN 30376 
 *  Program: Assignment 3
 *  Instructor: Grinberg 
 *  Summary of Description:  A program that encrypts and decrypts a phrase with a Caesar cipher and bellaso. 
 *  Due Date: 03/13/2023  
 *  Integrity Pledge: I pledge that I have completed the programming assignment independently. 
 *  I have not copied the code from a student or any source. 
 *  David Sawma 
 */

/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple �substitution cipher� where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */
public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) {
		//for loop to search each ch of the array (planText)
		
		for(int i = 0; i < plainText.length(); i++) 
		{
			//if statement if the value is not between the upper range and lower ranger, returns false if condition is true
			// returns true if when all the ch of plainText is valid
			if(plainText.charAt(i) > UPPER_RANGE || plainText.charAt(i) < LOWER_RANGE)
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
		
		//if plainText is not in bound, return error message
		if(!isStringInBounds(plainText))
		{
			return "The selected string is not in bounds, Try again.";
		}
		
		//Declare an array of the length of plainText
		char[] textCh = new char[plainText.length()];
		
		//For loop that goes through each ch of plainText
		for(int i = 0; i < plainText.length(); i++) 
		{
			//Set textCh at position at distance of i of the length of plainText plus key 
			textCh[i] = (char) (plainText.charAt(i) + key);
			
			//While textCh at i is greater than UPPER_BOUND
			//set textCh at i minus RANGE
			
			while(textCh[i] > UPPER_RANGE) 
			{
				textCh[i] = (char) (textCh[i] - RANGE);
			}
			
			//While textCh at i is less than LOWER_BOUND
			//set textCh at i plus RANGE
			while(textCh[i] < LOWER_RANGE) 
			{
				textCh[i] = (char) (textCh[i] + RANGE);
			}
		}
		
		//Return array as a string
		return String.copyValueOf(textCh);
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) {

		//if plainText is not in bound, return error message
		if(!isStringInBounds(plainText)) 
		{
			return "The selected string is not in bounds, Try again.";
		}
				
		//Declare array for the length of plainText
		char[] keyCh = new char[plainText.length()];
		
		//Declare variable length and initialize it to 0
		int length = 0;
				
		//While length is less than plainText length, set keyCh at position length to bellasoStr char at len % bellasoStr length 
		//increment length after each iteration
		while(length < plainText.length()) 
		{
			keyCh[length] = bellasoStr.charAt(length % bellasoStr.length());
			length++;
		}
				
		//Declare another array for the length of plainText
		char[] textCh = new char[plainText.length()];

		//For loop that goes through length of plainText to encrypt
		for(int i = 0; i < plainText.length(); i++) 
		{
		//Set textCh at position i to plainText at length i plus keyCh at position i
			textCh[i] = (char) (plainText.charAt(i) + (int) (keyCh[i]));
					
			//While textCh at position i is greater than UPPER_BOUND
			//Set textCh at position i to textCh at position i minus RANGE 
			while(textCh[i] > UPPER_RANGE) 
			{
				textCh[i] = (char) (textCh[i] - RANGE);
			}
					
			//While textCh at position i is less than LOWER_BOUND
			//Set textCh at position i to textCh at position i plus RANGE
			while(textCh[i] < LOWER_RANGE)
			{
				textCh[i] = (char) (textCh[i] + RANGE);
			}
		}

		//Return textCh as a string
		return String.copyValueOf(textCh);
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) {
		
		// if encryptedText is out of bound, send error messsage
		if(!isStringInBounds(encryptedText)) {
			return "The selected string is not in bounds, Try again.";
		}
		
		//Declare a ch array for the length of encryptedText
		char[] textCh = new char[encryptedText.length()];
		
		//For loop that goes through the length of encyptedText 
		for(int i = 0; i < encryptedText.length(); i++) 
		{
			
			//Set textCh at position i of the length of encryptedText minus key 
			textCh[i] = (char) (encryptedText.charAt(i) - key);
	
			//While textCh at i is greater than UPPER_BOUND
			//set textCh at i minus RANGE
			while(textCh[i] > UPPER_RANGE) 
			{
				
				textCh[i] = (char) (textCh[i] - RANGE);
			}
			
			//While textCh at i is less than LOWER_BOUND
			//set textCh at i plus RANGE
			while(textCh[i] < LOWER_RANGE) 
			{
				textCh[i] = (char) (textCh[i] + RANGE);
			}	
		}
		
		//Return textCh as a string
		return String.copyValueOf(textCh);
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) 
	{
	
		//If encryptedText is out of bound, return error message
		if(!isStringInBounds(encryptedText)) {
			return "The selected string is not in bounds, Try again. ";
		}
			
		//Declare ch array of the length of encryptedText
		char[] keyCh = new char[encryptedText.length()];
		
		//Declare int variable, length, initialize it to 0
		int length = 0;
						
		//While length is less than encryptedText length, set keyArray at position length to bellasoStr char at len % bellasoStr length 
		// increment length after each iteration
		while(length < encryptedText.length()) 
		{ 
			keyCh[length] = bellasoStr.charAt(length % bellasoStr.length());
			length++;
		}
						
		//Declare another ch array of the length of encryptedText
		char[] textCh = new char[encryptedText.length()];
				
		//For loop that goes through encrytedText length
		for(int i = 0; i < encryptedText.length(); i++) 
		{
			//Set textCh at position i to plainText at length i minus keyCh at position i
			textCh[i] = (char) (encryptedText.charAt(i) - (int) (keyCh[i]));
							
			//While textCh at position i is greater than UPPER_BOUND
			//Set textCh at position i to textArray at position i minus RANGE 
			while(textCh[i] > UPPER_RANGE) 
			{
				textCh[i] = (char) (textCh[i] - RANGE);
			}
							
			//While textCh at position i is less than LOWER_BOUND
			//Set textCh at position i to textCh at position i plus RANGE
			while(textCh[i] < LOWER_RANGE) 
			{
				textCh[i] = (char) (textCh[i] + RANGE);
			}
		}

		//Return textCh as a string
		return String.copyValueOf(textCh);
		}
	}


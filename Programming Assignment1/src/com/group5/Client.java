package com.group5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 
 * @author Group 5
 * Class Name: Client.java
 * Date Created: 02/01/2018
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String mString;
			String mResponse;
			Scanner mScanner = new Scanner(System.in); 
			Socket mSocket = new Socket("127.0.0.1", 8081); 
			BufferedReader mReader = new BufferedReader(new InputStreamReader(mSocket.getInputStream()));
			PrintWriter mWriter = new PrintWriter(mSocket.getOutputStream(), true);

			do {
				System.out.println("Enter the input string :");
				mString = mScanner.nextLine();
				mWriter.println(mString);
				if (!mWriter.equals("exit")) {
					//reading the input until exit is entered
					mResponse = mReader.readLine();
					System.out.println(mResponse);
				}
			} while (!mString.equals("exit"));
			
		} catch (UnknownHostException e) {
			System.out.println("Host Error: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Client Error: " + e.getMessage());
		}
	}
}

package com.group5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 * @author Group 5
 * Class Name: Server.java
 * Date Created: 02/01/2018
 *
 */
public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocket mServerSocket = new ServerSocket(8081); 
			Socket mSocket = mServerSocket.accept(); 
			int mCount = 0;
			mCount++;
			System.out.println("SERVER: Client Connected 515OK");

			BufferedReader mReader = new BufferedReader(new InputStreamReader(mSocket.getInputStream()));
			PrintWriter mWriter = new PrintWriter(mSocket.getOutputStream(), true);

			while (true) {
				String mString = mReader.readLine();
				String mEquation = mString;
				int mResult = 0;

				if (mString.equalsIgnoreCase("EXIT")) {
					mServerSocket.close();
					
				} else if (mString.equalsIgnoreCase("COUNT")) {
					// displays the count of clients connected
					mString = Integer.toString(mCount);
					mWriter.println("No. of Client connected:" + mString);
					
				} else {
					// Checking for the mathematical equation
					for (int i = 0; i < mEquation.length(); i++) {
						if (mEquation.charAt(i) == '/') {
							mResult = Integer.parseInt(mEquation.substring(0, i))
									/ Integer.parseInt(mEquation.substring(i + 1, mEquation.length()));
							System.out.print("result=" + mResult);
						} else if (mEquation.charAt(i) == '*') {
							mResult = Integer.parseInt(mEquation.substring(0, i))
									* Integer.parseInt(mEquation.substring(i + 1, mEquation.length()));
							System.out.print("result=" + mResult);
						}else if (mEquation.charAt(i) == '+') {
							mResult = Integer.parseInt(mEquation.substring(0, i))
									+ Integer.parseInt(mEquation.substring(i + 1, mEquation.length()));
							System.out.print("result=" + mResult);
						} else if (mEquation.charAt(i) == '-') {
							mResult = Integer.parseInt(mEquation.substring(0, i))
									- Integer.parseInt(mEquation.substring(i + 1, mEquation.length()));
							System.out.print("result=" + mResult);
						} else  if (mEquation.charAt(i) == '%') {
							mResult = Integer.parseInt(mEquation.substring(0, i))
									% Integer.parseInt(mEquation.substring(i + 1, mEquation.length()));
							System.out.print("result=" + mResult);
						}
					}
					mWriter.println("SERVER: " + mString + "=" + mResult);
				}
			}
		} catch (UnknownHostException e) {
			System.out.println("Host Error: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Client Error: " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

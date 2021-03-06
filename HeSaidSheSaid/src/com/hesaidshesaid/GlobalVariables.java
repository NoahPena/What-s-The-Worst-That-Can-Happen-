package com.hesaidshesaid;

import java.util.ArrayList;

public class GlobalVariables {
	
	//0 = Max Rounds
	//1 = Max Points
	//2 = Endless
	public static int gameType = 0;
	
	//0 = use default cards
	//1 = use custom only cards
	//2 = player in lead uses custom cards
	public static int cardType = 0;
	
	public static int maxRounds = 20;
	public static int maxPoints = 15;
	
	public static int amountOfPlayers = 2;
	
	public static ArrayList<Player> players = new ArrayList<Player>();
	
	public static ArrayList<Player> playersNotHost = new ArrayList<Player>();
	
	public static ArrayList<Player> playersAnswering = new ArrayList<Player>();
	
	public static Player host;
	
	public static String currentQuestion;
	
	public static ArrayList<String> questionBank = new ArrayList<String>();
	
	public static ArrayList<String> currentQuestionBank = new ArrayList<String>();
	
	public static int currentCounter = -1;
	
	public static int currentRound = 0;
	
	public static String bestAnswer = "";
	
	public static Player currentWinner;
	
	public static ArrayList<Player> winningPlayers = new ArrayList<Player>();
	
	public static boolean gameOver = false;
	
}

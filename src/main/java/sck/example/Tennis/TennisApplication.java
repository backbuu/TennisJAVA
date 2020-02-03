package sck.example.Tennis;


public class TennisApplication {

	private int player1Score;
	private int player2Score;
	private String[] scoreWord = {"Love","Fifteen","Thirty","Forty"};

	public String displayScore(){
		//System.out.println(player1Score + " - " + player2Score);
		if(player2Score >= 3 && (player2Score - player1Score) > 1){
			return "PLAYER2 - WON";
		}
		if(player1Score == 3 && player2Score == 3){
			return "Duece";
		}
		if(player1Score >= 3 && (player1Score - player2Score) == 1){
			return "ADV - PLAYER1";
		}
		if(player1Score >= 3 && (player1Score - player2Score) > 1){
			return "PLAYER1 - WON";
		}
		
		return scoreWord[player1Score] + " - " + scoreWord[player2Score];
	}

	public void player1GotScore(){
		player1Score += 1;
	}
	public void player2GotScore(){
		player2Score += 1;
	}

}

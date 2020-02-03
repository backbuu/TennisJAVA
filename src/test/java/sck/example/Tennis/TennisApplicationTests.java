package sck.example.Tennis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;


class TennisApplicationTests {
	TennisApplication tennis = new TennisApplication();

	@Test
	public void play1score0Play2score0ShouldBeLoveLove() {
		String expectedResult = "Love - Love";

		String result = tennis.displayScore();

		assertEquals(expectedResult,result);
	}
	@Test
	public void play1score1Play2score0ShouldBeFifteenLove() {
		String expectedResult = "Fifteen - Love";

		player1GotScore(1);

		String result = tennis.displayScore();

		assertEquals(expectedResult,result);
	}
	@Test
	public void play1score1Play2score1ShouldBeFifteenFifteen() {
		String expectedResult = "Fifteen - Fifteen";

		player1GotScore(1);
		player2GotScore(1);

		String result = tennis.displayScore();

		assertEquals(expectedResult,result);
	}
	@Test 
	public void play1score1Play2score2ShouldBeFifteenThirty() {
		String expectedResult = "Fifteen - Thirty";

		player1GotScore(1);
		player2GotScore(2);

		String result = tennis.displayScore();

		assertEquals(expectedResult,result);
	}
	@Test
	public void play1score3Play2score3ShouldBeDuece(){
		String expectedResult = "Duece";

		player1GotScore(3);
		player2GotScore(3);

		String result = tennis.displayScore();

		assertEquals(expectedResult,result);
	}
	@Test
	public void play1score4Play2score3ShouldBeADVPLAYER1() {
		String expectedResult = "ADV - PLAYER1";

		player1GotScore(4);
		player2GotScore(3);

		String result = tennis.displayScore();

		assertEquals(expectedResult,result);
	}
	@Test
	public void play1score4Play2score3ShouldBePLAYER1WON() {
		String expectedResult = "PLAYER1 - WON";

		player1GotScore(5);
		player2GotScore(3);

		String result = tennis.displayScore();

		assertEquals(expectedResult,result);
	}
	@Test
	public void play1score1Play2score4ShouldBePLAYER2WON() {
		String expectedResult = "PLAYER2 - WON";

		player1GotScore(1);
		player2GotScore(4);

		String result = tennis.displayScore();

		assertEquals(expectedResult,result);
	}

	private void player1GotScore(int score){
		for(int i = 0; i < score; i++){
			tennis.player1GotScore(); 
		}
	}
	private void player2GotScore(int score){
		for(int i = 0; i < score; i++){
			tennis.player2GotScore(); 
		}
	}
}
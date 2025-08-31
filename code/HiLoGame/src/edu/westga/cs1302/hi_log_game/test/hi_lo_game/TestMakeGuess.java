package edu.westga.cs1302.hi_log_game.test.hi_lo_game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.hi_log_game.model.HiLoGame;

class TestMakeGuess {
	
	public static final String TOO_LOW = "Too low.";
	public static final String TOO_HIGH = "Too high.";
	public static final String CORRECT = "Correct.";
	public static final String TOO_MANY_GUESSES = "Too many guesses.";

	@Test
	void testGuessIsTooHigh() {
		HiLoGame game = new HiLoGame(3);
		
		String result = game.makeGuess(4);
		
		assertEquals(TOO_HIGH, result, "checking result of makeGuess");
		assertEquals(1, game.getGuessCount(), "checking guess count");
	}

	@Test
	void testGuessIsTooLow() {
		HiLoGame game = new HiLoGame(3);
		
		String result = game.makeGuess(2);
		
		assertEquals(TOO_LOW, result, "checking result of makeGuess");
		assertEquals(1, game.getGuessCount(), "checking guess count");
	}
	
	@Test
	void testCorrectGuessFirstTime() {
		HiLoGame game = new HiLoGame(3);

		String result = game.makeGuess(3);
		
		assertEquals(CORRECT, result, "checking result of makeGuess");
		assertEquals(1, game.getGuessCount(), "checking guess count");
		
	}
	
	@Test
	void testCorrectGuessSecondTime() {
		HiLoGame game = new HiLoGame(3);
		game.makeGuess(1);

		String result = game.makeGuess(3);
		
		assertEquals(CORRECT, result, "checking result of makeGuess");
		assertEquals(2, game.getGuessCount(), "checking guess count");
		
	}
	
	@Test
	void testCorrectGuessThirdTime() {
		HiLoGame game = new HiLoGame(3);
		game.makeGuess(5);
		game.makeGuess(2);

		String result = game.makeGuess(3);
		
		assertEquals(CORRECT, result, "checking result of makeGuess");
		assertEquals(3, game.getGuessCount(), "checking guess count");
		
	}

	@Test
	void testTooManyGuesses() {
		HiLoGame game = new HiLoGame(3);
		game.makeGuess(5);
		game.makeGuess(6);
		game.makeGuess(7);
		
		String result = game.makeGuess(1);
		
		assertEquals(TOO_MANY_GUESSES, result, "checking result of makeGuess");
		assertEquals(4, game.getGuessCount(), "checking guess count");
	}

}

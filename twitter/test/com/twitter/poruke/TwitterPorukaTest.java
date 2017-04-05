package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwitterPorukaTest {

	private TwitterPoruka poruka;
	
	@Before
	public void setUp() throws Exception {
		poruka = new TwitterPoruka();
	}

	@After
	public void tearDown() throws Exception {
		poruka = null;
	}

	@Test
	public void testSetKorisnik() {
		poruka.setKorisnik("Pera Peric");
		assertEquals("Pera Peric", poruka.getKorisnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNull() {
		poruka.setKorisnik(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikPrazanString() {
		poruka.setKorisnik("");
	}
	
	@Test
	public void testSetPoruka() {
		poruka.setPoruka("Poruka");
		assertEquals("Poruka", poruka.getPoruka());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaNull() {
		poruka.setPoruka(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaPrazanString() {
		poruka.setPoruka("");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaPunoKaraktera() {
		poruka.setPoruka("Tall Tweets lets you compose both tweetstorms and text shots (or text screenshots)."
				+ " The tweetstorm format will slice your lengthy essay into multiple tweets of 140 characters "
				+ "and tweets them all in sequence automatically."
				+ "If you opt for Tweet Shots, the app will convert your rich text into an image, "
				+ "rendered in Google's Roboto font, and posts the picture in a single tweet thus"
				+ " allowing you to bypass the 140 character limit");
	}
	
	@Test
	public void testToString() {
		poruka.setKorisnik("Pera");
		poruka.setPoruka("Message");
		assertEquals("KORISNIK:Pera PORUKA:Message", poruka.toString());
	}
	
	@Test
	public void testToStringBezKorisnika() {
		poruka.setPoruka("Message");
		assertEquals("KORISNIK:null PORUKA:Message", poruka.toString());
	}
	
	@Test
	public void testToStringBezPoruke() {
		poruka.setKorisnik("Pera");
		assertEquals("KORISNIK:Pera PORUKA:null", poruka.toString());
	}
	
	@Test
	public void testToStringBezIcega() {
		assertEquals("KORISNIK:null PORUKA:null", poruka.toString());
	}

}

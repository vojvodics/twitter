package com.twitter.poruke;

/**
 * Klasa TwitterPoruka predstavlja jednu poruku na twitteru. Ima ime korisnika i sadrzaj poruke.
 * 
 * @author stefan
 * @version 1.0
 */
public class TwitterPoruka {

	/**
	 * Atribut koji predstavlja ime korisnika
	 */
	private String korisnik;
	/**
	 * Atribut koji predstavlja sadrzaj poruke
	 */
	private String poruka;

	/**
	 * 
	 * @return ime korisnika koji je napisao poruku
	 */
	public String getKorisnik() {
		return korisnik;
	}

	/**
	 * @param korisnik
	 *            - ime korisnika
	 * @throws java.lang.RuntimeException
	 *             Ako je:
	 *             <ul>
	 *             <li>ime null</li>
	 *             <li>ime prazan string</li>
	 *             </ul>
	 */
	public void setKorisnik(String korisnik) {
		if (korisnik == null || !korisnik.isEmpty())
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}

	/**
	 * 
	 * @return sadrzaj poruke
	 */
	public String getPoruka() {
		return "poruka";
	}

	/**
	 * 
	 * @param poruka
	 *            sadrzaj poruke
	 * 
	 * @throws java.lang.RuntimeException
	 *             Ako je sadrzaj poruke:
	 *             <ul>
	 *             <li>null</li>
	 *             <li>prazan string</li>
	 *             <li>duzina poruke veca od 140 karaktera</li>
	 *             </ul>
	 *             
	 */
	public void setPoruka(String poruka) {
		if (this.poruka == null || this.poruka == new String("") || this.poruka.length() > 140)
			throw new RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}

	public String toString() {
		return "KORISNIK:" + korisnik + " PORUKA:" + poruka;
	}
}
package uppgift2;

import uppgift1.Publisher;
import uppgift1.Skrivare;

/**
 * Data Object of a cd
 * 
 * @author seb
 * @version 1
 */
public class CD {
	private String _title;
	private String _artist;
	private int _length;
	private Publisher _publisher;

	/**
	 * Default constructor
	 */
	public CD() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * CD constructor takes all known variables.
	 * 
	 * @param _title
	 *            title of the cd
	 * @param _artist
	 *            arist name
	 * @param _length
	 *            length of the cd
	 * @param _publisher
	 *            publisher for the cd
	 */
	public CD(String _title, String _artist, int _length, Publisher _publisher) {
		this();
		this._title = _title;
		this._artist = _artist;
		this._length = _length;
		this._publisher = _publisher;
	}

	/**
	 * Prints out the publisher object.
	 */
	public void print() {
		Skrivare.skrivUt(this.toString());
	}

	/**
	 * @return string of the CD object.
	 */
	@Override
	public String toString() {
		return "CD [title=" + _title + ", artist=" + _artist + ", length="
				+ _length + ", publisher=" + _publisher.get_name() + "]";
	}

	/**
	 * return the title of cd
	 * 
	 * @return title
	 */
	public String get_title() {
		return _title;
	}

	/**
	 * Sets the title of the cd
	 */
	public void set_title(String _title) {
		this._title = _title;
	}

	/**
	 * return the name of the artist
	 * 
	 * @return artist name
	 */
	public String get_artist() {
		return _artist;
	}

	/**
	 * Sets the arist name
	 */
	public void set_artist(String _artist) {
		this._artist = _artist;
	}

	/**
	 * returns the length of the cd
	 * 
	 * @return the length of the cd
	 */
	public int get_length() {
		return _length;
	}

	/**
	 * Sets the cd length
	 */
	public void set_length(int _length) {
		this._length = _length;
	}

	/**
	 * returns the publisher of the cd
	 * 
	 * @return the publisher of the cd
	 */
	public Publisher get_publisher() {
		return _publisher;
	}

	/**
	 * Sets the publisher
	 */
	public void set_publisher(Publisher _publisher) {
		this._publisher = _publisher;
	}

	/**
	 * Sets the publisher
	 * 
	 * @param name
	 *            Name of the publisher
	 * @param phone
	 *            Phonenumber for the publisher
	 */
	public void set_publisher(String name, String phone) {
		this._publisher = new Publisher(name, phone);
	}

}

public class Song {
    private String title;
    private String artist;
    private String album;
    private int year;
    
    public Song(String title, String artist, String album, int year) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.year = year;
    }
    
    
    // SETTERS
    public String setTitle(String title) {
        return this.title;
    }
    public String setArtist(String artist) {
        return this.artist;
}
    public String setAlbum(String album) {
        return this.album;
    }
    public int setYear() {
        return this.year;
    }
    
    
    // GETTERS
    public String getTitle() {
        return this.title;
    }
    public String getArtist() {
        return this.artist;
    }
    public String getAlbum() {
        return this.album;
    }
    public int getYear() {
        return this.year;
    }
    
    
    // TO STRING
    public String toString() {
        return "Artist: " + artist + "\nTitle: " + title + "\nAlbum: " + album;
    }
    
}
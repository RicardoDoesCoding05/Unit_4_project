public class Song{
    private String title;
    private String artist;
    private String album;
    private int year;
    
    

    public String get_title(){
     return this.title;
}
    public String getartist(){
       return this.artist;
}
    public int getyear(){
       return this.year;
}
    public String getalbum(){
        return this.album;
}

    public void setArtist() {
        artist = this.artist;
    }
    public String toString(){
        return "title " + this.title + "artist " + this.artist + " year " + this.year + " album " + this.album;
    }
    public Song(String title, String artist ,String album, int year){
        this.title = title;
        this.artist = artist;
        this.album  = album;
        this.year = year;
    }
}
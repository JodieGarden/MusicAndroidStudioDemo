public class Runner {

    public static void main(String[] args) {
        Artist.deleteAll();

        Artist artist1 = new Artist("Led Zeppelin");
        Artist artist2 = new Artist("MisterWives");
        Artist artist3 = new Artist("Bon jovi");
        Album album = new Album("Houses of the holy", "Rock", artist1);
        artist1.save();
        artist2.save();
        artist3.save();
        album.save();

        Artist.all();
        artist1.getArtistDetails();
        artist1.setName("Led Zep");
        artist1.update();
        artist1.getArtistDetails();

    }
}
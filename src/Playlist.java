import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        // Adding songs to the playlist
        desertIslandPlaylist.add("BBoom BBoom");
        desertIslandPlaylist.add("Boombayah");
        desertIslandPlaylist.add("LALISA");
        desertIslandPlaylist.add("Money");
        desertIslandPlaylist.add("Kill This Love");
        desertIslandPlaylist.add("Pretty Savage");

        // Printing the songs inside the array
        System.out.println(desertIslandPlaylist);

        // Finding out the size
        int playlistSize = desertIslandPlaylist.size();
        System.out.println(playlistSize);

        // Removing song from array
        desertIslandPlaylist.remove("LALISA");

        int newPlaylistSize = desertIslandPlaylist.size();
        System.out.println(newPlaylistSize);

        // Swapping songs
        int songA = desertIslandPlaylist.indexOf("Boombayah");
        int songB = desertIslandPlaylist.indexOf("Kill This Love");

        desertIslandPlaylist.set(songA, desertIslandPlaylist.get(songB));
        desertIslandPlaylist.set(songB, desertIslandPlaylist.get(songA));

        System.out.println(desertIslandPlaylist);

    }

}
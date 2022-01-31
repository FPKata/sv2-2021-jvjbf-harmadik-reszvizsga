//package streams;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class SongService {
//    private List<Song> songs = new ArrayList<>();
//
//    public void addSong(Song song){
//        songs.add(song);
//    }
//
//    public String shortestSong(List<Song> songs){
//        int min = songs.stream()
//                .mapToInt(s -> s.getLength())
//                .min()
//                .orElseThrow(() -> new IllegalArgumentException("Empty "));
//        String shortest = songs.get(min).getTitle();
//        return shortest;
//    }
//
//    public String findSongByTitle(String title){
//
//    }
//
//    public void isPerformerInSong(List<Song> songs){
//
//    }
//    public List<String> titlesBeforeDate(){
//
//    }
//}

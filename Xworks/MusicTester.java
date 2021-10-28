class MusicTester{

 public static void main(String[] boots)
   {
   
   MusicInstruments instruments=MusicInstruments.STRINGS;
   String musicname="melody";
   Music music = new Music(instruments,musicname){
   music.turnedon=true;
   System.out.println(music.durationofInstance);
   System.out.println(music.volume);
   System.out.println(music.musicname);
   System.out.println(music.turnedon);
   
   
   
   }
   
   
   
}
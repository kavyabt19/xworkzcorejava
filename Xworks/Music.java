class Music{

static int durationofInstance=5;
 MusicInstruments instruments;
 float volume=50.0f;
  String musicname;
 boolean turnedon;
 Music(MusicInstruments instruments,String musicname){
 
 durationofInstance++;
 this.instruments=instruments;
 this.musicname=musicname;
 }

}
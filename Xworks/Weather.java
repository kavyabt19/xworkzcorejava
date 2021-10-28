class Weather{

 Static int numberofInstance=0;
 WeatherSeason season;
 float temperatureinCelisus=28.0f;
 String humidity;
 boolean feel;
 Weather(WeatherSeason season,String humidity){
 
 numberofInstance++;
 this.season=season;
 this.humidity=humidity;
 }

}
Class WeatherRunner{

   public static void main(String[] boot)
   {
   
   WetherSeason season=weatherSeason.RAINY;
   string humidity="cloudy";
   Weather weather=new Weather(season,humidity);
   weather.feel=true;
   System.out.println(weather.season);
   System.out.println(weather.tempertueinCelsius);
   System.out.println(weather.humidity);
   System.out.println(weather.feel);
   System.out.println(weather.numberofInstance);
   
   
   }

}
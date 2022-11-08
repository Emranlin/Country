import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Country country=new Country("Kyrgyzstan",126000,"Bishkek",70000000,"kyrgyz","poor");
        Country country1=new Country("Kazakstan",400067800,"Astana",1900000,"kazak","rich");
        Country country2=new Country("Uzbekistan",2359000,"Tashkent",2500000,"uzbek","poor");
        Country country3=new Country("Tadjikastan",6523000,"Dushanbe",1256873,"tadjik","poor");
        Country[]countries={country,country1,country2,country3};
        Scanner scanner=new Scanner(System.in);
        System.out.println("1 getMax, 2 getMin,3 findByCountryName,4 findAll");
        while (true){
            int sell= scanner.nextInt();
            if(sell==1)getMax(countries);
            if(sell==2)getMin(countries);
            if(sell==3)findByCountryName(countries,new Scanner(System.in).nextLine());
            if(sell==4)findAll(countries);
            if (sell==5) System.out.println("That's all");
        }

    }
    public static void getMax(Country[] countries){
        int max= countries[0].getLength();
        for (int i = 0; i < countries.length; i++) {
            max=Math.max(max,countries[0].getLength());}
        System.out.println(max);

    }
    public static void getMin(Country[]countries){
        int min=countries[0].getLength();
        for (int i = 0; i < countries.length; i++) {
            min=Math.min(min,countries[0].getLength());}
        System.out.println(min);}
    public static void findByCountryName(Country[]countries,String countryName){
        for(Country country:countries) {
            if (country.getName().equals(countryName)) {
                System.out.println(country.toString());

            }
        }
    }
    public static void findAll(Country[] countries){
        for (Country country:countries){
            System.out.println(country.toString());
        }
    }
}
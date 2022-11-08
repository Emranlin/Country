public class Country {
    private String name;
    private  int length;
    private String capital;
    private  int population;
    private String language;
    private String social;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCapital() {
        return capital;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String getSocial() {
        return social;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", language='" + language + '\'' +
                ", social='" + social + '\'' +
                '}';
    }

    public Country(String name, int length, String capital, int population, String language, String social) {
        this.name = name;
        this.length=length;
        this.capital=capital;
        this.population=population;
        this.language=language;
        this.social=social;


    }
}


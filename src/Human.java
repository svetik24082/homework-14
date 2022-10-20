public class Human {
    private int numberOfYears;   // кол лет
    public String name;
    private String cityOfResident;

    public String post;


    public Human(String name, int numberOfYears, String cityOfResident, String post) {

        if (numberOfYears > 0) {
            this.numberOfYears = numberOfYears;
        } else {
            this.numberOfYears = 0;
        }
        if (name == null) {
            this.name = " Информация не указана";
        } else {
            this.name = name;
        }

        if (cityOfResident == null) {
            this.cityOfResident = " Информация не указана";
        } else {
            this.cityOfResident = cityOfResident;
        }

        if (post == null) {
            this.post = " Информация не указана";
        } else {
            this.post = post;
        }
    }


    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears > 0) {
            this.numberOfYears = numberOfYears;
        } else {
            this.numberOfYears = 0;
        }
    }

    public String getCityOfResident() {
        return cityOfResident;
    }

    public void setCityOfResident(String cityOfResident) {
        if (cityOfResident == null) {
            this.cityOfResident = " Информация не указана";
        } else {
            this.cityOfResident = cityOfResident;
        }


    }
}










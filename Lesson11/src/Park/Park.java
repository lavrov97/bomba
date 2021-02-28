//Создать класс Park с внутренним классом, с помощью объектов которого
//
//можно хранить информацию об аттракционах, времени их работы и стои-
//мости.
package Park;

public class Park {
    private String NamePark;

    Park() {
        NamePark = "Дисней";
    }

    public Park(String namePark) {
        NamePark = namePark;
    }

    class AboutOfPark {
        private String NameAttraction;
        private float Time;
        private float Cost;

        AboutOfPark() {
            this.NameAttraction = "Комната страха";
            this.Cost = 6;
            this.Time = 10;
        }

        AboutOfPark(String nameAttraction, float time, float cost) {
            setNameAttraction(nameAttraction);
            setCost(cost);
            setTime(time);
        }

        public String getNameAttraction() {
            return NameAttraction;
        }

        public void setNameAttraction(String nameAttraction) {
            NameAttraction = nameAttraction;
        }

        public float getTime() {
            return Time;
        }

        public void setTime(float time) {
            Time = time;
        }

        public float getCost() {
            return Cost;
        }

        public void setCost(float cost) {
            Cost = cost;
        }

        public void getFullInfo() {
            System.out.println("Название парка:  " + NamePark + "\nНазвание атракциона: " + getNameAttraction() +
                    "\nцена  " + getCost() + "\nвремя работы: " + getTime());
        }
    }
}

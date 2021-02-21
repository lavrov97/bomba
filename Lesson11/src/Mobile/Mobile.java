//Создать класс Mobile с внутренним классом, с помощью объектов которого
//можно хранить информацию о моделях телефонов и их свойствах.
package Mobile;

public class Mobile {
        private String MobileType;

        Mobile() {
            MobileType = "Смартфон";
        }

    public Mobile(String mobileType) {
        MobileType = mobileType;
    }


        class MobileInfo {
            private String operationSystemType;
            private float camera;
            private int battery;
            private float screenDiagonal;

            MobileInfo() {
                this.operationSystemType = "Android";
                this.camera = 12.2f;
                this.battery = 3200;
                this.screenDiagonal = 5.2f;
            }
  MobileInfo(String operationSystemType, float camera,int battery,float screenDiagonal){
                setOperationSystemType(operationSystemType);
                setCamera(camera);
                setBattery(battery);
                setScreenDiagonal(screenDiagonal);
}

            public String getOperationSystemType() {
                return operationSystemType;
            }

            public void setOperationSystemType(String operationSystemType) {
                this.operationSystemType = operationSystemType;
            }

            public float getCamera() {
                return camera;
            }

            public void setCamera(float camera) {
                this.camera = camera;
            }

            public int getBattery() {
                return battery;
            }

            public void setBattery(int battery) {
                this.battery = battery;
            }

            public float getScreenDiagonal() {
                return screenDiagonal;
            }

            public void setScreenDiagonal(float screenDiagonal) {
                this.screenDiagonal = screenDiagonal;
            }

            public void getFullInfo() {
                System.out.println("Тип телефона:  " + MobileType + "\nТип операционной системы: " + getOperationSystemType() +
                        "\nКамера в МП: " + getCamera() + "\nБатарея: " + getBattery() +
                        "\nДиагональ экрана: " + getScreenDiagonal() );
            }
        }
}

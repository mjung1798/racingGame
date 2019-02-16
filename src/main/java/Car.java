public class Car {
    private int location;
    private final static int CONDITION_NUMBER = 4;

    public Car() {
        location = 0;
    }

    public void repeatUpTo(int tryCount) {
        for (int i = 0; i < tryCount; i++) {
            int randomNum = generateRandomInt();
            updateLocationAccordingTo(randomNum);
        }
    }

    private void updateLocationAccordingTo(int randomNum) {
        if (randomNum >= CONDITION_NUMBER) {
            location++;
        }
    }

    private int generateRandomInt(){
        return (int) (Math.random() * 10);
    }

    public String drawRacingRoad() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < location; i++) {
            stringBuilder.append("=");
        }
        return stringBuilder.toString();
    }

}

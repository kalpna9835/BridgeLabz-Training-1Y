@FunctionalInterface
interface LightBehavior {
    void execute();
}

public class SmartHome {
    public static void main(String[] args) {

        LightBehavior motionDetected = () -> System.out.println("Lights ON (Motion detected)");
        LightBehavior nightMode = () -> System.out.println("Dim warm lights activated (Night mode)");
        LightBehavior voiceCommand = () -> System.out.println("Color lights changed via voice command");

        // Simulating triggers
        motionDetected.execute();
        nightMode.execute();
        voiceCommand.execute();
    }
}
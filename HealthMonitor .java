
public class HealthMonitor {
    private static final int NORMAL_HEARTBEAT_MIN = 60;
    private static final int NORMAL_HEARTBEAT_MAX = 100;
    private static final double NORMAL_TEMPERATURE_MIN = 35.5;
    private static final double NORMAL_TEMPERATURE_MAX = 37.5;

    private HeartbeatSensor heartbeatSensor;
    private TemperatureSensor temperatureSensor;

    public HealthMonitor() {
        this.heartbeatSensor = new HeartbeatSensor();
        this.temperatureSensor = new TemperatureSensor();
    }

    public void monitorHealth() {
        int heartbeat = heartbeatSensor.measureHeartbeat();
        double temperature = temperatureSensor.measureTemperature();

        System.out.println("Heartbeat: " + heartbeat + " BPM");
        System.out.println("Temperature: " + temperature + " °C");

        if (heartbeat < NORMAL_HEARTBEAT_MIN || heartbeat > NORMAL_HEARTBEAT_MAX) {
            sendAlert("Abnormal heartbeat detected!");
        }

        if (temperature < NORMAL_TEMPERATURE_MIN || temperature > NORMAL_TEMPERATURE_MAX) {
            sendAlert("Abnormal temperature detected!");
        }
    }

    private void sendAlert(String message) {
        
        System.out.println("ALERT: " + message);
    }

    public static void main(String[] args) {
        HealthMonitor healthMonitor = new HealthMonitor();

        
        while (true) {
            healthMonitor.monitorHealth();

            
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

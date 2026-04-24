public class ValidateIP {
    public static void main(String[] args) {
        String[] ips = {"192.168.1.1", "256.100.10.1"};

        String regex = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}"
                     + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

        for (String ip : ips) {
            System.out.println(ip + " -> " + ip.matches(regex));
        }
    }
}
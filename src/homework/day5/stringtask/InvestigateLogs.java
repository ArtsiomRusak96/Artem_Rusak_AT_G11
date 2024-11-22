package homework.day5.stringtask;

public class InvestigateLogs {

    public static void main(String[] args) {

        String logs = """
                access_log.2020.09.07 212.168.101.5 granted
                access_log.2020.09.07 212.168.101.6 denied
                access_log.2020.09.07 212.168.101.6 denied
                access_log.2020.09.07 212.168.122.6 denied
                """;

        InvestigateLogs investigateLogs = new InvestigateLogs();
        investigateLogs.investigateLogs(logs);
    }

    public void investigateLogs(String logs) {

        String[] logData = logs.split("\n");
        String[] ips = new String[logs.length()];
        int[] okStatuses = new int[logs.length()];
        int[] failedStatuses = new int[logs.length()];
        int ipCounter = 0;

        for (String i : logData) {
            String[] logParts = i.split(" ");
            String ipLine = logParts[1];
            String statusLine = logParts[2];

            int ipNumber = -1;
            for (int j = 0; j < ipCounter; j++) {
                if (ips[j].equals(ipLine)) {
                    ipNumber = j;
                    break;
                }
            }
            if (ipNumber == -1) {
                ips[ipCounter] = ipLine;
                okStatuses[ipCounter] = 0;
                failedStatuses[ipCounter] = 0;
                ipNumber = ipCounter;
                ipCounter++;
            }
            if (statusLine.equals("granted")) {
                okStatuses[ipNumber]++;
            } else if (statusLine.equals("denied")) {
                failedStatuses[ipNumber]++;
            }
        }
        for (int i = 0; i < ipCounter; i++) {
            System.out.println("ip " + ips[i]+ ": ok - " + okStatuses[i] + ", failed - " + failedStatuses[i]);
        }
    }
}

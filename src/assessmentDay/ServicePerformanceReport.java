package assessmentDay;

import java.util.*;

//Write a Java programme to print the report of services performance that are reused on a platform
//        NOTE: Assume that there are 30 services that are running on the platform.
//        Repost should consist the percentage of each service usage in descending order.

public class ServicePerformanceReport {
    public static void main(String[] args) {
        // Generate some random service usage data (from 0% to 100%)
        int[] usageData = new int[30];
        Random random = new Random();
        for (int i = 0; i < usageData.length; i++) {
            usageData[i] = random.nextInt(101);
        }

        // Calculate the total usage percentage
        int totalUsage = 0;
        for (int usage : usageData) {
            totalUsage += usage;
        }

        // Create a list of ServiceUsage objects to hold the usage data and percentages
        List<ServiceUsage> serviceUsageList = new ArrayList<>();
        for (int i = 0; i < usageData.length; i++) {
            String serviceName = "Service " + (i + 1);
            int usage = usageData[i];
            double percentage = (double) usage / totalUsage * 100;
            ServiceUsage serviceUsage = new ServiceUsage(serviceName, usage, percentage);
            serviceUsageList.add(serviceUsage);
        }

        // Sort the list in descending order of percentage
        Collections.sort(serviceUsageList, new Comparator<ServiceUsage>() {
            @Override
            public int compare(ServiceUsage s1, ServiceUsage s2) {
                return Double.compare(s2.percentage, s1.percentage);
            }
        });

        // Print the report
        System.out.println("Service Performance Report:");
        System.out.println("---------------------------");
        for (ServiceUsage serviceUsage : serviceUsageList) {
            System.out.printf("%s: %.2f%%\n", serviceUsage.serviceName, serviceUsage.percentage);
        }
    }

    static class ServiceUsage {
        String serviceName;
        int usage;
        double percentage;

        public ServiceUsage(String serviceName, int usage, double percentage) {
            this.serviceName = serviceName;
            this.usage = usage;
            this.percentage = percentage;
        }
    }
}

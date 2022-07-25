package Threading;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
public final class SummarizeClients {
    public static void main(String[] args) throws Exception{

//        List<UdacisearchClient> clients = ClientStore.getClients();
//        int numClients = clients.size();
//
//        ForkJoinPool pool = new ForkJoinPool();
//
//        Future<Integer> totalQuarterlySpend =
//                pool.submit(() -> clients
//                        .parallelStream()
//                        .mapToInt(UdacisearchClient::getQuarterlyBudget)
//                        .sum());
//
//        Future<Double> averageBudget =
//                pool.submit(() -> clients
//                        .parallelStream()
//                        .mapToDouble(UdacisearchClient::getQuarterlyBudget)
//                        .average()
//                        .orElse(0));
//
//        Future<>
    }
}

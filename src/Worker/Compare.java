package Worker;

import java.util.Comparator;

public class Compare implements Comparator<Worker> {

    public int compare(Worker firstWorker, Worker secondWorker) {
        return secondWorker.year - firstWorker.year;
    }
}



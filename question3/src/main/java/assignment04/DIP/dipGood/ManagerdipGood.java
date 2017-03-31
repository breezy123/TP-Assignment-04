package assignment04.DIP.dipGood;

/**
 * Created by aubrey on 31/03/2017.
 */
public class ManagerdipGood {
    WorkerServicedipGood worker;

    public void setWorker(WorkerServicedipGood worker) {
        this.worker = worker;
    }

    public void manage()
    {
        worker.work();
    }

}

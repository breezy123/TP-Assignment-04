package assignment04.DIP.dipBad;

/**
 * Created by aubrey on 31/03/2017.
 */
public class ManagerdipBad {

    WorkerdipBad worker;
    SuperWorkerdipBad superWorker;
    public void setWorker(WorkerdipBad worker) {
        this.worker = worker;
    }

    public void setSuperWorker(SuperWorkerdipBad superWorker) {
        this.superWorker = superWorker;
    }

    public void manage()
    {
        worker.work();
    }
}

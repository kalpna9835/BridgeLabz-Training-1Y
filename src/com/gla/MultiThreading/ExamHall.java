class ExamTask implements Runnable {
    private String taskName;
    private int delay;

    public ExamTask(String taskName, int delay) {
        this.taskName = taskName;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            Thread t = Thread.currentThread();

            System.out.println(taskName + " State: " + t.getState());

            Thread.sleep(delay);

            System.out.println(taskName + " started by " + t.getName());

            Thread.sleep(3000);

            System.out.println(taskName + " completed.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ExamHall {
    public static void main(String[] args) {
        Thread entry = new Thread(new ExamTask("Student Entry", 0));
        Thread paper = new Thread(new ExamTask("Question Paper Distribution", 5000));
        Thread attendance = new Thread(new ExamTask("Attendance", 10000));
        Thread collection = new Thread(new ExamTask("Answer Sheet Collection", 15000));

        paper.setPriority(10);
        attendance.setPriority(8);
        collection.setPriority(7);
        entry.setPriority(5);

        entry.start();
        paper.start();
        attendance.start();
        collection.start();
    }
}
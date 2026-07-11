// Name: Laiba Rafiq, Roll No: 2022F-BSE-064
package taskschedulerprogram;
import java.util.PriorityQueue;
class Task implements Comparable<Task> {
    String name;
    int priority;
    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
    @Override
    public int compareTo(Task other) {
        return Integer.compare(other.priority, this.priority);
    }
}
class TaskScheduler {
    private PriorityQueue<Task> taskQueue;
    public TaskScheduler() {
        this.taskQueue = new PriorityQueue<>();
    }
    public void scheduleTask(String taskName, int priority) {
        Task newTask = new Task(taskName, priority);
        taskQueue.add(newTask);
        System.out.println("Task scheduled: " + taskName + " with priority " 
                + priority);
    }
    public void executeTasks() {
        System.out.println("Executing tasks in descending order of priority:");
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Executing task: " + task.name + 
                    " with priority " + task.priority);
        }
    }
}
public class TaskSchedulerProgram {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        System.out.println("Tasks scheduled with priorities:");
        scheduler.scheduleTask("Task 12", 5);
        scheduler.scheduleTask("Task 20", 3);
        scheduler.scheduleTask("Task 9", 10);
        System.out.println("");
        scheduler.executeTasks();
    }
}

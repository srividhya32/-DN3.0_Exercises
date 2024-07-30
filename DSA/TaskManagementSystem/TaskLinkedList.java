package TaskManagementSystem;

class Node {
    Task task;
    Node next;

    Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

public class TaskLinkedList {
    private Node head;

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Task added successfully.");
    }

    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println("Task ID: " + current.task.getTaskId() + ", Name: " + current.task.getTaskName() + ", Status: " + current.task.getStatus());
            current = current.next;
        }
    }

    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            System.out.println("Task deleted successfully.");
            return;
        }

        Node current = head;
        while (current.next != null && current.next.task.getTaskId() != taskId) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Task not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Task deleted successfully.");
        }
    }

    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();
        taskList.addTask(new Task(1, "Design Database", "Pending"));
        taskList.addTask(new Task(2, "Develop API", "In Progress"));
        taskList.addTask(new Task(3, "Test Application", "Completed"));
        System.out.println();
        System.out.println("Traversing tasks:");
        taskList.traverseTasks();
        System.out.println();
        System.out.println("Searching for task with ID 2:");
        Task task = taskList.searchTask(2);
        if (task != null) {
            System.out.println("Task found: " + task.getTaskName() + ", Status: " + task.getStatus());
        } else {
            System.out.println("Task not found.");
        }
        System.out.println();
        System.out.println("Deleting task with ID 1:");
        taskList.deleteTask(1);
        taskList.traverseTasks();
    }
}

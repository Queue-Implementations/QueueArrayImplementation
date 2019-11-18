package com.kamaldwip.coding.queues.arrayImpl;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Kamaldwip","Choudhury");
        Employee emp2 = new Employee("Abhinav","Borgohain");
        Employee emp3 = new Employee("Prateek","Sahu");
        Employee emp4 = new Employee("Parag","Roy");
        Employee emp5 = new Employee("Shaibal","Nandy Mazumdar");

        QueueArray queue = new QueueArray(10);

        queue.enQueue(emp1);
        queue.enQueue(emp2);
        queue.enQueue(emp3);
        queue.enQueue(emp4);

        queue.printQueue();

        System.out.println("Peeked : "+queue.peek());

        System.out.println("Remove : "+queue.deQueue());

        queue.printQueue();

        System.out.println("Remove : "+queue.deQueue());
        System.out.println("Remove : "+queue.deQueue());
        System.out.println("Remove : "+queue.deQueue());

        queue.printQueue();

        queue.enQueue(emp5);

        queue.printQueue();

        System.out.println("Peeked : "+queue.peek());



    }
}

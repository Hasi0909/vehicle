package com.klef.jfsd.exam.vehicle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientDemo {

    public static void main(String[] args) {

        // Create Hibernate session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Vehicle.class)
                .addAnnotatedClass(Car.class)
                .addAnnotatedClass(Truck.class)
                .buildSessionFactory();

        // Create session
        Session session = factory.getCurrentSession();

        try {
            // Create Vehicle, Car, and Truck objects
            Vehicle vehicle = new Vehicle();
            vehicle.setName("Generic Vehicle");
            vehicle.setType("Vehicle");
            vehicle.setMaxSpeed(120);
            vehicle.setColor("White");

            Car car = new Car();
            car.setName("Sedan");
            car.setType("Car");
            car.setMaxSpeed(180);
            car.setColor("Red");
            car.setNumberOfDoors(4);

            Truck truck = new Truck();
            truck.setName("Freight Truck");
            truck.setType("Truck");
            truck.setMaxSpeed(100);
            truck.setColor("Blue");
            truck.setLoadCapacity(5000);

            // Start a transaction
            session.beginTransaction();

            // Save the objects
            session.save(vehicle);
            session.save(car);
            session.save(truck);

            // Commit transaction
            session.getTransaction().commit();

            System.out.println("Data saved successfully!");
        } finally {
            factory.close();
        }
    }
}

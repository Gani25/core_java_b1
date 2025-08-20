package project.service;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import project.entity.Ticket;
import project.entity.Train;
import project.entity.User;

public class BookingService {
    private List<Train> trainList = new ArrayList<>();
    private List<Ticket> ticketList = new ArrayList<>();

    public BookingService()
    {
        trainList.add(new Train(101,"Rajdhani Express","Delhi","Nagpur",100));
        trainList.add(new Train(102,"Shatabdi Express","Delhi","Mumbai",60));
        trainList.add(new Train(103,"Durunto Express","Agra","Delhi",70));
        trainList.add(new Train(104,"Vande Bharat Express","Delhi","Goa",100));
        trainList.add(new Train(105,"Intercity","Kolkata","Manali",90));
        trainList.add(new Train(106,"Tejas Express","Delhi","Bengaluru",80));
    }

    //date
    public List<Train> searchTrain(String source,String destination)
    {
        List<Train> res=new ArrayList<>();
        // Logic

        return res;
    }

    public Ticket bookTicket(User user,int trainId,int seatCount)
    {
    	// Logic
        System.out.println("Train ID not found");
        return null;
    }

    public List<Ticket> getTicketByUser(User user)
    {
        List<Ticket> res=new ArrayList<>();
        // Logic
        return res;
    }

    public boolean cancelTicket(int ticketId,User user)
    {
        // Logic

        System.out.println("Ticket not found or does not belong to current user");
        return false;
    }

    public void listAllTrains()
    {
        System.out.println("List of all trains:");
        for(Train train:trainList)
        {
            System.out.println(train);
        }
    }

}
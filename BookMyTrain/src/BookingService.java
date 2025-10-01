
import java.util.*;
public class BookingService {
    private List<Train> trainList = new ArrayList<>();
    private List<Ticket> ticketList = new ArrayList<>();

    public BookingService(){
        trainList.add(new Train(101,"Rajdhani Express","Delhi","Nagpur",100));
        trainList.add(new Train(102,"Shatabdi Express","Delhi","Mumbai",60));
        trainList.add(new Train(103,"Durunto Express","Agra","Delhi",70));
        trainList.add(new Train(104,"Vande Bharat Express","Goa","Manali",90));
        trainList.add(new Train(105,"Tejas Express","Delhi","Bengaluru",80));
    }
    //HW is add DATE
    public List<Train> searchTrain(String source,String destination){
        List<Train> res = new ArrayList<>();
        for(Train train : trainList){
            if(train.getSource().equalsIgnoreCase(source) && train.getDestination().equalsIgnoreCase(destination)){
                res.add(train);
            }
        }
        return res;
    }

    public Ticket bookTicket(User user , int trainId, int seatCount){
        for(Train train:trainList){
            if(train.getTrainId()==trainId){
                if(train.bookSeats(seatCount)){
                    Ticket ticket = new Ticket(user,train,seatCount);
                    ticketList.add(ticket);
                    return ticket;
                }
                else{
                    System.out.println("No Enough Seats Available");
                    return null;
                }
            }
        }
        System.out.println("Train ID Not Found");
        return null;
    }

    public List<Ticket> getTicketByUser(User user){
        List<Ticket> res = new ArrayList<>();
        for(Ticket ticket:ticketList){
            if(ticket.getUser().getUsername().equalsIgnoreCase(user.getUsername())){
                res.add(ticket);
            }
        }
        return res;
    }

    public boolean cancelTicket(int ticketId,User user){
        Iterator<Ticket> iterator = ticketList.listIterator();
        while(iterator.hasNext()){
            Ticket ticket = iterator.next();
            if(ticket.getTicketId()==ticketId && ticket.getUser().getUsername().equalsIgnoreCase(user.getUsername())){
                Train train = ticket.getTrain();
                train.cancelSeats(ticket.getSeatBooked());
                iterator.remove();
                System.out.println("Ticket " +ticketId+ " Cancelled Succesfully");
            }
        }
        System.out.println("Ticket not found or Does not belong to current user");
        return false;
    }

    public void listAllTrains(){
        System.out.println("List of All Trains : ");
        for(Train train:trainList){
            System.out.println(train);
        }
    }
}



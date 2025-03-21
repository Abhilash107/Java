package OOP.innerClass.LocalInnerClass;

public class Hotel {
    private String name;
    private int totalRooms, reservedRooms;


    public Hotel(String name, int totalRooms,  int reservedRooms) {
        this.totalRooms = totalRooms;
        this.name = name;
        this.reservedRooms = reservedRooms;
    }

    public void reserveRoom(String guestName, int noOfRoom){

        class ReservationValidator{
            boolean validate(){
                if(guestName == null || guestName.isBlank()){
                    System.out.println("Name can't be empty");
                    return false;
                }

                if(noOfRoom < 0){
                    System.out.println("No. of room can't be negative");
                    return false;
                }

                if(reservedRooms + noOfRoom > totalRooms){
                    System.out.print("Not enough rooms available ");
                    return false;
                }

                return true;
            }

        }//LOCAL class

        ReservationValidator validator = new ReservationValidator();
        if(validator.validate()){
            reservedRooms += noOfRoom;
            System.out.println("Reservation confirmed for "+ guestName + "for rooms: "+ noOfRoom);
        }
        else {
            System.out.println("Reservation failed");
        }
    }
}

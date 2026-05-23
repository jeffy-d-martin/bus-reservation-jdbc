import java.sql.SQLException;

void main() throws SQLException {
    Scanner scan = new Scanner(System.in);
    Bus bus = new Bus();
    while(true){
        System.out.println("1.Book the Bus \n2.Show all the Bus  \n3.Exit");
        System.out.print("Enter the choice : ");
        int choice = scan.nextInt();
        if(choice == 1){
            System.out.print("Enter the Bus Id : ");
            int id = scan.nextInt();
            bus.bookTheBus(id);

        }else if(choice == 2){
            bus.getAllBuses();
        }else if(choice == 3){
            System.out.println("Exiting......");
            break;
        }else System.out.println("Invaild Choice.....");
    }
}
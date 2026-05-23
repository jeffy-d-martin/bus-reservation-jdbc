import java.sql.*;

public class Bus {

    private final Statement stmt;
    private final Connection con;

    public Bus() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/your_db";
        String user = "DB_USER";
        String password = "DB_PASSWORD";

        con = DriverManager.getConnection(url, user, password);
        stmt = con.createStatement();
        con.setAutoCommit(false);
    }

    public void getAllBuses() {
        String query = "SELECT * FROM bus";

        try (ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("Bus ID | Bus Name | Seats Left | From | To");
            System.out.println("------------------------------------------");

            while (rs.next()) {
                int id = rs.getInt("bus_id");
                String name = rs.getString("bus_name");
                String seats = rs.getString("capacity");
                String source = rs.getString("from_place");
                String destination = rs.getString("to_place");

                System.out.printf("%d | %s | %s | %s | %s%n", id, name, seats, source, destination);
            }

        } catch (SQLException e) {
            System.out.println("Error executing query: " + e.getMessage());
        }
    }

    public void bookTheBus(int id) throws SQLException {
        String query = "UPDATE bus \n" +
                "SET capacity = capacity - 1 \n" +
                "WHERE bus_id = ?";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setInt(1,id);
        int row  = preparedStatement.executeUpdate();
        if(row != 0){
            System.out.println("Bus Booked......");
        }else{
            con.rollback();
        }
        con.commit();
    }
}

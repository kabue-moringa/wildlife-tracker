import org.junit.rules.ExternalResource;
import org.sql2o.*;

public class DataBaseRule extends ExternalResource{
    private Connection con;
    private Sql2o sql2o=new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test","moringa","Access");
    @Override
    public void before(){
        con=sql2o.open();
    }
    @Override
    public void after(){
        con.createQuery("DELETE FROM animal *;").executeUpdate();
        con.createQuery("DELETE FROM sighting *;").executeUpdate();
        con.close();
    }
    public Connection getCon(){
        return this.con;
    }

}

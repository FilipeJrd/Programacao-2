package data;
import com.mongodb.*;
import com.mongodb.client.MongoDatabase;
public class DBInstance {
	public static MongoDatabase db =  new MongoClient(new MongoClientURI("mongodb://adm:123456@ds056998.mongolab.com:56998/prog2")).getDatabase("prog2");
	
}

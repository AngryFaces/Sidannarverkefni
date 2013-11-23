package is.ru.SidannaVerkefni;
import static spark.Spark.*;
import spark.*;

public class spark {
	static TicTacToeGame game = new TicTacToeGame();
	public static void main(String[] args){
		staticFileLocation("/public");        
		setPort(Integer.valueOf(System.getenv("PORT")));	
			put(new Route("/addToTable") {
				@Override
				public Object handle(Request request, Response response) {
			   		String ID = String.valueOf(request.attribute("cellID"));
			   		game.addToTable(Integer.parseInt(ID));
			   		return 0;
			}
		});
	 }
}

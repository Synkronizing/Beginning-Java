package monsters;
import static java.lang.System.*;

public class WhatsOnTheInside
{
	public static void main ( String[] args )
	{
		GoodWitch bad = new GoodWitch();		//why does this not compile
		out.println(bad);
		
		GoodWitch witch = new GoodWitch("Harriet");
		out.println(witch);
		
		Werewolf werewolf = new Werewolf("Jacob");
		out.println(werewolf);
		
		BadWitch witch2 = new BadWitch("Melony");
		out.println(witch2);
	}
}

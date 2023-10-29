import java.util.Scanner;

public class TeamService {
	static Team[] tarr;  //tarr is static array of ref 'Team Class type'
	static int cnt;
	
	static {
		tarr=new Team[10];
		cnt=0;
	}
	
	/*public TeamService() {
		super();
		this.tarr = new Team[10];
		Player[] plist={
				new Player(2,"Ashwin","allrounder"),new Player(3,"Raina","batsman")
			};
		tarr[0]=new Team(1,"xxx",new Player(111,"Dhoni","Wicketkeeper"),plist); 
	}*/
	//create a new team
	public static void addnewteam() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr teamno");
		int tno=sc.nextInt();
		sc.nextLine();
		System.out.println("enter team name");
		String tname=sc.nextLine();
	//accept captain details
		System.out.println("captain player number");
		int pno=sc.nextInt();
		sc.nextLine();
		System.out.println("enter player name");
		String pname=sc.nextLine();
		System.out.println("enter skill");
		String skill=sc.nextLine();
		Player c=new Player(pno,pname,skill);//Object C of Player class captain ref
	//accept other player details
		Player[] plist=new Player[3];
		for(int i=0;i<plist.length;i++) {
			System.out.println("player number");
			pno=sc.nextInt();
			sc.nextLine();
			System.out.println("enter player name");
			pname=sc.nextLine();
			
			System.out.println("enter skill");
			skill=sc.nextLine();
			plist[i]=new Player(pno,pname,skill); //array Object plist of Player class plist ref
		}
		tarr[cnt]=new Team(tno,tname,c,plist);   //team class object inside it player class obj
		cnt++;
		
	}
	public static void displayall() {
		for(int i=0;i<cnt;i++) {
			System.out.println(tarr[i]);
		}
		
	}
	public static Team searchByCName(String nm) {
		for(int i=0;i<cnt;i++) {
			
			//tarr[i].getCaptain().getPname()
			Player c=tarr[i].getCaptain();
			if(c.getPname().equals(nm)) {
				return tarr[i];
			}
		}
		return null;
	}
	public static Team searchByPlayerName(String nm) {
		for(int i=0;i<cnt;i++) {
			
			//tarr[i].getCaptain().getPname()
			Player[] parr=tarr[i].getPlist();
			for(int j=0;j<parr.length;j++) {
				if(parr[i].getPname().equals(nm)) {
					return tarr[i];
				}
			}
			
		}
		return null;
	}

}

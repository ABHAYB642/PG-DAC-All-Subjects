package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Team;
import com.demo.service.*;
public class TestTeam {

	public static void main(String[] args) {
		int choice=0;
		TeamService ts=new TeamServiceImpl();
		Scanner sc=new Scanner(System.in);
	
		do {
			System.out.println("1. add new Team\n2. delete a team\n3. delete a player from team\n4. display all\n5.display all player with a speciality(accept speciality from user");
			System.out.println("6. add a new player in a team\n7. modify coach of a team\n8. exit");	
			System.out.println("Enter Your Choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				ts.addTeam();
				break;
			case 2:
				System.out.println("Enter id to delete ");
				int id=sc.nextInt();
				boolean status=ts.deleteTeambyid(id);
				if(status)
				{
					System.out.println("Team Deleted");
				}
				else {
					System.out.println("Team not Deleted");
				}
				break;
			case 3:
				System.out.println("Enter player id to delete ");
			    id=sc.nextInt();
				status=ts.deletePlayerbyid(id);
				if(status)
				{
					System.out.println("Player Deleted");
				}
				else {
					System.out.println("Player not Deleted");
				}
				break;
			case 4:
				List<Team> Allteam=ts.displayAll();
				if(Allteam!=null)
				{
					for(Team t:Allteam)
					{
						System.out.println(t);
					}
				}
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				sc.close();
				System.out.println("Exited");
				break;
			default:
				System.out.println("Enter From choice");
			}}while(choice!=8);
		
		

	}


}

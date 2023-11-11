package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Player;
import com.demo.beans.Team;
import com.demo.dao.TeamDao;
import com.demo.dao.TeamDaoImpl;

public class TeamServiceImpl implements TeamService {
private TeamDao tdao;

	public TeamServiceImpl() {
	tdao=new TeamDaoImpl();
}
	
	Scanner sc=new Scanner(System.in);
	public static List<Player>plist=new ArrayList<>();
	@Override
	public void addTeam() {
		System.out.println("Enter team id");
		int id=sc.nextInt();
		System.out.println("Enter team Name");
		String tname=sc.next();
		System.out.println("Enter Coach Name");
		String cname=sc.next();
		for(int i=0;i<3;i++) {
			System.out.println("Enter Player id");
			int pid=sc.nextInt();
			System.out.println("Enter Player Name");
			 String pname=sc.next();
			 Player p=new Player(pid,pname);
			 plist.add(p);
		}	
		Team t=new Team(id,tname,cname,plist);
	    tdao.save(t);
	}

	@Override
	public boolean deleteTeambyid(int id) {
		
		return tdao.deleteTeamId(id);
	}
	@Override
	
	public boolean deletePlayerbyid(int id) {
		return tdao.deletePlayerbyid(id);
	}
	
	@Override
	public List<Team> displayAll() {

    return tdao.getall();
	}}

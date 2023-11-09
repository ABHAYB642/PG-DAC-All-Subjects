package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Player;
import com.demo.beans.Team;

public class TeamDaoImpl implements TeamDao {

	static List<Team> tlist;
//	int cnt=3;
	static {
		List<Player>plist=new ArrayList<>();
		
		plist.addAll(plist);
		
		plist.add(new Player(7,"Dhnoi"));
		plist.add(new Player(8,"Dyanesh"));
		plist.add(new Player(9,"Abhi"));
		
		tlist=new ArrayList<>();
		
		tlist.add(new Team(1,"Mumbai","Sujit",plist));
	}
	
	@Override
	public void save(Team t) {
		tlist.add(t);	
	}
    public int getByid(int id)
    {
    	int pos=tlist.indexOf(new Team(id));
    	if(pos!=-1)
    	{
    		return pos;
    	}
    	return -1;
    }
	@Override
	public boolean deleteTeamId(int id) {
		int pos=getByid(id);
		if(pos!=-1)
		{
			tlist.remove(pos);
			return true;
		}
		//tlist.remove(new Team(id));
		return false;
	}
	
	
	@Override
	public boolean deletePlayerbyid(int id) {
		int i;
		List<Player> plist=new ArrayList<>();
		boolean flag=false;
		for(Team t:tlist) {
		plist=t.getPlist();
		for(Player p:plist) {
			plist.remove(new Player(id));
		}
		return true;
		}	
		return false;
	}
	@Override
	public List<Team> getall() {
		return tlist;
	}
	

}

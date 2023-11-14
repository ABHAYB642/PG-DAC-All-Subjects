package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Player;
import com.demo.beans.Team;
import com.demo.service.TeamServiceImpl;

public class TeamDaoImpl implements TeamDao {

	static List<Team> tlist;
	static {
		List<Player>plist=new ArrayList<>();
		
		//plist.addAll(plist);
		
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
    	
//    	public Employee getById(int id) {
//    		for(Employee e:hs) {
//    			if(e.getPid()==id) {
//    				return e;
//    			}
//    		}
//    		return null;
//    	}

    }
    
    public int getByPlayerid(int id)
    {
    	int pos=0;
    	List<Player> plist1=new ArrayList<>();
    	for(Team t:tlist) {
    		plist1=t.getPlist();
    	  pos=plist1.indexOf(new Player(id));
    	}
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
		int pos=0;
		List<Player> plist2=new ArrayList<>();
		for(Team t:tlist) {
		plist2=t.getPlist();
		  for(Player p:plist2) {
			pos=getByPlayerid(id);
		}
		}
		System.out.println(pos);
		if(pos!=-1) {
			plist2.remove(pos);
			return true;
		}
		return false;
	}
	@Override
	public List<Team> getall() {
		return tlist;
	}
	@Override
	public boolean addPlayer(int tid, int id, String name) {
		List<Player> plist2=new ArrayList<>();
		for(Team t:tlist) {
			if(t.getTid()==tid) {
			   plist2=t.getPlist();//Reference to actual list.So any Modifications in plist2 will modify List in Original Team
			   plist2.add(new Player(id,name));
			   return true;
			}
		}
		return false;
	}
	@Override
	public boolean modifycoach(int tid, String name) {
		for(Team t:tlist) {
			if(t.getTid()==tid) {
				t.setCoachname(name);
				return true;
			}	
			}
		return false;
	}

	

}

package service;

import java.util.List;

import model.Events_model;

public interface IEvent {
	public int addEvent(model.Events_model pr);
	public void removeEvent(int id);
	public Events_model getEventById(int id);
	public List<Events_model> getAllEvent();
	void updateEvent(Events_model p);
	public List<Events_model> getAllFeatured();
	public List<Events_model> getAllDel();
	

}

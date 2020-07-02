package org.sid.web;

import java.util.List;

import java.util.Optional;

import org.sid.dao.backlogRepository;
import org.sid.entities.backlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins="*")
public class backlogservice {
@Autowired
private backlogRepository t;
@RequestMapping(value="/backlog",method=RequestMethod.GET)
public List<backlog> getTodouserstories(){
	return t.findAll();
}
@RequestMapping(value="/backlog/{id}",method=RequestMethod.GET)
public Optional<backlog> getTodouserstories(@PathVariable Long id){
	return t.findById(id);
}


@RequestMapping(value="/backlog",method=RequestMethod.POST)
public backlog getTodouserstories(@RequestBody backlog task){
	return t.save(task);
}


@RequestMapping(value="/backlog/{id}",method=RequestMethod.DELETE)
public boolean suprimer(@PathVariable Long id){
t.deleteById(id);
return true;
}
/*
 * METHODE POUR MODIFIER 
@RequestMapping(value="/sprints/{id}",method=RequestMethod.PUT)
public todo sauvgarder(@PathVariable Long id,@RequestBody todo task){
t.setId(id);
return t.save(task);
}*/
}

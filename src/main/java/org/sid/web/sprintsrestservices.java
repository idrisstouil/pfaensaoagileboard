package org.sid.web;

import java.util.List;
import java.util.Optional;

import org.sid.dao.sprintsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.sid.entities.Sprints;
@CrossOrigin(origins="*")
@RestController
public class sprintsrestservices {
@Autowired
private sprintsRepository t;
@RequestMapping(value="/sprints",method=RequestMethod.GET)
public List<Sprints> getTodouserstories(){
	return t.findAll();
}
@RequestMapping(value="/sprints/{id}",method=RequestMethod.GET)
public Optional<Sprints> getTodouserstories(@PathVariable Long id){
	return t.findById(id);
}
@CrossOrigin(origins="*")
@RequestMapping(value="/sprints",method=RequestMethod.POST)
public Sprints getTodouserstories(@RequestBody Sprints task){
	return t.save(task);
}


@RequestMapping(value="/sprints/{id}",method=RequestMethod.DELETE)
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

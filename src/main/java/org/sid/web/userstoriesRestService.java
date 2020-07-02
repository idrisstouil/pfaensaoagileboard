package org.sid.web;

import java.util.List;
import java.util.Optional;

import org.sid.dao.todoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.sid.entities.Userstories;
@RestController
@CrossOrigin(origins="*")
public class userstoriesRestService {
@Autowired
private todoRepository t;
@RequestMapping(value="/todolist",method=RequestMethod.GET)
public List<Userstories> getTodouserstories(){
	return t.findAll();
}
@RequestMapping(value="/todolist/{id}",method=RequestMethod.GET)
public Optional<Userstories> getTodouserstories(@PathVariable Long id){
	return t.findById(id);
}


@RequestMapping(value="/todolist",method=RequestMethod.POST)
public Userstories getTodouserstories(@RequestBody Userstories task){
	return t.save(task);
}


@RequestMapping(value="/todolist/{id}",method=RequestMethod.DELETE)
public boolean suprimer(@PathVariable Long id){
t.deleteById(id);
return true;
}
/*
 * METHODE POUR MODIFIER 
@RequestMapping(value="/todolist/{id}",method=RequestMethod.PUT)
public todo sauvgarder(@PathVariable Long id,@RequestBody todo task){
t.setId(id);
return t.save(task);
}*/
}

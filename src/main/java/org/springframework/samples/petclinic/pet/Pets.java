package org.springframework.samples.petclinic.pet;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.samples.petclinic.vet.Vet;

/**
 * Simple domain object representing a list of registered pets
 * 
 * @author kanatala
 *
 */

@XmlRootElement
public class Pets {
	
	private List<Pet> pets;
	
	@XmlElement
	public List<Pet> getPetList() {
		if (pets == null) {
			pets = new ArrayList<>();
		}
		return pets;
	}

}
